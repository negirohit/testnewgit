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



public class NavBarCheck extends base
{

	@BeforeMethod
	public void CallSetup() throws Exception
	{
		
		
		
		
		
	}
	
	@Test(priority=2)
	public void nav_clickable() throws Exception
	{
		
		driver.navigate().to(CONFIG.getProperty("Entertainment_sectionPage"));
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
		
		pageClass pageclass1 = new pageClass();
		PageFactory.initElements(driver, pageclass1);
		pageclass1.sport_nav_click();
		
		System.out.println("SectionTC_04");
		Thread.sleep(5000);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl+ "fail krche test case");
		
		
		
		Assert.assertEquals("https://ebela.in/sports?ref=entertainment-TopNav", currentUrl);
	
		
		Thread.sleep(2000);

		
		
		
	}
	
	@AfterMethod
	public void close()
	{
		
	}
	
}
