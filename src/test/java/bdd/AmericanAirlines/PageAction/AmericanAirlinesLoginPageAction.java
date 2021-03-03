package bdd.AmericanAirlines.PageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import bdd.AmericanAirlines.PageElements.AmericanAirlinesLoginPageLoactors;
import bdd.utilities.SetupDriver;



public class AmericanAirlinesLoginPageAction {
	
	AmericanAirlinesLoginPageLoactors AmericanAirlinesLoginPageLoactorsObj;
	public AmericanAirlinesLoginPageAction(){
		AmericanAirlinesLoginPageLoactorsObj = new AmericanAirlinesLoginPageLoactors();
	PageFactory.initElements(SetupDriver.driver, AmericanAirlinesLoginPageLoactorsObj);
	}
	
	
	public void navigatetologin(){
		
		SetupDriver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		AmericanAirlinesLoginPageLoactorsObj.Inkclklogin.click();
		
	}
	
     public void fillupinfo() throws InterruptedException{
    	 Thread.sleep(5000);
    	 AmericanAirlinesLoginPageLoactorsObj.txtusername.sendKeys("sakhirhossain");
    	 AmericanAirlinesLoginPageLoactorsObj.txtlastname.sendKeys("hossain");
    	 AmericanAirlinesLoginPageLoactorsObj.txtpassword.sendKeys("Vikings123");
    	 
		
	}

    public void clickslogin(){
    	AmericanAirlinesLoginPageLoactorsObj.Inklogin.click();
	
      }
	
	
	

}
