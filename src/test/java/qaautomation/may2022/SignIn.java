package qaautomation.may2022;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.AmazonForgotPasswordPage;
import pages.AmazonHelpPage;
import pages.AmazonHomePage;
import pages.AmazonOTPPage;
import pages.AmazonSignInPage;
import pages.AmazonSignUpPage;

public class SignIn extends BaseSignIn {
	
	AmazonSignUpPage signUpPage = new AmazonSignUpPage(driver, explicitWait);
	AmazonSignInPage signInPage = new AmazonSignInPage(driver, explicitWait);
	AmazonHelpPage helpPage = new AmazonHelpPage(driver, explicitWait);
	AmazonOTPPage otpPage = new AmazonOTPPage(driver, explicitWait);
	AmazonHomePage homePage = new AmazonHomePage(driver, explicitWait);
	AmazonForgotPasswordPage forgotPasswordPage = new AmazonForgotPasswordPage(driver, explicitWait);
	
	@Test
	public void signInWithEmptyData() {
		signInPage.clickContinueButton();
		assertEquals(signInPage.getEmailOrPhoneNumberErrorText(), "Enter your email or mobile phone number");
	}
	
	@Test
	public void signInWithValidEmail() {
		signInPage.inputEmail("chenlaurr@gmail.com");
		signInPage.clickContinueButton();
		signInPage.inputPassword("amazon123");
		signInPage.clickSignInButton();
		assertEquals(homePage.getAccountText(), "Hello, Laura");
	}
	
	@Test
	public void signInWithValidPhoneNumber() {
		signInPage.inputPhoneNumber("08161672788");
		signInPage.clickContinueButton();
		signInPage.inputPassword("amazon123");
		signInPage.clickSignInButton();
		assertEquals(homePage.getAccountText(), "Hello, Laura");
	}

	@Test
	public void signInWithInvalidEmail() {
		signInPage.inputEmail("chenlaur");
		signInPage.clickContinueButton();
		assertEquals(signInPage.getErrorText(), "We cannot find an account with that email address");
	}

	@Test
	public void signInWithInvalidPhoneNumber() {
		signInPage.inputPhoneNumber("0821567");
		signInPage.clickContinueButton();
		assertEquals(signInPage.getErrorText(), "We cannot find an account with that mobile number");
	}

	@Test
	public void verifyConditionsOfUsePage() {
		signInPage.clickConditionsOfUseLink();
		assertEquals(helpPage.getConditionsOfUseText(), "Conditions of Use");
	}
	
	@Test
	public void verifyPrivacyNoticePage() {
		signInPage.clickPrivacyNoteLink();
		assertEquals(helpPage.getPrivacyNoticeText(), "Amazon.com Privacy Notice");
	}

	@Test
	public void verifyForgotPasswordPageInNeedHelp() {
		signInPage.clickNeedHelpLink();
		signInPage.clickForgotPasswordLink();
		assertEquals(forgotPasswordPage.getHeaderText(), "Password assistance");
	}
	
	@Test
	public void verifyOtherIssuesWithSignInPage() {
		signInPage.clickNeedHelpLink();
		signInPage.clickOtherIssuesWithSignInLink();
		assertEquals(helpPage.getHeaderText(), "Account & Login Issues");
	}
	
	@Test
	public void verifyCreateYourAmazonAccountButtonFunctionality() {
		signInPage.clickCreateYourAmazonAccount();
		assertEquals(signUpPage.getHeaderText(), "Create account");
	}
	
	@Test
	public void verifyChangeEmailLinkFunctionality() {
		signInPage.inputEmail("chenlaurr@gmail.com");
		signInPage.clickContinueButton();
		signInPage.clickChangeEmailLink();
		assertEquals(signInPage.getSignInText(), "Sign-In");
	}
	
	@Test
	public void verifyForgotPasswordPage() {
		signInPage.inputEmail("chenlaurr@gmail.com");
		signInPage.clickContinueButton();
		signInPage.clickForgotPasswordLink();
		assertEquals(forgotPasswordPage.getHeaderText(), "Password assistance");
	}
	
	@Test
	public void showDetailsPopUp() {
		signInPage.inputEmail("chenlaurr@gmail.com");
		signInPage.clickContinueButton();
		signInPage.clickDetailsLink();
		assertEquals(signInPage.getPopUpTitleText(), "\"Keep Me Signed In\" Checkbox");
		System.out.println(signInPage.getPopUpBodyText());
		assertEquals(signInPage.getPopUpBodyText(), "Choosing \"Keep me signed in\" reduces the number of times you're asked to Sign-In on this device."
				+ "\n"
				+ "To keep your account secure, use this option only on your personal devices.");
	}
}
