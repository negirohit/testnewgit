package homepage;

import java.util.EventListener;
import java.util.concurrent.TimeUnit;

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



public class social extends base
{


	
	@BeforeMethod
	public void CallSetup() throws Exception
	{
		
		
		
	}
	
	@Test(priority=4)
	@Parameters("browser_name")
	public void social_clickable(String browser_name) throws Exception
	{
		String testname = "Ebela Home page : Check Social Links";
		SetUp(browser_name,testname);
		
		driver.navigate().to(CONFIG.getProperty("homePage"));
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
		
		
		 String firstwindowhandle = driver.getWindowHandle();
		 System.out.println("HomeTC_16");
		pageClass pageclass1 = new pageClass();
		PageFactory.initElements(driver, pageclass1);
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		pageclass1.facebook_click();
		Thread.sleep(2000);
		
		pageclass1.windowhandles(driver, firstwindowhandle);
		Thread.sleep(2000);
		String currentUrlfb = driver.getCurrentUrl();
		
		Assert.assertEquals(currentUrlfb,"https://www.facebook.com/Ebelaonline/");
		driver.close();
		driver.switchTo().window(firstwindowhandle);
		
		pageclass1.twitter_click();
		Thread.sleep(2000);
		
		pageclass1.windowhandles(driver, firstwindowhandle);
		Thread.sleep(2000);
		String currentUrltwtr = driver.getCurrentUrl();
		
		
		Assert.assertEquals(currentUrltwtr,"https://twitter.com/ebelaonline");
		
		driver.close();
		driver.switchTo().window(firstwindowhandle);
		
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
