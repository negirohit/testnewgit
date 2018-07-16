package ebela;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ebela_tagpage extends ebela_base
{
	
	@Test(priority = 1)
	public void tag_page_UrlCheck() throws Exception
	{
		setup();
	//	 WebDriver driver = new FirefoxDriver();
		 driver.get("http://www.ebela.in/");	
		
		
		
		
		List<WebElement> topic = driver.findElements(By.cssSelector(".black_footer_span>a"));
		Thread.sleep(2000);
		for (WebElement i : topic) 
		{
		
			System.out.println(i.getText());
			
		}
		Thread.sleep(2000);
		topic.get(8).click();
		
		Thread.sleep(2000);
		
		WebElement tag1 = driver.findElement(By.xpath(".//*[@id='wrapper']/div[2]/div[2]/div[3]/div[1]/div[2]/div[3]/a"));
		String tag1name = tag1.getText();
		tag1.click();
		Thread.sleep(2000);
		String tag1url = driver.getCurrentUrl();
		char[] char_ar = tag1name.toCharArray();
		for(int i=0;i<char_ar.length;i++)
		{
			
			if(char_ar[i]==' ')
			{
				char_ar[i] = '-';
			}
			
		}
		
		String tag1name_str = new String(char_ar);
		System.out.println(tag1name_str);
		
		if(tag1url.contains(tag1name_str.toLowerCase()))
		{
			System.out.println("Url of Topic Page is Correct");
	    	APP_LOGS.debug("Url of Topic Page is Correct");
			
		}
		else
			Assert.fail("Url of Topic Page is not Correct");
		
		
		
		
		
	}
	
	@Test(priority = 2)
	public void tag_page_assertion() throws Exception
	{	
	
	//	driver.get("http://ebela.in/topic/amitabh-bachchan");
		 Thread.sleep(2000);
		
		WebElement tag1_breadcrumb = driver.findElement(By.cssSelector(".bread_crumb_active>span"));
		
		
		
		String tag1_heading = driver.findElement(By.cssSelector(".col-lg-12.col-md-12.col-sm-12.col-xs-12.both0>h1")).getText();
		
		Assert.assertEquals(tag1_breadcrumb.getText(), tag1_breadcrumb.getText());
		
		Assert.assertEquals("Amitabh Bachchan", tag1_breadcrumb.getText());
		
		
	}
	
	@Test(priority = 3)
	public void tag_page_breadcrumb() throws Exception
	{
		
		driver.findElement(By.cssSelector(".bread_crumb_active>span")).click();
		
		List<WebElement> breadcrumblist1 = driver.findElements(By.cssSelector(".bread_crumb>span>a>span"));
		breadcrumblist1.get(0).click();
		Thread.sleep(2000);
		String breadcrumb1url = driver.getCurrentUrl();
		Assert.assertEquals("https://ebela.in/", breadcrumb1url);
		
		driver.navigate().back();
		
		List<WebElement> breadcrumblist2 = driver.findElements(By.cssSelector(".bread_crumb>span>a>span"));
		breadcrumblist2.get(2).click();
		Thread.sleep(2000);
		String breadcrumb2url = driver.getCurrentUrl();
		Assert.assertEquals("https://ebela.in/topic", breadcrumb2url);
		
		driver.navigate().back();
	}
	
	@Test(priority = 4)
	public void tag_page_results() throws Exception
	{
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

				(new WebDriverWait(driver, 30))
				  .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".pagination-numbers")));
				
		Thread.sleep(2000);
		String results = driver.findElement(By.cssSelector(".pagination-numbers")).getText();
		
		if(results.contains("showing 1-12"))
		{
			
			System.out.println("Results are fine");
			
		}
		else
		{
			Assert.fail("12 results should be populated in a particular tag page");
		}
		
	}
	
	@Test(priority = 5)
	public void tag_page_story_verify() throws Exception
	{
		
		driver.get("http://ebela.in/topic/amitabh-bachchan");
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.cssSelector(".pagination-numbers")).isDisplayed());
		
		
	}
	
	@Test(priority = 6)
	public void tag_page_date_verify_story() throws Exception
	{
		
		setup();
		driver.get("http://ebela.in/topic/amitabh-bachchan");
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.cssSelector(".article-date>strong")).isDisplayed());
		driver.close();
	}
	
	@Test(priority = 7)
	public void tag_page_story_click() throws Exception
	{
		
		WebDriver driver = new FirefoxDriver();
		
	//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//	driver.get("http://www.ebela.in/");
		driver.get("http://ebela.in/topic/amitabh-bachchan");
		Thread.sleep(2000);
		List<WebElement> readmore = driver.findElements(By.cssSelector(".article-title>strong"));
		Thread.sleep(2000);
		readmore.get(2).click();
		
		Thread.sleep(2000);
		
		Assert.assertTrue(driver.findElement(By.cssSelector(".story_topstory_head")).isDisplayed());
		driver.close();
	}
	
	@Test(priority = 8)
	public void topic_page_alphabet_nav_click() throws Exception
	{
		
			setup();
		
			driver.get("http://ebela.in/topic?google_nofetch=true&param=something");
			
			Thread.sleep(2000);
			List<WebElement> alphabets= driver.findElements(By.cssSelector(".glossary-chars-span>a"));
			alphabets.get(18).click();
			Thread.sleep(2000);
			driver.close();
	}
	
	
}
