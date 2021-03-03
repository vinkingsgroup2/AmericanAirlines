package bdd.stepDef;



import bdd.AmericanAirlines.PageAction.AAHomePageActions;
import bdd.AmericanAirlines.PageAction.AmericanAirlinesCarsPageActions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmericanAirlinesCarsSteps {
	
	//AmericanAirlineskaziHomePageActions AmericanAirlinesHomePageActionsObj = new AmericanAirlineskaziHomePageActions();
	
	AmericanAirlinesCarsPageActions AmericanAirlinesCarsPageActionsObj = new AmericanAirlinesCarsPageActions();
	AAHomePageActions AAHomePageActionsobj = new AAHomePageActions();
//	@Given("^Browse to American Airlines homepage$")
//	public void browse_to_American_Airlines_homepage() throws Throwable {
//		AmericanAirlinesHomePageActionsObj.loadAmericanAirlinesHomePage();	
//	}
	
	


	

@Given("^Browse to American Airlines homepage$")
public void browse_to_American_Airlines_homepage() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
	AAHomePageActionsobj.loadAAHomePage();
	
}


@When("^Navigate Plan Travel$")
public void navigate_to_Plan_Travel() throws Throwable {
	
	
	AAHomePageActionsobj.clickPlanTravel();
}



	@When("^Click on Cars$")
	public void click_on_Cars() throws Throwable {
		AmericanAirlinesCarsPageActionsObj.clickonCars();
  
	}
	
	@When("^Fill form with valid info$")
	public void fill_form_with_valid_info() throws Throwable {
		AmericanAirlinesCarsPageActionsObj.fillupinfo();
	}
	

	@When("^Click on Search$")
	public void click_on_Search() throws Throwable {
		AmericanAirlinesCarsPageActionsObj.searchacar();  
	}


	@When("^Clicks on Select$")
	public void clicks_on_Select() throws Throwable {
		AmericanAirlinesCarsPageActionsObj.selectacar();
	}
	
	@Then("^Customer can see the total price$")
	public void customer_can_see_the_total_price() throws Throwable {
		AmericanAirlinesCarsPageActionsObj.gettext();
	}
	
	}
