package qaautomation.may2022;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.YopmailHomePage;
import pages.YopmailInboxPage;

public class YopmailTest extends BaseYopmailTest
{	
	
    @Test
    public void redirectToInbox() {
    	
    	YopmailHomePage homePage = new YopmailHomePage(driver, explicitWait);
    	YopmailInboxPage inboxPage = new YopmailInboxPage(driver, explicitWait);
    	
    	homePage.inputEmail("automationtest");
    	homePage.clickArrowButton();
    	
    	inboxPage.switchIframe();
    	
    	System.out.println(inboxPage.getIframeText());
    	
    }
   
}
