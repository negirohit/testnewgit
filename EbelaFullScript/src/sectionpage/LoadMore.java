package sectionpage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.base;
import base.pageClass;



public class LoadMore extends base 
{
	@BeforeMethod
	public void CallSetup() throws Exception
	{
		
		
		
		
		
	}
	
	@Test(priority=1)
	@Parameters("browser_name")
	public void LoadMoreSectionPage(String browser_name) throws Exception
	{
		String testname = "Ebela Section page : Check LoadMore";
		SetUp(browser_name,testname);
		
		driver.navigate().to(CONFIG.getProperty("Sports_sectionPage"));
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
				
		pageClass pageclass1 = new pageClass();
		PageFactory.initElements(driver, pageclass1);
		
		Thread.sleep(2000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
    	jse.executeScript("window.scrollBy(0,1500)", "");
    	
    	Thread.sleep(2000);
    	
    	String LoadMoreText = pageclass1.LoadMoreStoryClick();
    	System.out.println(LoadMoreText);
    	APP_LOGS.debug(LoadMoreText);
		Thread.sleep(2000);
		
		//pageclass1.BackToTop();
		//Thread.sleep(2000);
		
		System.out.println("SectionTC_07");
		//Assert.assertNotEquals(LoadMoreText, null);
		
		
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
