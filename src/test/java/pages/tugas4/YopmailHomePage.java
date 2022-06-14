package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YopmailHomePage extends YopmailBasePage {
	
	@FindBy(xpath="//input[@id='login']")
	private WebElement emailInpt;
	
	@FindBy(xpath="//i[@class='material-icons-outlined f36']")
	private WebElement arrowBtn;;
	
	public YopmailHomePage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
		
	}
	
	public void inputEmail(String email) {
		
		emailInpt.sendKeys(email);

	}
	
	public void clickArrowButton() {
		
		arrowBtn.click();
		
	}
}
