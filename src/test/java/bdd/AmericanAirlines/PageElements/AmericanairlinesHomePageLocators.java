package bdd.AmericanAirlines.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmericanairlinesHomePageLocators {
	
	@FindBy(xpath="//button[@id='plan-travel-expander']")
	
    public WebElement lnkPlanTravel;
	
	@FindBy(xpath="//a[contains(text(),'Hotels')]")
	public WebElement lnkhotels;

	
	
}

	