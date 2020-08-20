package bdd.AmericanAirlines.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AAHomePageLocators {
	
	@FindBy(xpath="//button[@id='plan-travel-expander']")
	public WebElement btnPlanTravel;
	
	@FindBy(xpath="//a[contains(text(),'Flights')]")
	public WebElement lnkFlights;
	
}
