package abpdigital_Robots;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SSl_protocol extends base {

	 @BeforeMethod
	 @Parameters("browser_name")
	  public void startdriver(String browser_name) throws Exception {
	    
	
		String testname = "SSL Protocol Test Cases";
		setup(browser_name,testname);
		
		
	}
	
	
	@Test (priority=1)
	public void test_ABP_SSl_protocol() throws Exception{
		
		driver.navigate().to(CONFIG.getProperty("google"));
		driver.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys("anandabazar");
		driver.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys(Keys.ENTER);
		
		/*List <WebElement> SSlprotocol= driver.findElements(By.cssSelector("cite._Rm"));
		int i=SSlprotocol.size();
		System.out.println("size is  "+ i);
		String protocol1= SSlprotocol.get(1).getText();*/
		
		Thread.sleep(2000);
		
		String protocol=driver.findElement(By.cssSelector(".iUh30")).getText();
		APP_LOGS.debug("ABP_SSl_protocol URL is "+protocol );
		Assert.assertEquals(protocol,"https://www.anandabazar.com/");
		Thread.sleep(2000);
	
	}
	
	@Test (priority=2)
	public void test_Ebela_SSl_protocol() throws Exception{
		driver.navigate().to(CONFIG.getProperty("google"));
		driver.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys("Ebela");
		driver.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys(Keys.ENTER);
	
		Thread.sleep(2000);
		
		String protocol=driver.findElement(By.cssSelector(".iUh30")).getText();
		APP_LOGS.debug("Ebela_SSl_protocol URL is "+protocol);
		Assert.assertEquals(protocol,"https://ebela.in/");
		Thread.sleep(2000);
	
	}
	
	
	//@Test (priority=3)
	public void test_T2online_SSl_protocol() throws Exception{
		driver.navigate().to(CONFIG.getProperty("google"));
		driver.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys("T2online");
		driver.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys(Keys.ENTER);

		
		Thread.sleep(2000);
		
		String protocol=driver.findElement(By.cssSelector(".iUh30")).getText();
		APP_LOGS.debug("T2online_SSl_protocol URL is "+protocol);
		Assert.assertEquals(protocol,"t2online.com/");
		Thread.sleep(2000);
		
		
		
	}	
	@Test (priority=4)
	public void test_Fortune_SSl_protocol() throws Exception{
		driver.navigate().to(CONFIG.getProperty("google"));
		driver.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys("Fortuneindia");
		driver.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		String protocol=driver.findElement(By.cssSelector(".iUh30")).getText();
		APP_LOGS.debug("Fortune_SSl_protocol URL is  "+protocol);
		Assert.assertEquals(protocol,"https://www.fortuneindia.com/");
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
