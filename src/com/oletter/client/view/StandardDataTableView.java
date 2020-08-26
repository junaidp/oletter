package com.oletter.client.view;

import com.google.gwt.user.client.ui.Widget;
import com.oletter.shared.Person;

import gwt.material.design.client.data.SelectionType;
import gwt.material.design.client.ui.MaterialColumn;
import gwt.material.design.client.ui.table.MaterialDataTable;

public class StandardDataTableView {
	
	private MaterialColumn colMain = new MaterialColumn();
//	
//	StandardDataTableView(){
//		layout();
//	}

	public Widget layout() {
		MaterialDataTable<Person> table = new MaterialDataTable<Person>();
		table.setHeight("calc(100vh - 131px)"); 
		table.setUseStickyHeader(true);
		table.setUseCategories(true);
		table.setUseRowExpansion(true);
		table.setSelectionType(SelectionType.SINGLE);
		
		 Person firstPerson = new Person();
		 firstPerson.setFirstName("Abdul"); 
		 firstPerson.setLastName("Moqeet"); 
		 firstPerson.setEmailID("amoqeet43@gmail.com"); 
		 firstPerson.setAge(26);
		 table.updateRow(firstPerson);
		 table.getRowByModel(firstPerson);
		 
		colMain.add(table);
		return colMain;
	}

}
