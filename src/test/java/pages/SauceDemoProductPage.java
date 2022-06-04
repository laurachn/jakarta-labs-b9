package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SauceDemoProductPage extends SauceDemoBasePage {
	
	By headerTxt = By.xpath("//span[@class='title']");
	By addToCartBtn = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
	By cartBadge = By.xpath("//span[@class='shopping_cart_badge']");
	
	public SauceDemoProductPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
	}
	
	public String getHeaderText() {
		return getText(headerTxt);
	}
	
	public void clickAddToCartButton() {
		clickAndWait(addToCartBtn);
	}
	
	public String getCartBadgeText() {
		return getText(cartBadge);
	}
	
	public void clickCartBadge() {
		clickAndWait(cartBadge);
	}
	
}
