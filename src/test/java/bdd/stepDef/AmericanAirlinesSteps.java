package bdd.stepDef;



import bdd.AmericanAirlines.PageAction.AAHomePageActions;
import bdd.AmericanAirlines.PageAction.AmericanAirlinesVacationpackagePageAction;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmericanAirlinesSteps {

	
	
	AAHomePageActions AmericanAirlinesHomePageActionsObj = new AAHomePageActions ();
	
	AmericanAirlinesVacationpackagePageAction  AmericanAirlinesVacationpackagePageActionobj = new AmericanAirlinesVacationpackagePageAction();
	
	//AmericanAirlinesloginPageAction AmericanAirlinesloginPageActionobj = new AmericanAirlinesloginPageAction();
	
	
	
	@Given("^Browse to AmericanAirlines homepage$")
	public void browse_to_AmericanAirlines_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		AmericanAirlinesHomePageActionsObj.loadAAHomePage();
	}



	@When("^Navigate to Plan Travel$")
	public void navigate_to_Plan_Travel() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		AmericanAirlinesHomePageActionsObj.clickPlanTravel();
	}

	@When("^Navigate to Vacations$")
	public void navigate_to_Vacations() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		AmericanAirlinesVacationpackagePageActionobj.NavigateToVacation();
	}

	@When("^Fill form with info$")
	public void fill_form_with_info() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		AmericanAirlinesVacationpackagePageActionobj.fillupbasicinfo();
	}

	@When("^Select desired package$")
	public void select_desired_package() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		AmericanAirlinesVacationpackagePageActionobj.SelectPackage();
	}

	

	@When("^Select a room$")
	public void select_a_room() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		AmericanAirlinesVacationpackagePageActionobj.SelectRoom();
	}

	@When("^Click continue$")
	public void click_continue() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		AmericanAirlinesVacationpackagePageActionobj.ClickContinue();
	}

	@Then("^Log in Message pops up$")
	public void log_in_Message_pops_up() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		AmericanAirlinesVacationpackagePageActionobj.takescreenshot();
	}


}
