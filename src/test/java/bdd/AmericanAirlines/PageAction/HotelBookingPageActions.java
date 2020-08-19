package bdd.AmericanAirlines.PageAction;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.support.PageFactory;

import bdd.AmericanAirlines.PageElements.HotelBookingPageLocators;
import bdd.utilities.SetupDriver;

public class HotelBookingPageActions {
	HotelBookingPageLocators HotelBookingPageLocatorsObj;
	public HotelBookingPageActions(){
		HotelBookingPageLocatorsObj = new HotelBookingPageLocators();
	PageFactory.initElements(SetupDriver.driver, HotelBookingPageLocatorsObj);
	}	
	 
 public static  void switchWindow(){
	 Set<String> id = SetupDriver.driver.getWindowHandles();
		Iterator<String>it = id.iterator();
		
		String parentWindow = it.next();
		String BookingPage = it.next();
		SetupDriver.driver.switchTo().window(BookingPage);
		
 }
 
 

		public void hotelBookinginfo(){
			switchWindow();
			 HotelBookingPageLocatorsObj.txtWhere.sendKeys("Las Vegas, United States");
		}
			public void clickcal(){
			 HotelBookingPageLocatorsObj.clkcalender.click();
			 
			}
			 
			public void clickckindate(){
			HotelBookingPageLocatorsObj.clkinDate.click();
			}
			
			public void clickoutdate(){
		      HotelBookingPageLocatorsObj.clkinDate.click();
			}
			
			public void search(){
			 HotelBookingPageLocatorsObj.clicksearch.click();
			 
			}
		}
    

    
			 		
			 
			 
			
		

