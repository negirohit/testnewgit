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
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;


public class base 
{
	

	public static WebDriver driver;
	public static EventFiringWebDriver firingdriver;
	public static String dynamicUser;
	public static Properties OR;
	public static Properties CONFIG;
	public static String baseurl;
	public static Logger APP_LOGS = Logger.getLogger("devpinoyLogger");
	
	public static void main(String[] args) throws Exception 
	{   
		
	    
	    
		
	}
	public static void setup() throws IOException, InterruptedException{
		 
		
		 CONFIG =new Properties();
		 FileInputStream cn=new FileInputStream(System.getProperty("user.dir")+"\\config\\config.properties");
		 CONFIG.load(cn);
		 
		 PropertyConfigurator.configure(System.getProperty("user.dir")+"//config//log4j.properties");
	
		    String chromedriver = CONFIG.getProperty("chromedriverpath");
	        System.setProperty("webdriver.chrome.driver", chromedriver);
	        
	        driver = new ChromeDriver();  
	       // driver = new EventFiringWebDriver(driver);
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
			
			
			/*driver = new FirefoxDriver();	
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);*/
			//driver.manage().window().maximize();
			
			//APP_LOGS.debug("anandbazartest");
			//APP_LOGS.debug(CONFIG.getProperty("testSiteURL"));
		//	driver.navigate().to(CONFIG.getProperty("testSiteURL"));
		//	driver.manage().window().maximize();	
	}
	
	public void LoadMore(String url) throws Exception
	{	
		
		
		WebDriver driver = new ChromeDriver();
	    driver.get(url);
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	   Thread.sleep(2000);
	   JavascriptExecutor jse = (JavascriptExecutor)driver;
	   jse.executeScript("window.scrollBy(0,1750)", "");
	   Thread.sleep(5000);
	   
	   WebElement loadclick = driver.findElement(By.xpath(".//*[@id='section-blk']/div[4]/a"));
	   loadclick.click();
	   
	   jse.executeScript("window.scrollBy(0,500)", "");
	   Thread.sleep(5000);
	   loadclick.click();
	   jse.executeScript("window.scrollBy(0,250)", "");
		driver.close();
	}
	public void entertainment_SubMenuAssert(String url) throws Exception
	{	
		
		driver.navigate().to(url);
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
		String entermainment = driver.findElement(By.xpath(".//*[@id='parallax']/ng-view/div[3]/div[1]/category-item/div/div/div[1]/span/a")).getText(); 
		System.out.println(entermainment);
		if(driver.getCurrentUrl().equalsIgnoreCase("http://t2online.com/entertainment/") !=true)
		Assert.assertEquals("ENTERTAINMENT",entermainment);
		driver.close();
	}
	public void lifestyle_SubMenuAssert(String url) throws Exception
	{
		
		driver.navigate().to(url);
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	    String lifestyle = driver.findElement(By.xpath(".//*[@id='parallax']/ng-view/div[3]/div[2]/category-item/div/div/div[1]/span/a")).getText();
		System.out.println(lifestyle);
		if(driver.getCurrentUrl().equalsIgnoreCase("http://t2online.com/lifestyle/") !=true)
		Assert.assertEquals("LIFESTYLE",lifestyle);   
		driver.close();
	}
	public void tech_SubMenuAssert(String url) throws Exception
	{	
		
		driver.navigate().to(url);
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	    String tech = driver.findElement(By.xpath(".//*[@id='parallax']/ng-view/div[3]/div[3]/category-item/div/div/div[1]/span/a")).getText();
		System.out.println(tech);
		if(driver.getCurrentUrl().equalsIgnoreCase("http://t2online.com/tech/") !=true)
		Assert.assertEquals("TECH",tech);
		driver.close();
	}
	public void sport_SubMenuAssert(String url) throws Exception
	{
		
		driver.navigate().to(url);
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	    String sport = driver.findElement(By.xpath(".//*[@id='parallax']/ng-view/div[3]/div[6]/category-item/div/div/div[1]/span/a")).getText();
		System.out.println(sport);
		if(driver.getCurrentUrl().equalsIgnoreCase("http://t2online.com/sport/") !=true)
		Assert.assertEquals("SPORT",sport);
		driver.close();
	}
	public void spin_SubMenuAssert(String url) throws Exception
	{
		
		driver.navigate().to(url);
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	    String spin = driver.findElement(By.xpath(".//*[@id='parallax']/ng-view/div[3]/div[7]/category-item/div/div/div[1]/span/a")).getText();
		System.out.println(spin);
		if(driver.getCurrentUrl().equalsIgnoreCase("http://t2online.com/the-spin/") !=true)
		Assert.assertEquals("THE SPIN",spin);
		driver.close();
	}
	public void video_SubMenuAssert(String url) throws Exception
	{
		
		driver.navigate().to(url);
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	    String video = driver.findElement(By.xpath(".//*[@id='parallax']/ng-view/div[3]/div[10]/category-item/div/div/div[1]/span/a")).getText();
		System.out.println(video);
		if(driver.getCurrentUrl().equalsIgnoreCase("http://t2online.com/video/") !=true)
		Assert.assertEquals("VIDEO",video);
		driver.close();
	}
	public void SubMenuAssert(String url) throws Exception
	{	
		
		
		driver.navigate().to(url);
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
		String entermainment = driver.findElement(By.xpath(".//*[@id='parallax']/ng-view/div[3]/div[1]/category-item/div/div/div[1]/span/a")).getText(); 
		System.out.println(entermainment);
		if(driver.getCurrentUrl().equalsIgnoreCase("http://t2online.com/entertainment/") !=true)
		Assert.assertEquals("ENTERTAINMENT",entermainment);
		
		String lifestyle = driver.findElement(By.xpath(".//*[@id='parallax']/ng-view/div[3]/div[2]/category-item/div/div/div[1]/span/a")).getText();
		System.out.println(lifestyle);
		if(driver.getCurrentUrl().equalsIgnoreCase("http://t2online.com/lifestyle/") !=true)
		Assert.assertEquals("LIFESTYLE",lifestyle);   
		
		String tech = driver.findElement(By.xpath(".//*[@id='parallax']/ng-view/div[3]/div[3]/category-item/div/div/div[1]/span/a")).getText();
		System.out.println(tech);
		if(driver.getCurrentUrl().equalsIgnoreCase("http://t2online.com/tech/") !=true)
		Assert.assertEquals("TECH",tech);
		
		String sport = driver.findElement(By.xpath(".//*[@id='parallax']/ng-view/div[3]/div[6]/category-item/div/div/div[1]/span/a")).getText();
		System.out.println(sport);
		if(driver.getCurrentUrl().equalsIgnoreCase("http://t2online.com/sport/") !=true)
		Assert.assertEquals("SPORT",sport);
		
		
		String spin = driver.findElement(By.xpath(".//*[@id='parallax']/ng-view/div[3]/div[7]/category-item/div/div/div[1]/span/a")).getText();
		System.out.println(spin);
		if(driver.getCurrentUrl().equalsIgnoreCase("http://t2online.com/the-spin/") !=true)
		Assert.assertEquals("THE SPIN",spin);
		
		
		String video = driver.findElement(By.xpath(".//*[@id='parallax']/ng-view/div[3]/div[10]/category-item/div/div/div[1]/span/a")).getText();
		System.out.println(video);
		if(driver.getCurrentUrl().equalsIgnoreCase("http://t2online.com/video/") !=true)
		Assert.assertEquals("VIDEO",video);
		driver.close();
	}
	
