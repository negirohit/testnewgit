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
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class t2online_topic_sitemap extends base{
	
public static String currdate;
	
	@BeforeTest
	public void openBrowser() throws InterruptedException, IOException{
		setup();
	  }
	
	@BeforeMethod
	public void openUrl() throws InterruptedException{
		driver.navigate().to(CONFIG.getProperty("testSiteURL3"));
	
		Thread.sleep(1000);	
	}
	
	
	
	
	//@Test(priority=0)
	public void t2online_SiteMap() throws InterruptedException, ParseException
	{
		
		String t2online_sitemap1 = "http://t2online.com/sitemap.xml";
		driver.get(t2online_sitemap1);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		driver.manage().window().maximize();
		
		Assert.assertEquals(driver.getCurrentUrl(),t2online_sitemap1);
		
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
		
		dateSiteMapcheck(4);
	}
	
	//@Test(priority=0)
	public void t2_topicsitemap() throws InterruptedException, ParseException
	{
		
		String t2topic_sitemap = "http://t2online.com/topic/sitemap.xml";
		driver.get(t2topic_sitemap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		driver.manage().window().maximize();
		
		Assert.assertEquals(driver.getCurrentUrl(), t2topic_sitemap);
		
		try
		{
		if(driver.findElement(By.cssSelector(".err-txt-blk.pull-left")).isDisplayed())
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
		
		SiteMapcheck(4);
	}
	
	//@Test(priority=0)
	public void t2index_SiteMap() throws InterruptedException, ParseException
	{
		
		String t2story_sitemap = "http://t2online.com/t2onlineSiteMapsIndex.xml";
		driver.get(t2story_sitemap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		driver.manage().window().maximize();
		
		Assert.assertEquals(driver.getCurrentUrl(), t2story_sitemap);
		
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
	
	//@Test(priority=0)
	public void t2rss_fb_new() throws InterruptedException, ParseException
	{
		
		String t2rssfb = "http://t2online.com/t2-rss-feed-new.xml";
		driver.get(t2rssfb);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		driver.manage().window().maximize();
		
		Assert.assertEquals(driver.getCurrentUrl(), t2rssfb);
		
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
	
	//@Test(priority=0)
	public void t2rss_detail() throws InterruptedException, ParseException
	{
		
		String t2rss_detail = "http://t2online.com/t2-rss-feed-detailed.xml";
		driver.get(t2rss_detail);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		driver.manage().window().maximize();
		
		Assert.assertEquals(driver.getCurrentUrl(), t2rss_detail);
		
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
		
		String expected_firstlink="http://www.w3.org/2005/Atom";
		String actual_firstlink = datacheck();
		Assert.assertEquals(actual_firstlink, expected_firstlink);
		
		List<WebElement> links= driver.findElements(By.cssSelector("span.text"));
		
		//to print all the first 30 span.text values
		int a = links.size();				
		System.out.println(a);	
		for(int i=1;i<20;i++)
		{
		String ab= links.get(i).getText();
		System.out.println("vaue of link" +i + ab );
		
		
		
		}
		
		String mydate= links.get(11).getText();
		if(mydate.contains("CDATA"))
			Assert.assertTrue(true);
		else
			Assert.fail();
	}
	
	//@Test(priority=0)
	public void t2rss_Feed() throws InterruptedException, ParseException
	{
		
		String t2rssfeed = "http://t2online.com/t2-rss-feed.xml";
		driver.get(t2rssfeed);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		driver.manage().window().maximize();
		
		Assert.assertEquals(driver.getCurrentUrl(), t2rssfeed);
		
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
		
		String expected_firstlink="http://www.w3.org/2005/Atom";
		String actual_firstlink = datacheck();
		Assert.assertEquals(actual_firstlink, expected_firstlink);
		
		
		List<WebElement> links= driver.findElements(By.cssSelector("span.text"));
		
		//to print all the first 30 span.text values
		int a = links.size();				
		System.out.println(a);	
		for(int i=1;i<20;i++)
		{
		String ab= links.get(i).getText();
		System.out.println("vaue of link" +i + ab );
		
		
		
		}
		
		String mydate= links.get(11).getText();
		if(mydate.contains("CDATA"))
			Assert.assertTrue(true);
		else
			Assert.fail();
	}
	
	//@Test(priority=0)
	public void t2rss_FullFeed() throws InterruptedException, ParseException
	{
		
		String t2rssfullfeed = "http://t2online.com/t2-rss-full-feed.xml";
		driver.get(t2rssfullfeed);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		driver.manage().window().maximize();
		
	//	Assert.assertEquals(driver.getCurrentUrl(), t2rssfullfeed);
		
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
		
		String expected_firstlink="http://www.w3.org/2005/Atom";
		String actual_firstlink = datacheck();
		Assert.assertEquals(actual_firstlink, expected_firstlink);
		
		
	}
	
	
	@AfterClass
	public void close()
	{
		driver.quit();
	}
	
}
