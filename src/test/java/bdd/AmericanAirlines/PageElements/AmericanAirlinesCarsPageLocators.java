package bdd.AmericanAirlines.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmericanAirlinesCarsPageLocators {

	
	@FindBy(xpath= "//a[contains(text(),'Cars')]")
	public WebElement lnkCars;
	
	@FindBy(xpath = "//input[@name='carHomeSearchForm.pickUpPlace']")
	public WebElement txtPickupPlace;

	@FindBy(xpath = "//label[contains(text(),'Pick-up date')]")
	public WebElement txtPickupDate;

	@FindBy(xpath	= "//label[contains(text(),'Pick-up time')]")
	public WebElement txtPickupTime;

	@FindBy(xpath = "//input[@name='carHomeSearchForm.dropOffDate']")
	public WebElement txtDropoffDate;
	
	@FindBy(xpath = "//label[contains(text(),'Drop-off time')]")
	public WebElement txtDropoffTime;

	@FindBy (xpath = "//button[@id='searchButton']")
	public WebElement lnkButton;
	
	@FindBy (id = "rentalPriceTotal")
	public WebElement TotalPrice;


}
