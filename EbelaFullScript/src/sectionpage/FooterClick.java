package sectionpage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.base;
import base.pageClass;



public class FooterClick extends base
{

	@BeforeMethod
	public void CallSetup() throws Exception
	{
		
		
		
		
		
	}
	
	@Test(priority=1)
	@Parameters("browser_name")
	public void footer_clickable(String browser_name) throws Exception
	{
		String testname = "Ebela Section page : Click Privacy Policy in Footer";
		SetUp(browser_name,testname);
		
		driver.navigate().to(CONFIG.getProperty("Sports_sectionPage"));
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
				
		pageClass pageclass1 = new pageClass();
		PageFactory.initElements(driver, pageclass1);
		
		Thread.sleep(2000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
    	jse.executeScript("window.scrollBy(0,2000)", "");

		Thread.sleep(2000);
		
		pageclass1.privacysection_click();
		Thread.sleep(2000);
		
		String currentUrl = driver.getCurrentUrl();
		
		
		System.out.println("SectionTC_01");
		Assert.assertEquals("https://ebela.in/privacy?ref=sports-Footer", currentUrl);
		
		
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
