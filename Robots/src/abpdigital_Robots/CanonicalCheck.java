package abpdigital_Robots;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CanonicalCheck extends base 
{
	public static Logger APP_LOGS = Logger.getLogger("devpinoyLogger");

	
	 @BeforeMethod
	 @Parameters("browser_name")
	  public void startdriver(String browser_name) throws Exception {
	    
	
		String testname = "Canonical Check ABP & Ebela Test Cases";
		setup(browser_name,testname);
		
		
	}

	@Test
	public void CanonicalCheck_Ebela() throws Exception
	{
		
		driver.get("https://ebela.in/");
		Thread.sleep(5000);
		String s = driver.getCurrentUrl();

		Assert.assertEquals(s, "https://ebela.in/");

		driver.navigate().to("http://ebela.in/");
		Thread.sleep(5000);
		String s1 = driver.getCurrentUrl();
		APP_LOGS.debug("Ebela Canonical Check Passed");
		Assert.assertEquals(s1, "https://ebela.in/");

		
		
	}
	
	@Test
	public void CanonicalCheck_ABP() throws Exception
	{
				
		driver.get("http://www.anandabazar.com/");
		Thread.sleep(5000);
		String s = driver.getCurrentUrl();

		Assert.assertEquals(s,"https://www.anandabazar.com/");

		//driver.navigate().to("http://www.anandabazar.com/");
		//Thread.sleep(5000);
		//String s1 = driver.getCurrentUrl();
		APP_LOGS.debug("ABP Canonical Check Passed");
		//Assert.assertEquals(s1,"http://www.anandabazar.com/");

		
		
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
