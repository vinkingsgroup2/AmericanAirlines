package bdd.AmericanAirlines.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AABookFlightsPageLocators {
	
	//From
	//@FindBy(xpath="//input[@id='segments0.origin']")
	//public WebElement txtFrom;
	
	//To
	@FindBy(xpath="//input[@id='segments0.destination']")
	public WebElement txtTo;
	
	//Depart
	@FindBy(xpath="//input[@id='segments0.travelDate']")
	public WebElement txtDepart;
	
	/*@FindBy(xpath="//a[@class='ui-datepicker-next ui-corner-all']")
	public WebElement clkNext;
	
	@FindBy(xpath="//a[@class='ui-datepicker-next ui-corner-all']")
	public WebElement clkNext1;
	
	@FindBy(xpath="//a[@class='ui-datepicker-next ui-corner-all']")
	public WebElement clkNext11;
	
	@FindBy(xpath="//div[@class='ui-datepicker-group ui-datepicker-group-last']//a[@class='ui-state-default'][contains(text(),'10')]")
	public WebElement dateToSelect;*/
	
	@FindBy(xpath="//input[@id='segments1.travelDate']")
	public WebElement txtReturn;
	
	@FindBy(xpath="//button[@id='flightSearchSubmitBtn']")
	public WebElement lnkSubmit;
	
	
	
	
	
	
	
	

}
