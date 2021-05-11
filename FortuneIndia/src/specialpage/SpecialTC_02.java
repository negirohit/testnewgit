package specialpage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import basepackage.PageClass;
import basepackage.base;

public class SpecialTC_02 extends base
{

	EventFiringWebDriver firingdriver;
	
	@Test
	@Parameters("browser_name")
	public void mpw_click(String browser_name) throws IOException, InterruptedException
	{
		

		
			String testname = "Fortune MPW Page opening";
			setup(browser_name,testname);
			firingdriver = new EventFiringWebDriver(driver);
			firingdriver.navigate().to("http://www.fortuneindia.com/mpw?year=2017&google_nofetch=true&param=something");
			firingdriver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			basepackage.EventListener listener = new basepackage.EventListener();
			
			
			PageClass pageclass = new PageClass();
			PageFactory.initElements(firingdriver, pageclass);
			
			
			
			
			
			
			pageclass.menu_click();
			
			Thread.sleep(2000);

			pageclass.menuoptions_click(2);
			Thread.sleep(2000);
			JavascriptExecutor jse = (JavascriptExecutor)firingdriver;
			  jse.executeScript("window.scrollBy(0,250)", "");
			Thread.sleep(5000);
			
			
			
			
			Thread.sleep(5000);
			try
			{
				if(firingdriver.findElement(By.cssSelector(".nf-home-btn")).isDisplayed())
				{
					Assert.fail("404 found");
					listener.onException(null,firingdriver);
				}
				
			}
			catch (Exception e) 
			{
				
			}
			
			
			
			
			firingdriver.close();
		
		
	}
	
	@AfterMethod
	public void teardown(ITestResult result) 
	{
		((JavascriptExecutor)driver).executeScript("sauce:job-result=" + (result.isSuccess() ? "passed" : "failed"));
		firingdriver.quit();
		System.out.println("Closing the browser");
		System.out.println("--------------------");
	}
	
}
