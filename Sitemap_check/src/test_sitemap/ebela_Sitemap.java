package test_sitemap;


import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class ebela_Sitemap extends base{
	
	
	
	@BeforeTest
	public void openBrowser() throws InterruptedException, IOException{
		setup();
	  }
	
	@BeforeMethod
	public void openUrl() throws InterruptedException{
		driver.navigate().to(CONFIG.getProperty("testSiteURL1"));
	//	APP_LOGS.debug("Ebelasitemap");
	//	APP_LOGS.debug(CONFIG.getProperty("testSiteURL1"));
		//skipHomeAd();
		Thread.sleep(1000);	
	}
	
	@Test
	public void ebelaSiteMap() throws InterruptedException, ParseException{
		
	//	APP_LOGS.debug("Ebelasitemap");
	//	APP_LOGS.debug(CONFIG.getProperty("testSiteURL1"));
		
		List<WebElement> links= driver.findElements(By.cssSelector("span.text"));
		
		/////////////////////
		 int a = links.size();				
		 System.out.println(a);	
		
		 for(int i=1;i<a;i++)
		 {
		 String ab= links.get(i).getText();
		
		 if(ab.contains("2016"))
		 {
			 flag1++;
			 
		 }
		 
		 
		// System.out.println("vaue of link" +i + ab );
		
		
		 }
		
		 System.out.println(" Total Number of articles are" + flag1 );
		 APP_LOGS.debug(" Total Number of articles In Anandabazar are - " + flag);
		 APP_LOGS.debug(" Total Number of articles In Ebela are - " + flag1);
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
			 
		//	 APP_LOGS.debug("Ebela sitemap checked");
				

	}
	
	@AfterMethod
	public void after_method() throws InterruptedException{
		
		driver.close();
		
			
		
	}
}
