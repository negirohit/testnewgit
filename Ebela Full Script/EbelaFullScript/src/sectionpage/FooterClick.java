package sectionpage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Sleeper;
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
		
		driver.navigate().to(CONFIG.getProperty("Sports_sectionPage"));
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
				
		pageClass pageclass1 = new pageClass();
		PageFactory.initElements(driver, pageclass1);
		
		Thread.sleep(2000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
    	jse.executeScript("window.scrollBy(0,2000)", "");

		Thread.sleep(2000);
		
		pageclass1.privacysection_click();
		Thread.sleep(2000);
		
		String currentUrl = driver.getCurrentUrl();
		
		
		System.out.println("SectionTC_01");
		Assert.assertEquals("https://ebela.in/privacy?ref=sports-Footer", currentUrl);
		
		
		Thread.sleep(2000);
		
		
	}
	
	@AfterMethod
	public void close()
	{
		
	}
	
}
