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



public class breadcrumb extends base
{

	@BeforeMethod
	public void CallSetup() throws Exception
	{
		
		
		
		
		
	}
	
	@Test
	public void breadcrumb_clickable() throws Exception
	{
	
		driver.navigate().to(CONFIG.getProperty("Sports_sectionPage"));
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
		
		pageClass pageclass1 = new pageClass();
		PageFactory.initElements(driver, pageclass1);
		pageclass1.secbreadcrumbcheck();
		
		System.out.println("SectionTC_05");
		Thread.sleep(5000);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		
		pageclass1.firstbreadcrumbcheck();
		Thread.sleep(5000);
		
		String currentUrl1 = driver.getCurrentUrl();
		System.out.println(currentUrl1);
		
		
		
		Assert.assertEquals("https://ebela.in/", currentUrl1);
	
		
		Thread.sleep(2000);

		
		
		
	}
	
	@AfterMethod
	public void close()
	{
		
	}
	
}
