package bdd.AmericanAirlines.PageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import bdd.AmericanAirlines.PageElements.AmericanairlinesHomePageLocators;
import bdd.utilities.SetupDriver;




public class AmericanairlinesHomePageActions {
	

	AmericanairlinesHomePageLocators AmericanairlinesHomePageLocatorsObj;

	
	public AmericanairlinesHomePageActions(){
		
		AmericanairlinesHomePageLocatorsObj = new AmericanairlinesHomePageLocators();
		
		PageFactory.initElements(SetupDriver.driver, AmericanairlinesHomePageLocatorsObj);
	}

	public void loadAmericanairlinesHomepage(){
		SetupDriver.driver.manage().window().maximize();
		SetupDriver.driver.get("https://www.aa.com/homePage.do");
		SetupDriver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
		
	
	public void clickPlanTravel() {
		
		AmericanairlinesHomePageLocatorsObj.lnkPlanTravel.click();
		}

	public void clickHotel() {
		AmericanairlinesHomePageLocatorsObj.lnkhotels.click();

}
	
	

		
	}
