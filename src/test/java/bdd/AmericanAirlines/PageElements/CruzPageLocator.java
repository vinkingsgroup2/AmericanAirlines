package bdd.AmericanAirlines.PageElements;









import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CruzPageLocator {

@FindBy (xpath="//a[@class='headerNavMainLink wthNavMainLink_1 ui-link']")
public WebElement lnkCruiselines;

@FindBy (xpath="//a[contains(text(),'Carnival Cruise Line')]")
public WebElement lnkCarnivalCruiseLine;

@FindBy (xpath="//input[@id='zipcode']")
public WebElement txtZipCode;

@FindBy (xpath="//input[@id='email']")
public WebElement txtEmailAddress;

@FindBy (xpath="//a[@id='continue']")
public WebElement lnkContinue;

@FindBy (xpath="//div[@id='totalPriceUpRightWraper']")
public WebElement TotalPrice;


}