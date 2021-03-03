package bdd.AmericanAirlines.PageAction;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

//clicks until vacation

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import bdd.AmericanAirlines.PageElements.AmericanAirlinesVacationpackagePageLocator;
import bdd.utilities.SetupDriver;

import junit.framework.Assert;

public class AmericanAirlinesVacationpackagePageAction {
	
	
	AmericanAirlinesVacationpackagePageLocator AmericanAirlinesVacationpackagePageLocatorObj;

	public AmericanAirlinesVacationpackagePageAction() {
		AmericanAirlinesVacationpackagePageLocatorObj = new AmericanAirlinesVacationpackagePageLocator();
		
		PageFactory.initElements(SetupDriver.driver, AmericanAirlinesVacationpackagePageLocatorObj);
		
		}
	public void navigateplantravel(){
		SetupDriver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		AmericanAirlinesVacationpackagePageLocatorObj.lnkNavigate.click();
		
	}
	
	public void NavigateToVacation(){
	
		AmericanAirlinesVacationpackagePageLocatorObj.lnkVacation.click();
	}
	
	
	public void fillupbasicinfo(){
		
		Set<String> id = SetupDriver.driver.getWindowHandles();
		Iterator<String>it = id.iterator();
		String parentWindow = it.next();
		String VacationTab = it.next();
		SetupDriver.driver.switchTo().window(VacationTab);
		
		
		AmericanAirlinesVacationpackagePageLocatorObj.txtFromairport.click();
		
		AmericanAirlinesVacationpackagePageLocatorObj.txtFromairport.sendKeys("jfk");
		AmericanAirlinesVacationpackagePageLocatorObj.txttoairport.sendKeys("las");
		//WebElement nextLink = SetupDrivers.driver.findElement(By.xpath("//input[@id='flight-hotel_from_date"));
		
		AmericanAirlinesVacationpackagePageLocatorObj.lnkdepartdate.clear();
		AmericanAirlinesVacationpackagePageLocatorObj.lnkdepartdate.sendKeys("11/10/2020");
		AmericanAirlinesVacationpackagePageLocatorObj.lnkreturndate.clear();
		AmericanAirlinesVacationpackagePageLocatorObj.lnkreturndate.sendKeys("11/18/2020");
		AmericanAirlinesVacationpackagePageLocatorObj.lnksearch.click();
		
		
		
	}
	
	
	public void SelectPackage() throws InterruptedException{
        	Thread.sleep(20000);
        	
		
		//AmericanAirlinesVacationpackagePageLocatorObj.lnkpackage.click();
	
		JavascriptExecutor je = (JavascriptExecutor) SetupDriver.driver;
		 
		 
		 
		//Identify the WebElement which will appear after scrolling down
		 
		WebElement element = SetupDriver.driver.findElement(By.xpath("//h3[contains(text(),'Golden Nugget Las Vegas Hotel and Casino')]"));
		 
		 
		 
		// now execute query which actually will scroll until that element is not appeared on page.
		 
		je.executeScript("arguments[0].scrollIntoView(true);",element);
		
		element.click();
		
		
		
	}

	
	
	public void SelectRoom() throws InterruptedException{
    	//Thread.sleep(20000);
        	
		
		//AmericanAirlinesVacationpackagePageLocatorObj.lnkpackage.click();
	
		JavascriptExecutor je = (JavascriptExecutor) SetupDriver.driver;
		 
		 
		 
		//Identify the WebElement which will appear after scrolling down
		 
		WebElement element = SetupDriver.driver.findElement(By.cssSelector("body.case-base.lang-en.cobrand-default.page-hotel-detail:nth-child(2) div.ember-application:nth-child(1) div.ember-view main.container.page-content.automation-page-header:nth-child(3) div.page-body div.page-body.automation-hotelDetails div.main-contents-container.col-md-12.product.product-detail:nth-child(2) section.product-details-list:nth-child(5) div.section-body:nth-child(2) div.component div.component-body div.ember-view div.automation-selectRoom div.clearfix ul.list-unstyled.products-list.products-rooms li.automation-roomOption.product:nth-child(1) div.product-body div.clearfix.text-right.product-padding > button.automation-checkRoom.btn-min-width.ember-view.automation-checkRoom.btn-min-width.btn.btn-primary"));
		 
		 
		 
		// now execute query which actually will scroll until that element is not appeared on page.
		 
		je.executeScript("arguments[0].scrollIntoView(true);",element);
		
		element.click();
	
		
	}
	
	
	public void ClickContinue() throws InterruptedException{
		Thread.sleep(15000);
		AmericanAirlinesVacationpackagePageLocatorObj.lnkcontinue.click();
		
		
	}
	
	
	public void takescreenshot() throws IOException, InterruptedException{
		Thread.sleep(10000);
		//String confirmMsg = AmericanAirlinesVacationpackagePageLocatorObj.txtget.getText(); //calling locator
		//Assert.assertEquals(confirmMsg, "Log in to redeem AAdvantage Miles.");
		
		File screenshot = ((TakesScreenshot)SetupDriver.driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("C:\\TTSoftware\\ScreenShot\\screenshot.jpg"));
	}
	
	
	
	
}
