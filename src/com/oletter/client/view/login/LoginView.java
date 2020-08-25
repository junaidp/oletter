package com.oletter.client.view.login;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.dom.client.Style.VerticalAlign;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.oletter.client.view.Presenter;
import com.oletter.client.view.View;
import com.oletter.client.images.*;
import com.oletter.client.view.header.HeaderPanel;
import com.oletter.client.view.header.HeaderPanelImpl;

import gwt.material.design.client.constants.Color;
import gwt.material.design.client.constants.IconPosition;
import gwt.material.design.client.constants.IconSize;
import gwt.material.design.client.constants.IconType;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialColumn;
import gwt.material.design.client.ui.MaterialIcon;
import gwt.material.design.client.ui.MaterialRow;
import gwt.material.design.client.ui.MaterialTextBox;
import gwt.material.design.themes.orange.ThemeOrange;

public class LoginView implements View
{
	private Presenter presenter;
	private MaterialColumn colMain = new MaterialColumn();

	public Widget layout()
	{
		MaterialColumn colLogin = new MaterialColumn();
		MaterialColumn colLoginContainer = new MaterialColumn();
		colLogin.addStyleName("w3-display-middle w3-border w3-round-xxlarge");
		colLogin.setSize("400px", "300px");
//		container.addStyleName("centered");
		
		colLoginContainer.addStyleName("w3-display-middle");
		colLoginContainer.setSize("300px", "130px");
		
//		 <m:MaterialIcon waves="LIGHT" iconType="POLYMER"/>
//		 <m:MaterialIcon waves="LIGHT" iconType="POLYMER" textColor="BLUE" type="CIRCLE"/>
//		 <m:MaterialIcon waves="LIGHT" iconType="POLYMER" backgroundColor="BLUE" textColor="WHITE" type="CIRCLE" tooltip="Tooltip" tooltipLocation="BOTTOM"/>
		 
		MaterialRow rowIcon = new MaterialRow();
//		MaterialIcon iconUser = new MaterialIcon();
//		iconUser.setIconType(IconType.ACCOUNT_CIRCLE);
//		iconUser.setIconSize(IconSize.LARGE);
//		iconUser.setIconColor(Color.BLUE);
//		rowIcon.addStyleName("w3-display-topmiddle");
		Image imgUser = new Image(Images.INSTANCE.user());
		imgUser.setPixelSize(100, 70);
		imgUser.addStyleName("w3-display-topmiddle");
		rowIcon.add(imgUser);
		rowIcon.getElement().getStyle().setMarginBottom(10, Unit.PX);
		colLogin.add(rowIcon);
		
		MaterialTextBox txtBoxEmail = new MaterialTextBox();
		txtBoxEmail.setWidth("300px");
		txtBoxEmail.setPlaceholder("Email");
		colLoginContainer.add(txtBoxEmail);
		
		PasswordTextBox txtBoxPassword = new PasswordTextBox();
		txtBoxPassword.setWidth("300px");
		txtBoxPassword.getElement().setPropertyString("placeholder", "Password");
		colLoginContainer.add(txtBoxPassword);
		
		MaterialButton loginButton = new MaterialButton("Login"); 
		loginButton.setWidth("100px");
		loginButton.addStyleName("w3-right");
		colLoginContainer.add(loginButton);
		
		Image imgBackground  = new Image(Images.INSTANCE.loginBackground());
		colMain.add(imgBackground);
		
		colLogin.add(colLoginContainer);
		colMain.add(colLogin);
		return colMain;
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
