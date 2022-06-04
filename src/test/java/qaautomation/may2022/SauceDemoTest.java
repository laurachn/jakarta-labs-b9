package qaautomation.may2022;

import org.testng.annotations.Test;

import pages.SauceDemoCartPage;
import pages.SauceDemoCheckoutDetailPage;
import pages.SauceDemoCheckoutPage;
import pages.SauceDemoLoginPage;
import pages.SauceDemoProductPage;
import pages.SauceDemoThankYouPage;

import org.testng.annotations.Test;
import org.testng.Assert;

public class SauceDemoTest extends BaseSauceDemoTest {
	
	SauceDemoLoginPage loginPage = new SauceDemoLoginPage(driver, explicitWait);
	SauceDemoProductPage productPage = new SauceDemoProductPage(driver, explicitWait);
	SauceDemoCartPage cartPage = new SauceDemoCartPage(driver, explicitWait);
	SauceDemoCheckoutPage checkoutPage = new SauceDemoCheckoutPage(driver, explicitWait);
	SauceDemoCheckoutDetailPage checkoutDetailPage = new SauceDemoCheckoutDetailPage(driver, explicitWait);
	SauceDemoThankYouPage thankYouPage = new SauceDemoThankYouPage(driver, explicitWait);
	
    @Test
    public void checkout() {
      
    	loginPage.loginWeb("standard_user", "secret_sauce");
    	String actualText = productPage.getHeaderText();
    	String expectedText = "PRODUCTS";
    	Assert.assertTrue(actualText.contains(expectedText));
    	
    	productPage.clickAddToCartButton();
    	actualText = productPage.getCartBadgeText();
    	System.out.println(actualText);
    	expectedText = "1";
    	Assert.assertTrue(actualText.contains(expectedText));
    	
    	productPage.clickCartBadge();
    	actualText = productPage.getHeaderText();
    	expectedText = "YOUR CART";
    	Assert.assertTrue(actualText.contains(expectedText));
    	
    	cartPage.clickCheckoutButton();
    	actualText = checkoutPage.getHeaderText();
    	expectedText = "CHECKOUT: YOUR INFORMATION";
    	Assert.assertTrue(actualText.contains(expectedText));
    	
    	checkoutPage.inputFirstName("Laura");
    	checkoutPage.inputLastName("Chen");
    	checkoutPage.inputPostalCode("10710");
    	checkoutPage.clickContinueButton();
    	actualText = checkoutDetailPage.getHeaderText();
    	expectedText = "CHECKOUT: OVERVIEW";
    	Assert.assertTrue(actualText.contains(expectedText));
    	
    	checkoutDetailPage.clickFinishButton();
    	actualText = thankYouPage.getThankYouText();
    	expectedText = "THANK YOU FOR YOUR ORDER";
    	Assert.assertTrue(actualText.contains(expectedText));
    	
    }
    
//    @Test
//    public void loginWithInvalidUsernameAndValidPassword() {
//      
//    	loginPage.loginWeb("standard_userz", "secret_sauce");
//    	String actualText = loginPage.getErrorText();
//    	String expectedText = "Epic sadface: Username and password do not match any user in this service";
//    	Assert.assertTrue(actualText.contains(expectedText));
//    	
//    }
//    
//    @Test
//    public void loginWithValidUsernameAndInvalidPassword() {
//      
//    	loginPage.loginWeb("standard_user", "secret_saucez");
//    	String actualText = loginPage.getErrorText();
//    	String expectedText = "Epic sadface: Username and password do not match any user in this service";
//    	Assert.assertTrue(actualText.contains(expectedText));
//    	
//    }
//    
//    @Test
//    public void loginWithInvalidUsernameAndInvalidPassword() {
//      
//    	loginPage.loginWeb("standard_userz", "secret_saucez");
//    	String actualText = loginPage.getErrorText();
//    	String expectedText = "Epic sadface: Username and password do not match any user in this service";
//    	Assert.assertTrue(actualText.contains(expectedText));
//    	
//    }
//    
//    @Test
//    public void addToCart() {
//
//    	productPage.clickAddToCartButton();
//    	String actualText = productPage.getCartBadgeText();
//    	System.out.println(actualText);
//    	String expectedText = "1";
//    	Assert.assertTrue(actualText.contains(expectedText));
//    }
//  
//    @Test
///   public void viewCart() {
//    	
//    	productPage.clickCartBadge();
//    	String actualText = productPage.getHeaderText();
//    	String expectedText = "YOUR CART";
//    	Assert.assertTrue(actualText.contains(expectedText));
//    }
//    
//    @Test
//    public void checkoutCart() {
//    	
//    	cartPage.clickCheckoutButton();
//    	String actualText = checkoutPage.getHeaderText();
//    	String expectedText = "CHECKOUT: YOUR INFORMATION";
//    	Assert.assertTrue(actualText.contains(expectedText));
//    	
//    }
//    
//    @Test
//    public void fillInCheckOutInformation() {
//    	
//    	checkoutPage.inputFirstName("Laura");
//    	checkoutPage.inputLastName("Chen");
//    	checkoutPage.inputPostalCode("10710");
//    	checkoutPage.clickContinueButton();
//    	String actualText = checkoutDetailPage.getHeaderText();
//    	String expectedText = "CHECKOUT: OVERVIEW";
//    	Assert.assertTrue(actualText.contains(expectedText));
//    	
//    }
//    
//    @Test
//    public void finishCheckout() {
//    	
//    	checkoutDetailPage.clickFinishButton();
//    	String actualText = thankYouPage.getThankYouText();
//    	String expectedText = "THANK YOU FOR YOUR ORDER";
//    	Assert.assertTrue(actualText.contains(expectedText));
//    	
//    }
}
