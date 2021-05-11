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



public class AddThis extends base
{

	@BeforeMethod
	public void CallSetup() throws Exception
	{
		SetUp();
		
		
	}
	
	@Test(priority=1)
	public void addThis_story() throws Exception
	{
		
		driver.navigate().to(CONFIG.getProperty("homePage"));
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.navigate().refresh();
				
		pageClass pageclass1 = new pageClass();
		PageFactory.initElements(driver, pageclass1);
		
		String AddThis_heading = pageclass1.AddThis_check();
		Thread.sleep(2000);
		
		
		
		Assert.assertEquals("à¦†à¦ªà¦¨à¦¾à¦° à¦œà¦¨à§�à¦¯ à¦ªà§�à¦°à¦¸à§�à¦¤à¦¾à¦¬à¦¿à¦¤", AddThis_heading);
		
		
		Thread.sleep(2000);
		
		
	}
	
	@AfterMethod
	public void close()
	{
		
	}
	
}
