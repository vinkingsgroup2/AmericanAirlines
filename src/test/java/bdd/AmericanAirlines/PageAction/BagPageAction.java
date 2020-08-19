package bdd.AmericanAirlines.PageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;


import bdd.AmericanAirlines.PageElements.BagPageLocator;
import bdd.utilities.SetupDriver;

public class BagPageAction {

	
	BagPageLocator BagPageLocatorobj;
	
	public BagPageAction(){
		
		
		//SetupDriver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS)
		
		BagPageLocatorobj = new BagPageLocator();
		
		PageFactory.initElements(SetupDriver.driver, BagPageLocatorobj);
		
		
	}


	public void clickTravelinformation(){
		 BagPageLocatorobj.InkTravelinformation.click();
	}
	public void clickOnbags(){
		 BagPageLocatorobj.InkBags.click();;
		
	}
	
	public void carryonbag(){
		BagPageLocatorobj.InkCarryonbag.click();;
		
	}



}
