package qaautomation.may2022;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import pages.AmazonBusinessSignUpPage;
import pages.AmazonHelpPage;
import pages.AmazonOTPPage;
import pages.AmazonSignInPage;
import pages.AmazonSignUpPage;

public class SignUp extends BaseSignUp {

	AmazonSignUpPage signUpPage = new AmazonSignUpPage(driver, explicitWait);
	AmazonSignInPage signInPage = new AmazonSignInPage(driver, explicitWait);
	AmazonHelpPage helpPage = new AmazonHelpPage(driver, explicitWait);
	AmazonBusinessSignUpPage businessSignUpPage = new AmazonBusinessSignUpPage(driver, explicitWait);
	AmazonOTPPage otpPage = new AmazonOTPPage(driver, explicitWait);
	
	@Test
	public void signUpWithEmptyData() {
		
		signUpPage.clickContinueButton();
		assertEquals(signUpPage.getNameErrorText(), "Enter your name");
		assertEquals(signUpPage.getMobileNumberOrEmailErrorText(), "Enter your email or mobile phone number");
		assertEquals(signUpPage.getPasswordErrorText(), "Minimum 6 characters required");
		
	}

	@Test
	public void signUpWithInvalidPassword() {
		signUpPage.inputPassword("asdfg");
		signUpPage.clickContinueButton();
		assertEquals(signUpPage.getPasswordErrorText(), "Minimum 6 characters required");
	}
	
	@Test
	public void signUpWithInvalidEmail() {
		signUpPage.inputEmail("chenlaur");
		signUpPage.clickContinueButton();
		assertEquals(signUpPage.getMobileNumberOrEmailErrorText(), "Wrong or Invalid email address or mobile phone number. Please correct and try again.");
	}
	
	@Test
	public void signUpWithEmail() {
		signUpPage.inputName("Fanuel Feliks");
		signUpPage.inputEmail("davaiff@gmail.com");
		signUpPage.inputPassword("amazon123");
		signUpPage.inputConfirmPassword("amazon123");
		signUpPage.clickContinueButton();
		assertEquals(otpPage.getHeaderText(), "Verify email address");
	}
	
	@Test
	public void signUpWithPhoneNumber() {
		signUpPage.inputName("Fanuel Feliks");
		signUpPage.inputEmail("81219995621");
		signUpPage.clickCountryDropdown();
		signUpPage.selectCountry("93");
		signUpPage.inputPassword("amazon123");
		signUpPage.inputConfirmPassword("amazon123");
		signUpPage.clickContinueButton();
		assertEquals(otpPage.getHeader2Text(), "Verify mobile number");
	}
	
	@Test
	public void verifyConditionsOfUsePage() {
		signUpPage.clickConditionsOfUseLink();
		assertEquals(helpPage.getConditionsOfUseText(), "Conditions of Use");
	}
	
	@Test
	public void verifyPrivacyNoticePage() {
		signUpPage.clickPrivacyNoteLink();
		assertEquals(helpPage.getPrivacyNoticeText(), "Amazon.com Privacy Notice");
	}

	@Test
	public void verifySignInPage() {
		signUpPage.clickSignInLink();
		assertEquals(signInPage.getSignInText(), "Sign-In");
	}

	@Test
	public void verifyCreateAFreeBusinessAccountPage() {
		signUpPage.clickCreateABusinessFreeAccountLink();
		assertEquals(businessSignUpPage.getTitleText(), "Let’s create your free Amazon Business account");
	}

}
