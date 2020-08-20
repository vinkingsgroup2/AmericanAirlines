package bdd.stepDef;
import bdd.AmericanAirlines.PageAction.AABookFlightsPageActions;
import bdd.AmericanAirlines.PageAction.AAHomePageActions;
import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;

	public class AAFlightBookingStepes {
		
		AAHomePageActions AAHomePageActionsObj = new AAHomePageActions();
		AABookFlightsPageActions AABookFlightsPageActionsObj = new AABookFlightsPageActions();
		
		@Given("^Browes American Airlines home page$")
		public void browes_American_Airlines_home_page() throws Throwable {
			AAHomePageActionsObj.loadAAHomePage();
		}

		@When("^Click on the Plan Travel menu$")
		public void click_on_the_Plan_Travel_menu() throws Throwable {
			AAHomePageActionsObj.clickPlanTravel();
		   
		}

		@When("^Click on the flight option$")
		public void click_on_the_flight_option() throws Throwable {
			AAHomePageActionsObj.navigateBookFlightPage();
		}

		@When("^Put the departing city$")
		public void put_the_departing_city() throws Throwable {
			AABookFlightsPageActionsObj.Citiesanddates();
		}

		@When("^Put the arriving city$")
		public void put_the_arriving_city() throws Throwable {
		   
		}

		@When("^Select depart date$")
		public void select_depart_date() throws Throwable {
		   
		}

		@When("^Select depart time$")
		public void select_depart_time() throws Throwable {
		   
		}

		@When("^Select return date$")
		public void select_return_date() throws Throwable {
		   
		}

		@When("^Select return time$")
		public void select_return_time() throws Throwable {
		    
		}

		@When("^Select passenger number (\\d+)$")
		public void select_passenger_number(int arg1) throws Throwable {
		   
		}

		@When("^Select passenger age$")
		public void select_passenger_age() throws Throwable {
		    
		}

		@When("^Search the fare$")
		public void search_the_fare() throws Throwable {
		    
		}

		@Then("^Select the class$")
		public void select_the_class() throws Throwable {
		   
		}

		@Then("^Select the Airlines$")
		public void select_the_Airlines() throws Throwable {
		    
		}

		@Then("^Click the search button$")
		public void click_the_search_button() throws Throwable {
		   
		}
		

	}
	

