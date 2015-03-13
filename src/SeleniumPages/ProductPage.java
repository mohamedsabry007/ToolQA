package SeleniumPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage {
	
	final WebDriver driver;
	
	@FindBy(css = "#log")
    private WebElement _userName;
	
	@FindBy(css = "#pwd")
    private WebElement _Password;
	
	@FindBy(id = "login")
    private WebElement _Login;
	
	@FindBy(xpath = ".//*[@id='account_logout']/a")
    private WebElement _LogOut;
	
	@FindBy(css="#wp-admin-bar-my-account > a")
	private WebElement _WelcomeUserTxt;
	
	@FindBy(xpath=".//*[@id='ajax_loginform']/p[1]")
	private WebElement _ErrorMessageTxt;
	
	public ProductPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void EnterLoginInformation()
	{
		_userName.sendKeys("mmahran02");
		_Password.sendKeys("cCpaqR8mnZQP");
	}
	public void EnterInvalidLoginInformation()
	{
		_userName.sendKeys("mmahran02");
		_Password.sendKeys("cCpaqR8mnZQb");
	}
	
	public void Login()
	{
		_Login.click();
	}
	
	public void Logout()
	{
		_LogOut.click();
	}
	
	public String IsWelecomeUserDisplayed()
	
	{
		String ActualText=_WelcomeUserTxt.getText();
		return ActualText;
		
	}
	
	public String IsErrorMessageDisplayed()
	
	{
		String ActualResult=_ErrorMessageTxt.getText();
		return ActualResult;
		
	}
	
}
