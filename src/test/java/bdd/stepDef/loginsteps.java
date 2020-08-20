package bdd.stepDef;




import bdd.AmericanAirlines.PageAction.AmericanAirlinesLoginPageAction;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginsteps {

	AmericanAirlinesLoginPageAction AmericanAirlinesLoginPageActionobj = new AmericanAirlinesLoginPageAction();

	//AmericanairlinesHomePageActions  AmericanAirlinesHomePageActionsObj = new AmericanairlinesHomePageActions ();
	


	
	
	
	

	
//	@Given("^Browse to AmericanAirlines homepage$")
//	public void browse_to_AmericanAirlines_homepage() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		AmericanAirlinesHomePageActionsObj.loadAmericanairlinesHomepage();
//	}

	@When("^Navigate to log in$")
	public void navigate_to_log_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		AmericanAirlinesLoginPageActionobj.navigatetologin();
	}

	@When("^Fill form$")
	public void fill_form() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		AmericanAirlinesLoginPageActionobj.fillupinfo();
		}

	@Then("^click on Login$")
	public void click_on_Login() throws Throwable {
		AmericanAirlinesLoginPageActionobj.clickslogin();
	}
}
