package homepage;

import java.util.EventListener;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Ebela.Mvn.base;
import Ebela.Mvn.pageClass;

public class HomeTC_10 extends base
{


	
	
	
	@BeforeMethod
	public void CallSetup() throws Exception
	{
		SetUp();
		
		
		
		
		
	}
	
	@Test(priority=1)
	public void opinion_poll() throws Exception
	{
		EventFiringWebDriver firingdriver = new EventFiringWebDriver(driver);
		firingdriver.navigate().to("https://ebela.in/?ref=hm-TopNav");
		firingdriver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		extentTest = extentReport.startTest("Verifying the Opinion Poll from Homepage","Clicking on any option and then submit, the opinion poll should work.");
		Ebela.Mvn.EventListener listener = new Ebela.Mvn.EventListener();
		firingdriver.register(listener);
		
		pageClass pageclass1 = new pageClass();
		PageFactory.initElements(firingdriver, pageclass1);
		
		System.out.println("Passed");
		
		pageclass1.Poll_click(firingdriver);
		Thread.sleep(5000);
		
		extentTest.log(LogStatus.PASS, "Test Case Passed");
		extentReport.endTest(extentTest);
		System.out.println("HomeTC_10");
		firingdriver.unregister(listener);
		Thread.sleep(2000);
		
		firingdriver.quit();
		
	}
	
	@AfterMethod
	public void close()
	{
		
	}
	
	
}
