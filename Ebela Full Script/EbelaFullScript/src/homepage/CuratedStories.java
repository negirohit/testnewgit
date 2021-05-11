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

import base.base;
import base.pageClass;



public class CuratedStories extends base
{

	

	@BeforeMethod
	public void CallSetup() throws Exception
	{
		
		
		
		
	}
	
	@Test(priority=1)
	public void Total_Stories() throws Exception
	{
		
		driver.navigate().to(CONFIG.getProperty("homePage"));
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
		
		pageClass pageclass1 = new pageClass();
		PageFactory.initElements(driver, pageclass1);
		
		int value =pageclass1.TotalCuratedStories();
		Thread.sleep(2000);
		int totalstoriescount = 10;
		
		
		System.out.println("HomeTC_12");
		//Assert.assertEquals(totalstoriescount, value);
		if(value<totalstoriescount)
		{
			Assert.fail("Story count must be greater than 10");
		}
	
		Thread.sleep(2000);
		
		
	}
	
	@AfterMethod
	public void close()
	{
		
	}
	
}
