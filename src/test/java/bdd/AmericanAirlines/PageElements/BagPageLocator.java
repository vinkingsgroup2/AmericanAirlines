package bdd.AmericanAirlines.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BagPageLocator {

	
	@FindBy(xpath="//button[@id='travel-information-expander']")
	public WebElement InkTravelinformation;
	
	//click bags
	@FindBy(xpath="//a[contains(text(),'Bags')]")
	public WebElement InkBags;
	
	//click carry on bags
	@FindBy(xpath="//div[contains(text(),'Carry-on bags')]")
	public WebElement InkCarryonbag;
	
	
}
