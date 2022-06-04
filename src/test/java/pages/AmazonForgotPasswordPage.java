package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonForgotPasswordPage extends AmazonBasePage {

	By headerTxt = By.xpath("//h1[normalize-space()='Password assistance']");

	public AmazonForgotPasswordPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
	}
	
	public String getHeaderText() {
		return getText(headerTxt);
	}
	
}
