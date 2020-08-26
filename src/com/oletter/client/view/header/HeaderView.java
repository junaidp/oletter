package com.oletter.client.view.header;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.oletter.client.view.Presenter;
import com.oletter.client.view.View;
import gwt.material.design.client.ui.MaterialColumn;

public class HeaderView implements View
{
	private Presenter presenter;
	private MaterialColumn colMain = new MaterialColumn();

	public Widget layout()
	{
		
		return new HTML("HEADER");
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

	public MaterialColumn getCenterContainer()
	{
		return colMain;
	}

}
