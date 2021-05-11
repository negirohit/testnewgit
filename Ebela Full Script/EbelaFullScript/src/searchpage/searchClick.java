package searchpage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.base;
import base.pageClass;

public class searchClick extends base
{

	@BeforeMethod
	public void CallSetup() throws Exception
	{
		
		
		
		
		
	}
	
	@Test(priority=1)
	public void BackToTop() throws Exception
	{
	
		driver.navigate().to(CONFIG.getProperty("homePage"));
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
	
		driver.navigate().refresh();
		
		pageClass pageclass1 = new pageClass();
		PageFactory.initElements(driver, pageclass1);
		
		Thread.sleep(3000);
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1750)", "");
		pageclass1.BackToTop();
		Thread.sleep(2000);
		
		
		Long value = (Long) jse.executeScript("return window.scrollY;");
		
		
		System.out.println("HomeTC_11");
		Assert.assertEquals(value.toString(), "0");
		
		
		Thread.sleep(2000);
		
		
		
		
	}
	
	@AfterMethod
	public void close()
	{
		
	}
	
}
