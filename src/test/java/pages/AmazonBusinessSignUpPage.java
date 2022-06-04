package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonBusinessSignUpPage extends AmazonBasePage {
	
	By titleTxt = By.xpath("//span[contains(text(),'Let’s create your free Amazon Business account')]");
	
	public AmazonBusinessSignUpPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
	}
	
	public String getTitleText() {
		return getText(titleTxt);
	}
	
}
