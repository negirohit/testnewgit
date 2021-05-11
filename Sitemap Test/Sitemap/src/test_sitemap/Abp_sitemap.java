package test_sitemap;



import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Abp_sitemap extends base{
	
	
	
	@BeforeTest
	public void openBrowser() throws InterruptedException, IOException{
		setup();
	  }
	
	@BeforeMethod
	public void openUrl() throws InterruptedException{
		driver.navigate().to(CONFIG.getProperty("testSiteURL"));
		APP_LOGS.debug("anandbazarsitemap");
		APP_LOGS.debug(CONFIG.getProperty("testSiteURL"));
		//skipHomeAd();
		Thread.sleep(1000);	
	}
	
	
	@Test(priority=1)
	public void abptopic_SiteMap() throws InterruptedException, ParseException
	{
		
		String abptopic_sitemap1 = "https://www.anandabazar.com/topic/sitemap.xml";
		driver.get(abptopic_sitemap1);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		driver.manage().window().maximize();
		
		Assert.assertEquals(driver.getCurrentUrl(), abptopic_sitemap1);
		
		try
		{
		if(driver.findElement(By.cssSelector(".error-head")).isDisplayed())
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
	
	@Test(priority=2)
	public void abpnews_SiteMap() throws InterruptedException, ParseException
	{
		
		String abpnews_sitemap1 = "https://www.anandabazar.com/news-sitemap.xml";
		driver.get(abpnews_sitemap1);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		driver.manage().window().maximize();
		
		Assert.assertEquals(driver.getCurrentUrl(), abpnews_sitemap1);
		
		try
		{
		if(driver.findElement(By.cssSelector(".col-xs-12.leftpadding0.rightpadding0.abp-404-txt-div>h1")).isDisplayed())
		{
			Assert.fail("404 url found");
		}
		
		}
		catch (Exception e) 
		{
			
		}
		
		String expected_firstlink="http://www.sitemaps.org/schemas/sitemap/0.9";
		String actual_firstlink = datacheck();
		Assert.assertEquals(actual_firstlink, expected_firstlink);
		
		SiteMapcheck(20);
	}
	
	@Test(priority=3)
	public void abpSiteMap_index() throws InterruptedException, ParseException
	{
		
		String abpSiteMapindex = "https://www.anandabazar.com/abpSitemapsIndex.xml";
		driver.get(abpSiteMapindex);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		driver.manage().window().maximize();
		
		Assert.assertEquals(driver.getCurrentUrl(), abpSiteMapindex);
		
		try
		{
		if(driver.findElement(By.cssSelector("html>body>center>h1")).isDisplayed())
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
		dateSiteMapcheck(1);
	}
	
	@Test(priority=4)
	public void abp_SiteMap() throws InterruptedException, ParseException
	{
		
		String abpsitemap = "https://www.anandabazar.com/sitemap.xml";
		driver.get(abpsitemap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		driver.manage().window().maximize();
		
		Assert.assertEquals(driver.getCurrentUrl(), abpsitemap);
		
		try
		{
		if(driver.findElement(By.cssSelector(".col-xs-12.leftpadding0.rightpadding0.abp-404-txt-div>h1")).isDisplayed())
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
		dateSiteMapcheck(4);
	}
	
	

	@AfterClass
	public void closedriver(){
		driver.quit();
	}
	
	
	@AfterMethod
	public void takeScreenShotOnFailure(ITestResult testResult) throws IOException { 
        if (testResult.getStatus() == ITestResult.FAILURE) { 
                
               File scrFile = ((TakesScreenshot) driver)
                     .getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File(CONFIG.getProperty("scrfolder")+ testResult.getName()+".jpg"));
                  
               }
	}
}
	
//to print all the first 30 span.text values
/* int a = links.size();				
System.out.println(a);	
for(int i=1;i<30;i++)
{
String ab= links.get(i).getText();
System.out.println("vaue of link" +i + ab );

///////////////////////////////////////////
 * 
 * // get the text of the body element
WebElement body = driver.findElement(By.tagName("body"));
String bodyText = body.getText();

// count occurrences of the string
int count = 0;

// search for the String within the text
while (bodyText.contains("VIM LIQUID MARATHI")){

    // when match is found, increment the count
    count++;

    // continue searching from where you left off
    bodyText = bodyText.substring(bodyText.indexOf("VIM LIQUID MARATHI") + "VIM LIQUID MARATHI".length());
}
 */

