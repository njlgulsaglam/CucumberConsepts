package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions3 {

	WebDriver driver = null;

	@Given("^I navigated to the zoo website$")
	public void shouldNavigatedToZooSite() throws Throwable {
		driver = new ChromeDriver();
	  driver.navigate().to("https://buffalozoo.org/about/#contact");
	}

	@When("^I click on the about link$")
	public void shouldClickOnAboutLink() throws Throwable{
	    driver.findElement(By.xpath("//ul[@id='menu-primary-navigation-1']//li[@class='active dropdown menu-about']//a[@class='dropdown-toggle']")).click();
	} 
	
	
	@When("^I click on the contact us link$")
	public void shouldClickOnContactUsLink() throws Throwable{
	    driver.findElement(By.id("//nav[@id='desktopNav']//li[@class='active dropdown menu-about']//ul[@class='dropdown-menu']//li[1]")).click();
	driver.findElement(By.id("input_7_1_3")).sendKeys("Nancy");
	driver.findElement(By.id("input_7_1_6")).sendKeys("April");
	driver.findElement(By.id("input_7_2")).sendKeys("nancy_sam@gmail.com");
	driver.findElement(By.id("input_7_5")).sendKeys("15189006789");
	driver.findElement(By.id("gform_submit_button_7")).click();
	} 

	@When("^populate the contact form$")
	public void populateTheContactForm() throws Throwable {
		driver.findElement(By.id("contact_link")).click();
	}
	

	@Then("^I should be on the contact confirmation page$")
	public void checkOnTheContactConfirmationPage() throws Throwable{
	    Assert.assertTrue("Not on confirmation page",
	    driver.getTitle().equals("Contact confirmation"));
	}

}