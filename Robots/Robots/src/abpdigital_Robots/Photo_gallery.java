package abpdigital_Robots;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sun.jna.platform.win32.SetupApi;

public class Photo_gallery extends base {
	
	public static String heading;
	public static String h3heading;
	WebDriver driver;
	
	/*
	@BeforeTest
	public void openBrowser() throws InterruptedException, IOException{
		
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("http://ebela.in/");
		//skipHomeAd();
		Thread.sleep(1000);	
	  }
	  
	*/
	  @Test
	  public void PhotoGallery() throws Exception {
		  
		  WebDriver driver = new FirefoxDriver();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("http://www.ebela.in/?google_nofetch=true&param=something");

	    driver.findElement(By.linkText("GALLERY")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.linkText("PHOTOS")).click();
	    
	    Thread.sleep(3000);
	
	    String page_url = driver.getCurrentUrl();	        
	//    Assert.assertEquals("http://ebela.in/photogallery?ref=hm-TopNav",page_url);
		
	//    String page_404 = driver.findElement(By.cssSelector("h1")).getText();	    
	//    Assert.assertNotEquals("404: Page not found", page_404);
	    
	    heading= driver.findElement(By.cssSelector(".ebela-pg-heading")).getText();
	    Assert.assertTrue(driver.findElement(By.cssSelector(".ebela-pg-heading")).isDisplayed());
	    
	    driver.close();
	  }
	  
	  @Test(priority=1)
	  public void PhotoGallery_1ststory_click() throws Exception 
	  {
		  
		  WebDriver driver = new FirefoxDriver();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.get("http://www.ebela.in/?google_nofetch=true&param=something");

		    driver.findElement(By.linkText("GALLERY")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.linkText("PHOTOS")).click();
		    
		    Thread.sleep(3000);
		
		    String page_url = driver.getCurrentUrl();

			 // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  List<WebElement> photogalleryimage = driver.findElements(By.cssSelector(".gallery-item-caption"));
			    Thread.sleep(3000);
			    photogalleryimage.get(0).click();
			   
			    h3heading= driver.findElement(By.cssSelector("h3.latest-article-heading")).getText();

	    
	    Assert.assertTrue(driver.findElement(By.cssSelector("h3.latest-article-heading")).isDisplayed());
	  
	    driver.close();
	  }
	  
	  @Test(priority=2)
	  public void PhotoGallery_2ndstory_click() throws Exception {
		  
		  WebDriver driver = new FirefoxDriver();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.get("http://www.ebela.in/?google_nofetch=true&param=something");

		    driver.findElement(By.linkText("GALLERY")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.linkText("PHOTOS")).click();
		    
		    Thread.sleep(3000);
		
		    String page_url = driver.getCurrentUrl();

	  
	    List<WebElement> photogalleryimage1 = driver.findElements(By.cssSelector(".gallery-item-caption"));
	    Thread.sleep(3000);
	//    Assert.assertNotEquals("404: Page not found", page_404);	    
	    photogalleryimage1.get(1).click();
	    h3heading= driver.findElement(By.cssSelector("h3.latest-article-heading")).getText();
	    Assert.assertTrue(driver.findElement(By.cssSelector("h3.latest-article-heading")).isDisplayed());
	    
	    driver.close();
	  }
	  
	  @Test(priority=3)
	  public void PhotoGallery_3rdstory_click() throws Exception {
		  
		  WebDriver driver = new FirefoxDriver();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.get("http://www.ebela.in/?google_nofetch=true&param=something");

		    driver.findElement(By.linkText("GALLERY")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.linkText("PHOTOS")).click();
		    
		    Thread.sleep(3000);
		
		    String page_url = driver.getCurrentUrl();

		  
		  List<WebElement> photogalleryimage2 = driver.findElements(By.cssSelector(".gallery-item-caption"));
	    Thread.sleep(3000);
	    photogalleryimage2.get(2).click();
	    h3heading= driver.findElement(By.cssSelector("h3.latest-article-heading")).getText();
	  
	   Assert.assertTrue(driver.findElement(By.cssSelector("h3.latest-article-heading")).isDisplayed());
	    driver.close();
	  }
	 /* 
	  @AfterClass
		public void CloseDriver () throws Exception {
			   driver.quit();	   
		}
		*/
}
