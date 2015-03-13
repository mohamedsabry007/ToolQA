package StepDefinition;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;

import SeleniumPages.AccountPage;
import SeleniumPages.CheckoutPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberTest.AbstractPageStepDefination;

public class CheckoutSteps extends AbstractPageStepDefination {
	WebDriver driver=getDriver();
	 
	@And("^User Select Product$")
		public void user_Select_See_Product() throws Throwable {
			
			AccountPage accountPage=PageFactory.initElements(driver, AccountPage.class);
			accountPage.SelectProduct();
	}
	@When("^User Press Add To Cart$")
	public void user_Press_Add_To_Cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    CheckoutPage checkoutPage=PageFactory.initElements(driver, CheckoutPage.class);
	    checkoutPage.DocumentReady(driver);
	    checkoutPage.AddToCart();
	}
	@When("^User Press Go to Chekout$")
	public void user_press_Go_to_Checkout() throws Throwable
	{
		CheckoutPage checkoutPage=PageFactory.initElements(driver, CheckoutPage.class);
		checkoutPage.GoToCheckOut();
	}
	@Then("^User See  Checkout Cart$")
	public void user_See_Checkout_Cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		CheckoutPage checkoutPage=PageFactory.initElements(driver, CheckoutPage.class);
		Assert.assertTrue(checkoutPage.IsCheckoutCartDisplayed());
	}

}
