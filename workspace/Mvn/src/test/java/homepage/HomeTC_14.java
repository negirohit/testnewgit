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

public class HomeTC_14 extends base
{
	

	
	@BeforeMethod
	public void CallSetup() throws Exception
	{
		SetUp();
		
		
	}
	
	@Test(priority=2)
	public void nav_clickable() throws Exception
	{
		EventFiringWebDriver firingdriver = new EventFiringWebDriver(driver);
		firingdriver.navigate().to("https://ebela.in/?ref=hm-TopNav");
		firingdriver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		extentTest = extentReport.startTest("Clicking on Nav Bar from Homepage","Clicking on sport section, should take the user to the respective url");
		

		
		Ebela.Mvn.EventListener listener = new Ebela.Mvn.EventListener();
		firingdriver.register(listener);
		
		pageClass pageclass1 = new pageClass();
		PageFactory.initElements(firingdriver, pageclass1);
		pageclass1.sport_nav_click();
		
		System.out.println("HomeTC_14");
		Thread.sleep(5000);
		
		String currentUrl = firingdriver.getCurrentUrl();
		System.out.println(currentUrl+ "fail krche test case");
		if(currentUrl.equalsIgnoreCase("https://ebela.in/sports?ref=hm-TopNav"))
			extentTest.log(LogStatus.PASS, "Test Case Passed");
		else
		{
		
			extentTest.log(LogStatus.FAIL, "Test Case Failed");
			listener.onException(null, firingdriver);
		}
			extentReport.endTest(extentTest);
		
		Assert.assertEquals("https://ebela.in/sports?ref=hm-TopNav", currentUrl);
	
		firingdriver.unregister(listener);
		Thread.sleep(2000);

		
		firingdriver.close();
		
	}
	
	@AfterMethod
	public void close()
	{
		
	}
	
}
