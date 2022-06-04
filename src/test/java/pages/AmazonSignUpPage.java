package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonSignUpPage extends AmazonBasePage {
	
	By continueBtn = By.xpath("//input[@id='continue']");
	By yourNameErrorTxt = By.xpath("//div[contains(text(),'Enter your name')]");
	By mobileNumberOrEmailErrorTxt = By.xpath("//div[@class='a-alert-content'][normalize-space()='Wrong or Invalid email address or mobile phone number. Please correct and try again.']");
	By passwordErrorTxt = By.xpath("//div[@id='auth-password-invalid-password-alert']//div[@class='a-alert-content'][normalize-space()='Minimum 6 characters required']");
	By nameInpt = By.xpath("//input[@id='ap_customer_name']");
	By passwordInpt = By.xpath("//input[@id='ap_password']");
	By emailInpt = By.xpath("//input[@id='ap_email']");
	By confirmPasswordInpt = By.xpath("//input[@id='ap_password_check']");
	By conditionsOfUseLink = By.xpath("//div[@id='legalTextRow']//a[contains(text(),'Conditions of Use')]");
	By privacyNoteLink = By.xpath("//div[@id='legalTextRow']//a[contains(text(),'Privacy Notice')]");
	By signInLink = By.xpath("//a[normalize-space()='Sign-In']");
	By createABusinessFreeAccountLink = By.xpath("//a[@id='ab-registration-link']");
	By countryDropdown = By.xpath("//span[@class='country-display-text']");
	By headerTxt = By.xpath("//h1[@class='a-spacing-small']");
	
	public AmazonSignUpPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
	}
	
	public String getNameErrorText() {
		return getText(yourNameErrorTxt);
	}
	
	public String getMobileNumberOrEmailErrorText() {
		return getText(mobileNumberOrEmailErrorTxt);
	}
	
	public String getPasswordErrorText() {
		return getText(passwordErrorTxt);
	}
	
	public void clickContinueButton() {
		clickAndWait(continueBtn);
	}
	
	public void inputName(String name) {
		setText(nameInpt, name);
	}
	
	public void inputPassword(String password) {
		setText(passwordInpt, password);
	}
	
	public void inputEmail(String email) {
		setText(emailInpt, email);
	}
	
	public void inputConfirmPassword(String password) {
		setText(confirmPasswordInpt, password);
	}
	
	public void clickConditionsOfUseLink() {
		clickAndWait(conditionsOfUseLink);
	}
	
	public void clickPrivacyNoteLink() {
		clickAndWait(privacyNoteLink);
	}
	
	public void clickSignInLink() {
		clickAndWait(signInLink);
	}
	
	public void clickCreateABusinessFreeAccountLink() {
		clickAndWait(createABusinessFreeAccountLink);
	}
	
	public void clickCountryDropdown() {
		clickAndWait(countryDropdown);
	}
	
	public void selectCountry(String countryID) {
		By countryList = By.xpath("//a[@id='auth-country-picker_" + countryID + "']");
		clickAndWait(countryList);
	}
	
	public String getHeaderText() {
		return getText(headerTxt);
	}
	
}
