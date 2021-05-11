package homepage;

import java.util.EventListener;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Ebela.Mvn.base;
import Ebela.Mvn.pageClass;

public class HomeTC_09 extends base
{

	
	
	
	@BeforeMethod
	public void CallSetup() throws Exception
	{
		SetUp();
		
		
		
		
		
	}
	@Test(priority=1)
	public void footer_clickable() throws Exception
	{
		EventFiringWebDriver firingdriver = new EventFiringWebDriver(driver);
		firingdriver.navigate().to("https://ebela.in/?ref=hm-TopNav");
		firingdriver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		extentTest = extentReport.startTest("Clicking on Footer from Homepage","Clicking on privacy policy in footer, privacy policy page should open.");
		Ebela.Mvn.EventListener listener = new Ebela.Mvn.EventListener();
		firingdriver.register(listener);
				
		pageClass pageclass1 = new pageClass();
		PageFactory.initElements(firingdriver, pageclass1);
		
		pageclass1.footer_click();
		Thread.sleep(2000);
		String currentUrl = firingdriver.getCurrentUrl();
		
		if(currentUrl.equals("https://ebela.in/privacy?ref=hm-Footer"))
			extentTest.log(LogStatus.PASS, "Test Case Passed");
		else
		{
		
			extentTest.log(LogStatus.FAIL, "Test Case Failed");
			listener.onException(null, firingdriver);
		}
		extentReport.endTest(extentTest);
		System.out.println("HomeTC_09");
		Assert.assertEquals("https://ebela.in/privacy?ref=hm-Footer", currentUrl);
		
		firingdriver.unregister(listener);
		Thread.sleep(2000);
		
		firingdriver.quit();
	}
	
	
	@AfterMethod
	public void close()
	{
		
	}
	
}
