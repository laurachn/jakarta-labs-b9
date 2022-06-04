package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonOTPPage extends AmazonBasePage {
	
	By headerTxt = By.xpath("//h1[normalize-space()='Verify email address']");
	By header2Txt = By.xpath("//h1[normalize-space()='Verify mobile number']");
	
	public AmazonOTPPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
	}
	
	public String getHeaderText() {
		return getText(headerTxt);
	}
	
	public String getHeader2Text() {
		return getText(header2Txt);
	}
	
}
