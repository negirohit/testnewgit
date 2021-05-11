package abpdigital_Robots;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sun.jna.platform.win32.SetupApi;

public class Photo_gallery extends base {
	
	public static String heading;
	public static String h3heading;
	WebDriverWait wait;
	
	 @BeforeMethod
	 @Parameters("browser_name")
	  public void startdriver(String browser_name) throws Exception {
	    
	
		String testname = "Ebela Photo Gallery Test Cases";
		setup(browser_name,testname);
		
		
	}
	 
	  @Test(priority=4)
	  public void PhotoGallery() throws Exception {
		  
		
		driver.navigate().to("http://www.ebela.in/?google_nofetch=true&param=something");
		
		Thread.sleep(5000);
	    
	   // WebElement element = driver.findElement(By.cssSelector("#pe_close_btn"));
	    //element.click();
	    
		
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
	    
	    
	  }
	  
	  @Test(priority=1)
	  public void PhotoGallery_1ststory_click() throws Exception 
	  {
		  
		    
		    
		    driver.navigate().to("http://www.ebela.in/entertainment?google_nofetch=true&param=something");
		    
		    Thread.sleep(5000);
		    
		    //WebElement element = driver.findElement(By.cssSelector("#pe_close_btn"));
		    //element.click();
		    
		    Thread.sleep(3000);
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
	  
	    
	  }
	  
	  @Test(priority=2)
	  public void PhotoGallery_2ndstory_click() throws Exception {
		  
		  
		    driver.get("http://www.ebela.in/?google_nofetch=true&param=something");

		    Thread.sleep(5000);
		    
		    //WebElement element = driver.findElement(By.cssSelector("#pe_close_btn"));
		    //element.click();
		    
		    
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
	    
	    
	  }
	  
	  @Test(priority=3)
	  public void PhotoGallery_3rdstory_click() throws Exception {
		  		    
		    driver.get("http://www.ebela.in/?google_nofetch=true&param=something");
		    
		    Thread.sleep(5000);
		    
		    //WebElement element = driver.findElement(By.cssSelector("#pe_close_btn"));
		    //element.click();
		    
		   
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
	    
	  }
	 
	  public void planner_page_wait(WebElement element,int i)
		{
			wait = new WebDriverWait(this.driver, i);
			wait.until(ExpectedConditions.visibilityOf(element));
		}
	  
	  @AfterMethod
	  public void teardown(ITestResult result) 
		{
		
				((JavascriptExecutor)driver).executeScript("sauce:job-result=" + (result.isSuccess() ? "passed" : "failed"));
				driver.quit();
				System.out.println("Closing the browser");
				System.out.println("--------------------");
						
		}
}
