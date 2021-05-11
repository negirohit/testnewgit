package sectionpage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.base;
import base.pageClass;



public class SubSectionCheck extends base
{
	@BeforeMethod
	public void CallSetup() throws Exception
	{
		
		
		
		SetUp();
		
	}
	
	@Test(priority=1)
	public void SubSectionSport() throws Exception
	{
		
		driver.navigate().to(CONFIG.getProperty("Sports_sectionPage"));
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
		
		pageClass pageclass1 = new pageClass();
		PageFactory.initElements(driver, pageclass1);
		
		Thread.sleep(5000);
		pageclass1.subsection_click();
		Thread.sleep(2000);
		
		String currentUrl = driver.getCurrentUrl();
		
		
		System.out.println("SectionTC_06");
		Assert.assertEquals(currentUrl, "https://ebela.in/sports/cricket");
		
		
		Thread.sleep(2000);
		
		
		
		
	}
	@AfterMethod
	public void close()
	{
		//driver.quit();
	}
	
}
