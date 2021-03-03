package bdd.AmericanAirlines.PageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import bdd.AmericanAirlines.PageElements.AAHomePageLocators;
import bdd.utilities.SetupDriver;

public class AAHomePageActions {
	AAHomePageLocators AAHomePageLocatorsObj;
	
	public AAHomePageActions(){
		AAHomePageLocatorsObj = new AAHomePageLocators();
		PageFactory.initElements(SetupDriver.driver, AAHomePageLocatorsObj);
		
	}
	
	public void loadAAHomePage(){
		SetupDriver.driver.manage().window().maximize();
		SetupDriver.driver.get("https://www.aa.com/");
		SetupDriver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void clickPlanTravel(){
		AAHomePageLocatorsObj.btnPlanTravel.click();
	}
	
	public void navigateBookFlightPage(){
		AAHomePageLocatorsObj.lnkFlights.click();
	}
}
