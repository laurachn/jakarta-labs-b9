package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SauceDemoLoginPage extends SauceDemoBasePage {
	
	By usernameInpt = By.xpath("//input[@id='user-name']");
	By passwordInpt = By.xpath("//input[@id='password']");
	By loginBtn = By.xpath("//input[@id='login-button']");
	By errorTxt = By.xpath("//h3[@data-test='error']");
	
	public SauceDemoLoginPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
	}
	
	public void loginWeb(String username, String password) {
		setText(usernameInpt, username);
		setText(passwordInpt, password);
		clickAndWait(loginBtn);
	}
	
	public void inputUsername(String username) {
		setText(usernameInpt, username);
	}
	
	public void inputPassword(String password) {
		setText(passwordInpt, password);
	}
	
	public void clickLoginButton() {
		clickAndWait(loginBtn);
	}
	
	public String getErrorText() {
		return getText(errorTxt);
	}
	
}
