import java.awt.Desktop.Action;
import java.io.File;
import java.sql.Driver;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.apache.http.HttpRequest;
import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sun.jna.platform.win32.SetupApi;
import com.sun.jna.platform.win32.WinDef;




public class Homepage extends base
{
	public static Logger APP_LOGS = Logger.getLogger("devpinoyLogger");
	
	
	@BeforeMethod
	public void openHomepage() throws Exception
	{	
		
		
	    setup();
	    //driver.get("http://t2online.com/");
	    
	}
	
	@Test
	public void homepage_CarousalClick() throws Exception
	{
		
		
	    driver.get(CONFIG.getProperty("homePage"));
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    APP_LOGS.debug("Executing Carousal Click from Homepage");
	    // Carousal Click
		WebElement CarousalClick1 = driver.findElement(By.cssSelector(".swiper-button-next.article-thumb-swiper-next.shared-button-next.mobile-hide"));
		CarousalClick1.click();
		System.out.println("Carousal Click Done");
		Thread.sleep(2000);
		WebElement CarousalClick2 = driver.findElement(By.cssSelector(".swiper-button-next.article-thumb-swiper-next.shared-button-next.mobile-hide"));
		CarousalClick2.click();
		System.out.println("Carousal Click Done");
		Thread.sleep(2000);
		WebElement CarousalClick3 = driver.findElement(By.cssSelector(".swiper-button-next.article-thumb-swiper-next.shared-button-next.mobile-hide"));
		CarousalClick3.click();
		System.out.println("Carousal Click Done");
		Thread.sleep(2000);
		WebElement CarousalClick4 = driver.findElement(By.cssSelector(".swiper-button-next.article-thumb-swiper-next.shared-button-next.mobile-hide"));
		CarousalClick4.click();
		System.out.println("Carousal Click Done");
		Thread.sleep(2000);
		driver.close();
	}
	
	@Test
	public void homepage_entertainment_SubSectionClick() throws Exception
	{	
		APP_LOGS.debug("Executing Entertainment Subsection Click from Homepage");
		String url = CONFIG.getProperty("homePage");
		entertainment_SubSectionClick(url);
				
	}
	
	@Test
	public void homepage_lifestyle_SubSectionClick() throws Exception
	{	
		APP_LOGS.debug("Executing Lifestyle Subsection Click from Homepage");
		String url = CONFIG.getProperty("homePage");
		lifestyle_SubSectionClick(url);
				
	}
	
	@Test
	public void homepage_tech_SubSectionClick() throws Exception
	{	
		APP_LOGS.debug("Executing Tech Subsection Click from Homepage");
		String url = CONFIG.getProperty("homePage");
		tech_SubSectionClick(url);
				
	}
	
	@Test
	public void homepage_sport_SubSectionClick() throws Exception
	{	
		APP_LOGS.debug("Executing Sport Subsection Click from Homepage");
		String url = CONFIG.getProperty("homePage");
		sport_SubSectionClick(url);
				
	}
	
	@Test
	public void homepage_spin_SubSectionClick() throws Exception
	{	
		APP_LOGS.debug("Executing Spin Subsection Click from Homepage");
		String url = CONFIG.getProperty("homePage");
		spin_SubSectionClick(url);
				
	}
	
	@Test
	public void homepage_video_SubSectionClick() throws Exception
	{	
		APP_LOGS.debug("Executing Video Subsection Click from Homepage");
		String url = CONFIG.getProperty("homePage");
		video_SubSectionClick(url);
				
	}
	
	@Test
	public void homepage_LoadMoreHome() throws Exception
	{	
		APP_LOGS.debug("Executing LOADMORE feature from Homepage");
		String url = CONFIG.getProperty("homePage");
		LoadMore(url);
	}
	
