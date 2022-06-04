package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonHomePage extends AmazonBasePage {
	
	By accountTxt = By.xpath("//span[@id='nav-link-accountList-nav-line-1']");
	
	public AmazonHomePage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
	}
	
	public String getAccountText() {
		return getText(accountTxt);
	}
}
