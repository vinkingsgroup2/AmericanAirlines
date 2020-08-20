package bdd.AmericanAirlines.PageAction;










import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


import bdd.AmericanAirlines.PageElements.CruzPageLocator;
import bdd.utilities.SetupDriver;



public class CruzPageAction {

	CruzPageLocator AmericanAirlinesCruisesPageLocatorsObj;

public CruzPageAction() {
AmericanAirlinesCruisesPageLocatorsObj = new CruzPageLocator();
PageFactory.initElements(SetupDriver.driver, AmericanAirlinesCruisesPageLocatorsObj);

}

public void Cruiselines(){

Set<String> id = SetupDriver.driver.getWindowHandles();
Iterator<String>it = id.iterator();
String parentWindow = it.next();
String cruisesTab = it.next();
SetupDriver.driver.switchTo().window(cruisesTab);

AmericanAirlinesCruisesPageLocatorsObj.lnkCruiselines.click();

}

public void CarnivalCruiseLine(){

AmericanAirlinesCruisesPageLocatorsObj.lnkCarnivalCruiseLine.click();
}

public void ViewItinerary() throws InterruptedException {

Thread.sleep(3000);

JavascriptExecutor je = (JavascriptExecutor) SetupDriver.driver;

WebElement element = SetupDriver.driver.findElement(By.xpath("//a[@id='seeDetail1']"));

je.executeScript("arguments[0].scrollIntoView(true);",element);

element.click();

}

public void SailingDate() throws InterruptedException {

Thread.sleep(3000);

JavascriptExecutor je = (JavascriptExecutor) SetupDriver.driver;

WebElement element = SetupDriver.driver.findElement(By.xpath("//a[@id='select_2']"));

je.executeScript("arguments[0].scrollIntoView(true);",element);

element.click();
}

public void FillupBasicInformation() throws InterruptedException {

Thread.sleep(3000);

JavascriptExecutor je = (JavascriptExecutor) SetupDriver.driver;

WebElement element = SetupDriver.driver.findElement(By.xpath("//input[@id='zipcode']"));

je.executeScript("arguments[0].scrollIntoView(true);",element);

element.click();

AmericanAirlinesCruisesPageLocatorsObj.txtZipCode.sendKeys("11377");

Thread.sleep(2000);

AmericanAirlinesCruisesPageLocatorsObj.txtEmailAddress.sendKeys("nirjhola_19@yahoo.com");

Thread.sleep(2000);

AmericanAirlinesCruisesPageLocatorsObj.lnkContinue.click();
}

public void SelectRoom() throws InterruptedException{

Thread.sleep(3000);

JavascriptExecutor je = (JavascriptExecutor) SetupDriver.driver;

WebElement element = SetupDriver.driver.findElement(By.xpath("//a[@id='81-73_9_Select']"));

je.executeScript("arguments[0].scrollIntoView(true);",element);

element.click();
}

public void gettext() throws InterruptedException{

AmericanAirlinesCruisesPageLocatorsObj.TotalPrice.getText();

Thread.sleep(3000);

}

}

