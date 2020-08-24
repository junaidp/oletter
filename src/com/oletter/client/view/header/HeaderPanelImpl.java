package com.oletter.client.view.header;


import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;

public class HeaderPanelImpl extends VerticalPanel implements HeaderPanel
{

	@Override
	public void activatePanel(boolean activate) {
		// TODO Auto-generated method stub
		
	}
	
	public HeaderPanelImpl()
	{
		add(new HTML("HEADER"));
	}

	
}
