package test_sitemap;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.time.DateUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebela_topic_sitemap extends base{
	
public static String currdate;
	
	@BeforeTest
	public void openBrowser() throws InterruptedException, IOException{
		setup();
	  }
	
	@BeforeMethod
	public void openUrl() throws InterruptedException{
		driver.navigate().to(CONFIG.getProperty("testSiteURL4"));
	
		Thread.sleep(1000);	
	}
	
	
	
	
	@Test(priority=4)
	public void ebelaTopic_Sitemap() throws InterruptedException, ParseException
	{
		
		String ebela_topic = "https://ebela.in/topic/sitemap.xml";
		driver.get(ebela_topic);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		driver.manage().window().maximize();
		
		Assert.assertEquals(driver.getCurrentUrl(), ebela_topic);
		
		try
		{
		if(driver.findElement(By.cssSelector(".page-not-found-header")).isDisplayed())
		{
			Assert.fail("404 found");
		}
		
		}
		catch (Exception e) 
		{
			
		}
		
		String expected_firstlink="http://www.sitemaps.org/schemas/sitemap/0.9";
		String actual_firstlink = datacheck();
		Assert.assertEquals(actual_firstlink, expected_firstlink);
		
	}
	
	@AfterMethod
	public void close()
	{
		driver.close();
	}
	
}
