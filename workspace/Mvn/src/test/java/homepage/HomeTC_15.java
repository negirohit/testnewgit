package homepage;

import java.util.EventListener;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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

public class HomeTC_15 extends base
{


	@BeforeMethod
	public void CallSetup() throws Exception
	{
		SetUp();
		
		
		
	}
	
	@Test(priority=3)
	public void TrendingBar() throws Exception
	{
		EventFiringWebDriver firingdriver = new EventFiringWebDriver(driver);
		firingdriver.navigate().to("https://ebela.in/?ref=hm-TopNav");
		firingdriver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		extentTest = extentReport.startTest("Clicking on Trending Bar from Homepage","Clicking on Trending bar section, all the five tag pages should open & none of them should return 404");
		
		Ebela.Mvn.EventListener listener = new Ebela.Mvn.EventListener();
		//firingdriver.register(listener);
		
		

		
		pageClass pageclass1 = new pageClass();
		PageFactory.initElements(firingdriver, pageclass1);
		int i;
		System.out.println("HomeTC_15");
		for(i=0;i<6;i++)
		{
			pageclass1.trending_check(i);
			
			
			if(firingdriver.findElement(By.cssSelector(".page-not-found-header")).isDisplayed())
			
				{
					extentTest.log(LogStatus.FAIL,"Test Case Failed");
					Assert.fail("404 found");
					listener.onException(null, firingdriver);
				}
			else
				{
					extentTest.log(LogStatus.PASS, "Test Case Passed");
				}
				
			
			
			
			//firingdriver.navigate().back();
			Thread.sleep(2000);
			
		}
		
		extentReport.endTest(extentTest);
		
		firingdriver.unregister(listener);
		Thread.sleep(2000);
		
		firingdriver.close();
	}
	
	
	@AfterMethod
	public void close()
	{
		
	}
	
}
