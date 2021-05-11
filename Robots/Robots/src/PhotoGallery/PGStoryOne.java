package PhotoGallery;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import abpdigital_Robots.base;

public class PGStoryOne extends base
{
	public static String heading;
	public static String h3heading;
	


	 @Test(retryAnalyzer = abpdigital_Robots.RetryAnalyzer.class)
	  public void PhotoGallery_1ststory_click() throws Exception 
	  {
		  
		  
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
		
		    

			 // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  List<WebElement> photogalleryimage = driver.findElements(By.cssSelector(".gallery-item-caption"));
			    Thread.sleep(3000);
			    photogalleryimage.get(0).click();
			   
			    wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".latest-article-heading"))));
			    
			    Thread.sleep(2000);
			    
			    h3heading= driver.findElement(By.cssSelector(".latest-article-heading")).getText();

			    APP_LOGS.debug("Photo Gallery Story One clicked");
			    
	    Assert.assertTrue(driver.findElement(By.cssSelector(".latest-article-heading")).isDisplayed());
	  
	    
	  }
	 
	 @AfterMethod
		public void close()
		{
			//driver.quit();
		}
	 
}
