package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ebela_base 
{
	

	public static String emailid ="";
	public static WebDriver driver;
	public static String dynamicUser;
	public static Properties OR;
	public static Properties CONFIG;
	public static String baseurl;
	public static Logger APP_LOGS = Logger.getLogger("devpinoyLogger");
	
	
	public static void setup() throws IOException, InterruptedException{
	   	
		 CONFIG =new Properties();
		 FileInputStream cn=new FileInputStream(System.getProperty("user.dir")+"\\config\\Config.properties");
		 CONFIG.load(cn);
		 
		 PropertyConfigurator.configure(System.getProperty("user.dir")+"//config//log4j.properties");
	
		 	String chromedriver = CONFIG.getProperty("chromedriverpath");
	        System.setProperty("webdriver.chrome.driver", chromedriver);
	       // adblock();

			//ChromeOptions options = new ChromeOptions();
			//options.addArguments("load-extension=C:\\Content\\1.13.4_0");
			//DesiredCapabilities capabilities = new DesiredCapabilities();
			//capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	        //driver = new ChromeDriver(capabilities); 
	        driver = new ChromeDriver(); 
		//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
			
			/*driver = new FirefoxDriver();	
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);*/
			driver.manage().window().maximize();
			
			APP_LOGS.debug("anandbazartest");
			APP_LOGS.debug(CONFIG.getProperty("testSiteURL"));
		//	driver.navigate().to(CONFIG.getProperty("testSiteURL"));
		//	driver.manage().window().maximize();	
	}
	
	public static void adblock()
	{
		
	//	String path_to_extension = "C:\\Content\\1.13.4_0";

		//ChromeDriver driver = new ChromeDriver(capabilities);
		
	}
	
	public void social_share_fb(String s) throws Exception
	{
		driver.navigate().to(s);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
			(new WebDriverWait(driver, 30))
			  .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='main']/div[1]/div[1]/div[1]/div/span")));
			

		WebElement social = driver.findElement(By.xpath(".//*[@id='main']/div[1]/div[1]/div[1]/div/span"));
		social.click();
		
		Thread.sleep(2000);
		String firstwindowhandle = driver.getWindowHandle();
		WebElement social_facebook = driver.findElement(By.xpath(".//*[@id='main']/div[1]/div[1]/div[2]/div[2]/a[1]/span"));
		social_facebook.click();
		
		Thread.sleep(5000);
	    String secondwindowhandle = " ";
	    Set<String> windowhandles = driver.getWindowHandles();
	    
	    for(String id : windowhandles)
	    {
	    	
	    	if(!firstwindowhandle.equalsIgnoreCase(id))
	    		secondwindowhandle=id;
	    	
	    }
	    driver.switchTo().window(secondwindowhandle);
	    Thread.sleep(5000);
	    String facebookurl = driver.getCurrentUrl();
	    System.out.println(facebookurl);
	    if(facebookurl.contains("https://www.facebook.com/login.php?"))
	    {
	    	System.out.println("Facebook url opened");
	    	APP_LOGS.debug("Facebook url opened");
	    	
	    }
	    else
	    	Assert.fail("Facebook Url not opened");
		driver.quit();
		
		
	}
	
	public void social_share_twitter(String s) throws Exception
	{
		driver.navigate().to(s);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		WebElement social = driver.findElement(By.xpath(".//*[@id='main']/div[1]/div[1]/div[1]/div/span"));
		social.click();
		
		Thread.sleep(2000);
		String firstwindowhandle = driver.getWindowHandle();
		WebElement social_facebook = driver.findElement(By.xpath(".//*[@id='main']/div[1]/div[1]/div[2]/div[2]/a[2]/span"));
		social_facebook.click();
		
		Thread.sleep(5000);
	    String secondwindowhandle = " ";
	    Set<String> windowhandles = driver.getWindowHandles();
	    
	    for(String id : windowhandles)
	    {
	    	
	    	if(!firstwindowhandle.equalsIgnoreCase(id))
	    		secondwindowhandle=id;
	    	
	    }
	    driver.switchTo().window(secondwindowhandle);
	    Thread.sleep(5000);
	    String facebookurl = driver.getCurrentUrl();
	    System.out.println(facebookurl);
	    if(facebookurl.contains("https://twitter.com/intent/tweet?"))
	    {
	    	System.out.println("Twitter url opened");
	    	APP_LOGS.debug("Twitter url opened");
	    	
	    }
	    else
	    	Assert.fail("Twitter Url not opened");
		driver.quit();
	}

	
	public void social_share_gplus(String s) throws Exception
	{
		driver.navigate().to(s);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		WebElement social = driver.findElement(By.xpath(".//*[@id='main']/div[1]/div[1]/div[1]/div/span"));
		social.click();
		
		Thread.sleep(2000);
		String firstwindowhandle = driver.getWindowHandle();
		WebElement social_facebook = driver.findElement(By.xpath(".//*[@id='main']/div[1]/div[1]/div[2]/div[2]/a[3]/span"));
		social_facebook.click();
		
		Thread.sleep(5000);
	    String secondwindowhandle = " ";
	    Set<String> windowhandles = driver.getWindowHandles();
	    
	    for(String id : windowhandles)
	    {
	    	
	    	if(!firstwindowhandle.equalsIgnoreCase(id))
	    		secondwindowhandle=id;
	    	
	    }
	    driver.switchTo().window(secondwindowhandle);
	    Thread.sleep(5000);
	    String facebookurl = driver.getCurrentUrl();
	    System.out.println(facebookurl);
	    if(facebookurl.contains("https://accounts.google.com/"))
	    {
	    	System.out.println("GPlus url opened");
	    	APP_LOGS.debug("GPlus url opened");
	    	
	    }
	    else
	    	Assert.fail("GPlus Url not opened");
		driver.quit();
	}
	
	public void loadMore_socialshare_fb(String s) throws Exception
	{
		driver.navigate().to(s);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		(new WebDriverWait(driver, 30))
		  .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='breadcrumb']/div/div/span[2]")));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1750)", "");
		Thread.sleep(5000);
		
		
		WebElement social = driver.findElement(By.id("parent22"));
		social.click();
		
		Thread.sleep(3000);
		String firstwindowhandle = driver.getWindowHandle();
		WebElement social_facebook = driver.findElement(By.xpath(".//*[@id='load2']/div[2]/a[1]/img"));
		social_facebook.click();
		
		Thread.sleep(5000);
	    String secondwindowhandle = " ";
	    Set<String> windowhandles = driver.getWindowHandles();
	    
	    for(String id : windowhandles)
	    {
	    	
	    	if(!firstwindowhandle.equalsIgnoreCase(id))
	    		secondwindowhandle=id;
	    	
	    }
	    driver.switchTo().window(secondwindowhandle);
	    Thread.sleep(5000);
	    String facebookurl = driver.getCurrentUrl();
	    System.out.println(facebookurl);
	    if(facebookurl.contains("https://www.facebook.com/login.php?"))
	    {
	    	System.out.println("Facebook url opened");
	    	APP_LOGS.debug("Facebook url opened");
	    	
	    }
	    else
	    	Assert.fail("Facebook Url not opened");
		driver.quit();
		
		
	}
	
	public void loadMore_socialshare_twitter(String s) throws Exception
	{
		driver.navigate().to(s);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		(new WebDriverWait(driver, 30))
		  .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='breadcrumb']/div/div/span[2]")));
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1750)", "");
		Thread.sleep(5000);
		
		WebElement social = driver.findElement(By.id("parent22"));
		social.click();
		
		Thread.sleep(2000);
		String firstwindowhandle = driver.getWindowHandle();
		WebElement social_facebook = driver.findElement(By.xpath(".//*[@id='load2']/div[2]/a[2]/img"));
		social_facebook.click();
		
		Thread.sleep(5000);
	    String secondwindowhandle = " ";
	    Set<String> windowhandles = driver.getWindowHandles();
	    
	    for(String id : windowhandles)
	    {
	    	
	    	if(!firstwindowhandle.equalsIgnoreCase(id))
	    		secondwindowhandle=id;
	    	
	    }
	    driver.switchTo().window(secondwindowhandle);
	    Thread.sleep(5000);
	    String facebookurl = driver.getCurrentUrl();
	    System.out.println(facebookurl);
	    if(facebookurl.contains("https://twitter.com/intent/tweet?"))
	    {
	    	System.out.println("Twitter url opened");
	    	APP_LOGS.debug("Twitter url opened");
	    	
	    }
	    else
	    	Assert.fail("Twitter Url not opened");
		driver.quit();
	}

	
	public void loadMore_socialshare_gplus(String s) throws Exception
	{
		
		driver.navigate().to(s);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		(new WebDriverWait(driver, 30))
		  .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='breadcrumb']/div/div/span[2]")));
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1750)", "");
		Thread.sleep(5000);
		WebElement social = driver.findElement(By.id("parent22"));
		social.click();
		
		Thread.sleep(2000);
		String firstwindowhandle = driver.getWindowHandle();
		WebElement social_facebook = driver.findElement(By.xpath(".//*[@id='load2']/div[2]/a[3]/img"));
		social_facebook.click();
		
		Thread.sleep(5000);
	    String secondwindowhandle = " ";
	    Set<String> windowhandles = driver.getWindowHandles();
	    
	    for(String id : windowhandles)
	    {
	    	
	    	if(!firstwindowhandle.equalsIgnoreCase(id))
	    		secondwindowhandle=id;
	    	
	    }
	    driver.switchTo().window(secondwindowhandle);
	    Thread.sleep(5000);
	    String facebookurl = driver.getCurrentUrl();
	    System.out.println(facebookurl);
	    if(facebookurl.contains("https://accounts.google.com"))
	    {
	    	System.out.println("GPlus url opened");
	    	APP_LOGS.debug("GPlus url opened");
	    	
	    }
	    else
	    	Assert.fail("GPlus Url not opened");
		driver.quit();
	}
	
	
	public void carousal_socialshare_fb(String s) throws Exception
	{
		driver.navigate().to(s);		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
		(new WebDriverWait(driver, 30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='myCarousel']/div/div[1]/div[1]/div[2]/div/span")));

														
		
		WebElement social = driver.findElement(By.xpath(".//*[@id='myCarousel']/div/div[1]/div[1]/div[2]/div/span"));
		social.click();
		
		Thread.sleep(500);
		String firstwindowhandle = driver.getWindowHandle();
		WebElement social_facebook = driver.findElement(By.xpath(".//*[@id='myCarousel']/div/div[1]/div[1]/div[3]/div[2]/a[1]/span"));
		social_facebook.click();
		
		Thread.sleep(5000);
	    String secondwindowhandle = " ";
	    Set<String> windowhandles = driver.getWindowHandles();
	    
	    for(String id : windowhandles)
	    {
	    	
	    	if(!firstwindowhandle.equalsIgnoreCase(id))
	    		secondwindowhandle=id;
	    	
	    }
	    driver.switchTo().window(secondwindowhandle);
	    Thread.sleep(5000);
	    String facebookurl = driver.getCurrentUrl();
	    System.out.println(facebookurl);
	    if(facebookurl.contains("https://www.facebook.com/login.php?"))
	    {
	    	System.out.println("Facebook url opened");
	    	APP_LOGS.debug("Facebook url opened");
	    	
	    }
	    else
	    	Assert.fail("Facebook Url not opened");
		driver.quit();
		
		
	}
	
	public void carousal_socialshare_twitter(String s) throws Exception
	{
		driver.navigate().to(s);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		(new WebDriverWait(driver, 30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='myCarousel']/div/div[1]/div[1]/div[2]/div/span")));


		
		WebElement social = driver.findElement(By.xpath(".//*[@id='myCarousel']/div/div[1]/div[1]/div[2]/div/span"));
		social.click();
		
		Thread.sleep(2000);
		String firstwindowhandle = driver.getWindowHandle();
		WebElement social_facebook = driver.findElement(By.xpath(".//*[@id='myCarousel']/div/div[1]/div[1]/div[3]/div[2]/a[2]/span"));
		social_facebook.click();
		
		Thread.sleep(5000);
	    String secondwindowhandle = " ";
	    Set<String> windowhandles = driver.getWindowHandles();
	    
	    for(String id : windowhandles)
	    {
	    	
	    	if(!firstwindowhandle.equalsIgnoreCase(id))
	    		secondwindowhandle=id;
	    	
	    }
	    driver.switchTo().window(secondwindowhandle);
	    Thread.sleep(5000);
	    String facebookurl = driver.getCurrentUrl();
	    System.out.println(facebookurl);
	    if(facebookurl.contains("https://twitter.com/intent/tweet?"))
	    {
	    	System.out.println("Twitter url opened");
	    	APP_LOGS.debug("Twitter url opened");
	    	
	    }
	    else
	    	Assert.fail("Twitter Url not opened");
		driver.quit();
	}

	
	public void carousal_socialshare_gplus(String s) throws Exception
	{
		
		driver.navigate().to(s);
		
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		Thread.sleep(3000);
		(new WebDriverWait(driver, 30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='breadcrumb']/div/div/span[2]")));

		WebElement social = driver.findElement(By.xpath(".//*[@id='myCarousel']/div/div[1]/div[1]/div[2]/div/span"));
		social.click();
		
		Thread.sleep(2000);
		String firstwindowhandle = driver.getWindowHandle();
		WebElement social_facebook = driver.findElement(By.xpath(".//*[@id='myCarousel']/div/div[1]/div[1]/div[3]/div[2]/a[3]/span"));
		social_facebook.click();
		
		Thread.sleep(5000);
	    String secondwindowhandle = " ";
	    Set<String> windowhandles = driver.getWindowHandles();
	    
	    for(String id : windowhandles)
	    {
	    	
	    	if(!firstwindowhandle.equalsIgnoreCase(id))
	    		secondwindowhandle=id;
	    	
	    }
	    driver.switchTo().window(secondwindowhandle);
	    Thread.sleep(5000);
	    String facebookurl = driver.getCurrentUrl();
	    System.out.println(facebookurl);
	    if(facebookurl.contains("https://accounts.google.com/"))
	    {
	    	System.out.println("GPlus url opened");
	    	APP_LOGS.debug("GPlus url opened");
	    	
	    }
	    else
	    	Assert.fail("GPlus Url not opened");
		driver.quit();
	}
	public void trending(String s) throws Exception
	{	
		driver.navigate().to(s);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
		List<WebElement> trending = driver.findElements(By.cssSelector(".trending_scrollar_list"));
		String trendingname = trending.get(1).getText();
		System.out.println("Trending Name"+trendingname);
		trending.get(1).click();
		Thread.sleep(3000);
		
		String trendingurl = driver.getCurrentUrl();
		
		if (trendingurl.contains("ref=hm-Trendingbar")) 
		{
		
			System.out.println("Ref Parameter present");
	    	APP_LOGS.debug("Ref Parameter present");
			
		}
		else
			Assert.fail("Ref Param not Present");
		
		char[] char_ar = trendingname.toCharArray();
		for(int i=0;i<char_ar.length;i++)
		{
			
			if(char_ar[i]==' ')
			{
				char_ar[i] = '-';
			}
			
		}
		
		String trendingname1 = new String(char_ar);
		System.out.println(trendingname1);
		
		if(trendingurl.contains(trendingname1.toLowerCase()))
		{
			System.out.println("Url of Topic Page is Correct");
	    	APP_LOGS.debug("Url of Topic Page is Correct");
			
		}
		else
			Assert.fail("Url of Topic Page is not Correct");
		
		driver.findElement(By.xpath("html/body/div[3]/div[2]/div[2]/div[1]/div/div[2]/a[1]/div/strong")).click();
		(new WebDriverWait(driver, 30))
	   	 .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='middleContainer']/div[1]/h1")));

		
		WebElement heading =driver.findElement(By.xpath(".//*[@id='middleContainer']/div[1]/h1"));
		
			Assert.assertTrue(heading.isDisplayed());
			
			
		driver.close();
	}
	
	
	public void BackToTop() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		(new WebDriverWait(driver, 30))
	   	 .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='pg_load_bd']/div/div[1]/div[3]/div[5]/div[1]/a[2]/div/span[1]")));

		JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("window.scrollBy(0,750)", "");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".fa.fa-2x.fa-arrow-circle-up")).click();
		
		Long value = (Long) jse.executeScript("return window.scrollY;");
		Assert.assertEquals(value.toString(), "0");
		
	}
	
	public void section_carousal(String url) throws Exception
	{
	
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get(url);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		//System.setProperty("webdriver.gecko.driver","D:\\Mozilla\\geckodriver.exe");
        
		(new WebDriverWait(driver, 30))
		  .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='breadcrumb']/div/div/span[2]")));
		
		
		driver.findElement(By.xpath(".//*[@id='myCarousel']/div/div[1]/a[2]/span[1]")).click();		
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='myCarousel']/div/div[2]/a[2]/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='myCarousel']/div/div[3]/a[1]/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='myCarousel']/div/div[2]/a[3]/img")).click();
		
		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
		Thread.sleep(2000);
		
		
		String trendingurl = driver.getCurrentUrl();
		if (trendingurl.contains("-ft-stry")) 
		{
		
			System.out.println("Ref Parameter present");
	    	APP_LOGS.debug("Ref Parameter present");
			
		}
		else
			Assert.fail("Ref Param not Present");
		
		WebElement heading =driver.findElement(By.cssSelector(".col-md-12.both0.ebela-new-news-content-wrap>h1"));
		
		Assert.assertTrue(heading.isDisplayed());
		
		
		// Insert story method() here 
		driver.close();
	}
	
	public void section_breadcrumb(String url) throws Exception
	{
		
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		(new WebDriverWait(driver, 30))
		  .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='breadcrumb']/div/div/span[2]")));
		
		//System.setProperty("webdriver.gecko.driver","D:\\Mozilla\\geckodriver.exe");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(".//*[@id='breadcrumb']/div/div/span[2]")).click();		
		Thread.sleep(1000);
		
		String newurl = driver.getCurrentUrl();
		
		if(url.equals(newurl))
		{
			System.out.println("Second BreadCrumb is not clickable");
		}
		else
		{
			Assert.fail("Second Breadcrumb is clickable");
		}
		driver.close();
		
	}
}
