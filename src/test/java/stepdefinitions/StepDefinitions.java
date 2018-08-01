package stepdefinitions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {

WebDriver driver =null;


    @Given ("^I navigated to the zoo website$")
    public void shouldNavigateToZooSite() throws Throwable {
    	System.out.println("executed the navigate to zoo method");
    }
   

	@When("^I click on the adaption link$")
	public void shouldClickOnAdaption()throws Throwable {
	   System.out.println("executed the click on adaption method");
	}

	@Then("^I check to see that no animals are available$")
	public void checkAnimalStringVisible()throws Throwable {
        System.out.println("checked that the animals string was visible or not");
        
	}
	

	
	
}








