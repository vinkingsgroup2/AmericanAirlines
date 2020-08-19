package bdd.AmericanAirlines.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmericanAirlinesVacationpackagePageLocator {

	
	@FindBy(xpath="//button[@id='plan-travel-expander']")
	public WebElement lnkNavigate;
	
	
	@FindBy(xpath="//a[contains(text(),'Vacations')]")
	public WebElement lnkVacation;
	
	@FindBy(xpath="//input[@id='flight-hotel_from_city']")
	public WebElement txtFromairport;
	
	@FindBy(xpath="//input[@id='flight-hotel_to_city']")
	public WebElement txttoairport;
	
	
	@FindBy(xpath="//input[@id='flight-hotel_from_date']")
	public WebElement lnkdepartdate;
	
	
	
	
	
	@FindBy(xpath="//input[@id='flight-hotel_to_date']")
	public WebElement lnkreturndate;
	
	
	
	
	
	@FindBy(xpath="//button[@id='searchButton']")
	public WebElement lnksearch;
	
	@FindBy(xpath="//button[@id='checkout-button']")
	public WebElement lnkcontinue;
	
	
	
	
	
}
