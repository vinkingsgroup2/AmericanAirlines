package bdd.AmericanAirlines.PageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import bdd.AmericanAirlines.PageElements.AmericanairlinesHomePageLocators;
import bdd.utilities.SetupDriver;




public class AmericanairlinesalalaminHomePageActions {
	

	AmericanairlinesHomePageLocators AmericanairlinesalaminHomePageLocatorsObj;

	
	public AmericanairlinesalalaminHomePageActions(){
		
		AmericanairlinesalaminHomePageLocatorsObj = new AmericanairlinesHomePageLocators();
		
		PageFactory.initElements(SetupDriver.driver, AmericanairlinesalaminHomePageLocatorsObj);
	}

	public void loadAmericanairlinesHomepage(){
		SetupDriver.driver.manage().window().maximize();
		SetupDriver.driver.get("https://www.aa.com/homePage.do");
		SetupDriver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
		
	
	public void clickPlanTravel() {
		
		AmericanairlinesalaminHomePageLocatorsObj.lnkPlanTravel.click();
		}

	public void clickHotel() {
		AmericanairlinesalaminHomePageLocatorsObj.lnkhotels.click();

}
	
	

		
	}