	/*public void scroll(String url) throws Exception

	{
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(url);
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	    Thread.sleep(5000);
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	    	jse.executeScript("window.scrollBy(0,5000)", "");
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement scroll = driver.findElement(By.id("toTop"));
		Thread.sleep(2000);
		scroll.click();
		Thread.sleep(5000);
		String title = driver.findElement(By.xpath(".//*[@id='desktop-ad-bar']/div[2]/div/div[2]/div/span")).getText();
		Assert.assertEquals("FOLLOW US",title);
		driver.close();
		
	}
	*/
	public void curated_SubSectionClick(String url) throws Exception
	{
		
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		//SubSectionClick
		
		boolean value = driver.getCurrentUrl().equalsIgnoreCase("http://t2online.com/video/");	
		System.out.println(value);
		if(value!=true)
		{
		WebElement Curatedsection = driver.findElement(By.xpath(".//*[@id='section-blk']/div[3]/div[4]/div[1]/div/div/div[1]/a/span"));
		Curatedsection.click();                                  
		Thread.sleep(5000);
		String curatedsectionUrl = driver.getCurrentUrl().toString();
		System.out.println("Current curated story Url"+curatedsectionUrl);

		Assert.assertNotEquals("http://t2online.com/404/", curatedsectionUrl);
	//	scroll(curatedsectionUrl);

		driver.navigate().back();
		Thread.sleep(2000);
		
		}
		driver.close();
	}
	public void entertainment_SubSectionClick(String url) throws Exception
	{
		
		
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		

		boolean value1 = driver.getCurrentUrl().equalsIgnoreCase("http://t2online.com/entertainment/");	
			System.out.println(value1);
			if(value1!=true)
			{
		WebElement entertainment1 = driver.findElement(By.xpath(".//*[@id='parallax']/ng-view/div[3]/div[1]/category-item/div/div/div[2]/div[1]/div[3]/div[2]/a/span"));
		entertainment1.click();
		Thread.sleep(2000);

		String entertainment1Url = driver.getCurrentUrl().toString();
		System.out.println("Current entertainment Url"+entertainment1Url);
		Assert.assertNotEquals("http://t2online.com/404/", entertainment1Url);
		// scroll(entertainment1Url);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
			}
			driver.close();
	}
	public void lifestyle_SubSectionClick(String url) throws Exception
	{
		
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		boolean value2 = driver.getCurrentUrl().equalsIgnoreCase("http://t2online.com/lifestyle/");	
		System.out.println(value2);
		if(value2!=true)
		{
	WebElement lifestyle = driver.findElement(By.xpath(".//*[@id='parallax']/ng-view/div[3]/div[2]/category-item/div/div/div[2]/div[1]/div[1]/div[2]/a/span"));
	lifestyle.click();
	Thread.sleep(5000);
	String lifestyleUrl = driver.getCurrentUrl().toString();
	System.out.println("Current lifestyle Url"+lifestyleUrl);

	Assert.assertNotEquals("http://t2online.com/404/", lifestyleUrl);
	
	//scroll(lifestyleUrl);

	driver.navigate().back();
	Thread.sleep(5000);
		}
		driver.close();
	}
	public void tech_SubSectionClick(String url) throws Exception
	{
		
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		
		boolean value3 = driver.getCurrentUrl().equalsIgnoreCase("http://t2online.com/tech/");
		boolean videovalue1 = driver.getCurrentUrl().equalsIgnoreCase("http://t2online.com/video/");
		System.out.println(value3);
		if(value3!=true)
		{
	WebElement tech = driver.findElement(By.xpath(".//*[@id='parallax']/ng-view/div[3]/div[3]/category-item/div/div/div[2]/div[1]/div[1]/div[2]/a/span"));
	tech.click();
	Thread.sleep(5000);
	String techUrl = driver.getCurrentUrl().toString();
	System.out.println("Current tech Url"+techUrl);
	
	Assert.assertNotEquals("http://t2online.com/404/", techUrl);				
	
	// scroll(techUrl);
	driver.navigate().back();
	Thread.sleep(5000);
		}
		driver.close();
	}
	public void sport_SubSectionClick(String url) throws Exception
	{
		
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		boolean value4 = driver.getCurrentUrl().equalsIgnoreCase("http://t2online.com/sport/");	
		System.out.println(value4);
		
		if(value4 !=true)
		{
		
	WebElement sport = driver.findElement(By.xpath(".//*[@id='parallax']/ng-view/div[3]/div[6]/category-item/div/div/div[2]/div[1]/div[1]/div[2]/a/span"));
	sport.click();
	Thread.sleep(5000);
	String sportUrl = driver.getCurrentUrl().toString();
	System.out.println("Current Sports Url"+sportUrl);
	
	Assert.assertNotEquals("http://t2online.com/404/", sportUrl);
	// scroll(sportUrl);
	
	driver.navigate().back();
	Thread.sleep(5000);
		}
		driver.close();
	}
	public void spin_SubSectionClick(String url) throws Exception
	{
		
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		boolean value5 = driver.getCurrentUrl().equalsIgnoreCase("http://t2online.com/the-spin/");
		boolean videovalue2 = driver.getCurrentUrl().equalsIgnoreCase("http://t2online.com/video/");
		System.out.println(value5);
		if(value5 !=true)
		{
	WebElement spin = driver.findElement(By.xpath(".//*[@id='parallax']/ng-view/div[3]/div[7]/category-item/div/div/div[2]/div[1]/div[2]/div[2]/a/span"));
	spin.click();
	Thread.sleep(5000);
	String spinUrl = driver.getCurrentUrl().toString();
	System.out.println("Current Spin Url"+spinUrl);
	
	Assert.assertNotEquals("http://t2online.com/404/", spinUrl);				
//	scroll(spinUrl);
	driver.navigate().back();
	Thread.sleep(5000);
		}
		
		driver.close();
	}
	public void video_SubSectionClick(String url) throws Exception
	{
		
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		

		boolean value6 = driver.getCurrentUrl().equalsIgnoreCase("http://t2online.com/video/");	
		System.out.println(value6);
		if(value6!=true)	
		{
	WebElement video = driver.findElement(By.xpath(".//*[@id='parallax']/ng-view/div[3]/div[10]/category-item/div/div/div[2]/div[1]/div[1]/div[2]/a/span"));
	video.click();
	Thread.sleep(5000);
	String videoUrl = driver.getCurrentUrl();
	System.out.println("Current Video Url"+videoUrl);
	
	Assert.assertNotEquals("http://t2online.com/404/", videoUrl);
//	scroll(videoUrl);
	driver.navigate().back();
		}
	driver.close();
	
	}
	
