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



public class Nanabidh extends base
{

	@BeforeMethod
	public void CallSetup() throws Exception
	{
		
		SetUp();
		
	}
	
	@Test(priority=1)
	public void Nanabidh_click() throws Exception
	{
		EventFiringWebDriver firingdriver = new EventFiringWebDriver(driver);
		driver.navigate().to(CONFIG.getProperty("homePage"));
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
				
		pageClass pageclass1 = new pageClass();
		PageFactory.initElements(driver, pageclass1);
		
		pageclass1.nanabidh_click();
		Thread.sleep(2000);
		String currentUrl = driver.getCurrentUrl();
		
		
		System.out.println("HomeTC_17");
		Assert.assertEquals("https://ebela.in/national?ref=hm-SecMisc-national", currentUrl);
		
		
		Thread.sleep(2000);
		
		
	}
	
	@AfterMethod
	public void close()
	{
		
	}
	
}
