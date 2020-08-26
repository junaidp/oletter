package com.oletter.client.view;

import com.gargoylesoftware.htmlunit.javascript.host.event.Event;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialColumn;

public class MainViewImpl implements MainView
{

	private Presenter presenter;
	private MaterialColumn centerContainer = new MaterialColumn();

	public Widget layout()
	{
		MaterialColumn container = new MaterialColumn();
		MaterialButton but = new MaterialButton("Login");
		but.addClickHandler(Event -> History.newItem("login"));
		container.add(but);
		MaterialButton btnPost = new MaterialButton("Post");
		container.add(btnPost);
		btnPost.addClickHandler(Event -> History.newItem("post"));
//		StandardDataTableView dataTable = new StandardDataTableView();
//		container.add(dataTable.layout());
		return container;
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

	public MaterialColumn getCenterContainer()
	{
		return centerContainer;
	}



}