	public void SubSectionClick(String url) throws Exception
	{
		

		driver.navigate().to(url);
	    		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	    		//SubSectionClick
	    		
	    		boolean value = driver.getCurrentUrl().equalsIgnoreCase("http://t2online.com/video/");	
				System.out.println(value);
				if(value!=true)
				{
	    		WebElement Curatedsection = driver.findElement(By.xpath(".//*[@id='section-blk']/div[3]/div[4]/div[1]/div/div/div[1]/a/span"));
				Curatedsection.click();                                  
				Thread.sleep(5000);
				String curatedsectionUrl = driver.getCurrentUrl().toString();
				System.out.println("Current curated story Url"+curatedsectionUrl);
		
				Assert.assertNotEquals("http://t2online.com/404/", curatedsectionUrl);
				
		
				driver.navigate().back();
				Thread.sleep(5000);
				}
				
				//SubSectionClick
				
				
				
				
				boolean value1 = driver.getCurrentUrl().equalsIgnoreCase("http://t2online.com/entertainment/");	
					System.out.println(value1);
					if(value1!=true)
					{
				WebElement entertainment1 = driver.findElement(By.xpath(".//*[@id='parallax']/ng-view/div[3]/div[1]/category-item/div/div/div[2]/div[1]/div[3]/div[2]/a/span"));
				entertainment1.click();
				Thread.sleep(2000);
	
				String entertainment1Url = driver.getCurrentUrl().toString();
				System.out.println("Current entertainment Url"+entertainment1Url);
				Assert.assertNotEquals("http://t2online.com/404/", entertainment1Url);
				
				
				driver.navigate().back();
				
				Thread.sleep(2000);
					}
					
				//SubSectionClick
					boolean value2 = driver.getCurrentUrl().equalsIgnoreCase("http://t2online.com/lifestyle/");	
					System.out.println(value2);
					if(value2!=true)
					{
				WebElement lifestyle = driver.findElement(By.xpath(".//*[@id='parallax']/ng-view/div[3]/div[2]/category-item/div/div/div[2]/div[1]/div[1]/div[2]/a/span"));
				lifestyle.click();
				Thread.sleep(5000);
				String lifestyleUrl = driver.getCurrentUrl().toString();
				System.out.println("Current lifestyle Url"+lifestyleUrl);
		
				Assert.assertNotEquals("http://t2online.com/404/", lifestyleUrl);
				
				
		
				driver.navigate().back();
				Thread.sleep(5000);
					}
				//SubSectionClick
					
					boolean value3 = driver.getCurrentUrl().equalsIgnoreCase("http://t2online.com/tech/");
					boolean videovalue1 = driver.getCurrentUrl().equalsIgnoreCase("http://t2online.com/video/");
					System.out.println(value3);
					if(value3!=true)
					{
				WebElement tech = driver.findElement(By.xpath(".//*[@id='parallax']/ng-view/div[3]/div[3]/category-item/div/div/div[2]/div[1]/div[1]/div[2]/a/span"));
				tech.click();
				Thread.sleep(5000);
				String techUrl = driver.getCurrentUrl().toString();
				System.out.println("Current tech Url"+techUrl);
				
				Assert.assertNotEquals("http://t2online.com/404/", techUrl);				
				
				driver.navigate().back();
				Thread.sleep(5000);
					}
				//SubSectionClick
					
					boolean value4 = driver.getCurrentUrl().equalsIgnoreCase("http://t2online.com/sport/");	
					System.out.println(value4);
					
					if(value4 !=true)
					{
					
				WebElement sport = driver.findElement(By.xpath(".//*[@id='parallax']/ng-view/div[3]/div[6]/category-item/div/div/div[2]/div[1]/div[1]/div[2]/a/span"));
				sport.click();
				Thread.sleep(5000);
				String sportUrl = driver.getCurrentUrl().toString();
				System.out.println("Current Sports Url"+sportUrl);
				
				Assert.assertNotEquals("http://t2online.com/404/", sportUrl);
				
				
				driver.navigate().back();
				Thread.sleep(5000);
					}
				//SubSectionClick
					
					boolean value5 = driver.getCurrentUrl().equalsIgnoreCase("http://t2online.com/the-spin/");
					boolean videovalue2 = driver.getCurrentUrl().equalsIgnoreCase("http://t2online.com/video/");
					System.out.println(value5);
					if(value5 !=true)
					{
				WebElement spin = driver.findElement(By.xpath(".//*[@id='parallax']/ng-view/div[3]/div[7]/category-item/div/div/div[2]/div[1]/div[2]/div[2]/a/span"));
				spin.click();
				Thread.sleep(5000);
				String spinUrl = driver.getCurrentUrl().toString();
				System.out.println("Current Spin Url"+spinUrl);
				
				Assert.assertNotEquals("http://t2online.com/404/", spinUrl);				
				
				driver.navigate().back();
				Thread.sleep(5000);
					}
				//SubSectionClick
				
					boolean value6 = driver.getCurrentUrl().equalsIgnoreCase("http://t2online.com/video/");	
					System.out.println(value6);
					if(value6!=true)	
					{
				WebElement video = driver.findElement(By.xpath(".//*[@id='parallax']/ng-view/div[3]/div[10]/category-item/div/div/div[2]/div[1]/div[1]/div[2]/a/span"));
				video.click();
				Thread.sleep(5000);
				String videoUrl = driver.getCurrentUrl();
				System.out.println("Current Video Url"+videoUrl);
				
				Assert.assertNotEquals("http://t2online.com/404/", videoUrl);
				driver.navigate().back();
					}
				driver.close();
	}
	public void video_SubMenuStoryClick(String url) throws Exception
	{
		
		driver.navigate().to(url);
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	    Actions action = new Actions(driver);
	    Thread.sleep(2000);
WebElement video = driver.findElement(By.xpath(".//*[@id='desktop-nav']/div[2]/div/div/div[2]/ul/li[6]/a"));
		
	    action.moveToElement(video);
	    action.build().perform();
	    Thread.sleep(5000);
	    WebElement videostory = driver.findElement(By.xpath(".//*[@id='nav-preview']/div/div/nav-snippet/div/div/div[1]/div[2]/a/span"));
	    videostory.click();
	    Thread.sleep(10000);
	    String videostoryurl = driver.getCurrentUrl();
	    
	    System.out.println("Current video story Url"+videostoryurl);
		org.testng.Assert.assertNotEquals("http://t2online.com/404/", videostoryurl);
		
		Thread.sleep(5000);
		String assertcheck11 = driver.findElement(By.xpath(".//*[@id='parallax']/ng-view/div[1]/div[2]/ol/li[2]/a/span")).getText();
		
		Assert.assertEquals("VIDEO",assertcheck11);
		Thread.sleep(5000);
		
		
		driver.navigate().back();
	    Thread.sleep(5000);
	    driver.close();
	    
	}
	public void entertainment_SubMenuStoryClick(String url) throws Exception
	{
		
		driver.navigate().to(url);
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	    
		
WebElement entertainment = driver.findElement(By.xpath(".//*[@id='desktop-nav']/div[2]/div/div/div[2]/ul/li[1]/a"));
	    
	    Actions action = new Actions(driver);
	    action.moveToElement(entertainment);
	    action.build().perform();
	    Thread.sleep(5000);
	    WebElement enterstory = driver.findElement(By.xpath(".//*[@id='nav-preview']/div/div/nav-snippet/div/div/div[1]/div[2]/a/span"));
	    enterstory.click();
	    Thread.sleep(10000);
	    String enterstoryurl = driver.getCurrentUrl();
	    
	    System.out.println("Current entertainment story Url"+enterstoryurl);
		
		Assert.assertNotEquals("http://t2online.com/404/", enterstoryurl);
		Thread.sleep(5000);
		String assertcheck1 = driver.findElement(By.xpath(".//*[@id='nav-preview']/div/div/nav-snippet/div/div/div[1]/div[2]/a/span")).getText();
		String assertcheck2 = driver.findElement(By.xpath(".//*[@id='nav-preview']/div/div/nav-snippet/div/div/div[1]/div[2]/a/span")).getText();
		Assert.assertEquals( assertcheck1,assertcheck2);
		Thread.sleep(5000);
	    driver.navigate().back();
	    
	    driver.close();
	}
	public void lifestyle_SubMenuStoryClick(String url) throws Exception
	{
		
		driver.navigate().to(url);
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Thread.sleep(2000);
	    WebElement lifestyle = driver.findElement(By.xpath(".//*[@id='desktop-nav']/div[2]/div/div/div[2]/ul/li[2]/a"));
	    Actions action = new Actions(driver);
	    action.moveToElement(lifestyle);
	    action.build().perform();
	    Thread.sleep(5000);
	    WebElement lifestylestory = driver.findElement(By.xpath(".//*[@id='nav-preview']/div/div/nav-snippet/div/div/div[1]/div[2]/a/span"));
	    lifestylestory.click();
	    Thread.sleep(10000);
	    String lifestoryurl = driver.getCurrentUrl();
	    
	    System.out.println("Current lifestyle story Url"+lifestoryurl);
		Assert.assertNotEquals("http://t2online.com/404/", lifestoryurl);
		
		Thread.sleep(5000);
		String assertcheck3 = driver.findElement(By.xpath(".//*/div[1]/div/ol/li[2]/a/span")).getText();
		String assertcheck4 = driver.findElement(By.xpath(".//*/div[2]/div[1]/div[1]/span[1]")).getText();
		Assert.assertEquals( assertcheck3,assertcheck4);
		Thread.sleep(5000);
	    driver.navigate().back();
	    
	    driver.close();
	}
	public void tech_SubMenuStoryClick(String url) throws Exception
	{
		
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
	public void sport_SubMenuStoryClick(String url) throws Exception
	{
		
		driver.navigate().to(url);
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    Thread.sleep(2000);
	    Actions action = new Actions(driver);
WebElement sport = driver.findElement(By.xpath(".//*[@id='desktop-nav']/div[2]/div/div/div[2]/ul/li[4]/a"));
		
	    action.moveToElement(sport);
	    action.build().perform();
	    Thread.sleep(5000);
	    WebElement sportstory = driver.findElement(By.xpath(".//*[@id='nav-preview']/div/div/nav-snippet/div/div/div[1]/div[2]/a/span"));
	    sportstory.click();
	    Thread.sleep(10000);
	    String sportstoryurl = driver.getCurrentUrl().toString();
	    
	    System.out.println("Current sport story Url"+sportstoryurl);
		Assert.assertNotEquals("http://t2online.com/404/", sportstoryurl);
		
		Thread.sleep(5000);
		String assertcheck7 = driver.findElement(By.xpath(".//*/div[1]/div/ol/li[2]/a/span")).getText();
		String assertcheck8 = driver.findElement(By.xpath(".//*/div[2]/div[1]/div[1]/span[1]")).getText();
		Assert.assertEquals( assertcheck7,assertcheck8);
		Thread.sleep(5000);
	    driver.navigate().back();
	    
	    driver.close();
	}
	public void spin_SubMenuStoryClick(String url) throws Exception
	{
		
		driver.navigate().to(url);
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    Thread.sleep(2000);
	    Actions action = new Actions(driver);
 WebElement spin = driver.findElement(By.xpath(".//*[@id='desktop-nav']/div[2]/div/div/div[2]/ul/li[5]/a"));
		
	    action.moveToElement(spin);
	    action.build().perform();
	    Thread.sleep(5000);
	    WebElement spinstory = driver.findElement(By.xpath(".//*[@id='nav-preview']/div/div/nav-snippet/div/div/div[1]/div[2]/a/span"));
	    spinstory.click();
	    Thread.sleep(10000);
	    String spinstoryurl = driver.getCurrentUrl().toString();
	    
	    System.out.println("Current spin story Url"+spinstoryurl);
		Assert.assertNotEquals("http://t2online.com/404/", spinstoryurl);
		
		Thread.sleep(5000);
		String assertcheck9 = driver.findElement(By.xpath(".//*/div[1]/div/ol/li[2]/a/span")).getText();
		String assertcheck10 = driver.findElement(By.xpath(".//*/div[2]/div[1]/div[1]/span[1]")).getText();
		Assert.assertEquals( assertcheck9,assertcheck10);
		Thread.sleep(5000);
	    driver.navigate().back();
	    
	    driver.close();
	}
	public void SubMenuStoryClick(String url) throws Exception
	{
		
		driver.navigate().to(url);
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	    //Entertainment
	    WebElement entertainment = driver.findElement(By.xpath(".//*[@id='desktop-nav']/div[2]/div/div/div[2]/ul/li[1]/a"));
	    
	    Actions action = new Actions(driver);
	    action.moveToElement(entertainment);
	    action.build().perform();
	    Thread.sleep(5000);
	    WebElement enterstory = driver.findElement(By.xpath(".//*[@id='nav-preview']/div/div/nav-snippet/div/div/div[1]/div[2]/a/span"));
	    enterstory.click();
	    Thread.sleep(10000);
	    String enterstoryurl = driver.getCurrentUrl();
	    
	    System.out.println("Current entertainment story Url"+enterstoryurl);
		
		Assert.assertNotEquals("http://t2online.com/404/", enterstoryurl);
		Thread.sleep(5000);
		String assertcheck1 = driver.findElement(By.xpath(".//*[@id='nav-preview']/div/div/nav-snippet/div/div/div[1]/div[2]/a/span")).getText();
		String assertcheck2 = driver.findElement(By.xpath(".//*[@id='nav-preview']/div/div/nav-snippet/div/div/div[1]/div[2]/a/span")).getText();
		Assert.assertEquals( assertcheck1,assertcheck2);
		Thread.sleep(5000);
	    driver.navigate().back();
	    
	    //Lifestyle
	    WebElement lifestyle = driver.findElement(By.xpath(".//*[@id='desktop-nav']/div[2]/div/div/div[2]/ul/li[2]/a"));
	    	
	    action.moveToElement(lifestyle);
	    action.build().perform();
	    Thread.sleep(5000);
	    WebElement lifestylestory = driver.findElement(By.xpath(".//*[@id='nav-preview']/div/div/nav-snippet/div/div/div[1]/div[2]/a/span"));
	    lifestylestory.click();
	    Thread.sleep(10000);
	    String lifestoryurl = driver.getCurrentUrl();
	    
	    System.out.println("Current lifestyle story Url"+lifestoryurl);
		Assert.assertNotEquals("http://t2online.com/404/", lifestoryurl);
		
		Thread.sleep(5000);
		String assertcheck3 = driver.findElement(By.xpath(".//*/div[1]/div/ol/li[2]/a/span")).getText();
		String assertcheck4 = driver.findElement(By.xpath(".//*/div[2]/div[1]/div[1]/span[1]")).getText();
		Assert.assertEquals( assertcheck3,assertcheck4);
		Thread.sleep(5000);
	    driver.navigate().back();
	    
	    //Tech
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
	    
	    //Sport
	    WebElement sport = driver.findElement(By.xpath(".//*[@id='desktop-nav']/div[2]/div/div/div[2]/ul/li[4]/a"));
		
	    action.moveToElement(sport);
	    action.build().perform();
	    Thread.sleep(5000);
	    WebElement sportstory = driver.findElement(By.xpath(".//*[@id='nav-preview']/div/div/nav-snippet/div/div/div[1]/div[2]/a/span"));
	    sportstory.click();
	    Thread.sleep(10000);
	    String sportstoryurl = driver.getCurrentUrl().toString();
	    
	    System.out.println("Current sport story Url"+sportstoryurl);
		Assert.assertNotEquals("http://t2online.com/404/", sportstoryurl);
		
		Thread.sleep(5000);
		String assertcheck7 = driver.findElement(By.xpath(".//*/div[1]/div/ol/li[2]/a/span")).getText();
		String assertcheck8 = driver.findElement(By.xpath(".//*/div[2]/div[1]/div[1]/span[1]")).getText();
		Assert.assertEquals( assertcheck7,assertcheck8);
		Thread.sleep(5000);
	    driver.navigate().back();

	    //Spin
	 WebElement spin = driver.findElement(By.xpath(".//*[@id='desktop-nav']/div[2]/div/div/div[2]/ul/li[5]/a"));
		
	    action.moveToElement(spin);
	    action.build().perform();
	    Thread.sleep(5000);
	    WebElement spinstory = driver.findElement(By.xpath(".//*[@id='nav-preview']/div/div/nav-snippet/div/div/div[1]/div[2]/a/span"));
	    spinstory.click();
	    Thread.sleep(10000);
	    String spinstoryurl = driver.getCurrentUrl().toString();
	    
	    System.out.println("Current spin story Url"+spinstoryurl);
		Assert.assertNotEquals("http://t2online.com/404/", spinstoryurl);
		
		Thread.sleep(5000);
		String assertcheck9 = driver.findElement(By.xpath(".//*/div[1]/div/ol/li[2]/a/span")).getText();
		String assertcheck10 = driver.findElement(By.xpath(".//*/div[2]/div[1]/div[1]/span[1]")).getText();
		Assert.assertEquals( assertcheck9,assertcheck10);
		Thread.sleep(5000);
	    driver.navigate().back();

	    //Video
	 WebElement video = driver.findElement(By.xpath(".//*[@id='desktop-nav']/div[2]/div/div/div[2]/ul/li[6]/a"));
		
	    action.moveToElement(video);
	    action.build().perform();
	    Thread.sleep(5000);
	    WebElement videostory = driver.findElement(By.xpath(".//*[@id='nav-preview']/div/div/nav-snippet/div/div/div[1]/div[2]/a/span"));
	    videostory.click();
	    Thread.sleep(10000);
	    String videostoryurl = driver.getCurrentUrl();
	    
	    System.out.println("Current video story Url"+videostoryurl);
		org.testng.Assert.assertNotEquals("http://t2online.com/404/", videostoryurl);
		
		Thread.sleep(5000);
		String assertcheck11 = driver.findElement(By.xpath(".//*[@id='parallax']/ng-view/div[1]/div[2]/ol/li[2]/a/span")).getText();
		
		Assert.assertEquals("VIDEO",assertcheck11);
		Thread.sleep(5000);
		
		
		driver.navigate().back();
	    Thread.sleep(5000);
	    driver.close();
	}
	
	public void NextPrevButton(String url) throws Exception
	{
		
		driver.navigate().to(url);
	    String Surl ="http://t2online.com/404/";
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    Assert.assertNotEquals(Surl, driver.getCurrentUrl());
	    Actions action = new Actions(driver);
	    System.out.println("System out");
	    
	    Thread.sleep(2000);
	    Thread.sleep(5000);
		String assertcheck = driver.findElement(By.xpath(".//*[@id='1.60898']/div[1]/div/ol/li[2]/a/span")).getText();
		String assertcheck1 = driver.findElement(By.xpath(".//*/div[2]/div[1]/div[1]/span[1]")).getText();
		System.out.println("System out");
		Assert.assertEquals( assertcheck,assertcheck1);
	    Assert.assertNotEquals(Surl, driver.getCurrentUrl());
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
	    
		WebElement nextclick1 = driver.findElement(By.xpath(".//*[@id='parallax']/ng-view/div/div[3]/span/a[2]/i"));
		action.moveToElement(nextclick1);
		action.build().perform();
		Thread.sleep(2000);
		
		
		
	//	scroll(driver.getCurrentUrl());
		
	
		
		WebElement nextclick1visible = driver.findElement(By.xpath(".//*[@id='prevTitle']"));
		//Assert.assertTrue(nextclick1visible.isDisplayed());
		
	    nextclick1.click();
		Thread.sleep(2000);
		Assert.assertEquals( assertcheck,assertcheck1);
		Assert.assertNotEquals(Surl, driver.getCurrentUrl());	
		Thread.sleep(2000);
	    jse.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
	//	scroll(driver.getCurrentUrl());
		WebElement nextclick2 = driver.findElement(By.xpath(".//*[@id='parallax']/ng-view/div/div[3]/span/a[2]/i"));
		action.moveToElement(nextclick2);
		action.build().perform();
		nextclick2.click();
		Thread.sleep(2000);
	//	scroll(driver.getCurrentUrl());
		Assert.assertNotEquals(Surl, driver.getCurrentUrl());
		Thread.sleep(2000);
	    jse.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		Assert.assertEquals( assertcheck,assertcheck1);
		WebElement nextclick3 = driver.findElement(By.xpath(".//*[@id='parallax']/ng-view/div/div[3]/span/a[2]/i"));
		action.moveToElement(nextclick3);
		action.build().perform();
		nextclick3.click();
		Thread.sleep(2000);
	//	scroll(driver.getCurrentUrl());
		Assert.assertNotEquals(Surl, driver.getCurrentUrl());
		Thread.sleep(2000);
		Assert.assertEquals( assertcheck,assertcheck1);
	    jse.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		WebElement prevclick3 = driver.findElement(By.xpath(".//*[@id='parallax']/ng-view/div/div[3]/span/a[1]/i"));
		action.moveToElement(prevclick3);
		action.build().perform();
		prevclick3.click();
		Thread.sleep(2000);
	//	scroll(driver.getCurrentUrl());
		Assert.assertNotEquals(Surl, driver.getCurrentUrl());
		Thread.sleep(2000);
		Assert.assertEquals( assertcheck,assertcheck1);
	    jse.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		WebElement prevclick2 = driver.findElement(By.xpath(".//*[@id='parallax']/ng-view/div/div[3]/span/a[1]/i"));
		action.moveToElement(prevclick2);
		action.build().perform();
		prevclick2.click();
		Thread.sleep(2000);
	//	scroll(driver.getCurrentUrl());
		Assert.assertNotEquals(Surl, driver.getCurrentUrl());
		Thread.sleep(2000);
		Assert.assertEquals( assertcheck,assertcheck1);
	    jse.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		WebElement prevclick1 = driver.findElement(By.xpath(".//*[@id='parallax']/ng-view/div/div[3]/span/a[1]/i"));
		action.moveToElement(prevclick1);
		action.build().perform();
		prevclick1.click();
		Thread.sleep(2000);
		Assert.assertEquals( assertcheck,assertcheck1);
		Assert.assertNotEquals("http://t2online.com/404/", driver.getCurrentUrl());
	//	scroll(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.close();
		
		
	}
	public void Search(String searchkey) throws Exception
	{
		driver = new FirefoxDriver();  
        //firingdriver = new EventFiringWebDriver(driver);
		
		driver.navigate().to("http://t2online.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement SearchButton = driver.findElement(By.id("search-identifier"));
		SearchButton.click();
		//Single Keyword
		driver.findElement(By.id("search-t2")).sendKeys(searchkey);
		
		WebElement SearchClick = driver.findElement(By.xpath(".//*[@id='search-view']/div/form/span/input"));
		SearchClick.click();
		
		EventListenerProject listener = new EventListenerProject();
		//driver.register(listener);
		Thread.sleep(5000);
		List<WebElement> ResultsList1 = driver.findElements(By.cssSelector(".img-h-centered-bottom.auto-fit-target-img.ng-isolate-scope.fit-to-width.fit-to-height"));
		System.out.println(ResultsList1.size());
		if(ResultsList1.size() != 0)
		{
		Assert.assertEquals(ResultsList1.size(),5);
		
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1750)", "");
		Thread.sleep(5000);
		   
		WebElement loadclick = driver.findElement(By.xpath(".//*[@id='parallax']/ng-view/div/div[9]/a"));
		loadclick.click();
		   
		jse.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(5000);

		List<WebElement> ResultsList2 = driver.findElements(By.cssSelector(".img-h-centered-bottom.auto-fit-target-img.ng-isolate-scope.fit-to-width.fit-to-height"));
		System.out.println(ResultsList2.size());
		Assert.assertEquals(ResultsList2.size(),10);
		
		Thread.sleep(5000);
		loadclick.click();
		jse.executeScript("window.scrollBy(0,250)", "");
		
		Thread.sleep(5000);
		List<WebElement> ResultsList3 = driver.findElements(By.cssSelector(".img-h-centered-bottom.auto-fit-target-img.ng-isolate-scope.fit-to-width.fit-to-height"));
		System.out.println(ResultsList3.size());
		Assert.assertEquals(ResultsList3.size(),16);
		}
		else
		{
			System.out.println("This item cannot be searched");
		}
		//driver.unregister(listener);
		driver.close();
 	}
	
	
}	