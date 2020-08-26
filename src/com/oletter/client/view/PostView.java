package com.oletter.client.view;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.oletter.client.view.Presenter;
import com.oletter.client.view.View;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialColumn;
import gwt.material.design.client.ui.MaterialLabel;
import gwt.material.design.client.ui.MaterialRow;
import gwt.material.design.client.ui.MaterialTextArea;
import gwt.material.design.client.ui.MaterialTextBox;

public class PostView implements View
{
	private Presenter presenter;
	private MaterialColumn colMain = new MaterialColumn();

	public Widget layout()
	{
		MaterialColumn colLogin = new MaterialColumn();
		MaterialColumn colLoginContainer = new MaterialColumn();
		colLogin.addStyleName("w3-display-middle w3-border w3-round-xxlarge");
		colLogin.setSize("400px", "700px");
		colLoginContainer.setWidth("300px");
		
		colLoginContainer.addStyleName("w3-display-middle");
		
		//TitleUi
		MaterialRow rowTitle = new MaterialRow();
		colLoginContainer.add(rowTitle);
		
		MaterialLabel lblTitle = new MaterialLabel("Title");
		lblTitle.setWidth("100px");
		rowTitle.add(lblTitle);
		
		MaterialTextBox txtBoxTitle = new MaterialTextBox();
		txtBoxTitle.setWidth("200px");
		txtBoxTitle.setPlaceholder("Title");
		rowTitle.add(txtBoxTitle);
		//AuthorUi
		MaterialRow rowAuthor = new MaterialRow();
		colLoginContainer.add(rowAuthor);
		
		MaterialLabel lblAuthor = new MaterialLabel("Author");
		lblAuthor.setWidth("100px");
		rowAuthor.add(lblAuthor);
		
		MaterialTextBox txtAuthor = new MaterialTextBox();
		txtAuthor.setWidth("200px");
		txtAuthor.setPlaceholder("Author");
		rowAuthor.add(txtAuthor);
		//personalityUi
		MaterialRow rowPersonality = new MaterialRow();
		colLoginContainer.add(rowPersonality);
		
		MaterialLabel lblPersonality = new MaterialLabel("Personality");
		lblPersonality.setWidth("100px");
		rowPersonality.add(lblPersonality);
//		
//		GroupToggleButton<String> togglePersonality = new GroupToggleButton<String>();
//		togglePersonality.addItem("Bad", "0");
//		togglePersonality.addItem("Good", "1");
//		togglePersonality.addItem("Excellent", "2");
		//rowPersonality.add(togglePersonality);
		//NameUi
		MaterialRow rowName = new MaterialRow();
		colLoginContainer.add(rowName);
		
		MaterialLabel lblName = new MaterialLabel("Name");
		lblName.setWidth("100px");
		rowName.add(lblName);
		
		MaterialTextBox txtName = new MaterialTextBox();
		txtName.setWidth("200px");
		txtName.setPlaceholder("Name");
		rowName.add(txtName);
		
		//MoodUi
		MaterialRow rowMood = new MaterialRow();
		colLoginContainer.add(rowMood);
		
		MaterialLabel lblMood = new MaterialLabel("Mood");
		lblMood.setWidth("100px");
		rowMood.add(lblMood);
		
		MaterialTextBox txtMood = new MaterialTextBox();
		txtMood.setWidth("200px");
		txtMood.setPlaceholder("Mood");
		rowMood.add(txtMood);
		
		//ContentUi
		MaterialRow rowContent = new MaterialRow();
		colLoginContainer.add(rowContent);
		
		MaterialLabel lblContent = new MaterialLabel("Content");
		lblContent.setWidth("100px");
		rowContent.add(lblContent);
		
		MaterialTextArea txtContent = new MaterialTextArea();
		txtContent.setWidth("200px");
		txtContent.setPlaceholder("write your content here..");
		rowContent.add(txtContent);
		
		MaterialButton btnPost = new MaterialButton("Post"); 
		btnPost.setWidth("100px");
		btnPost.addStyleName("w3-right");
		colLoginContainer.add(btnPost);
		
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
