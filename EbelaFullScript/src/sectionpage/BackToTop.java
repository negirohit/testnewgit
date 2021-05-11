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



public class BackToTop extends base
{

	@BeforeMethod
	public void CallSetup() throws Exception
	{
		
		
		
		
		
	}
	
	
	@Test(priority=1)
	@Parameters("browser_name")
	public void BackToTopTest(String browser_name) throws Exception
	{
		
		String testname = "Ebela Section page : Back To Top Test";
		SetUp(browser_name,testname);
		
		driver.navigate().to(CONFIG.getProperty("Sports_sectionPage"));
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,750)", "");
		Thread.sleep(3000);
		pageClass pageclass1 = new pageClass();
		PageFactory.initElements(driver, pageclass1);
				
		Thread.sleep(5000);
		pageclass1.BackToTop();
		Thread.sleep(2000);
		
		
		Long value = (Long) jse.executeScript("return window.scrollY;");
		
	
		
		System.out.println("SectionTC_01");
		Assert.assertEquals(value.toString(), "0");
		
		
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
