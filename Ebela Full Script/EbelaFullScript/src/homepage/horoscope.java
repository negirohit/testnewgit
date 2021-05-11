package homepage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.base;
import base.pageClass;



public class horoscope extends base
{

	@BeforeMethod
	public void CallSetup() throws Exception
	{
		
		SetUp();
		
	}
	
	@Test(priority=1)
	public void horoscope_homepage() throws Exception
	{	
		String firstwindowhandle =" ";
		
		driver.navigate().to(CONFIG.getProperty("homePage"));
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
				
		pageClass pageclass1 = new pageClass();
		PageFactory.initElements(driver, pageclass1);
		
		pageclass1.horoscope_click();
		Thread.sleep(2000);
		pageclass1.windowhandles(driver, firstwindowhandle);
		String currentUrl = driver.getCurrentUrl();
		
		
		System.out.println("HomeTC_20");
		Assert.assertEquals("https://ebela.in/horoscope/daily", currentUrl);
		
		
		
		
		
		Thread.sleep(2000);
		
		
	}
	
	@AfterMethod
	public void close()
	{
		
	}
	
}
