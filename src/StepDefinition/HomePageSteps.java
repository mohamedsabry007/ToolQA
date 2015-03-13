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
	    
		    HomePage homePage=PageFactory.initElements(driver, HomePage.class);
			Assert.assertTrue(homePage.isLogoExist());
	}
	
	@Then("^The User Can See The Slide Show at the home Page$")
	public void the_User_Can_See_The_Slide_Show_at_the_home_Page() throws Throwable {
	   
		HomePage homePage=PageFactory.initElements(driver, HomePage.class);
		Assert.assertTrue(homePage.isSlideShowExist());
	}

}
