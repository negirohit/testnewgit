package test_sitemap;


import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
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



public class ebela_Sitemap extends base{
	
	
	
	@BeforeTest
	public void openBrowser() throws InterruptedException, IOException{
		setup();
	  }
	
	@BeforeMethod
	public void openUrl() throws InterruptedException{
		driver.navigate().to(CONFIG.getProperty("testSiteURL1"));
	//	APP_LOGS.debug("Ebelasitemap");
	//	APP_LOGS.debug(CONFIG.getProperty("testSiteURL1"));
		//skipHomeAd();
		Thread.sleep(1000);	
	}
	
	
	
	
	@Test(priority=1)
	public void ebela_SiteMap() throws InterruptedException, ParseException
	{
		
		String ebela_sitemap = "https://ebela.in/sitemap.xml";
		driver.get(ebela_sitemap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		driver.manage().window().maximize();
		
		Assert.assertEquals(driver.getCurrentUrl(), ebela_sitemap);
		
		try
		{                                      
		if(driver.findElement(By.cssSelector(".col-xs-12.leftpadding0.rightpadding0.ebela-404-txt-div>h1")).isDisplayed())
		{
			Assert.fail("404 found");
		}
		
		}
		catch (Exception e) 
		{
			
		}
		
		String expected_firstlink="https://www.sitemaps.org/schemas/sitemap/0.9";
		String actual_firstlink = datacheck();
		Assert.assertEquals(actual_firstlink, expected_firstlink);
		otherSiteMapcheck(6);
	}
	
	@Test(priority=2)
	public void EbelaNews_SiteMap() throws InterruptedException, ParseException
	{
		
		String ebelanews_sitemap = "https://ebela.in/news-sitemap.xml";
		driver.get(ebelanews_sitemap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		driver.manage().window().maximize();
		
		Assert.assertEquals(driver.getCurrentUrl(), ebelanews_sitemap);
		
		try
		{
		if(driver.findElement(By.cssSelector(".col-xs-12.leftpadding0.rightpadding0.ebela-404-txt-div>h1")).isDisplayed())
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
		
		SiteMapcheck(20);
	}
	
	@Test(priority=3)
	public void EbelaSitemap_Index() throws InterruptedException, ParseException
	{
		
		String ebela_index = "https://ebela.in/ebelaSitemapsIndex.xml";
		driver.get(ebela_index);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		driver.manage().window().maximize();
		
		Assert.assertEquals(driver.getCurrentUrl(), ebela_index);
		
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
	
		fewlinesdateSiteMapcheck(1);
	}
	
	


	@Test(priority=5)
	public void ebelanews_Feed() throws InterruptedException, ParseException
	{
		
		String ebela_newsfeed = "https://ebela.in/ebela-feed.xml";
		driver.get(ebela_newsfeed);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		driver.manage().window().maximize();
		
		Assert.assertEquals(driver.getCurrentUrl(), ebela_newsfeed);
		
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
		
		List<WebElement> links= driver.findElements(By.cssSelector("span.text"));
		
		//to print all the first 30 span.text values
		int a = links.size();				
		System.out.println(a);	
		for(int i=1;i<10;i++)
		{
		String ab= links.get(i).getText();
		System.out.println("vaue of link" +i + ab );
		
		
		
		}
		
		String mydate= links.get(2).getText();
		if(mydate.contains("CDATA"))
			Assert.assertTrue(true);
		else
			Assert.fail();
		
	}
	
	@Test(priority=6)
	public void ebela_videogalleryFeed() throws InterruptedException, ParseException
	{
		
		String ebela_video = "https://ebela.in/ebela-videogallery-feed.xml";
		driver.get(ebela_video);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		driver.manage().window().maximize();
		
		Assert.assertEquals(driver.getCurrentUrl(), ebela_video);
		
		try
		{
		if(driver.findElement(By.cssSelector("html>body>center>h1")).isDisplayed())
		{
			Assert.fail("404");
		}
		
		}
		catch (Exception e) 
		{
			
		}
		
		
		
		
		List<WebElement> links= driver.findElements(By.cssSelector("span.text"));
		
		//to print all the first 30 span.text values
		int a = links.size();				
		System.out.println(a);	
		for(int i=1;i<40;i++)
		{
		String ab= links.get(i).getText();
		System.out.println("vaue of link" +i + ab );
		
		
		
		}
		
		String mydate1= links.get(17).getText();
		if(mydate1.contains("https://ebela.in/videogallery"))
			Assert.assertTrue(true);	
		else
			Assert.fail();
	}
	
	@Test(priority=7)
	public void ebelarss_Feed() throws InterruptedException, ParseException
	{
		
		String ebelarssfeed = "https://ebela.in/ebela-rss-feed.xml";
		driver.get(ebelarssfeed);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		driver.manage().window().maximize();
		
		Assert.assertEquals(driver.getCurrentUrl(), ebelarssfeed);
		
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
		
		String expected_firstlink="http://purl.org/rss/1.0/modules/content/";
		String actual_firstlink = datacheck();
		Assert.assertEquals(actual_firstlink, expected_firstlink);
		SiteMapcheck(12);
	}
	
	@AfterMethod
	public void takeScreenShotOnFailure(ITestResult testResult) throws IOException { 
        if (testResult.getStatus() == ITestResult.FAILURE) { 
                
               File scrFile = ((TakesScreenshot) driver)
                     .getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File(CONFIG.getProperty("scrfolder")+ testResult.getName()+".jpg"));
                //driver.quit();  
               }
			
		
	}
	
	@AfterClass
	public void closedriver(){
		driver.quit();
	}
	
}
