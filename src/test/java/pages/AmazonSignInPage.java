package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonSignInPage extends AmazonBasePage {
	
	By signInTxt = By.xpath("//h1[@class='a-spacing-small']");
	By createYourAmazonAccountBtn = By.xpath("//a[@id='createAccountSubmit']");
	By conditionsOfUseLink = By.xpath("//div[@id='legalTextRow']//a[contains(text(),'Conditions of Use')]");
	By privacyNoteLink = By.xpath("//div[@id='legalTextRow']//a[contains(text(),'Privacy Notice')]");
	By continueButton = By.xpath("//input[@id='continue']");
	By emailOrPhoneNumberErrorTxt = By.xpath("//div[contains(text(),'Enter your email or mobile phone number')]");
	By errorTxt = By.xpath("//span[@class='a-list-item']");
	By emailOrPhoneNumberInpt = By.xpath("//input[@id='ap_email']");
	By passwordInpt = By.xpath("//input[@id='ap_password']");
	By signInButton = By.xpath("//input[@id='signInSubmit']");
	By changeEmailLink = By.xpath("//a[@id='ap_change_login_claim']");
	By forgotPasswordLink = By.xpath("//a[@id='auth-fpp-link-bottom']");
	By detailsLink = By.xpath("//a[@id='remember_me_learn_more_link']");
	By popUpTitle = By.xpath("//h4[@id='a-popover-header-1']");
	By popupBody = By.xpath("//div[@id='a-popover-content-1']");
	By needHelpLink = By.xpath("//span[@class='a-expander-prompt']");
	By otherIssuesWithSignInLink = By.xpath("//a[@id='ap-other-signin-issues-link']");
	
	public AmazonSignInPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
	}
	
	public String getSignInText() {
		return getText(signInTxt);
	}
	
	public void clickCreateYourAmazonAccount() {
		clickAndWait(createYourAmazonAccountBtn);
	}
	
	public void clickConditionsOfUseLink() {
		clickAndWait(conditionsOfUseLink);
	}
	
	public void clickPrivacyNoteLink() {
		clickAndWait(privacyNoteLink);
	}
	
	public void clickContinueButton() {
		clickAndWait(continueButton);
	}
	
	public String getEmailOrPhoneNumberErrorText() {
		return getText(emailOrPhoneNumberErrorTxt);
	}
	
	public String getErrorText() {
		return getText(errorTxt);
	}
	
	public void inputEmail(String email) {
		setText(emailOrPhoneNumberInpt, email);
	}
	
	public void inputPhoneNumber(String phoneNumber) {
		setText(emailOrPhoneNumberInpt, phoneNumber);
	}
	
	public void inputPassword(String password) {
		setText(passwordInpt, password);
	}
	
	public void clickSignInButton() {
		clickAndWait(signInButton);
	}
	
	public void clickChangeEmailLink() {
		clickAndWait(changeEmailLink);
	}
	
	public void clickForgotPasswordLink() {
		clickAndWait(forgotPasswordLink);
	}
	
	public void clickDetailsLink() {
		clickAndWait(detailsLink);
	}
	
	public String getPopUpTitleText() {
		return getText(popUpTitle);
	}
	
	public String getPopUpBodyText() {
		return getText(popupBody);
	}
	
	public void clickNeedHelpLink() {
		clickAndWait(needHelpLink);
	}
	
	public void clickOtherIssuesWithSignInLink() {
		clickAndWait(otherIssuesWithSignInLink);
	}
	
}
