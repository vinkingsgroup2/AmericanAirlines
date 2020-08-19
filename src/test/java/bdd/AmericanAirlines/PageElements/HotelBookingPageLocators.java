package bdd.AmericanAirlines.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

//choose city
public class HotelBookingPageLocators {

	
@FindBy(xpath="//input[@type='search']")
public WebElement txtWhere;

//click calendar box
@FindBy(xpath="//div[contains(@class,'xp__dates-inner xp__dates__checkin')]//span[contains(@class,'sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb')]")
public WebElement clkcalender;

//select checking date
@FindBy(xpath = "//span[@aria-label='24 August 2020']")
public WebElement clkinDate;

//select check out date 
@FindBy(xpath= "//span[@aria-label='31 August 2020']")
public WebElement clkoutDate;

// click search button
@FindBy(xpath="//span[@class='b-button__text']")
public WebElement clicksearch;






















// Select check in date
//@FindBy(xpath ="//td[@class='bui-calendar__date bui-calendar__date--selected']//span//span[contains(text(),'24')]")
//public WebElement clkInDate;
//
//// select check out date 
//@FindBy(xpath= "//td[@class='bui-calendar__date bui-calendar__date--selected']")
//public WebElement clkoutDate;
//
// 
////select search button
// @FindBy(xpath="//div[@class='bui-banner bui-banner--image bui-u-bleed@small bui-aa'])]")
// public WebElement clkSearch;
}
