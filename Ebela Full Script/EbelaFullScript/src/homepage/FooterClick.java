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



public class FooterClick extends base
{

	
	
	
	@BeforeMethod
	public void CallSetup() throws Exception
	{
		
		
		
		
		
	}
	@Test(priority=1)
	public void footer_clickable() throws Exception
	{
		
		driver.navigate().to(CONFIG.getProperty("homePage"));
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
				
		pageClass pageclass1 = new pageClass();
		PageFactory.initElements(driver, pageclass1);
		
		pageclass1.footer_click();
		Thread.sleep(2000);
		String currentUrl = driver.getCurrentUrl();
		
		
		System.out.println("HomeTC_09");
		Assert.assertEquals("https://ebela.in/privacy?ref=hm-Footer", currentUrl);
		
		
		Thread.sleep(2000);
		
		
	}
	
	
	@AfterMethod
	public void close()
	{
		
	}
	
}
