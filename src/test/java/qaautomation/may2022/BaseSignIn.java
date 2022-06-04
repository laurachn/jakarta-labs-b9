package qaautomation.may2022;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseSignIn {
	ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	ThreadLocal<WebDriverWait> explicitWait = new ThreadLocal<WebDriverWait>();
	
	@BeforeMethod
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		driver.set(new ChromeDriver());
		explicitWait.set(new WebDriverWait(driver.get(),Duration.ofSeconds(60)));
		driver.get().get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2FSign-up%2Fs%3Fk%3DSign%2Bup%26ref_%3Dnav_signin&prevRID=QYN5ZV9GD8W5WPXK9HM7&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&prepopulatedLoginId=eyJjaXBoZXIiOiJKQ3gvVm9FcHI3L3J4WXdMMERva01BPT0iLCJ2ZXJzaW9uIjoxLCJJViI6IkpZeXdRUFV6SU5YVSttTkF2cGRrUVE9PSJ9&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=usflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&timestamp=1653803458000");
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.get().quit();
		
	}
}
