package homepage;

import java.util.EventListener;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Ebela.Mvn.base;
import Ebela.Mvn.pageClass;

public class HomeTC_13 extends base
{


	@BeforeMethod
	public void CallSetup() throws Exception
	{
		SetUp();
		
		
	}
	
	@Test(priority=1)
	public void Logo_clickable() throws Exception
	{
		EventFiringWebDriver firingdriver = new EventFiringWebDriver(driver);
		firingdriver.navigate().to("https://ebela.in/?ref=hm-TopNav");
		firingdriver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		extentTest = extentReport.startTest("Clicking on Ebela Logo from Homepage","Clicking on ebela logo, the homepage should get redirected to the same page.");
		
		
		Ebela.Mvn.EventListener listener = new Ebela.Mvn.EventListener();
		firingdriver.register(listener);
		
		
		
		pageClass pageclass1 = new pageClass();
		PageFactory.initElements(firingdriver, pageclass1);
		
		pageclass1.logo_click();
		Thread.sleep(2000);
		String currentUrl = firingdriver.getCurrentUrl();
		System.out.println(currentUrl);
		if(currentUrl.equalsIgnoreCase("https://ebela.in/?ref=hm-Brandlogo"))
			extentTest.log(LogStatus.PASS, "Test Case Passed");
		else
		{
			extentTest.log(LogStatus.FAIL, "Test Case Failed");
			listener.onException(null, firingdriver);
		}
		
		extentReport.endTest(extentTest);
		System.out.println("HomeTC_13");
		Assert.assertEquals("https://ebela.in/?ref=hm-Brandlogo", currentUrl);
		firingdriver.unregister(listener);
		Thread.sleep(2000);
		
		firingdriver.close();
		
		
		
	}
	
	
	@AfterMethod
	public void close()
	{
		
	}
	
	
	
	
}
