package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonHelpPage extends AmazonBasePage {
	
	By conditionsOfUseTxt = By.xpath("//h1[normalize-space()='Conditions of Use']");
	By privacyNoticeTxt = By.xpath("//h1[normalize-space()='Amazon.com Privacy Notice']");
	By headerTxt = By.xpath("//h1[normalize-space()='Account & Login Issues']");
	
	public AmazonHelpPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
	}
	
	public String getConditionsOfUseText() {
		return getText(conditionsOfUseTxt);
	}
	
	public String getPrivacyNoticeText() {
		return getText(privacyNoticeTxt);
	}
	
	public String getHeaderText() {
		return getText(headerTxt);
	}
	
}