	@Test
	public void homepage_entertainment_SubMenuAssert() throws Exception
	{	
		APP_LOGS.debug("Checking Entertainment Submenu assertion from Homepage");
		String url = CONFIG.getProperty("homePage");
		entertainment_SubMenuAssert(url);
	
	
	}
	public void homepage_lifestyle_SubMenuAssert() throws Exception
	{	
		APP_LOGS.debug("Checking Lifestyle Submenu assertion from Homepage");
		String url = CONFIG.getProperty("homePage");
		lifestyle_SubMenuAssert(url);
	
	
	}
	public void homepage_tech_SubMenuAssert() throws Exception
	{	
		APP_LOGS.debug("Checking Tech Submenu assertion from Homepage");
		String url = CONFIG.getProperty("homePage");
		tech_SubMenuAssert(url);
	
	
	}
	public void homepage_sport_SubMenuAssert() throws Exception
	{	
		APP_LOGS.debug("Checking Sport Submenu assertion from Homepage");
		String url = CONFIG.getProperty("homePage");
		sport_SubMenuAssert(url);
	
	
	}
	public void homepage_spin_SubMenuAssert() throws Exception
	{	
		APP_LOGS.debug("Checking Spin Submenu assertion from Homepage");
		String url = CONFIG.getProperty("homePage");
		spin_SubMenuAssert(url);
	
	
	}
	public void homepage_video_SubMenuAssert() throws Exception
	{	
		APP_LOGS.debug("Checking Video Submenu assertion from Homepage");
		String url = CONFIG.getProperty("homePage");
		video_SubMenuAssert(url);
	
	
	}

@Test
public void homepage_SocialShare() throws Exception
{	
	APP_LOGS.debug("Checking Social Share from Homepage");
	WebDriver driver = new ChromeDriver();
    driver.get(CONFIG.getProperty("homePage"));
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

    String firstwindowhandle = driver.getWindowHandle();
    
    //facebook
    WebElement facebook = driver.findElement(By.cssSelector(".t2icon-facebook"));
    facebook.click();
    Thread.sleep(5000);
    String secondwindowhandle = " ";
    Set<String> windowhandles = driver.getWindowHandles();
    
    for(String id : windowhandles)
    {
    	
    	if(!firstwindowhandle.equalsIgnoreCase(id))
    		secondwindowhandle=id;
    	
    }
    driver.switchTo().window(secondwindowhandle);
    String facebookurl = driver.getCurrentUrl();
    System.out.println(facebookurl);
    Thread.sleep(5000);
	org.testng.Assert.assertEquals("https://www.facebook.com/t2online/?ref=ts&fref=ts", facebookurl);
    driver.close();
	driver.switchTo().window(firstwindowhandle);
	
	//twitter
	WebElement twitter = driver.findElement(By.cssSelector(".t2icon-twitter"));
    twitter.click();
    Thread.sleep(5000);
    Set<String> windowhandles1 = driver.getWindowHandles();
    
    for(String id : windowhandles1)
    {
    	
    	if(!firstwindowhandle.equalsIgnoreCase(id))
    		secondwindowhandle=id;
    	
    }
    driver.switchTo().window(secondwindowhandle);
    String twitterurl = driver.getCurrentUrl();
    System.out.println(twitterurl);
    Thread.sleep(5000);
	org.testng.Assert.assertEquals("https://twitter.com/T2_Online", twitterurl);
    driver.close();
	driver.switchTo().window(firstwindowhandle);
	
	
	
	//gplus
	WebElement gplus = driver.findElement(By.cssSelector(".t2icon-gplus"));
    gplus.click();
    Thread.sleep(5000);
    Set<String> windowhandles3 = driver.getWindowHandles();
    
    for(String id : windowhandles3)
    {
    	
    	if(!firstwindowhandle.equalsIgnoreCase(id))
    		secondwindowhandle=id;
    	
    }
    driver.switchTo().window(secondwindowhandle);
    String gplusurl = driver.getCurrentUrl();
    System.out.println(gplusurl);
    Thread.sleep(5000);
	org.testng.Assert.assertEquals("https://plus.google.com/113096528543729192017", gplusurl);
    driver.close();
	driver.switchTo().window(firstwindowhandle);
	
	
	
	//youtube
	WebElement youtube = driver.findElement(By.cssSelector(".t2icon-youtube"));
    youtube.click();
    Thread.sleep(5000);
    Set<String> windowhandles5 = driver.getWindowHandles();
    
    for(String id : windowhandles5)
    {
    	
    	if(!firstwindowhandle.equalsIgnoreCase(id))
    		secondwindowhandle=id;
    	
    }
    driver.switchTo().window(secondwindowhandle);
    String youtubeurl = driver.getCurrentUrl();
    System.out.println(youtubeurl);
	Thread.sleep(5000);
	org.testng.Assert.assertEquals("https://www.youtube.com/channel/UCjCgbZQbJvVXP13WMScdrRg", youtubeurl);
    driver.close();
	driver.switchTo().window(firstwindowhandle);
	driver.close();
	
}

	
@Test
public void homepage_BackToTop() throws Exception
{
	APP_LOGS.debug("Checking Back to Top Feature from Homepage");
	String url = CONFIG.getProperty("homePage");
	//	scroll(url);
	
}
@Test
public void homepage_video_SubMenuStoryClick() throws Exception
{
	APP_LOGS.debug("Checking Video SubMenu and hover over the story clicking on it from Homepage");
	String url = CONFIG.getProperty("homePage");
	video_SubMenuStoryClick(url);
}
@Test
public void homepage_entertainment_SubMenuStoryClick() throws Exception
{
	APP_LOGS.debug("Checking Entertainment SubMenu and hover over the story clicking on it from Homepage");
	String url = CONFIG.getProperty("homePage");
	entertainment_SubMenuStoryClick(url);
}
@Test
public void homepage_lifestyle_SubMenuStoryClick() throws Exception
{
	APP_LOGS.debug("Checking Lifestyle SubMenu and hover over the story clicking on it from Homepage");
	String url = CONFIG.getProperty("homePage");
	lifestyle_SubMenuStoryClick(url);
}
@Test
public void homepage_tech_SubMenuStoryClick() throws Exception
{
	APP_LOGS.debug("Checking Tech SubMenu and hover over the story clicking on it from Homepage");
	String url = CONFIG.getProperty("homePage");
	tech_SubMenuStoryClick(url);
}
@Test
public void homepage_sport_SubMenuStoryClick() throws Exception
{
	APP_LOGS.debug("Checking Sport SubMenu and hover over the story clicking on it from Homepage");
	String url = CONFIG.getProperty("homePage");
	sport_SubMenuStoryClick(url);
}
@Test
public void homepage_spin_SubMenuStoryClick() throws Exception
{
	APP_LOGS.debug("Checking Spin SubMenu and hover over the story clicking on it from Homepage");
	String url = CONFIG.getProperty("homePage");
	spin_SubMenuStoryClick(url);
}


@AfterMethod
public void close()
{
	driver.quit();
}
}
