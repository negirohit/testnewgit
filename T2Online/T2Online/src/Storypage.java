import java.awt.List;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterClass;
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
import org.testng.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Storypage extends base
{
	

	@BeforeMethod
	public void openHomepage() throws Exception
	{
		
	    setup(); 
	    
	}
	@Test
	public void story_NextPrevButtonStories() throws Exception
	{
		APP_LOGS.debug("Checking Next Previous Button from Story Page");
		String url = "http://t2online.com/entertainment/in-pics-aamir-khan-kangana-ranaut-sohail-khan-jacqueline-fernandez-and-more/cid/1.60898";
		NextPrevButton(url);
	}
	@Test
	public void story_BackToTop() throws Exception
	{	
		APP_LOGS.debug("Checking Back to Top from Story Page");
		String url = "http://t2online.com/entertainment/suits-patrick-j-adams-got-hitched-to-pretty-little-liars-star-troian-bellisario/cid/1.60583";
	//	scroll(url);
	    
		
	}
	@Test
	public void story_entertainment_SubMenuStoryClick() throws Exception
	{
		APP_LOGS.debug("Checking Entertainment SubMenu and hover over the story clicking on it from Storypage");
		String url = "http://t2online.com/tech/weird-and-wacky-gadgets-unveiled-at-ces-2017/cid/1.62849";
		entertainment_SubMenuStoryClick(url);
		
	}
	@Test
	public void story_video_SubMenuStoryClick() throws Exception
	{
		APP_LOGS.debug("Checking Video SubMenu and hover over the story clicking on it from Storypage");
		String url = "http://t2online.com/tech/weird-and-wacky-gadgets-unveiled-at-ces-2017/cid/1.62849";
		video_SubMenuStoryClick(url);
		
	}
	@Test
	public void story_lifestyle_SubMenuStoryClick() throws Exception
	{
		APP_LOGS.debug("Checking Lifestyle SubMenu and hover over the story clicking on it from Storypage");
		String url = "http://t2online.com/tech/weird-and-wacky-gadgets-unveiled-at-ces-2017/cid/1.62849";
		lifestyle_SubMenuStoryClick(url);
		
	}
	@Test
	public void story_tech_SubMenuStoryClick() throws Exception
	{
		APP_LOGS.debug("Checking Tech SubMenu and hover over the story clicking on it from Storypage");
		String url = "http://t2online.com/tech/weird-and-wacky-gadgets-unveiled-at-ces-2017/cid/1.62849";
		tech_SubMenuStoryClick(url);
		
	}
	@Test
	public void story_sport_SubMenuStoryClick() throws Exception
	{
		APP_LOGS.debug("Checking Sport SubMenu and hover over the story clicking on it from Storypage");
		String url = "http://t2online.com/tech/weird-and-wacky-gadgets-unveiled-at-ces-2017/cid/1.62849";
		sport_SubMenuStoryClick(url);
		
	}
	@Test
	public void story_spin_SubMenuStoryClick() throws Exception
	{
		APP_LOGS.debug("Checking Spin SubMenu and hover over the story clicking on it from Storypage");
		String url = "http://t2online.com/tech/weird-and-wacky-gadgets-unveiled-at-ces-2017/cid/1.62849";
		spin_SubMenuStoryClick(url);
		
	}
	
	@AfterMethod
	public void close()
	{
		driver.quit();
	}
}
