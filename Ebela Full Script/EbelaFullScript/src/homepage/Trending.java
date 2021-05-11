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

import base.base;
import base.pageClass;



public class Trending extends base
{


	@BeforeMethod
	public void CallSetup() throws Exception
	{
		
		
		
		
	}
	
	@Test(priority=3)
	public void TrendingBar() throws Exception
	{
		
		driver.navigate().to(CONFIG.getProperty("homePage"));
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
		
		

		
		pageClass pageclass1 = new pageClass();
		PageFactory.initElements(driver, pageclass1);
		int i;
		System.out.println("HomeTC_15");
		for(i=0;i<5;i++)
		{
			pageclass1.trending_check(i);
			Thread.sleep(2000);
			try
			{
				if(driver.findElement(By.cssSelector(".page-not-found-header")).isDisplayed())
					{
						
						Assert.fail("404 found");
						
					}
				else
					{
						
					}
			}
			catch (Exception e) 
			{
				// TODO: handle exception
			}
			
			
			
			driver.navigate().back();
			Thread.sleep(2000);
			
		}
		
		
		
		//firingdriver.unregister(listener);
		Thread.sleep(2000);
		
		
	}
	
	
	@AfterMethod
	public void close()
	{
		
	}
	
}
