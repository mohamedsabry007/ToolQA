package StepDefinition;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import SeleniumPages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberTest.AbstractPageStepDefination;

public class CommonPageStepDefinationClass extends AbstractPageStepDefination{
	WebDriver driver=getDriver();
	HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
         driver.get("http://www.store.demoqa.com");
         homePage.DocumentReady(driver);
         driver.manage().window().maximize();
        }
	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable
			{
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.NavigateToLogInPage();
			}
	@Then("^User Will Close The driver$")
 	public void user_Will_Close_The_driver() throws Throwable {
 	    driver.quit();
 	    
 	}

}
