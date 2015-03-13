package StepDefinition;



import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import SeleniumPages.HomePage;
import cucumber.api.java.en.Then;
import cucumberTest.AbstractPageStepDefination;

public class HomePageSteps extends AbstractPageStepDefination {
	WebDriver driver = getDriver();
	@Then("^The user Can See The Logo of our website$")
	public void the_user_Can_See_The_Logo_of_our_website() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		    HomePage homePage=PageFactory.initElements(driver, HomePage.class);
			Assert.assertTrue(homePage.isLogoExist());
	}

}
