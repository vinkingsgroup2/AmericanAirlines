package bdd.stepDef;






import bdd.AmericanAirlines.PageAction.AmericanAirlinesnadiHomePageActions;
import bdd.AmericanAirlines.PageAction.CruzPageAction;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmericanAirlinesCruisesSteps {
	AmericanAirlinesnadiHomePageActions AmericanAirlinesHomePageActionsObj= new AmericanAirlinesnadiHomePageActions();
	CruzPageAction AmericanAirlinesCruisesPageActionsObj= new CruzPageAction();


//@Given("^Browse to AmericanAirlines homepage$")
//public void browse_to_AmericanAirlines_homepage() throws Throwable {
//AmericanAirlinesHomePageActionsObj.loadAmericanAirlinesHomepage();
//
//}

//@When("^Navigate to Plan Travel$")
//public void navigate_to_Plan_Travel() throws Throwable {
//AmericanAirlinesHomePageActionsObj.navigatePlanTravelPage();
//
//}

@When("^Navigate to Cruises$")
public void navigate_to_Cruises() throws Throwable {
AmericanAirlinesHomePageActionsObj.navigateCruises();
}

@When("^Navigate to Cruise lines$")
public void navigate_to_Cruise_lines() throws Throwable {
AmericanAirlinesCruisesPageActionsObj.Cruiselines();
}

@When("^Select Cruise$")
public void select_Cruise() throws Throwable {
AmericanAirlinesCruisesPageActionsObj.CarnivalCruiseLine();
}

@When("^Select View Itinerary$")
public void select_View_Itinerary() throws Throwable {
AmericanAirlinesCruisesPageActionsObj.ViewItinerary();
}

@When("^Select Sailing Date$")
public void select_Sailing_Date() throws Throwable {
AmericanAirlinesCruisesPageActionsObj.SailingDate();
}

@When("^Fillup Basic Information$")
public void fillup_Basic_Information() throws Throwable {
AmericanAirlinesCruisesPageActionsObj.FillupBasicInformation();
}

@When("^Select Room$")
public void select_Room() throws Throwable {
AmericanAirlinesCruisesPageActionsObj.SelectRoom();
}

@Then("^User can see the total price$")
public void user_can_see_the_total_price() throws Throwable {
AmericanAirlinesCruisesPageActionsObj.gettext();
}


}
