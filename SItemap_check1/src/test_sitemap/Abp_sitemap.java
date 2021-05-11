package test_sitemap;



import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

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

public class Abp_sitemap extends base{
	
	
	
	@BeforeTest
	public void openBrowser() throws InterruptedException, IOException{
		setup();
	  }
	
	@BeforeMethod
	public void openUrl() throws InterruptedException{
		driver.navigate().to(CONFIG.getProperty("testSiteURL"));
		APP_LOGS.debug("anandbazarsitemap");
		APP_LOGS.debug(CONFIG.getProperty("testSiteURL"));
		//skipHomeAd();
		Thread.sleep(1000);	
	}

	
	@Test(priority=0)
	public void abpSiteMapCheck() throws InterruptedException, ParseException{
		
		/*driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL, "u"));
		
		List<WebElement> links= driver.findElements(By.cssSelector("span.html-tag"));
		
		//to print all the first 30 span.text values
		 int a = links.size();		
		 System.out.println(a);
		 int flag =0;
		 Iterator<WebElement> itr = links.iterator();
		 while(itr.hasNext()) {
		     System.out.println(itr.next());
		     flag++;
		 }
		 System.out.println(flag);*/
		
	//	APP_LOGS.debug("anandbazarsitemap");
	//	APP_LOGS.debug(CONFIG.getProperty("testSiteURL"));
		 
		List<WebElement> links= driver.findElements(By.cssSelector("span.text"));
				
		
		 int a = links.size();				
		 System.out.println(a);	
		
		 for(int i=1;i<a;i++)
		 {
		 String ab= links.get(i).getText();
		
		 if(ab.contains("2017"))
		 {
			 flag++;
			 
		 }
		 
		 
		// System.out.println("vaue of link" +i + ab );
		
		
		 }
		
		 System.out.println(" Total Number of articles are" + flag );
		 
		 APP_LOGS.debug(" Total Number of articles in ABP are -" + flag);
		// to get the 1st date field
		String currdate= links.get(19).getText();
		
		 // Print the xml Date
		System.out.println(currdate);				 
		
		 // Create object of SimpleDateFormat class and decide the format
		 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		 
		 //get current date time with Date()
		 Date date = new Date();
		 
		 // Now format the date
		 String date1= dateFormat.format(date);
					 
		 // Print the Date
		 System.out.println(date1);
		
			if(currdate.equals(date1))
				
			{
			System.out.println("date field is correct");
			}
			else
			{
			System.out.println("date field is incorrect"+ currdate);
			}
			
		 Assert.assertEquals(currdate, date1);
		 
		 APP_LOGS.debug("sitemap check complete");
			
		 
	}
	
	
	
	
	

	@AfterClass
	public void closedriver(){
		driver.quit();
	}
	
	
	@AfterMethod
	public void takeScreenShotOnFailure(ITestResult testResult) throws IOException { 
        if (testResult.getStatus() == ITestResult.FAILURE) { 
                
               File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File(CONFIG.getProperty("scrfolder")+ testResult.getName()+".jpg"));
                  
               }
	}
}
	
//to print all the first 30 span.text values
/* int a = links.size();				
System.out.println(a);	
for(int i=1;i<30;i++)
{
String ab= links.get(i).getText();
System.out.println("vaue of link" +i + ab );

///////////////////////////////////////////
 * 
 * // get the text of the body element
WebElement body = driver.findElement(By.tagName("body"));
String bodyText = body.getText();

// count occurrences of the string
int count = 0;

// search for the String within the text
while (bodyText.contains("VIM LIQUID MARATHI")){

    // when match is found, increment the count
    count++;

    // continue searching from where you left off
    bodyText = bodyText.substring(bodyText.indexOf("VIM LIQUID MARATHI") + "VIM LIQUID MARATHI".length());
}
 */

