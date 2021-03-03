package bdd.AmericanAirlines.PageAction;

import org.openqa.selenium.support.PageFactory;

import bdd.AmericanAirlines.PageElements.AABookFlightsPageLocators;
import bdd.utilities.SetupDriver;



public class AABookFlightsPageActions {
	
	AABookFlightsPageLocators AABookFlightsPageLocatorsObj;
	
	public AABookFlightsPageActions(){
		
		AABookFlightsPageLocatorsObj = new AABookFlightsPageLocators();
		PageFactory.initElements(SetupDriver.driver, AABookFlightsPageLocatorsObj);
	}

	
	public void Citiesanddates(){
		//AABookFlightsPageLocatorsObj.txtFrom.sendKeys("NYC");
		AABookFlightsPageLocatorsObj.txtTo.sendKeys("LAS");
		AABookFlightsPageLocatorsObj.txtDepart.sendKeys("11/10/2020");
		/*AABookFlightsPageLocatorsObj.clkNext.click();
		AABookFlightsPageLocatorsObj.clkNext1.click();
		AABookFlightsPageLocatorsObj.clkNext11.click();
		AABookFlightsPageLocatorsObj.dateToSelect.click();*/
		
		AABookFlightsPageLocatorsObj.txtReturn.sendKeys("11/18/2020");
		
		AABookFlightsPageLocatorsObj.lnkSubmit.click();
	}
	
	
	public void Passengers(){
		
	}
	
	
	public void Options(){
		
	}
	
	
	public void Search(){
		
		
		
	}
	
	
}
