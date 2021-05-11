import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
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


public class base 
{
	

	public static WebDriver driver;
	public static String dynamicUser;
	public static Properties OR;
	public static Properties CONFIG;
	public static String baseurl;
	public static Logger APP_LOGS = Logger.getLogger("devpinoyLogger");
	
	public static void main(String[] args) throws Exception 
	{   
	//	WebDriver driver= new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
	    driver.get("http://t2online.com/");
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	    
		
	}
	public static void setup() throws IOException, InterruptedException{
		 
		
		 CONFIG =new Properties();
		 FileInputStream cn=new FileInputStream(System.getProperty("user.dir")+"\\config\\config.properties");
		 CONFIG.load(cn);
		 
		 PropertyConfigurator.configure(System.getProperty("user.dir")+"//config//log4j.properties");
	
		    String chromedriver = CONFIG.getProperty("chromedriverpath");
	        System.setProperty("webdriver.chrome.driver", chromedriver);
	        driver = new ChromeDriver();  
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
			
			
			/*driver = new FirefoxDriver();	
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);*/
			//driver.manage().window().maximize();
			
			//APP_LOGS.debug("anandbazartest");
			//APP_LOGS.debug(CONFIG.getProperty("testSiteURL"));
		//	driver.navigate().to(CONFIG.getProperty("testSiteURL"));
		//	driver.manage().window().maximize();	
	}
	
	public interface IRetryAnalyzer {
		 
		  /**
		   * Returns true if the test method has to be retried, false otherwise.
		   *
		   * @param result The result of the test method that just ran.
		   * @return true if the test method has to be retried, false otherwise.
		   */
		  public boolean retry(ITestResult result);
		}
	 
	public void story_TrendingStories(String s) throws Exception
	{	
		
		
	//	APP_LOGS.debug("Checking Trending Stories from Story Page");
	    driver.navigate().to(s);
	    Assert.assertTrue(false);
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    
        Thread.sleep(2000);
       
        
        driver.findElement(By.cssSelector(".t2icon-up-open-big")).click();
        
        WebElement trending1 = driver.findElement(By.xpath(".//*[@id='1.66354']/div[2]/div[2]/trending/div/div[1]/div[1]/div/article-thumb/div[1]/div/div/div[2]/a/span"));
		trending1.click();
		Thread.sleep(2000);
		String trending1url = driver.getCurrentUrl();
		Thread.sleep(2000);
	    System.out.println(trending1url);
	    driver.navigate().back();
	    Thread.sleep(5000);
	    
		WebElement trending2 = driver.findElement(By.xpath(".//*[@id='1.66354']/div[2]/div[2]/trending/div/div[2]/div[1]/div/article-thumb/div[1]/div/div/div[2]/a/span"));
		Thread.sleep(2000);
		trending2.click();
		Thread.sleep(2000);
		String trending2url = driver.getCurrentUrl();
		Thread.sleep(2000);
		System.out.println(trending2url);
		driver.navigate().back();
	    Thread.sleep(5000);
	    
		WebElement trending3 = driver.findElement(By.xpath(".//*[@id='1.66354']/div[2]/div[2]/trending/div/div[3]/div[1]/div/article-thumb/div[1]/div/div/div[2]/a/span"));
		Thread.sleep(2000);
		trending3.click();
		Thread.sleep(2000);
		String trending3url = driver.getCurrentUrl();
		Thread.sleep(2000);
		System.out.println(trending3url);
		driver.navigate().back();
	    Thread.sleep(5000);
		
		
		WebElement trending4 = driver.findElement(By.xpath(".//*[@id='1.66354']/div[2]/div[2]/trending/div/div[4]/div[1]/div/article-thumb/div[1]/div/div/div[2]/a/span"));
		Thread.sleep(2000);
		trending4.click();
		Thread.sleep(2000);
		String trending4url = driver.getCurrentUrl();
		Thread.sleep(2000);
		System.out.println(trending4url);
		driver.navigate().back();
	    Thread.sleep(5000);
		
	    WebElement trending5 = driver.findElement(By.xpath(".//*[@id='1.66354']/div[2]/div[2]/trending/div/div[5]/div[1]/div/article-thumb/div[1]/div/div/div[2]/a/span"));
		Thread.sleep(3000);
		trending5.click();
		Thread.sleep(5000);
		String trending5url = driver.getCurrentUrl();
		Thread.sleep(2000);                                                    
		System.out.println(trending5url);
		driver.navigate().back();
	    Thread.sleep(5000);
		
		
		
		driver.get("https://accounts.google.com/signin");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("debaditya.bhattacharya@abpdigital.in");
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("Menaka*111");
		driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
		Thread.sleep(2000);
		
		String txt = "analytics";
		
		WebElement analyticstab=driver.findElement(By.xpath(".//*[@id=':2z']"));
		analyticstab.click();
		Thread.sleep(2000);
		List<WebElement> a = driver.findElements(By.xpath("//*[@class='yW']/span"));
        System.out.println(a.size());
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i).getText());
            if (a.get(i).getText().equalsIgnoreCase(txt)) //to click on a specific mail.
                {                                           
                a.get(i).click();
            }
        }
        Thread.sleep(5000);
        
        
        List<WebElement> trend1 = driver.findElements(By.cssSelector("a[target='_blank']"));
        
      
        
        System.out.println(trend1.get(32).getText());
        System.out.println(trend1.get(33).getText());
        System.out.println(trend1.get(34).getText());
        System.out.println(trend1.get(35).getText());
        System.out.println(trend1.get(36).getText());
       
        
        Assert.assertEquals(trending1url, trend1.get(32).getText());
        Assert.assertEquals(trending2url, trend1.get(33).getText());
        Assert.assertEquals(trending3url, trend1.get(34).getText());
        Assert.assertEquals(trending4url, trend1.get(35).getText());
        Assert.assertEquals(trending5url, trend1.get(36).getText());
      
        Thread.sleep(2000);
        driver.close();
		
		
	}
	
}	