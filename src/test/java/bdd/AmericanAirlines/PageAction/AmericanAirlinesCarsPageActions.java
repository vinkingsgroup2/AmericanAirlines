package bdd.AmericanAirlines.PageAction;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import bdd.AmericanAirlines.PageElements.AmericanAirlinesCarsPageLocators;
import bdd.utilities.SetupDriver;


public class AmericanAirlinesCarsPageActions {

	AmericanAirlinesCarsPageLocators AmericanAirlinesCarsPageLocatorsObj;

	public AmericanAirlinesCarsPageActions() {
		AmericanAirlinesCarsPageLocatorsObj = new AmericanAirlinesCarsPageLocators();
		PageFactory.initElements(SetupDriver.driver, AmericanAirlinesCarsPageLocatorsObj);

	}
	
	public void clickonCars(){	
		AmericanAirlinesCarsPageLocatorsObj.lnkCars.click();
	}

	public void fillupinfo() throws InterruptedException{


		Set<String> id = SetupDriver.driver.getWindowHandles();
		Iterator<String>it = id.iterator();
		String parentWindow = it.next();
		String carTab = it.next();
		SetupDriver.driver.switchTo().window(carTab);


		AmericanAirlinesCarsPageLocatorsObj.txtPickupPlace.sendKeys("LAS");
		AmericanAirlinesCarsPageLocatorsObj.txtPickupDate.sendKeys("11/10/2020");
		AmericanAirlinesCarsPageLocatorsObj.txtPickupTime.sendKeys("11:00 am");
		AmericanAirlinesCarsPageLocatorsObj.txtDropoffDate.sendKeys("11/18/2020");
		AmericanAirlinesCarsPageLocatorsObj.txtDropoffTime.sendKeys("10:30 pm");
	}

	public void searchacar(){
		AmericanAirlinesCarsPageLocatorsObj.lnkButton.click();


	}

	public void selectacar() throws InterruptedException{

		Thread.sleep(5000);



		JavascriptExecutor je = (JavascriptExecutor) SetupDriver.driver; 

		WebElement element = SetupDriver.driver.findElement(By.xpath("//div[22]//div[2]//div[4]//div[1]//div[1]//div[3]//div[2]//button[1]"));

		je.executeScript("arguments[0].scrollIntoView(true);",element);

		element.click();
		}


		public void gettext(){

		AmericanAirlinesCarsPageLocatorsObj.TotalPrice.getText();	


	}
}
