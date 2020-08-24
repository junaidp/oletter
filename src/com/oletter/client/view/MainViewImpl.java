package com.oletter.client.view;

import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.oletter.client.view.header.HeaderPanel;
import com.oletter.client.view.header.HeaderPanelImpl;

import gwt.material.design.client.ui.MaterialButton;

public class MainViewImpl implements MainView
{

	private HeaderPanel headerPanel;
	private Presenter presenter;
	private VerticalPanel centerContainer = new VerticalPanel();



	public Widget layout()
	{
		VerticalPanel container = new VerticalPanel();
		container.add(new HTML("MAIN PAGE"));
		MaterialButton but = new MaterialButton("Login");
		but.addClickHandler(Event -> History.newItem("login"));
		container.add(but);
		return container;
	}

	
	public HeaderPanel getHeader()
	{
		if (headerPanel == null)
		{
			headerPanel = new HeaderPanelImpl();
		}
		return headerPanel;
	}

	@Override
	public void go( HasWidgets container )
	{
		//view = new AppViewImpl();// Here we can change app main view as per any condition for example which user logginIn or something else.for now the one view is appView
		//view.go(container);
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
