package ebela;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ebela_homepage extends ebela_base
{

	WebDriver driver1;

	@BeforeMethod
	  public void startdriver() throws Exception {
		//setup();
		APP_LOGS.debug("Starting the test");	
	//	driver.get("https://www.ebela.in/?google_nofetch=true");
	}

	
	//@Test (priority=7)
	public void homepage_social_share_fb() throws Exception
	{
		setup();
		
		String s = CONFIG.getProperty("homePage");
		social_share_fb(s);
		
	}
	//@Test (priority=2)
	public void homepage_social_share_twitter() throws Exception
	{
		setup();
		String s = CONFIG.getProperty("homePage");
		social_share_twitter(s);
		
	}

	//@Test (priority=3)
	public void homepage_social_share_gplus() throws Exception
	{
		setup();
		String s = CONFIG.getProperty("homePage");
		
		social_share_gplus(s);
		
	}
	
	@Test(priority=4)
	public void homepage_followus() throws Exception
	{	
	
		setup();
		driver.navigate().to(CONFIG.getProperty("homePage"));
		String firstwindowhandle = driver.getWindowHandle();
		WebElement followus_fb = driver.findElement(By.xpath("html/body/div[7]/div/div/div[2]/ul/li[3]/a/span/i[2]"));
		followus_fb.click();
		
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
		Assert.assertEquals(facebookurl, "https://www.facebook.com/Ebelaonline/");
		driver.close();
		
		driver.switchTo().window(firstwindowhandle);
		
		WebElement followus_twitter = driver.findElement(By.xpath("html/body/div[7]/div/div/div[2]/ul/li[2]/a/span/i[2]"));
		followus_twitter.click();
		
		Thread.sleep(5000);
	    String secondwindowhandle1 = " ";
	    Set<String> windowhandles1 = driver.getWindowHandles();
	    
	    for(String id : windowhandles1)
	    {
	    	
	    	if(!firstwindowhandle.equalsIgnoreCase(id))
	    		secondwindowhandle1=id;
	    	
	    }
	    driver.switchTo().window(secondwindowhandle1);
	    Thread.sleep(5000);
	    String twitterurl = driver.getCurrentUrl();
	    System.out.println(twitterurl);
		Assert.assertEquals(twitterurl, "https://twitter.com/ebelaonline");
		driver.close();
		Thread.sleep(2000);
		
		driver.switchTo().window(firstwindowhandle);
		WebElement followus_gplus = driver.findElement(By.xpath("html/body/div[7]/div/div/div[2]/ul/li[1]/a/span/i[2]"));
		
		followus_gplus.click();
		
		Thread.sleep(5000);
	    String secondwindowhandle2 = " ";
	    Set<String> windowhandles2 = driver.getWindowHandles();
	    
	    for(String id : windowhandles2)
	    {
	    	
	    	if(!firstwindowhandle.equalsIgnoreCase(id))
	    		secondwindowhandle2=id;
	    	
	    }
	    driver.switchTo().window(secondwindowhandle2);
	    Thread.sleep(5000);
	    String gplusurl = driver.getCurrentUrl();
	    System.out.println(gplusurl);
		Assert.assertEquals(gplusurl, "https://plus.google.com/113996572862638582270?_ga=1.133159628.339465395.1447999586");
		driver.close();
	}
	/*
	
	@Test(priority=5)
	public void homepage_trending() throws Exception
	{
		setup();

		
		String s = "https://www.ebela.in/?google_nofetch=true&param=something";

		trending(s);

	
	}
		
	*/
	
	@Test(priority=6)
	public void carousal() throws Exception
	{ 	
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(CONFIG.getProperty("homePage"));

		
		//System.setProperty("webdriver.gecko.driver","D:\\Mozilla\\geckodriver.exe");
        
		(new WebDriverWait(driver, 30))
		  .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='myCarousel']/div/div[1]/a[3]/span[1]")));
		
		
		driver.findElement(By.xpath(".//*[@id='myCarousel']/div/div[1]/a[3]/span[1]")).click();		
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='myCarousel']/div/div[2]/a[3]/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='myCarousel']/div/div[3]/a[3]/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='myCarousel']/div/div[4]/a[4]/img")).click();
		
		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
		Thread.sleep(2000);
		
		
		String trendingurl = driver.getCurrentUrl();
		if (trendingurl.contains("?ref=hm-ft-stry")) 
		{
		
			System.out.println("Ref Parameter present");
	    	APP_LOGS.debug("Ref Parameter present");
			
		}
		else
			Assert.fail("Ref Param not Present");
		
		WebElement heading =driver.findElement(By.xpath(".//*[@id='middleContainer']/div[1]/h1"));
		
		Assert.assertTrue(heading.isDisplayed());
		
		
		// Insert story method() here 
		driver.close();
	}
	
	@Test(priority=1)
	public void opinion_poll() throws Exception
	{
		
		setup();
		
		driver.get(CONFIG.getProperty("homePage"));
		
		(new WebDriverWait(driver, 30))
	   	 .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='main']/div[17]/div[1]/h3")));
		
		
		String s = driver.findElement(By.xpath(".//*[@id='main']/div[17]/div[1]/h3")).getText();
		System.out.println(s);
		Thread.sleep(5000);
		(new WebDriverWait(driver, 30))
	   	 .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='myForm']/label[1]/input")));
		driver.findElement(By.xpath(".//*[@id='myForm']/label[1]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='opinion_div']/button")).click();
		Thread.sleep(10000);
		WebElement opinion =driver.findElement(By.xpath(".//*[@id='opinoin_ques']/p"));
		Assert.assertTrue(opinion.isDisplayed());
		
		driver.close();
	}
	/* 
	@Test(priority=8)
	public void homepage_entertainment_click() throws Exception
	{
		setup();
		
		driver.get("https://www.ebela.in/");
		
		
		
		WebElement entertainmentstory = driver.findElement(By.xpath(".//*[@id='pg_load_bd']/div/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/a/span"));
		entertainmentstory.click();
		
		
		
		(new WebDriverWait(driver, 30))
	   	 .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".bread_crumb_active>a>span")));
		
		String storyurl = driver.getCurrentUrl();
		if(storyurl.contains("https://ebela.in/entertainment"))
			System.out.println("Entertainment Story Opended");
		else
		{
			Assert.fail("Entertainment Url not opened");
		}
		
		driver.navigate().back();

		
		
		
		driver.close();
		
	}
	
	@Test(priority=9)
	public void homepage_khela_click() throws Exception
	{
		setup();
		
		driver.get("https://www.ebela.in/");
		
		
		
		WebElement sportstory = driver.findElement(By.xpath(".//*[@id='pg_load_bd']/div/div[1]/div[3]/div[1]/div[4]/div[1]/div[3]"));
		sportstory.click();
		
		
		
		(new WebDriverWait(driver, 30))
	   	 .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".bread_crumb_active>a>span")));
		
		String storyurl = driver.getCurrentUrl();
		if(storyurl.contains("https://ebela.in/sports"))
			System.out.println("Sports Story Opended");
		else
		{
			Assert.fail("Sports Url not opened");
		}
		
		driver.navigate().back();
		
		
		
		driver.close();
		
	}
	
	@Test(priority=10)
	public void homepage_photogallery_click() throws Exception
	{
		setup();
		
		driver.get("https://www.ebela.in/");
		
		
		
		WebElement photostory = driver.findElement(By.xpath(".//*[@id='pg_load_bd']/div/div[1]/div[3]/div[5]/div[1]/div[1]/div[1]/div/a"));
		photostory.click();
		
		
		
		(new WebDriverWait(driver, 30))
	   	 .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".breadcrumb>li>a>span")));
		
		String storyurl = driver.getCurrentUrl();
		if(storyurl.contains("https://ebela.in/photogallery"))
			System.out.println("Photogallery Story Opended");
		else
		{
			Assert.fail("Photogallery Url not opened");
		}
		
		driver.navigate().back();
		
		
		driver.close();
		
	}

	@Test(priority=11)
	public void homepage_video_click() throws Exception
	{
setup();
		
		driver.get("https://www.ebela.in/");
		
		
		
		WebElement videostory = driver.findElement(By.xpath(".//*[@id='pg_load_bd']/div/div[1]/div[3]/div[5]/div[1]/div[2]/div[1]/div/a"));
		videostory.click();
		
		
		
		(new WebDriverWait(driver, 30))
	   	 .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".row>span>a>span")));
		
		String storyurl = driver.getCurrentUrl();
		if(storyurl.contains("https://ebela.in/videogallery"))
			System.out.println("Video Story Opended");
		else
		{
			Assert.fail("Video Url not opened");
		}
		
		driver.navigate().back();
		
		
		driver.close();
		
	}
	
	*/
	
	@Test(priority=11)
	public void BackToTop() throws Exception
	{
		
		setup();
		driver.get(CONFIG.getProperty("homePage"));
		
		(new WebDriverWait(driver, 30))
	   	 .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='main']/div[1]/div[1]/div[1]/div/span")));
		
		
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("window.scrollBy(0,750)", "");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("html/body/div[3]")).click();
		
		Thread.sleep(2000);
		Long value = (Long) jse.executeScript("return window.scrollY;");
		Assert.assertEquals(value.toString(), "0");
		
		driver.close();
		
	}
	
	
	
	//@Test(priority=12)
	public void homepage_carousal_socialshare_twitter() throws Exception
	{
		setup();
		String s = CONFIG.getProperty("homePage");
		
		driver.navigate().to(s);

		(new WebDriverWait(driver, 30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='myCarousel']/div/div[1]/div[1]/div[1]/div/span")));


		
		WebElement social = driver.findElement(By.xpath(".//*[@id='myCarousel']/div/div[1]/div[1]/div[1]/div/span"));
		social.click();
		
		Thread.sleep(2000);
		String firstwindowhandle = driver.getWindowHandle();
		WebElement social_facebook = driver.findElement(By.xpath(".//*[@id='myCarousel']/div/div[1]/div[1]/div[2]/div[2]/a[2]/span"));
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
	
	//@Test(priority=13)
	public void homepage_carousal_socialshare_glus() throws Exception
	{
		setup();
		String s = CONFIG.getProperty("homePage");
		
		

		driver.navigate().to(s);
		
		
		(new WebDriverWait(driver, 30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='myCarousel']/div/div[1]/div[1]/div[1]/div/span")));
		
		WebElement social = driver.findElement(By.xpath(".//*[@id='myCarousel']/div/div[1]/div[1]/div[1]/div/span"));
		social.click();
		
		Thread.sleep(2000);
		String firstwindowhandle = driver.getWindowHandle();
		WebElement social_facebook = driver.findElement(By.xpath(".//*[@id='myCarousel']/div/div[1]/div[1]/div[2]/div[2]/a[3]/span"));
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
	    
	    Thread.sleep(2000);
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
	
	//@Test(priority=14)
	public void homepage_carousal_socialshare_fb() throws Exception
	{
		setup();
		String s = CONFIG.getProperty("homePage");		
		
		driver.navigate().to(s);		
		

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


		WebElement social = driver.findElement(By.xpath(".//*[@id='myCarousel']/div/div[1]/div[1]/div[1]/div/span"));
		social.click();
		
		Thread.sleep(2000);
		String firstwindowhandle = driver.getWindowHandle();
		WebElement social_facebook = driver.findElement(By.xpath(".//*[@id='myCarousel']/div/div[1]/div[1]/div[2]/div[2]/a[1]/span"));
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
	

}
