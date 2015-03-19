
package SeleniumPages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	@FindBy(xpath = ".//*[@id='account']/a")
    private WebElement _UserLogin;
	
	@FindBy(css="#logo")
	private WebElement _Logo;
	
	@FindBy(css="#wrapper")
	private WebElement _container;
	
	@FindBy(css="#main-nav")
	private WebElement _MainMenu;
	
	public void NavigateToLogInPage() 
	{
		this._UserLogin.click();
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
	public boolean isLogoExist()
	{
		return _Logo.isDisplayed();
	}
	public boolean isSlideShowExist()
	{
		return _container.isDisplayed();
	}
	public boolean IsMainMenuDisplayed()
	
	{
		return _MainMenu.isDisplayed();
	}
	
	
   }