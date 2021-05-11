package sectionpage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.base;
import base.pageClass;



public class BrandLogo extends base
{

	@BeforeMethod
	public void CallSetup() throws Exception
	{
		
		
		
		
		
	}
	
	@Test(priority=1)
	public void Logo_clickable() throws Exception
	{
		
		driver.navigate().to(CONFIG.getProperty("Sports_sectionPage"));
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
		
		
		
		pageClass pageclass1 = new pageClass();
		PageFactory.initElements(driver, pageclass1);
		
		pageclass1.logo_click();
		Thread.sleep(2000);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		
		
		System.out.println("SectionTC_03");
		Assert.assertEquals("https://ebela.in/?ref=sports-Brandlogo", currentUrl);
		
		Thread.sleep(2000);
		
	
		
		
		
	}
	
	
	@AfterMethod
	public void close()
	{
		
	}
}
