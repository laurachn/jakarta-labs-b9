package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YopmailInboxPage extends YopmailBasePage {
	
	@FindBy(xpath="//h2[normalize-space()='How to use YOPmail']")
	private WebElement headerTxt;
	
	@FindBy(xpath="//iframe[@id='ifmail']")
	private WebElement iframe;
	
	@FindBy(xpath="//strong[normalize-space()='Hello.']")
	private WebElement iframeText;
	
	@FindBy(xpath="//strong[normalize-space()='We selected these for you:']")
	private WebElement iframeText2;
	
	@FindBy(xpath="/html[1]/body[1]/main[1]/div[1]/div[1]/div[1]/table[2]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[3]/td[2]/table[2]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]")
	private WebElement iframeText3;
	
	@FindBy(xpath="/html[1]/body[1]/main[1]/div[1]/div[1]/div[1]/table[2]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[3]/td[2]/table[7]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/strong[1]")
	private WebElement iframeText4;
	
	@FindBy(xpath="//strong[normalize-space()='Call']")
	private WebElement iframeText5;
	
	@FindBy(xpath="//span[normalize-space()='(800) 463-3768']")
	private WebElement iframeText6;
	
	@FindBy(xpath="//strong[normalize-space()='Text']")
	private WebElement iframeText7;
	
	@FindBy(xpath="//span[normalize-space()='(904) 853-3768']")
	private WebElement iframeText8;
	
	public YopmailInboxPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
		
	}
	
	public void switchIframe() {
		
		driver.get().switchTo().frame(iframe);
		
	}
	
	public String getIframeText() {
		
		return iframeText.getText() + "\n" + iframeText2.getText() + "\n" + iframeText3.getText() + "\n" + iframeText4.getText() + "\n" + iframeText5.getText() + "\n" + iframeText6.getText() + "\n" + iframeText7.getText() + "\n" + iframeText8.getText();
	}
	
}
