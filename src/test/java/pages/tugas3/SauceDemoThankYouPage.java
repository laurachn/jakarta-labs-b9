package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SauceDemoThankYouPage extends SauceDemoBasePage {
	
	By thankYouTxt = By.xpath("//h2[@class='complete-header']");
	
	public SauceDemoThankYouPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
	}
	
	public String getThankYouText() {
		return getText(thankYouTxt);
	}
	
}
