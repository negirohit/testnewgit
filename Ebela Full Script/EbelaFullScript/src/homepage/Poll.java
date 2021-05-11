package homepage;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.base;
import base.pageClass;



public class Poll extends base
{


	
	
	
	@BeforeMethod
	public void CallSetup() throws Exception
	{
		
		
		
		
		
		
	}
	
	@Test(priority=1)
	public void opinion_poll() throws Exception
	{
		
		driver.navigate().to(CONFIG.getProperty("homePage"));
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
		
		pageClass pageclass1 = new pageClass();
		PageFactory.initElements(driver, pageclass1);
		
		System.out.println("Passed");
		
		pageclass1.Poll_click(driver);
		Thread.sleep(5000);
		
		
		System.out.println("HomeTC_10");
		
		Thread.sleep(2000);
		
		
		
	}
	
	@AfterMethod
	public void close()
	{
		
	}
	
	
}
