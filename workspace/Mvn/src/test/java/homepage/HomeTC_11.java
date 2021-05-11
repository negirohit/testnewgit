package homepage;

import java.util.EventListener;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Ebela.Mvn.base;
import Ebela.Mvn.pageClass;

public class HomeTC_11 extends base 
{


	
	
	@BeforeMethod
	public void CallSetup() throws Exception
	{
		SetUp();
		
		
		
		
	}
	
	@Test(priority=1)
	public void BackToTop() throws Exception
	{
		EventFiringWebDriver firingdriver = new EventFiringWebDriver(driver);
		firingdriver.navigate().to("https://ebela.in/?ref=hm-TopNav");
		firingdriver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		extentTest = extentReport.startTest("Validating BackToTop feature in Homepage","Scroll down & clicking on BackToTop button takes the user to the top of the page.");
		Ebela.Mvn.EventListener listener = new Ebela.Mvn.EventListener();
		firingdriver.register(listener);
		
		pageClass pageclass1 = new pageClass();
		PageFactory.initElements(firingdriver, pageclass1);
		
		Thread.sleep(5000);
		pageclass1.BackToTop(firingdriver);
		Thread.sleep(2000);
		
		JavascriptExecutor jse = (JavascriptExecutor)firingdriver;
		Long value = (Long) jse.executeScript("return window.scrollY;");
		
		if(value.toString().equalsIgnoreCase("0"))
			extentTest.log(LogStatus.PASS, "Test Case Passed");
		else
		{
			extentTest.log(LogStatus.FAIL, "Test Case Failed");
			listener.onException(null, firingdriver);
		}	
		extentReport.endTest(extentTest);
		System.out.println("HomeTC_11");
		Assert.assertEquals(value.toString(), "0");
		
		firingdriver.unregister(listener);
		Thread.sleep(2000);
		
		
		firingdriver.quit();
		
	}
	
	
	
}
