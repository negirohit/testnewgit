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

public class HomeTC_16 extends base
{


	
	@BeforeMethod
	public void CallSetup() throws Exception
	{
		SetUp();
		
		
	}
	
	@Test(priority=4)
	public void social_clickable() throws Exception
	{
		EventFiringWebDriver firingdriver = new EventFiringWebDriver(driver);
		firingdriver.navigate().to("https://ebela.in/?ref=hm-TopNav");
		firingdriver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		extentTest = extentReport.startTest("Clicking on Social Links","Clicking on social links,ie, Facebook & Twitter, the respective url should open.");
		

		
		Ebela.Mvn.EventListener listener = new Ebela.Mvn.EventListener();
		firingdriver.register(listener);
		
		
		 String firstwindowhandle = driver.getWindowHandle();
		 System.out.println("HomeTC_16");
		pageClass pageclass1 = new pageClass();
		PageFactory.initElements(firingdriver, pageclass1);
		
		pageclass1.facebook_click();
		Thread.sleep(2000);
		
		pageclass1.windowhandles(firingdriver, firstwindowhandle);
		Thread.sleep(2000);
		String currentUrlfb = firingdriver.getCurrentUrl();
		if(currentUrlfb.equalsIgnoreCase("https://www.facebook.com/Ebelaonline/"))
			extentTest.log(LogStatus.PASS, "Test Case Passed");
		else
		{
			extentTest.log(LogStatus.FAIL, "Test Case Failed");
			listener.onException(null, firingdriver);
		}	
		Assert.assertEquals(currentUrlfb,"https://www.facebook.com/Ebelaonline/");
		firingdriver.close();
		driver.switchTo().window(firstwindowhandle);
		
		pageclass1.twitter_click();
		Thread.sleep(2000);
		
		pageclass1.windowhandles(firingdriver, firstwindowhandle);
		Thread.sleep(2000);
		String currentUrltwtr = firingdriver.getCurrentUrl();
		
		if(currentUrltwtr.equalsIgnoreCase("https://twitter.com/ebelaonline"))
			extentTest.log(LogStatus.PASS, "Test Case Passed");
		else
		{
			extentTest.log(LogStatus.FAIL, "Test Case Failed");
			listener.onException(null, firingdriver);
		}
		Assert.assertEquals(currentUrltwtr,"https://twitter.com/ebelaonline");
		
		firingdriver.close();
		driver.switchTo().window(firstwindowhandle);
		firingdriver.unregister(listener);
		Thread.sleep(2000);
		extentReport.endTest(extentTest);
		
		firingdriver.close();
		
	}
	
	@AfterMethod
	public void close()
	{
		
	}
	

	
}
