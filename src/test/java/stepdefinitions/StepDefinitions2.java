package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions2 {
	
	 @Given ("^I navigated to the zoo website$")
	    public void shouldNavigateToZoo() throws Throwable {
	    	System.out.println("executed the navigate to zoo method");
	    }
	   
		
		@When ("^I click on the about link$")
		public void shouldClickOnTheAbout() throws Throwable{
			System.out.println("executed the click about the link method");
	}
	}


