package homepage;

import java.util.concurrent.TimeUnit;
import java.util.EventListener;
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

public class HomeTC_12 extends base
{

	

	@BeforeMethod
	public void CallSetup() throws Exception
	{
		SetUp();
		
		
		
	}
	
	@Test(priority=1)
	public void Total_Stories() throws Exception
	{
		EventFiringWebDriver firingdriver = new EventFiringWebDriver(driver);
		firingdriver.navigate().to("https://ebela.in/?ref=hm-TopNav");
		firingdriver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		extentTest = extentReport.startTest("Validating total manually curated stories in Homepage","Count the total number manually curated of articles in homepage");
		Ebela.Mvn.EventListener listener = new Ebela.Mvn.EventListener();
		firingdriver.register(listener);
		
		
		pageClass pageclass1 = new pageClass();
		PageFactory.initElements(driver, pageclass1);
		
		int value =pageclass1.TotalCuratedStories();
		Thread.sleep(2000);
		int totalstories = 12;
		
		if(totalstories==value)
			extentTest.log(LogStatus.PASS, "Test Case Passed");
		else
		{
		
			extentTest.log(LogStatus.FAIL, "Test Case Failed");
			listener.onException(null, firingdriver);
		}	
		extentReport.endTest(extentTest);
		System.out.println("HomeTC_12");
		Assert.assertEquals(totalstories, pageclass1.TotalCuratedStories());
		
		firingdriver.unregister(listener);
		Thread.sleep(2000);
		
		firingdriver.quit();
	}
	
	@AfterMethod
	public void close()
	{
		
	}
	
}
