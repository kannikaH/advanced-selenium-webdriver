package com.herokuapp.theinternet.checkboxespagetests;

import org.testng.annotations.Test;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.WelcomePage;

public class CheckboxesTests  extends TestUtilities{
	
	@Test
	public void selectingTwoboxesTest() {
		log.info("Starting selectingTwoCheckboxesTest");
		
		// open main page
		WelcomePage welcomePage = new WelcomePage(driver, log);
		welcomePage.openPage();
		
		//click on Checkboxes link
		// Select All Checkboxes
		// Verify All Checkboxes are checked
		
	}
	

}
