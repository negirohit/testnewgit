package homepage;

import java.util.concurrent.TimeUnit;
import java.util.EventListener;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.base;
import base.pageClass;



public class CuratedStories extends base
{

	

	@BeforeMethod
	public void CallSetup() throws Exception
	{
		
		
		
		
	}
	
	@Test(priority=1)
	@Parameters("browser_name")
	public void Total_Stories(String browser_name) throws Exception
	{
		String testname = "Ebela Home page : Curated Stories count";
		SetUp(browser_name,testname);
		driver.navigate().to(CONFIG.getProperty("homePage"));
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
		
		pageClass pageclass1 = new pageClass();
		PageFactory.initElements(driver, pageclass1);
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		int value =pageclass1.TotalCuratedStories();
		Thread.sleep(2000);
		int totalstoriescount = 8;
		
		
		System.out.println("HomeTC_12");
		//Assert.assertEquals(totalstoriescount, value);
		if(value<totalstoriescount)
		{
			Assert.fail("Story count must be greater than 10");
		}
	
		Thread.sleep(2000);
		
		
	}
	
	@AfterMethod
	public void teardown(ITestResult result) 
	{
		((JavascriptExecutor)driver).executeScript("sauce:job-result=" + (result.isSuccess() ? "passed" : "failed"));
		driver.quit();
		System.out.println("Closing the browser");
		System.out.println("--------------------");
		
	}
	
}
