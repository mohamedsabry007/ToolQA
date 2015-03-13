package cucumberTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbstractPageStepDefination {
	
	protected static WebDriver driver;
	protected WebDriver getDriver() {
		if(driver==null)
		{
			driver=new FirefoxDriver();
			
		}
		return driver;
	}

}
