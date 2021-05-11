import java.io.File;
import java.util.concurrent.TimeUnit;

import java.util.List;
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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sectionpage extends base
{


	@BeforeMethod
	public void openHomepage() throws Exception
	{
		
	    setup();
	    
	}
	
	@Test
	public void curatedsection_entertainment_SubSectionClick() throws Exception
	{
		
		APP_LOGS.debug("Checking Entertainment Sub Section Click from Entertainment Sectionpage");
		String url = "http://t2online.com/entertainment/";
		curated_SubSectionClick(url);
	}
	
	@Test
	public void lifestylesection_entertainment_SubSectionClick() throws Exception
	{
		
		APP_LOGS.debug("Checking Lifestyle Sub Section Click from Entertainment Sectionpage");
		String url = "http://t2online.com/entertainment/";
		lifestyle_SubSectionClick(url);
	}
	
	@Test
	public void techsection_entertainment_SubSectionClick() throws Exception
	{
		
		APP_LOGS.debug("Checking Tech Sub Section Click from Entertainment Sectionpage");
		String url = "http://t2online.com/entertainment/";
		tech_SubSectionClick(url);
	}
	
	@Test
	public void sportsection_entertainment_SubSectionClick() throws Exception
	{
		
		APP_LOGS.debug("Checking Sport Sub Section Click from Entertainment Sectionpage");
		String url = "http://t2online.com/entertainment/";
		sport_SubSectionClick(url);
	}
	@Test
	public void spinsection_entertainment_SubSectionClick() throws Exception
	{
		
		APP_LOGS.debug("Checking Spin Sub Section Click from Entertainment Sectionpage");
		String url = "http://t2online.com/entertainment/";
		spin_SubSectionClick(url);
	}
	@Test
	public void videosection_entertainment_SubSectionClick() throws Exception
	{
		
		APP_LOGS.debug("Checking Video Sub Section Click from Entertainment Sectionpage");
		String url = "http://t2online.com/entertainment/";
		video_SubSectionClick(url);
	}
	
	
	@Test
	public void curatedsection_lifestyle_SubSectionClick() throws Exception
	{
		
		APP_LOGS.debug("Checking Curated Sub Section Click from Lifestyle Sectionpage");
		String url = "http://t2online.com/lifestyle/";
		curated_SubSectionClick(url);
	}
	@Test
	public void entertainmentsection_lifestyle_SubSectionClick() throws Exception
	{
		
		APP_LOGS.debug("Checking Entertainment Sub Section Click from Lifestyle Sectionpage");
		String url = "http://t2online.com/lifestyle/";
		entertainment_SubSectionClick(url);
	}
	@Test
	public void techsection_lifestyle_SubSectionClick() throws Exception
	{
		
		APP_LOGS.debug("Checking Tech Sub Section Click from Lifestyle Sectionpage");
		String url = "http://t2online.com/lifestyle/";
		tech_SubSectionClick(url);
	}
	@Test
	public void sportsection_lifestyle_SubSectionClick() throws Exception
	{
		
		APP_LOGS.debug("Checking Sports Sub Section Click from Lifestyle Sectionpage");
		String url = "http://t2online.com/lifestyle/";
		sport_SubSectionClick(url);
	}
	@Test
	public void spinsection_lifestyle_SubSectionClick() throws Exception
	{
		
		APP_LOGS.debug("Checking Spin Sub Section Click from Lifestyle Sectionpage");
		String url = "http://t2online.com/lifestyle/";
		spin_SubSectionClick(url);
	}
	@Test
	public void videosection_lifestyle_SubSectionClick() throws Exception
	{
		
		APP_LOGS.debug("Checking Video Sub Section Click from Lifestyle Sectionpage");
		String url = "http://t2online.com/lifestyle/";
		video_SubSectionClick(url);
	}
	
	
	@Test
	public void curatedsection_tech_SubSectionClick() throws Exception
	{
		
		APP_LOGS.debug("Checking Curated Sub Section Click from Tech Sectionpage");
		String url = "http://t2online.com/tech/";
		curated_SubSectionClick(url);
	}
	@Test
	public void lifestylesection_tech_SubSectionClick() throws Exception
	{
		
		APP_LOGS.debug("Checking Lifestyle Sub Section Click from Tech Sectionpage");
		String url = "http://t2online.com/tech/";
		lifestyle_SubSectionClick(url);
	}
	@Test
	public void entertainmentsection_tech_SubSectionClick() throws Exception
	{
		
		APP_LOGS.debug("Checking Entertainment Sub Section Click from Tech Sectionpage");
		String url = "http://t2online.com/tech/";
		entertainment_SubSectionClick(url);
	}
	@Test
	public void sportsection_tech_SubSectionClick() throws Exception
	{
		
		APP_LOGS.debug("Checking Sport Sub Section Click from Tech Sectionpage");
		String url = "http://t2online.com/tech/";
		sport_SubSectionClick(url);
	}
	@Test
	public void spinsection_tech_SubSectionClick() throws Exception
	{
		
		APP_LOGS.debug("Checking Spin Sub Section Click from Tech Sectionpage");
		String url = "http://t2online.com/tech/";
		spin_SubSectionClick(url);
	}
	@Test
	public void videosection_tech_SubSectionClick() throws Exception
	{
		
		APP_LOGS.debug("Checking Video Sub Section Click from Tech Sectionpage");
		String url = "http://t2online.com/tech/";
		video_SubSectionClick(url);
	}
	
	
	@Test
	public void curatedsection_sport_SubSectionClick() throws Exception
	{
		
		APP_LOGS.debug("Checking Curated Sub Section Click from Sport Sectionpage");
		String url = "http://t2online.com/sport/";
		curated_SubSectionClick(url);
	}
	@Test
	public void lifestylesection_sport_SubSectionClick() throws Exception
	{
		
		APP_LOGS.debug("Checking Lifestyle Sub Section Click from Sport Sectionpage");
		String url = "http://t2online.com/sport/";
		lifestyle_SubSectionClick(url);
	}
	@Test
	public void techsection_sport_SubSectionClick() throws Exception
	{
		
		APP_LOGS.debug("Checking Tech Sub Section Click from Sport Sectionpage");
		String url = "http://t2online.com/sport/";
		tech_SubSectionClick(url);
	}
	@Test
	public void entertainmentsection_sport_SubSectionClick() throws Exception
	{
		
		APP_LOGS.debug("Checking Entertainment Sub Section Click from Sport Sectionpage");
		String url = "http://t2online.com/sport/";
		entertainment_SubSectionClick(url);
	}
	@Test
	public void spinsection_sport_SubSectionClick() throws Exception
	{
		
		APP_LOGS.debug("Checking Spin Sub Section Click from Sport Sectionpage");
		String url = "http://t2online.com/sport/";
		spin_SubSectionClick(url);
	}
	@Test
	public void videosection_sport_SubSectionClick() throws Exception
	{
		
		APP_LOGS.debug("Checking Video Sub Section Click from Sport Sectionpage");
		String url = "http://t2online.com/sport/";
		video_SubSectionClick(url);
	}
	
	
	@Test
	public void curatedsection_spin_SubSectionClick() throws Exception
	{
		
		APP_LOGS.debug("Checking Curated Sub Section Click from Spin Sectionpage");
		String url = "http://t2online.com/the-spin/";
		curated_SubSectionClick(url);
	}
	@Test
	public void lifestylesection_spin_SubSectionClick() throws Exception
	{
		
		APP_LOGS.debug("Checking Lifestyle Sub Section Click from Spin Sectionpage");
		String url = "http://t2online.com/the-spin/";
		lifestyle_SubSectionClick(url);
	}
	@Test
	public void techsection_spin_SubSectionClick() throws Exception
	{
		
		APP_LOGS.debug("Checking Tech Sub Section Click from Spin Sectionpage");
		String url = "http://t2online.com/the-spin/";
		tech_SubSectionClick(url);
	}
	@Test
	public void sportsection_spin_SubSectionClick() throws Exception
	{
		
		APP_LOGS.debug("Checking Sport Sub Section Click from Spin Sectionpage");
		String url = "http://t2online.com/the-spin/";
		sport_SubSectionClick(url);
	}
	@Test
	public void entertainmentsection_spin_SubSectionClick() throws Exception
	{
		
		APP_LOGS.debug("Checking Entertainment Sub Section Click from Spin Sectionpage");
		String url = "http://t2online.com/the-spin/";
		entertainment_SubSectionClick(url);
	}
	@Test
	public void videosection_spin_SubSectionClick() throws Exception
	{
		
		APP_LOGS.debug("Checking Video Sub Section Click from Spin Sectionpage");
		String url = "http://t2online.com/the-spin/";
		video_SubSectionClick(url);
	}
	
	/*
	@Test
	public void curatedsection_video_SubSectionClick() throws Exception
	{
		
		APP_LOGS.debug("Checking Curated Sub Section Click from Video Sectionpage");
		String url = "http://t2online.com/video/";
		curated_SubSectionClick(url);
	}
	*/
	@Test
	public void lifestylesection_video_SubSectionClick() throws Exception
	{
		
		APP_LOGS.debug("Checking Lifestyle Sub Section Click from Video Sectionpage");
		
		
		driver.navigate().to("http://t2online.com/video/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement lifestylevideo = driver.findElement(By.xpath(".//*[@id='parallax']/ng-view/div[3]/div[5]/category-item/div/div/div[2]/div[1]/div[2]/div[2]/a/span"));
		lifestylevideo.click();
		Thread.sleep(5000);
		String lifestylevideoUrl = driver.getCurrentUrl();
		System.out.println("Current Lifestyle Video Url"+lifestylevideoUrl);
		
		org.testng.Assert.assertNotEquals("http://t2online.com/404/", lifestylevideoUrl);
		driver.navigate().back();
		driver.close();
	}
	@Test
	public void techsection_video_SubSectionClick() throws Exception
	{
		
		APP_LOGS.debug("Checking Tech Sub Section Click from Video Sectionpage");
		
		
		driver.navigate().to("http://t2online.com/video/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement techvideo = driver.findElement(By.xpath(".//*[@id='parallax']/ng-view/div[3]/div[5]/category-item/div/div/div[2]/div[1]/div[2]/div[2]/a/span"));
		techvideo.click();
		Thread.sleep(5000);
		String techvideoUrl = driver.getCurrentUrl();
		System.out.println("Current Tech Video Url"+techvideoUrl);
		
		org.testng.Assert.assertNotEquals("http://t2online.com/404/", techvideoUrl);
		driver.navigate().back();
		driver.close();
	}
	@Test
	public void sportsection_video_SubSectionClick() throws Exception
	{
		
		APP_LOGS.debug("Checking Sport Sub Section Click from Video Sectionpage");
		
		
		driver.navigate().to("http://t2online.com/video/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement sportvideo = driver.findElement(By.xpath(".//*[@id='parallax']/ng-view/div[3]/div[5]/category-item/div/div/div[2]/div[1]/div[2]/div[2]/a/span"));
		sportvideo.click();
		Thread.sleep(5000);
		String sportvideoUrl = driver.getCurrentUrl();
		System.out.println("Current Sport Video Url"+sportvideoUrl);
		
		org.testng.Assert.assertNotEquals("http://t2online.com/404/", sportvideoUrl);
		driver.navigate().back();
		driver.close();
	}
	@Test
	public void spinsection_video_SubSectionClick() throws Exception
	{
		
		APP_LOGS.debug("Checking Spin Sub Section Click from Video Sectionpage");
		
		
		driver.navigate().to("http://t2online.com/video/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement spinvideo = driver.findElement(By.xpath(".//*[@id='parallax']/ng-view/div[3]/div[9]/category-item/div/div/div[2]/div[1]/div[2]/div[2]/a/span"));
		spinvideo.click();
		Thread.sleep(5000);
		String spinvideoUrl = driver.getCurrentUrl();
		System.out.println("Current Spin Video Url"+spinvideoUrl);
		
		org.testng.Assert.assertNotEquals("http://t2online.com/404/", spinvideoUrl);
		driver.navigate().back();
		driver.close();
	}
	@Test
	public void entertainmentsection_video_SubSectionClick() throws Exception
	{
		
		APP_LOGS.debug("Checking entertainment Sub Section Click from Video Sectionpage");
		
		
		driver.navigate().to("http://t2online.com/video/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement entertainmentvideo = driver.findElement(By.xpath(".//*[@id='parallax']/ng-view/div[3]/div[5]/category-item/div/div/div[2]/div[1]/div[2]/div[2]/a/span"));
		entertainmentvideo.click();
		Thread.sleep(5000);
		String entertainmentvideoUrl = driver.getCurrentUrl();
		System.out.println("Current Entertainment Video Url"+entertainmentvideoUrl);
		
		org.testng.Assert.assertNotEquals("http://t2online.com/404/", entertainmentvideoUrl);
		driver.navigate().back();
		driver.close();
	}
	
	@Test
	public void section_LoadMoreSection() throws Exception
	{
		APP_LOGS.debug("Checking Load More from Sectionpage");
		String ar[] = new String[6];
		ar[0]="http://t2online.com/entertainment/";
		ar[1]="http://t2online.com/lifestyle/";
		ar[2]="http://t2online.com/tech/";
		ar[3]="http://t2online.com/sport/";
		ar[4]="http://t2online.com/the-spin/";
		ar[5]="http://t2online.com/video/";
		for(int i= 0 ; i<5 ; i++)
		{
			System.out.println("SubSectionClickSection is being tested "+ar[i]);
			LoadMore(ar[i]);
			
		}
		WebDriver driver = new ChromeDriver();
	    driver.get("http://t2online.com/video/");
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	   Thread.sleep(2000);
	   JavascriptExecutor jse = (JavascriptExecutor)driver;
	   jse.executeScript("window.scrollBy(0,1750)", "");
	   Thread.sleep(5000);
	   
	   WebElement loadclick = driver.findElement(By.xpath(".//*[@id='parallax']/ng-view/div[1]/div[8]/a"));
	   loadclick.click();
	   
	   jse.executeScript("window.scrollBy(0,500)", "");
	   Thread.sleep(5000);
	   loadclick.click();
	   jse.executeScript("window.scrollBy(0,250)", "");
	   driver.close();
		
	}
	

	@Test
	public void lifestyle_section_entertainment_SubMenuAssert() throws Exception
	{
		
		APP_LOGS.debug("Checking lifestyle Assertion in Submenu heading from Entertainment Sectionpage");
		String url = "http://t2online.com/entertainment/";
		lifestyle_SubMenuAssert(url);
	}
	@Test
	public void tech_section_entertainment_SubMenuAssert() throws Exception
	{
		APP_LOGS.debug("Checking tech Assertion in Submenu heading from Entertainment Sectionpage");
		String url = "http://t2online.com/entertainment/";
		tech_SubMenuAssert(url);
	}
	@Test
	public void sport_section_entertainment_SubMenuAssert() throws Exception
	{
		APP_LOGS.debug("Checking sport Assertion in Submenu heading from Entertainment Sectionpage");
		String url = "http://t2online.com/entertainment/";
		sport_SubMenuAssert(url);
	}
	@Test
	public void spin_section_entertainment_SubMenuAssert() throws Exception
	{
		APP_LOGS.debug("Checking spin Assertion in Submenu heading from Entertainment Sectionpage");
		String url = "http://t2online.com/entertainment/";
		spin_SubMenuAssert(url);
	}
	@Test
	public void video_section_entertainment_SubMenuAssert() throws Exception
	{
		APP_LOGS.debug("Checking video Assertion in Submenu heading from Entertainment Sectionpage");
		String url = "http://t2online.com/entertainment/";
		video_SubMenuAssert(url);
	}
	
	
	@Test
	public void entertainment_section_lifestyle_SubMenuAssert() throws Exception
	{
		
		APP_LOGS.debug("Checking Entertainment Assertion in Submenu heading from lifestyle Sectionpage");
		String url = "http://t2online.com/lifestyle/";
		entertainment_SubMenuAssert(url);
	}
	@Test
	public void tech_section_lifestyle_SubMenuAssert() throws Exception
	{
		APP_LOGS.debug("Checking tech Assertion in Submenu heading from lifestyle Sectionpage");
		String url = "http://t2online.com/lifestyle/";
		tech_SubMenuAssert(url);
	}
	@Test
	public void sport_section_lifestyle_SubMenuAssert() throws Exception
	{
		APP_LOGS.debug("Checking sport Assertion in Submenu heading from lifestyle Sectionpage");
		String url = "http://t2online.com/lifestyle/";
		sport_SubMenuAssert(url);
	}
	@Test
	public void spin_section_lifestyle_SubMenuAssert() throws Exception
	{
		APP_LOGS.debug("Checking spin Assertion in Submenu heading from lifestyle Sectionpage");
		String url = "http://t2online.com/lifestyle/";
		spin_SubMenuAssert(url);
	}
	@Test
	public void video_section_lifestyle_SubMenuAssert() throws Exception
	{
		APP_LOGS.debug("Checking video Assertion in Submenu heading from lifestyle Sectionpage");
		String url = "http://t2online.com/lifestyle/";
		video_SubMenuAssert(url);
	}
	
	
	@Test
	public void lifestyle_section_tech_SubMenuAssert() throws Exception
	{
		
		APP_LOGS.debug("Checking lifestyle Assertion in Submenu heading from tech Sectionpage");
		String url = "http://t2online.com/tech/";
		lifestyle_SubMenuAssert(url);
	}
	@Test
	public void entertainment_section_tech_SubMenuAssert() throws Exception
	{
		APP_LOGS.debug("Checking Entertainment Assertion in Submenu heading from tech Sectionpage");
		String url = "http://t2online.com/tech/";
		entertainment_SubMenuAssert(url);
	}
	@Test
	public void sport_section_tech_SubMenuAssert() throws Exception
	{
		APP_LOGS.debug("Checking sport Assertion in Submenu heading from tech Sectionpage");
		String url = "http://t2online.com/tech/";
		sport_SubMenuAssert(url);
	}
	@Test
	public void spin_section_tech_SubMenuAssert() throws Exception
	{
		APP_LOGS.debug("Checking spin Assertion in Submenu heading from tech Sectionpage");
		String url = "http://t2online.com/tech/";
		spin_SubMenuAssert(url);
	}
	@Test
	public void video_section_tech_SubMenuAssert() throws Exception
	{
		APP_LOGS.debug("Checking video Assertion in Submenu heading from tech Sectionpage");
		String url = "http://t2online.com/tech/";
		video_SubMenuAssert(url);
	}
	
	
	@Test
	public void lifestyle_section_sport_SubMenuAssert() throws Exception
	{
		
		APP_LOGS.debug("Checking lifestyle Assertion in Submenu heading from sport Sectionpage");
		String url = "http://t2online.com/sport/";
		lifestyle_SubMenuAssert(url);
	}
	@Test
	public void tech_section_sport_SubMenuAssert() throws Exception
	{
		APP_LOGS.debug("Checking tech Assertion in Submenu heading from sport Sectionpage");
		String url = "http://t2online.com/sport/";
		tech_SubMenuAssert(url);
	}
	@Test
	public void entertainment_section_sport_SubMenuAssert() throws Exception
	{
		APP_LOGS.debug("Checking Entertainment Assertion in Submenu heading from sport Sectionpage");
		String url = "http://t2online.com/sport/";
		entertainment_SubMenuAssert(url);
	}
	@Test
	public void spin_section_sport_SubMenuAssert() throws Exception
	{
		APP_LOGS.debug("Checking spin Assertion in Submenu heading from sport Sectionpage");
		String url = "http://t2online.com/sport/";
		spin_SubMenuAssert(url);
	}
	@Test
	public void video_section_sport_SubMenuAssert() throws Exception
	{
		APP_LOGS.debug("Checking video Assertion in Submenu heading from sport Sectionpage");
		String url = "http://t2online.com/sport/";
		video_SubMenuAssert(url);
	}
	
	
	@Test
	public void lifestyle_section_spin_SubMenuAssert() throws Exception
	{
		
		APP_LOGS.debug("Checking lifestyle Assertion in Submenu heading from spin Sectionpage");
		String url = "http://t2online.com/the-spin/";
		lifestyle_SubMenuAssert(url);
	}
	@Test
	public void tech_section_spin_SubMenuAssert() throws Exception
	{
		APP_LOGS.debug("Checking tech Assertion in Submenu heading from spin Sectionpage");
		String url = "http://t2online.com/the-spin/";
		tech_SubMenuAssert(url);
	}
	@Test
	public void sport_section_spin_SubMenuAssert() throws Exception
	{
		APP_LOGS.debug("Checking sport Assertion in Submenu heading from spin Sectionpage");
		String url = "http://t2online.com/the-spin/";
		sport_SubMenuAssert(url);
	}
	@Test
	public void entertainment_section_spin_SubMenuAssert() throws Exception
	{
		APP_LOGS.debug("Checking entertainment Assertion in Submenu heading from spin Sectionpage");
		String url = "http://t2online.com/the-spin/";
		entertainment_SubMenuAssert(url);
	}
	@Test
	public void video_section_spin_SubMenuAssert() throws Exception
	{
		APP_LOGS.debug("Checking video Assertion in Submenu heading from spin Sectionpage");
		String url = "http://t2online.com/the-spin/";
		video_SubMenuAssert(url);
	}
	
	
	@Test
	public void lifestyle_section_video_SubMenuAssert() throws Exception
	{
		
		APP_LOGS.debug("Checking lifestyle Assertion in Submenu heading from video Sectionpage");
		
		driver.navigate().to("http://t2online.com/video/");
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	    
	    String lifestyle = driver.findElement(By.xpath(".//*[@id='parallax']/ng-view/div[3]/div[2]/category-item/div/div/div[1]/span/a")).getText();
		System.out.println(lifestyle);
		org.testng.Assert.assertEquals("LIFESTYLE",lifestyle); 
		driver.close();
	}
	@Test
	public void tech_section_video_SubMenuAssert() throws Exception
	{
		APP_LOGS.debug("Checking tech Assertion in Submenu heading from video Sectionpage");
		
		driver.navigate().to("http://t2online.com/video/");
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	    
	    String tech = driver.findElement(By.xpath(".//*[@id='parallax']/ng-view/div[3]/div[5]/category-item/div/div/div[1]/span/a")).getText();
		System.out.println(tech);
		org.testng.Assert.assertEquals("TECH",tech);
		driver.close();
	}
	@Test
	public void sport_section_video_SubMenuAssert() throws Exception
	{
		APP_LOGS.debug("Checking sport Assertion in Submenu heading from video Sectionpage");
		
		driver.navigate().to("http://t2online.com/video/");
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	    
	    String sport = driver.findElement(By.xpath(".//*[@id='parallax']/ng-view/div[3]/div[6]/category-item/div/div/div[1]/span/a")).getText();
		System.out.println(sport);
		org.testng.Assert.assertEquals("SPORT",sport);
		driver.close();
	}
	@Test
	public void spin_section_video_SubMenuAssert() throws Exception
	{
		APP_LOGS.debug("Checking spin Assertion in Submenu heading from video Sectionpage");
		
		driver.navigate().to("http://t2online.com/video/");
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	    
	    String spin = driver.findElement(By.xpath(".//*[@id='parallax']/ng-view/div[3]/div[9]/category-item/div/div/div[1]/span/a")).getText();
		System.out.println(spin);
		org.testng.Assert.assertEquals("THE SPIN",spin);
		driver.close();
	}
	@Test
	public void entertainment_section_video_SubMenuAssert() throws Exception
	{
		APP_LOGS.debug("Checking entertainment Assertion in Submenu heading from video Sectionpage");
		
		driver.navigate().to("http://t2online.com/video/");
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	    String entermainment = driver.findElement(By.xpath(".//*[@id='parallax']/ng-view/div[3]/div[1]/category-item/div/div/div[1]/span/a")).getText(); 
		System.out.println(entermainment);
		org.testng.Assert.assertEquals("ENTERTAINMENT",entermainment);
		
		driver.close();
	}
	
	
	
	@Test
	public void entertainmentsection_BackToTopSection() throws Exception
	{
		
		APP_LOGS.debug("Checking Back to Top from Entertainment Sectionpage");
		String url = "http://t2online.com/entertainment/";
	//	scroll(url);
	}
	
	@Test
	public void lifestylesection_BackToTopSection() throws Exception
	{
		
		
		APP_LOGS.debug("Checking Back to Top from Lifestyle Sectionpage");
		String url = "http://t2online.com/lifestyle/";
	//	scroll(url);
	}
	
	@Test
	public void techsection_BackToTopSection() throws Exception
	{
		
		APP_LOGS.debug("Checking Back to Top from Tech Sectionpage");
		String url = "http://t2online.com/tech/";
	//	scroll(url);
	}
	
	@Test
	public void sportsection_BackToTopSection() throws Exception
	{
		
		APP_LOGS.debug("Checking Back to Top from Sport Sectionpage");
		String url = "http://t2online.com/sport/";
	//	scroll(url);
	}
	
	@Test
	public void spinsection_BackToTopSection() throws Exception
	{
		APP_LOGS.debug("Checking Back to Top from Spin Sectionpage");
		String url = "http://t2online.com/the-spin/";
	//	scroll(url);
		
	}
	
	@Test
	public void videosection_BackToTopSection() throws Exception
	{
		
		APP_LOGS.debug("Checking Back to Top from Video Sectionpage");
		String url = "http://t2online.com/video/";
	//	scroll(url);
	}


	
	@Test
	public void entersection_entertainment_SubMenuStoryClickSection() throws Exception
	{
		APP_LOGS.debug("Checking Entertainment Sub Menu Story and clicking on them from Entertainment Sectionpage");
		String url ="http://t2online.com/entertainment/";
		entertainment_SubMenuStoryClick(url);
	}
	@Test
	public void lifestylesection_entertainment_SubMenuStoryClickSection() throws Exception
	{
		
		APP_LOGS.debug("Checking Lifestyle Sub Menu Story and clicking on them from Entertainment Sectionpage");
		String url ="http://t2online.com/entertainment/";
		lifestyle_SubMenuStoryClick(url);
	}
	@Test
	public void techsection_entertainment_SubMenuStoryClickSection() throws Exception
	{
		APP_LOGS.debug("Checking Tech Sub Menu Story and clicking on them from Entertainment Sectionpage");
		String url ="http://t2online.com/entertainment/";
		tech_SubMenuStoryClick(url);
	}
	/*
	@Test
	public void sportsection_entertainment_SubMenuStoryClickSection() throws Exception
	{
		APP_LOGS.debug("Checking Sport Sub Menu Story and clicking on them from Entertainment Sectionpage");
		String url ="http://t2online.com/entertainment/";
		sport_SubMenuStoryClick(url);
	}
	*/
	
	
	@Test
	public void spinsection_entertainment_SubMenuStoryClickSection() throws Exception
	{
		APP_LOGS.debug("Checking Spin Sub Menu Story and clicking on them from Entertainment Sectionpage");
		String url ="http://t2online.com/entertainment/";
		spin_SubMenuStoryClick(url);
	}
	
	@Test
	public void videosection_entertainment_SubMenuStoryClickSection() throws Exception
	{
		APP_LOGS.debug("Checking Video Sub Menu Story and clicking on them from Entertainment Sectionpage");
		String url ="http://t2online.com/entertainment/";
		video_SubMenuStoryClick(url);
	}
	
	
	@Test
	public void entersection_Lifestyle_SubMenuStoryClickSection() throws Exception
	{
		APP_LOGS.debug("Checking Entertainment Sub Menu Story and clicking on them from Lifestyle Sectionpage");
		String url ="http://t2online.com/lifestyle/";
		entertainment_SubMenuStoryClick(url);
	}
	@Test
	public void lifestylesection_lifestyle_SubMenuStoryClickSection() throws Exception
	{
		
		APP_LOGS.debug("Checking Lifestyle Sub Menu Story and clicking on them from Lifestyle Sectionpage");
		String url ="http://t2online.com/lifestyle/";
		lifestyle_SubMenuStoryClick(url);
	}
	@Test
	public void techsection_lifestyle_SubMenuStoryClickSection() throws Exception
	{
		APP_LOGS.debug("Checking Tech Sub Menu Story and clicking on them from Lifestyle Sectionpage");
		String url ="http://t2online.com/lifestyle/";
		
		driver.navigate().to(url);
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    Thread.sleep(2000);
	    Actions action = new Actions(driver);
	WebElement tech = driver.findElement(By.xpath(".//*[@id='desktop-nav']/div[2]/div/div/div[2]/ul/li[3]/a"));
		
	    action.moveToElement(tech);
	    action.build().perform();
	    Thread.sleep(5000);
	    WebElement techstory = driver.findElement(By.xpath(".//*[@id='nav-preview']/div/div/nav-snippet/div/div/div[1]/div[2]/a/span"));
	    techstory.click();
	    Thread.sleep(10000);
	    String techstoryurl = driver.getCurrentUrl().toString();
	    
	    System.out.println("Current tech story Url"+techstoryurl);
		Assert.assertNotEquals("http://t2online.com/404/", techstoryurl);
		
		Thread.sleep(5000);
		String assertcheck5 = driver.findElement(By.xpath(".//*/div[1]/div/ol/li[2]/a/span")).getText();
		String assertcheck6 = driver.findElement(By.xpath(".//*/div[2]/div[1]/div[1]/span[1]")).getText();
		Assert.assertEquals( assertcheck5,assertcheck6);
		Thread.sleep(5000);
	    driver.navigate().back();
	    driver.close();
	}
	@Test
	public void sportsection_lifestyle_SubMenuStoryClickSection() throws Exception
	{
		APP_LOGS.debug("Checking Sport Sub Menu Story and clicking on them from Lifestyle Sectionpage");
		String url ="http://t2online.com/lifestyle/";
		sport_SubMenuStoryClick(url);
	}
	
	@Test
	public void spinsection_lifestyle_SubMenuStoryClickSection() throws Exception
	{
		APP_LOGS.debug("Checking Spin Sub Menu Story and clicking on them from Lifestyle Sectionpage");
		String url ="http://t2online.com/lifestyle/";
		spin_SubMenuStoryClick(url);
	}
	
	@Test
	public void videosection_lifestyle_SubMenuStoryClickSection() throws Exception
	{
		APP_LOGS.debug("Checking Video Sub Menu Story and clicking on them from Lifestyle Sectionpage");
		String url ="http://t2online.com/lifestyle/";
		video_SubMenuStoryClick(url);
	}
	
	
	@Test
	public void entersection_tech_SubMenuStoryClickSection() throws Exception
	{
		APP_LOGS.debug("Checking Entertainment Sub Menu Story and clicking on them from tech Sectionpage");
		String url ="http://t2online.com/tech/";
		entertainment_SubMenuStoryClick(url);
	}
	@Test
	public void lifestylesection_tech_SubMenuStoryClickSection() throws Exception
	{
		
		APP_LOGS.debug("Checking Lifestyle Sub Menu Story and clicking on them from tech Sectionpage");
		String url ="http://t2online.com/tech/";
		lifestyle_SubMenuStoryClick(url);
	}
	@Test
	public void techsection_tech_SubMenuStoryClickSection() throws Exception
	{
		APP_LOGS.debug("Checking Tech Sub Menu Story and clicking on them from tech Sectionpage");
		String url ="http://t2online.com/tech/";
		tech_SubMenuStoryClick(url);
	}
	@Test
	public void sportsection_tech_SubMenuStoryClickSection() throws Exception
	{
		APP_LOGS.debug("Checking Sport Sub Menu Story and clicking on them from tech Sectionpage");
		String url ="http://t2online.com/tech/";
		sport_SubMenuStoryClick(url);
	}
	
	@Test
	public void spinsection_tech_SubMenuStoryClickSection() throws Exception
	{
		APP_LOGS.debug("Checking Spin Sub Menu Story and clicking on them from tech Sectionpage");
		String url ="http://t2online.com/tech/";
		spin_SubMenuStoryClick(url);
	}
	
	@Test
	public void videosection_tech_SubMenuStoryClickSection() throws Exception
	{
		APP_LOGS.debug("Checking Video Sub Menu Story and clicking on them from tech Sectionpage");
		String url ="http://t2online.com/tech/";
		video_SubMenuStoryClick(url);
	}
	
	
	@Test
	public void entersection_sport_SubMenuStoryClickSection() throws Exception
	{
		APP_LOGS.debug("Checking Entertainment Sub Menu Story and clicking on them from sport Sectionpage");
		String url ="http://t2online.com/sport/";
		entertainment_SubMenuStoryClick(url);
	}
	@Test
	public void lifestylesection_sport_SubMenuStoryClickSection() throws Exception
	{
		
		APP_LOGS.debug("Checking Lifestyle Sub Menu Story and clicking on them from sport Sectionpage");
		String url ="http://t2online.com/sport/";
		lifestyle_SubMenuStoryClick(url);
	}
	@Test
	public void techsection_sport_SubMenuStoryClickSection() throws Exception
	{
		APP_LOGS.debug("Checking Tech Sub Menu Story and clicking on them from sport Sectionpage");
		String url ="http://t2online.com/sport/";
		tech_SubMenuStoryClick(url);
	}
	@Test
	public void sportsection_sport_SubMenuStoryClickSection() throws Exception
	{
		APP_LOGS.debug("Checking Sport Sub Menu Story and clicking on them from sport Sectionpage");
		String url ="http://t2online.com/sport/";
		sport_SubMenuStoryClick(url);
	}
	
	@Test
	public void spinsection_sport_SubMenuStoryClickSection() throws Exception
	{
		APP_LOGS.debug("Checking Spin Sub Menu Story and clicking on them from sport Sectionpage");
		String url ="http://t2online.com/sport/";
		spin_SubMenuStoryClick(url);
	}
	
	@Test
	public void videosection_sport_SubMenuStoryClickSection() throws Exception
	{
		APP_LOGS.debug("Checking Video Sub Menu Story and clicking on them from sport Sectionpage");
		String url ="http://t2online.com/sport/";
		video_SubMenuStoryClick(url);
	}
	
	
	@Test
	public void entersection_spin_SubMenuStoryClickSection() throws Exception
	{
		APP_LOGS.debug("Checking Entertainment Sub Menu Story and clicking on them from spin Sectionpage");
		String url ="http://t2online.com/the-spin/";
		entertainment_SubMenuStoryClick(url);
	}
	@Test
	public void lifestylesection_spin_SubMenuStoryClickSection() throws Exception
	{
		
		APP_LOGS.debug("Checking Lifestyle Sub Menu Story and clicking on them from spin Sectionpage");
		String url ="http://t2online.com/the-spin/";
		lifestyle_SubMenuStoryClick(url);
	}
	@Test
	public void techsection_spin_SubMenuStoryClickSection() throws Exception
	{
		APP_LOGS.debug("Checking Tech Sub Menu Story and clicking on them from spin Sectionpage");
		String url ="http://t2online.com/the-spin/";
		tech_SubMenuStoryClick(url);
	}
	@Test
	public void sportsection_spin_SubMenuStoryClickSection() throws Exception
	{
		APP_LOGS.debug("Checking Sport Sub Menu Story and clicking on them from spin Sectionpage");
		String url ="http://t2online.com/the-spin/";
		sport_SubMenuStoryClick(url);
	}
	
	@Test
	public void spinsection_spin_SubMenuStoryClickSection() throws Exception
	{
		APP_LOGS.debug("Checking Spin Sub Menu Story and clicking on them from spin Sectionpage");
		String url ="http://t2online.com/the-spin/";
		spin_SubMenuStoryClick(url);
	}
	
	@Test
	public void videosection_spin_SubMenuStoryClickSection() throws Exception
	{
		APP_LOGS.debug("Checking Video Sub Menu Story and clicking on them from spin Sectionpage");
		String url ="http://t2online.com/the-spin/";
		video_SubMenuStoryClick(url);
	}
	
	@Test
	public void entersection_video_SubMenuStoryClickSection() throws Exception
	{
		APP_LOGS.debug("Checking Entertainment Sub Menu Story and clicking on them from video Sectionpage");
		String url ="http://t2online.com/video/";
		entertainment_SubMenuStoryClick(url);
	}
	@Test
	public void lifestylesection_video_SubMenuStoryClickSection() throws Exception
	{
		
		APP_LOGS.debug("Checking Lifestyle Sub Menu Story and clicking on them from video Sectionpage");
		String url ="http://t2online.com/video/";
		lifestyle_SubMenuStoryClick(url);
	}
	@Test
	public void techsection_video_SubMenuStoryClickSection() throws Exception
	{
		APP_LOGS.debug("Checking Tech Sub Menu Story and clicking on them from video Sectionpage");
		String url ="http://t2online.com/video/";
		tech_SubMenuStoryClick(url);
	}
	@Test
	public void sportsection_video_SubMenuStoryClickSection() throws Exception
	{
		APP_LOGS.debug("Checking Sport Sub Menu Story and clicking on them from video Sectionpage");
		String url ="http://t2online.com/video/";
		sport_SubMenuStoryClick(url);
	}
	
	@Test
	public void spinsection_video_SubMenuStoryClickSection() throws Exception
	{
		APP_LOGS.debug("Checking Spin Sub Menu Story and clicking on them from video Sectionpage");
		String url ="http://t2online.com/video/";
		spin_SubMenuStoryClick(url);
	}
	
	@Test
	public void videosection_video_SubMenuStoryClickSection() throws Exception
	{
		APP_LOGS.debug("Checking Video Sub Menu Story and clicking on them from video Sectionpage");
		String url ="http://t2online.com/video/";
		video_SubMenuStoryClick(url);
	}
	
	@AfterMethod
	public void close()
	{
		driver.quit();
	}
}
