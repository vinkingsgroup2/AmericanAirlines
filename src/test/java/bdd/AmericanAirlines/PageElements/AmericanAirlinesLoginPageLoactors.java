package bdd.AmericanAirlines.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmericanAirlinesLoginPageLoactors {

	
	@FindBy(xpath="//a[@id='loginLogoutLink']")
	public WebElement Inkclklogin;
	
	
	@FindBy(xpath="//input[@id='loginId']")
	public WebElement txtusername;
	
	@FindBy(xpath="//input[@id='lastName']")
	public WebElement txtlastname;
	
	@FindBy(xpath="//input[@id='password']")
	public WebElement txtpassword;
	
	
	
	@FindBy(xpath="//button[@id='button_login']")
	public WebElement Inklogin;
	
	
}
