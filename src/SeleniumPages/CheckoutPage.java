package SeleniumPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage {
	@FindBy(how =How.CSS,using=".wpsc_buy_button")
	private WebElement _AddToCart;
	@FindBy(how =How.CSS,using=".go_to_checkout")
	private WebElement _GoToCheckOut;
	
	@FindBy(how =How.CSS,using=".entry-content")
	private WebElement _entryContent;
	
	public void AddToCart()
	
	{
		_AddToCart.click();
	}
	public void GoToCheckOut()
	
	{
		_GoToCheckOut.click();
	}
	
	public boolean IsCheckoutCartDisplayed()
	
	{
		return _entryContent.isDisplayed();
	}
	
	
	public void  DocumentReady(WebDriver driver) {
        ExpectedCondition<Boolean> pageLoadCondition = new
            ExpectedCondition<Boolean>() {
                public Boolean apply(WebDriver driver) {
                    return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
                }
            };
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(pageLoadCondition);
    }

	
}
