package bdd.AmericanAirlines.PageAction;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import bdd.AmericanAirlines.PageElements.AmericanAirlinesnadiHomePageLocator;
import bdd.utilities.SetupDriver;


public class AmericanAirlinesnadiHomePageActions {






	AmericanAirlinesnadiHomePageLocator AmericanAirlinesHomePageLocatorsObj;

public AmericanAirlinesnadiHomePageActions(){
AmericanAirlinesHomePageLocatorsObj = new AmericanAirlinesnadiHomePageLocator();
PageFactory.initElements(SetupDriver.getDriver(), AmericanAirlinesHomePageLocatorsObj);
}

public void loadAmericanAirlinesHomepage(){
((WebDriver) SetupDriver.driver).manage().window().maximize();
((WebDriver) SetupDriver.driver).get("https://www.aa.com/homePage.do");
((WebDriver) SetupDriver.driver).manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}

public void navigatePlanTravelPage(){
AmericanAirlinesHomePageLocatorsObj.lnkPlanTravel.click();

}

public void navigateCruises(){

AmericanAirlinesHomePageLocatorsObj.lnkCruises.click();

}



}