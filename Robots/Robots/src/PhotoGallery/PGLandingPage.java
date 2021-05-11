package PhotoGallery;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import abpdigital_Robots.base;

public class PGLandingPage extends base
{
	public static String heading;
	public static String h3heading;
	
	
	
	@Test(retryAnalyzer = abpdigital_Robots.RetryAnalyzer.class)
	  public void PhotoGallery() throws Exception {
		  
			
		 
		 
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.get("http://www.ebela.in/?google_nofetch=true&param=something");
			driver.navigate().refresh();
	    driver.findElement(By.linkText("GALLERY")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.linkText("PHOTOS")).click();
	   
	    driver.navigate().refresh();
	    WebDriverWait wait = new WebDriverWait(driver, 30);
	    wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".ebela-pg-heading"))));
	    Thread.sleep(3000);
	    
	    //String page_url = driver.getCurrentUrl();	        
	//    Assert.assertEquals("http://ebela.in/photogallery?ref=hm-TopNav",page_url);
		
	//    String page_404 = driver.findElement(By.cssSelector("h1")).getText();	    
	//    Assert.assertNotEquals("404: Page not found", page_404);
	   
	    
	    heading= driver.findElement(By.cssSelector(".ebela-pg-heading")).getText();
	    APP_LOGS.debug("Photogallery landing Page Test Case Passed");
	    Assert.assertTrue(driver.findElement(By.cssSelector(".ebela-pg-heading")).isDisplayed());
	    
	    
	  }
	
	@AfterMethod
	public void close()
	{
		//driver.quit();
	}
	
}
