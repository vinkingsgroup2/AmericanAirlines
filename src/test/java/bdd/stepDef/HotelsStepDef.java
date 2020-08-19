package bdd.stepDef;

import bdd.AmericanAirlines.PageAction.AmericanairlinesHomePageActions;
import bdd.AmericanAirlines.PageAction.HotelBookingPageActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HotelsStepDef {
	AmericanairlinesHomePageActions AmericanairlinesHomePageActionsObj=new AmericanairlinesHomePageActions();
	HotelBookingPageActions HotelBookingPageActionsObj=new HotelBookingPageActions();
	
	@Given("^Browse to AmericanAirlines homepage$")
	public void browse_to_AmericanAirlines_homepage() throws Throwable {
		AmericanairlinesHomePageActionsObj.loadAmericanairlinesHomepage();
	 
	}

	@When("^Click on Plan Travel$")
	public void click_on_Plan_Travel() throws Throwable {
		AmericanairlinesHomePageActionsObj.clickPlanTravel();
	}

	@When("^Click on hotels$")
	public void click_on_hotels() throws Throwable {
		AmericanairlinesHomePageActionsObj.clickHotel();
	}
	@When("^navigate to hotelBooking page$")
	public void navigate_to_hotelBooking_page() throws Throwable {
		HotelBookingPageActionsObj.hotelBookinginfo();	
	}
	
	@When("^Select city where you like to go$")
	public void select_city_where_you_like_to_go() throws Throwable {
		HotelBookingPageActionsObj.hotelBookinginfo();
		
	}
	@When("^Click on calender$")
	public void click_on_calender() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		HotelBookingPageActionsObj.clickcal();
	}

	@When("^Click Check in date$")
	public void click_Check_in_date() throws Throwable {
		HotelBookingPageActionsObj.clickckindate();
	}
	@When("^Click Check out date$")
	public void click_Check_out_date() throws Throwable {
		HotelBookingPageActionsObj.clickoutdate();
	}
	@When("^Click Search$")
	public void click_Search() throws Throwable {
		HotelBookingPageActionsObj.search();


		

}}
