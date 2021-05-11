package test_sitemap;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacebookInstantarticle extends base {
	

	@BeforeTest
	public void openBrowser() throws InterruptedException, IOException{
		setup();
	  }
	
	@BeforeMethod
	public void openUrl() throws InterruptedException{
		driver.navigate().to("https://ebela.in/ebela-rss-feed.xml");
		APP_LOGS.debug("anandbazarsitemap");
		APP_LOGS.debug("https://ebela.in/ebela-rss-feed.xml");
		//skipHomeAd();
		Thread.sleep(1000);	
	}

	@Test(priority=0)
	public void ebelainstantarticlecheck() throws InterruptedException, ParseException{
		
//driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL, "u"));
		
		List<WebElement> links= driver.findElements(By.cssSelector("span.html-tag"));
		
		//to print all the first 30 span.text values
		
	/*	int a = links.size();		
		 System.out.println(a);
		 int flag =0;
		 Iterator<WebElement> itr = links.iterator();
		 while(itr.hasNext()) {
		     System.out.println(itr.next().getText());
		     flag++;
		 }
		 System.out.println(flag); */
		 
		 
		List<WebElement> links1= driver.findElements(By.cssSelector("span.text"));
		
		
		 int abc = links1.size();				
		 System.out.println(abc);	
		
		 for(int i=1;i<abc;i++)
		 {
		 String ab= links1.get(i).getText();
		
		 if(ab.contains("2017"))
		 {
			 flag++;
			 
		 }
		 
		 
		// System.out.println("vaue of link" +i + ab );
		
		
		 }
		
		 System.out.println(" Total Number of articles are" + flag );
		 
		 APP_LOGS.debug(" Total Number of articles in ABP are -" + flag);
		
			
		 
	}
	

	@AfterClass
	public void closedriver(){
		driver.quit();
	}
	
	
	@AfterMethod
	public void takeScreenShotOnFailure(ITestResult testResult) throws IOException { 
       if (testResult.getStatus() == ITestResult.FAILURE) { 
               
              File scrFile = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.FILE);
       FileUtils.copyFile(scrFile, new File(CONFIG.getProperty("scrfolder")+ testResult.getName()+".jpg"));
                 
              }
	

}
}
