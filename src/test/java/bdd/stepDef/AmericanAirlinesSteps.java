package bdd.stepDef;


import bdd.AmericanAirlines.PageAction.AmericanAirlinesVacationpackagePageAction;
import bdd.AmericanAirlines.PageAction.AmericanairlinesHomePageActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmericanAirlinesSteps {

	
	
	AmericanairlinesHomePageActions  AmericanAirlinesHomePageActionsObj = new AmericanairlinesHomePageActions ();
	
	AmericanAirlinesVacationpackagePageAction  AmericanAirlinesVacationpackagePageActionobj = new AmericanAirlinesVacationpackagePageAction();
	
	//AmericanAirlinesloginPageAction AmericanAirlinesloginPageActionobj = new AmericanAirlinesloginPageAction();
	
	
	
	@Given("^Browse to American Airlines homepage$")
	public void browse_to_American_Airlines_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		AmericanAirlinesHomePageActionsObj.loadAmericanairlinesHomepage();
		
	}
	


	@When("^Navigate to Plan Travel$")
	public void navigate_to_Plan_Travel() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		AmericanAirlinesVacationpackagePageActionobj.navigateplantravel();
	}

	@When("^Navigate to Vacations$")
	public void navigate_to_Vacations() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		AmericanAirlinesVacationpackagePageActionobj.NavigateToVacation();
	}

	@When("^Fill form with some basic information$")
	public void fill_form_with_some_basic_information() throws Throwable {
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
