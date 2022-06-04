package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SauceDemoCheckoutPage extends SauceDemoBasePage {
	
	By headerTxt = By.xpath("//span[@class='title']");
	By firstNameInpt = By.xpath("//input[@id='first-name']");
	By lastNameInpt = By.xpath("//input[@id='last-name']");
	By postalCodeInpt = By.xpath("//input[@id='postal-code']");
	By continueBtn = By.xpath("//input[@id='continue']");

	public SauceDemoCheckoutPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
	}
	
	public String getHeaderText() {
		return getText(headerTxt);
	}
	
	public void inputFirstName(String firstName) {
		setText(firstNameInpt, firstName);
	}
	
	public void inputLastName(String lastName) {
		setText(lastNameInpt, lastName);
	}
	
	public void inputPostalCode(String postalCode) {
		setText(postalCodeInpt, postalCode);
	}
	
	public void clickContinueButton() {
		clickAndWait(continueBtn);
	}

}
