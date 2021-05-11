package homepage;

import java.util.EventListener;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
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
	@Parameters("browser_name")
	public void nav_clickable(String browser_name) throws Exception
	{
		String testname = "Ebela Home page : Check Nav Bar Sport Link";
		SetUp(browser_name,testname);
		driver.navigate().to(CONFIG.getProperty("homePage"));
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
		
		pageClass pageclass1 = new pageClass();
		PageFactory.initElements(driver, pageclass1);
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		pageclass1.sport_nav_click();
		
		System.out.println("HomeTC_14");
		Thread.sleep(5000);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl+ "fail krche test case");
		
		
		Assert.assertEquals("https://ebela.in/sports?ref=hm-TopNav", currentUrl);
	
		
		Thread.sleep(2000);

		
		
		
	}
	
	@AfterMethod
	public void teardown(ITestResult result) 
	{
		((JavascriptExecutor)driver).executeScript("sauce:job-result=" + (result.isSuccess() ? "passed" : "failed"));
		driver.quit();
		System.out.println("Closing the browser");
		System.out.println("--------------------");
		
	}
}
