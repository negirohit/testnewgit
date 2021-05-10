package sectionpage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import basepackage.PageClass;
import basepackage.base;

public class SectionTC_01 extends base
{

	EventFiringWebDriver firingdriver;
	
	@Test
	@Parameters("browser_name")
	public void sectionstoryclick(String browser_name) throws IOException, InterruptedException
	{
		

		
			String testname = "Fortune Section page List Story click";
			setup(browser_name,testname);
			firingdriver = new EventFiringWebDriver(driver);
			firingdriver.navigate().to("http://www.fortuneindia.com/?google_nofetch=true&param=something");
			firingdriver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			
			PageClass pageclass = new PageClass();
			PageFactory.initElements(firingdriver, pageclass);
			
			basepackage.EventListener listener = new basepackage.EventListener();
		
			
			
			pageclass.menu_click();
			Thread.sleep(2000);
			pageclass.menuoptions_click(7);
			Thread.sleep(6000);
			pageclass.sectionstory_click(5);
			Thread.sleep(2000);
			try
			{
				if(firingdriver.findElement(By.cssSelector(".section__title--highlight")).isDisplayed())
				{
					System.out.println("Section Page Opened");
					Assert.assertTrue(true);
				}
				else
				{
					Assert.fail("404 found");
					listener.onException(null, firingdriver);
				}
			}
			catch (Exception e) 
			{
				
			}
			
			
			
			
		
		
	}
	
	@AfterMethod
	public void teardown(ITestResult result) 
	{
		((JavascriptExecutor)driver).executeScript("sauce:job-result=" + (result.isSuccess() ? "passed" : "failed"));
		firingdriver.quit();
		System.out.println("Closing the browser");
		System.out.println("--------------------");
	}
}
