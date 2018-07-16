package ebela;

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
import org.testng.annotations.Test;

import com.google.common.base.Verify;

public class ebela_sectionpage extends ebela_base
{
	
	@Test
	public void entertainment_CarousalClick() throws Exception
	{
		
		APP_LOGS.debug("Checking Entertainment Carousal from Entertainment Sectionpage");
		String url = "https://ebela.in/entertainment/?google_nofetch=true&param=something";
		section_carousal(url);
	}
	
	@Test
	public void sports_CarousalClick() throws Exception
	{
		
		APP_LOGS.debug("Checking Entertainment Carousal from Entertainment Sectionpage");
		String url = "https://ebela.in/sports";
WebDriver driver = new FirefoxDriver();
		
		
		driver.get(url);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		//System.setProperty("webdriver.gecko.driver","D:\\Mozilla\\geckodriver.exe");
        
		(new WebDriverWait(driver, 30))
		  .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='breadcrumb']/div/div/span[2]")));
		
		
		driver.findElement(By.xpath(".//*[@id='myCarousel']/div/div[1]/a[2]/span[1]")).click();		
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='myCarousel']/div/div[2]/a[2]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='myCarousel']/div/div[3]/a[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='myCarousel']/div/div[2]/a[3]/img")).click();
		Thread.sleep(2000);
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
		
		WebElement heading =driver.findElement(By.xpath(".//*[@id='middleContainer']/div[1]/h1"));
		
		Assert.assertTrue(heading.isDisplayed());
		
		
		// Insert story method() here 
		driver.close();
	}
	
	@Test
	public void state_CarousalClick() throws Exception
	{
		
		APP_LOGS.debug("Checking Entertainment Carousal from Entertainment Sectionpage");
		String url = "https://ebela.in/state/?google_nofetch=true&param=something";
		section_carousal(url);
	}
	
	@Test
	public void national_CarousalClick() throws Exception
	{
		
		APP_LOGS.debug("Checking Entertainment Carousal from Entertainment Sectionpage");
		String url = "https://ebela.in/national";
		section_carousal(url);
	}
	
	@Test
	public void international_CarousalClick() throws Exception
	{
		
		APP_LOGS.debug("Checking Entertainment Carousal from Entertainment Sectionpage");
		String url = "https://ebela.in/international/?google_nofetch=true&param=something";
		section_carousal(url);
	}
	
	@Test
	public void business_CarousalClick() throws Exception
	{
		
		APP_LOGS.debug("Checking Entertainment Carousal from Entertainment Sectionpage");
		String url = "https://ebela.in/business/?google_nofetch=true&param=something";
		section_carousal(url);
	}

	@Test
	public void health_CarousalClick() throws Exception
	{
		
		APP_LOGS.debug("Checking Entertainment Carousal from Entertainment Sectionpage");
		String url = "https://ebela.in/health/?google_nofetch=true&param=something";
		section_carousal(url);
	}

	@Test
	public void technology_CarousalClick() throws Exception
	{
		
		APP_LOGS.debug("Checking Entertainment Carousal from Entertainment Sectionpage");
		String url = "https://ebela.in/technology/?google_nofetch=true&param=something";
		section_carousal(url);
	}

	@Test(priority=1)
	public void lifestyle_CarousalClick() throws Exception
	{
		
		APP_LOGS.debug("Checking Entertainment Carousal from Entertainment Sectionpage");
		String url = "https://ebela.in/lifestyle";
		
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get(url);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		//System.setProperty("webdriver.gecko.driver","D:\\Mozilla\\geckodriver.exe");
        
		(new WebDriverWait(driver, 30))
		  .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='breadcrumb']/div/div/span[2]")));
		
		
		driver.findElement(By.xpath(".//*[@id='myCarousel']/div/div[1]/a[2]/span[1]")).click();		
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='myCarousel']/div/div[2]/a[2]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='myCarousel']/div/div[3]/a[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='myCarousel']/div/div[2]/a[3]/img")).click();
		Thread.sleep(2000);
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
		
		WebElement heading =driver.findElement(By.xpath(".//*[@id='middleContainer']/div[1]/h1"));
		
		Assert.assertTrue(heading.isDisplayed());
		
		
		// Insert story method() here 
		driver.close();
	}
	
	@Test
	public void entertainment_breadcrumb() throws Exception
	{
		
		APP_LOGS.debug("Checking Entertainment Carousal from Entertainment Sectionpage");
		String url = "https://ebela.in/entertainment?abcd";
		
		section_breadcrumb(url);
	}
	
	
	@Test
	public void sport_breadcrumb() throws Exception
	{
		
		APP_LOGS.debug("Checking Entertainment Carousal from Entertainment Sectionpage");
		String url = "https://ebela.in/sports?abcd";
		
		section_breadcrumb(url);
	}

	
	@Test
	public void state_breadcrumb() throws Exception
	{
		
		APP_LOGS.debug("Checking Entertainment Carousal from Entertainment Sectionpage");
		String url = "https://ebela.in/state?abcd";
		
		section_breadcrumb(url);
	}

	
	@Test
	public void national_breadcrumb() throws Exception
	{
		
		APP_LOGS.debug("Checking Entertainment Carousal from Entertainment Sectionpage");
		String url = "https://ebela.in/national?abcd";
		
		section_breadcrumb(url);
	}

	
	@Test
	public void international_breadcrumb() throws Exception
	{
		
		APP_LOGS.debug("Checking Entertainment Carousal from Entertainment Sectionpage");
		String url = "https://ebela.in/international?abcd";
		
		section_breadcrumb(url);
	}

	
	@Test
	public void business_breadcrumb() throws Exception
	{
		
		APP_LOGS.debug("Checking Entertainment Carousal from Entertainment Sectionpage");
		String url = "https://ebela.in/business?abcd";
		
		section_breadcrumb(url);
	}

	
	@Test
	public void health_breadcrumb() throws Exception
	{
		
		APP_LOGS.debug("Checking Entertainment Carousal from Entertainment Sectionpage");
		String url = "https://ebela.in/health?abcd";
		
		section_breadcrumb(url);
	}

	
	@Test
	public void technology_breadcrumb() throws Exception
	{
		
		APP_LOGS.debug("Checking Entertainment Carousal from Entertainment Sectionpage");
		String url = "https://ebela.in/technology?abcd";
		
		section_breadcrumb(url);
	}
	
	
	@Test
	public void lifestyle_breadcrumb() throws Exception
	{
		
		APP_LOGS.debug("Checking Entertainment Carousal from Entertainment Sectionpage");
		String url = "https://ebela.in/lifestyle?abcd";
		
		section_breadcrumb(url);
	}

	
	@Test
	public void videogallery_breadcrumb() throws Exception
	{
		
		APP_LOGS.debug("Checking Entertainment Carousal from Entertainment Sectionpage");
		String url = "https://ebela.in/videogallery?abcd";
		
		section_breadcrumb(url);
	}

	
	@Test
	public void blog_breadcrumb() throws Exception
	{
		
		APP_LOGS.debug("Checking Entertainment Carousal from Entertainment Sectionpage");
		String url = "https://ebela.in/blog?abcd";
		
		section_breadcrumb(url);
	}
	
	
	@Test
	public void photogallery_breadcrumb() throws Exception
	{
		
		APP_LOGS.debug("Checking Entertainment Carousal from Entertainment Sectionpage");
		String url = "https://ebela.in/photogallery?google_nofetch=true&param=something";
		
		setup();
		
		
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		//System.setProperty("webdriver.gecko.driver","D:\\Mozilla\\geckodriver.exe");
        
		(new WebDriverWait(driver, 30))
		  .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[6]/div/div[2]/div/ol/li[2]/a/span")));

		driver.findElement(By.xpath("html/body/div[6]/div/div[2]/div/ol/li[2]/a/span")).click();		
		Thread.sleep(1000);
		
		String newurl = driver.getCurrentUrl();
		
		if(url.equals(newurl))
		{
			System.out.println("Second BreadCrumb is not clickable");
		}
		else
		{
			Assert.fail("Second Breadcrumb is clcikable");
		}
		driver.close();

	}
	
	//@Test
	public void entertainment_social_share_twitter() throws Exception
	{
		setup();
		String s = "https://ebela.in/entertainment?google_nofetch=true&param=something";

		social_share_twitter(s);
		
	}
	
	//@Test
	public void entertainment_social_share_gplus() throws Exception
	{
		setup();
		String s = "https://ebela.in/entertainment?google_nofetch=true&param=something";

		social_share_gplus(s);
		
	}
	
	//@Test
	public void entertainment_social_share_fb() throws Exception
	{
		setup();
		String s = "https://ebela.in/entertainment?google_nofetch=true&param=something";
		social_share_fb(s);
		
	}
	
	
	//@Test
	public void sport_carousal_socialshare_twitter() throws Exception
	{
		setup();
		String s = "https://ebela.in/sports?google_nofetch=true&param=something";

		carousal_socialshare_twitter(s);
		
	}
	
	//@Test
	public void sport_carousal_socialshare_glus() throws Exception
	{
		setup();
		String s = "https://ebela.in/sports?google_nofetch=true&param=something";

		carousal_socialshare_gplus(s);
		
	}
	
	//@Test
	public void sport_carousal_socialshare_fb() throws Exception
	{
		setup();
		String s = "https://ebela.in/sports?google_nofetch=true&param=something";
		carousal_socialshare_fb(s);
		
	}

	
	
	

	//@Test
	public void state_loadMore_socialshare_twitter() throws Exception
	{
		setup();
		String s = "https://ebela.in/state?google_nofetch=true&param=something";

		loadMore_socialshare_twitter(s);
		
	}
	
	//@Test
	public void state_loadMore_socialshare_glus() throws Exception
	{
		setup();
		String s = "https://ebela.in/state?google_nofetch=true&param=something";

		loadMore_socialshare_gplus(s);
		
	}
	
	//@Test
	public void state_loadMore_socialshare_fb() throws Exception
	{
		setup();
		String s = "https://ebela.in/state?google_nofetch=true&param=something";
		loadMore_socialshare_fb(s);
		
	}
	
	
	@Test
	public void entertainment_storyclick() throws Exception
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://ebela.in/entertainment");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		(new WebDriverWait(driver, 30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='breadcrumb']/div/div/span[2]")));
		
		driver.findElement(By.xpath(".//*[@id='main']/div[1]/div[3]/a/span")).click();
		
		(new WebDriverWait(driver, 30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[9]/div/div/div[1]/div[1]/span[2]/a/span")));
		
			driver.findElement(By.xpath("html/body/div[9]/div/div/div[1]/div[1]/span[2]/a/span")).click();
			// driver.findElement(By.xpath("html/body/div[7]/div/div/div[1]/div[1]/span[2]/a/span")).click();
			(new WebDriverWait(driver, 30))
			.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='breadcrumb']/div/div/span[2]")));
		System.out.println(driver.getCurrentUrl());
		driver.close();

		
		
	}
	
	@Test
	public void sports_storyclick() throws Exception
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://ebela.in/sports");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		(new WebDriverWait(driver, 30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='breadcrumb']/div/div/span[2]")));
		
		driver.findElement(By.xpath(".//*[@id='main']/div[1]/div[3]/a/span")).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
		(new WebDriverWait(driver, 30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[9]/div/div/div[1]/div[1]/span[2]/a/span")));
		
			driver.findElement(By.xpath("html/body/div[9]/div/div/div[1]/div[1]/span[2]/a/span")).click();
			// driver.findElement(By.xpath("html/body/div[7]/div/div/div[1]/div[1]/span[2]/a/span")).click();
			(new WebDriverWait(driver, 30))
			.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='breadcrumb']/div/div/span[2]")));
		System.out.println(driver.getCurrentUrl());
		driver.close();

		
		
	}
	
	@Test
	public void state_storyclick() throws Exception
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://ebela.in/state");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		(new WebDriverWait(driver, 30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='breadcrumb']/div/div/span[2]")));
		
		driver.findElement(By.xpath(".//*[@id='main']/div[1]/div[3]/a/span")).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
		(new WebDriverWait(driver, 30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[9]/div/div/div[1]/div[1]/span[2]/a/span")));
		
			driver.findElement(By.xpath("html/body/div[9]/div/div/div[1]/div[1]/span[2]/a/span")).click();
			// driver.findElement(By.xpath("html/body/div[7]/div/div/div[1]/div[1]/span[2]/a/span")).click();
			(new WebDriverWait(driver, 30))
			.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='breadcrumb']/div/div/span[2]")));
		System.out.println(driver.getCurrentUrl());
		driver.close();

		
		
	}
	
	@Test
	public void national_storyclick() throws Exception
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://ebela.in/national");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		(new WebDriverWait(driver, 30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='breadcrumb']/div/div/span[2]")));
		
		driver.findElement(By.xpath(".//*[@id='main']/div[1]/div[3]/a/span")).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
		(new WebDriverWait(driver, 30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[8]/div/div/div[1]/div[1]/span[2]/a/span")));
		
			driver.findElement(By.xpath("html/body/div[8]/div/div/div[1]/div[1]/span[2]/a/span")).click();
			// driver.findElement(By.xpath("html/body/div[7]/div/div/div[1]/div[1]/span[2]/a/span")).click();
			(new WebDriverWait(driver, 30))
			.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='breadcrumb']/div/div/span[2]")));
		System.out.println(driver.getCurrentUrl());
		driver.close();

		
		
	}
	
	@Test
	public void international_storyclick() throws Exception
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://ebela.in/international");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		(new WebDriverWait(driver, 30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='breadcrumb']/div/div/span[2]")));
		
		driver.findElement(By.xpath(".//*[@id='main']/div[1]/div[3]/a/span")).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		(new WebDriverWait(driver, 30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[8]/div/div/div[1]/div[1]/span[2]/a/span")));
		
			driver.findElement(By.xpath("html/body/div[8]/div/div/div[1]/div[1]/span[2]/a/span")).click();
			// driver.findElement(By.xpath("html/body/div[7]/div/div/div[1]/div[1]/span[2]/a/span")).click();
			(new WebDriverWait(driver, 30))
			.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='breadcrumb']/div/div/span[2]")));
		System.out.println(driver.getCurrentUrl());
		driver.close();

		
		
	}
	
	@Test
	public void business_storyclick() throws Exception
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://ebela.in/business");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		(new WebDriverWait(driver, 30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='breadcrumb']/div/div/span[2]")));
		
		
		driver.findElement(By.xpath(".//*[@id='main']/div[1]/div[3]/a/span")).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
		(new WebDriverWait(driver, 30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[8]/div/div/div[1]/div[1]/span[2]/a/span")));
		
			driver.findElement(By.xpath("html/body/div[8]/div/div/div[1]/div[1]/span[2]/a/span")).click();
			// driver.findElement(By.xpath("html/body/div[7]/div/div/div[1]/div[1]/span[2]/a/span")).click();
			(new WebDriverWait(driver, 30))
			.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='breadcrumb']/div/div/span[2]")));
		System.out.println(driver.getCurrentUrl());
		driver.close();

		
		
	}
	
	@Test
	public void health_storyclick() throws Exception
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://ebela.in/health");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		(new WebDriverWait(driver, 30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='breadcrumb']/div/div/span[2]")));
		
		driver.findElement(By.xpath(".//*[@id='main']/div[1]/div[3]/a/span")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
		(new WebDriverWait(driver, 30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[8]/div/div/div[1]/div[1]/span[2]/a/span")));
		
			driver.findElement(By.xpath("html/body/div[8]/div/div/div[1]/div[1]/span[2]/a/span")).click();
			// driver.findElement(By.xpath("html/body/div[7]/div/div/div[1]/div[1]/span[2]/a/span")).click();
			(new WebDriverWait(driver, 30))
			.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='breadcrumb']/div/div/span[2]")));
		System.out.println(driver.getCurrentUrl());
		driver.close();


		
		
	}
	
	@Test
	public void technology_storyclick() throws Exception
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://ebela.in/technology");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		(new WebDriverWait(driver, 30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='breadcrumb']/div/div/span[2]")));
		
		driver.findElement(By.xpath(".//*[@id='main']/div[1]/div[3]/a/span")).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
		(new WebDriverWait(driver, 30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[8]/div/div/div[1]/div[1]/span[2]/a/span")));
		
			driver.findElement(By.xpath("html/body/div[8]/div/div/div[1]/div[1]/span[2]/a/span")).click();
			// driver.findElement(By.xpath("html/body/div[7]/div/div/div[1]/div[1]/span[2]/a/span")).click();
			(new WebDriverWait(driver, 30))
			.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='breadcrumb']/div/div/span[2]")));
		System.out.println(driver.getCurrentUrl());
		driver.close();

		
		
	}
	
	@Test
	public void lifestyle_storyclick() throws Exception
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://ebela.in/lifestyle");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		(new WebDriverWait(driver, 30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='breadcrumb']/div/div/span[2]")));
		
		driver.findElement(By.xpath(".//*[@id='main']/div[1]/div[3]/a/span")).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		(new WebDriverWait(driver, 30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[9]/div/div/div[1]/div[1]/span[2]/a/span")));
		
			driver.findElement(By.xpath("html/body/div[9]/div/div/div[1]/div[1]/span[2]/a/span")).click();
			// driver.findElement(By.xpath("html/body/div[7]/div/div/div[1]/div[1]/span[2]/a/span")).click();
			(new WebDriverWait(driver, 30))
			.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='breadcrumb']/div/div/span[2]")));
		System.out.println(driver.getCurrentUrl());
		driver.close();

		
		
	}
	
	
}
