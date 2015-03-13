package SeleniumPages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AccountPage {

	@FindBy(how =How.XPATH,using=".//*[@id='footer']/section[2]/ul/li[2]/a[3]")
	private WebElement _Product;  
	
	
	public void SelectProduct()
	{
		_Product.click();
	}

}
