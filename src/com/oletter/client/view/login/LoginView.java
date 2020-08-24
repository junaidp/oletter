package com.oletter.client.view.login;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.oletter.client.view.Presenter;
import com.oletter.client.view.View;
import com.oletter.client.view.header.HeaderPanel;
import com.oletter.client.view.header.HeaderPanelImpl;

public class LoginView implements View
{

	private Presenter presenter;
	private VerticalPanel centerContainer = new VerticalPanel();



	public Widget layout()
	{
		VerticalPanel container = new VerticalPanel();
		container.add(new HTML("Login PAGE"));
		return container;
	}

	
	@Override
	public void go( HasWidgets container )
	{
		container.clear();
		container.add( layout() );
	}

	@Override
	public Presenter getPresenter()
	{
		return presenter;
	}

	@Override
	public void setPresenter( Presenter presenter )
	{
		this.presenter = presenter;
	}

	public VerticalPanel getCenterContainer()
	{
		return centerContainer;
	}


	



}
