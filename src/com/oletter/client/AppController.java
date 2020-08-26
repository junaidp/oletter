package com.oletter.client;


import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.HasWidgets;
import com.oletter.client.event.MainEvent;
import com.oletter.client.event.MainEventHandler;
import com.oletter.client.presenter.PostPresenter;
import com.oletter.client.view.MainPresenterImpl;
import com.oletter.client.view.MainView;
import com.oletter.client.view.MainViewImpl;
import com.oletter.client.view.PostView;
import com.oletter.client.view.Presenter;
import com.oletter.client.view.header.HeaderPresenter;
import com.oletter.client.view.header.HeaderView;
import com.oletter.client.view.login.LoginPresenter;
import com.oletter.client.view.login.LoginView;

public class AppController implements Presenter, ValueChangeHandler<String>
{
	private final HandlerManager eventBus;

	private final GreetingServiceAsync rpcService;
	private HasWidgets container;
	private HasWidgets mainContainer, headerContainer;
	Presenter presenter = null;

	public AppController( GreetingServiceAsync rpcService, HandlerManager eventBus )
	{
		this.eventBus = eventBus;
		this.rpcService = rpcService;

		bind();
	}

	private void bind()
	{
		History.addValueChangeHandler( this );

		eventBus.addHandler( MainEvent.TYPE,
				new MainEventHandler()
				{
					public void onMain( MainEvent event )
					{
						History.newItem( "main" );
					}

				} );
		
	
	}

	public void go( final HasWidgets container, HasWidgets headerContainer )
	{
		this.container = container;
		this.mainContainer = container;
		this.headerContainer = headerContainer;

		if ("".equals( History.getToken()) || "index".equals(History.getToken()))
		{
			History.newItem( "main" );
		}
		else if ("login".equals( History.getToken()))
		{
			History.newItem( "login" );
		}
		else
		{
			History.fireCurrentHistoryState();
		}
	}

	public void onValueChange( ValueChangeEvent<String> event )
	{
		String token = event.getValue();

		if (token != null)
		{
			presenter = null;

			if (token.equals( "main" ))
			{
				presenter = new MainPresenterImpl( rpcService, eventBus );
				MainView mainView = new MainViewImpl();
				mainView.setPresenter( presenter );
				mainView.go( container );
				
				presenter = new HeaderPresenter( rpcService, eventBus );
				HeaderView headerView = new HeaderView();
				headerView.setPresenter( presenter );
				headerView.go( headerContainer );

			}
			
			else if (token.equals( "login" ))
			{
				presenter = new LoginPresenter( rpcService, eventBus );
				LoginView mainView = new LoginView();
//				Login mainView =  new Login();
				mainView.setPresenter( presenter );
				mainView.go( container );

			}
			
			else if (token.equals("post")) {
				presenter = new PostPresenter( rpcService, eventBus );
				PostView postView = new PostView();
				postView.setPresenter(presenter );
				postView.go(container );
			}
		}
	}

}
