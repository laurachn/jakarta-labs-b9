package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SauceDemoCheckoutDetailPage extends SauceDemoBasePage {
	
	By headerTxt = By.xpath("//span[@class='title']");
	By finishBtn = By.xpath("//button[@id='finish']");

	public SauceDemoCheckoutDetailPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
	}
	
	public String getHeaderText() {
		return getText(headerTxt);
	}
	
	public void clickFinishButton() {
		clickAndWait(finishBtn);
	}
	
}
