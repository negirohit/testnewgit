package homepage;

import java.util.EventListener;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.base;
import base.pageClass;



public class NavClick extends base
{
	

	
	@BeforeMethod
	public void CallSetup() throws Exception
	{
		
		
		
	}
	
	@Test(priority=2)
	public void nav_clickable() throws Exception
	{
		EventFiringWebDriver firingdriver = new EventFiringWebDriver(driver);
		driver.navigate().to(CONFIG.getProperty("homePage"));
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
		
		pageClass pageclass1 = new pageClass();
		PageFactory.initElements(firingdriver, pageclass1);
		pageclass1.sport_nav_click();
		
		System.out.println("HomeTC_14");
		Thread.sleep(5000);
		
		String currentUrl = firingdriver.getCurrentUrl();
		System.out.println(currentUrl+ "fail krche test case");
		
		
		Assert.assertEquals("https://ebela.in/sports?ref=hm-TopNav", currentUrl);
	
		
		Thread.sleep(2000);

		
		
		
	}
	
	@AfterMethod
	public void close()
	{
		
	}
	
}
