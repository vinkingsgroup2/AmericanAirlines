package bdd.stepDef;

import bdd.AmericanAirlines.PageAction.BagPageAction;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BagsStepDef {
	BagPageAction BagPageActionobj=new BagPageAction();
	
	@When("^Click on Travel information$")
	public void click_on_Travel_information() throws Throwable {
		BagPageActionobj.clickTravelinformation();  
	}

	@When("^Click on Bags$")
	public void click_on_Bags() throws Throwable {
		BagPageActionobj.clickOnbags();
	}
	@Then("^Carry on bags$")
	public void carry_on_bags() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		BagPageActionobj.carryonbag();
	}


	

}
