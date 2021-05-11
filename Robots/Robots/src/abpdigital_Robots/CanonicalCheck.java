package abpdigital_Robots;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class CanonicalCheck extends base 
{
	public static Logger APP_LOGS = Logger.getLogger("devpinoyLogger");


	@Test
	public void CanonicalCheck_Ebela() throws Exception
	{
		setup();
		
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
		setup();
		
		driver.get("http://www.anandabazar.com/");
		Thread.sleep(5000);
		String s = driver.getCurrentUrl();

		Assert.assertEquals(s,"http://www.anandabazar.com/");

		//driver.navigate().to("http://www.anandabazar.com/");
		//Thread.sleep(5000);
		//String s1 = driver.getCurrentUrl();
		APP_LOGS.debug("ABP Canonical Check Passed");
		//Assert.assertEquals(s1,"http://www.anandabazar.com/");

		
		
	}

	@AfterClass
	public void close()
	{
		driver.quit();
	}
	
}
