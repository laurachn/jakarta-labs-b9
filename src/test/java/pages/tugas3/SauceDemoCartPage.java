package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SauceDemoCartPage extends SauceDemoBasePage {
	
	By headerTxt = By.xpath("//span[@class='title']");
	By checkoutBtn = By.xpath("//button[@id='checkout']");

	public SauceDemoCartPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
	}
	
	public String getHeaderText() {
		return getText(headerTxt);
	}
	
	public void clickCheckoutButton() {
		clickAndWait(checkoutBtn);
	}
	
}
