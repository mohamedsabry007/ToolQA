package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import SeleniumPages.ProductPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberTest.AbstractPageStepDefination;
public class LoginSteps extends AbstractPageStepDefination {
		
	 WebDriver driver = getDriver();
	
	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
		ProductPage pdpPage = PageFactory.initElements(driver, ProductPage.class);
		pdpPage.EnterLoginInformation();
		pdpPage.Login();
		}
	
	@When("^User enters UserName and Password With Wrong Credentials$")
	public void user_enters_UserName_and_Password_With_Wrong_Credentials() throws Throwable {
		ProductPage pdpPage = PageFactory.initElements(driver, ProductPage.class);
	    pdpPage.EnterInvalidLoginInformation();
	    pdpPage.Login();
	}
	
	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
		ProductPage pdpPage = PageFactory.initElements(driver, ProductPage.class);
		pdpPage.Logout();
	}
	
	@Then("^Welcome Message displayed at the header$")
	public void message_displayed_at_the_header() throws Throwable {
		
		ProductPage pdpPage = PageFactory.initElements(driver, ProductPage.class);
		String ExpectedMessage="Howdy, mmahran02";
		Assert.assertEquals(ExpectedMessage, pdpPage.IsWelecomeUserDisplayed());
	}
 	@Then("^Error return to the user with invalid Login credentials")
 		public void ErrorReturnToTheUserWithInvalidCredentials() throws Throwable 
 			{
 		ProductPage pdpPage = PageFactory.initElements(driver, ProductPage.class);
 		String ExpectedResult="ERROR: Invalid login credentials.";	
 		Assert.assertEquals(ExpectedResult, pdpPage.IsErrorMessageDisplayed());
 			}
 	
 	
 	
 
}