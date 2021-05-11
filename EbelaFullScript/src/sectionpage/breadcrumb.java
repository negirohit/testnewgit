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



public class breadcrumb extends base
{

	@BeforeMethod
	public void CallSetup() throws Exception
	{
		
		
		
		
		
	}
	
	@Test
	@Parameters("browser_name")
	public void breadcrumb_clickable(String browser_name) throws Exception
	{
		String testname = "Ebela Section page : Breardcrumb Check";
		SetUp(browser_name,testname);
		
		driver.navigate().to(CONFIG.getProperty("Sports_sectionPage"));
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
		
		pageClass pageclass1 = new pageClass();
		PageFactory.initElements(driver, pageclass1);
		
		pageclass1.secbreadcrumbcheck();
		
		System.out.println("SectionTC_05");
		Thread.sleep(5000);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		
		pageclass1.firstbreadcrumbcheck();
		Thread.sleep(5000);
		
		String currentUrl1 = driver.getCurrentUrl();
		System.out.println(currentUrl1);
		
		
		
		Assert.assertEquals("https://ebela.in/", currentUrl1);
	
		
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
