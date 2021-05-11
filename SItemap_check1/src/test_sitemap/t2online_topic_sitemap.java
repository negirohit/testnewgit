package test_sitemap;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.time.DateUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class t2online_topic_sitemap extends base{
	
public static String currdate;
	
	@BeforeTest
	public void openBrowser() throws InterruptedException, IOException{
		setup();
	  }
	
	@BeforeMethod
	public void openUrl() throws InterruptedException{
		driver.navigate().to(CONFIG.getProperty("testSiteURL3"));
	
		Thread.sleep(1000);	
	}
	
	@Test
	public void T2onlinesSiteMapCheck() throws InterruptedException, ParseException{

		
		List<WebElement> links= driver.findElements(By.cssSelector("span.text"));
		
		/////////////////////
		int a = links.size();				
			System.out.println(a);	
		 
		 
		 for(int i=1;i<a;i++)
		 {
		 String ab= links.get(i).getText();
		
		 if(ab.contains("2017"))
		 {
			 flag2++;
			 
		 }		
		 }
		
		 System.out.println(" Total Number of articles are" + flag1 );
		 APP_LOGS.debug(" Total Number of articles In Anandabazar are - " + flag);
		 APP_LOGS.debug(" Total Number of articles In Ebela are - " + flag1);
		 APP_LOGS.debug(" Total Number of Topics In T2Online are - " + flag2);

			// to get the 1st date field
			String mydate= links.get(4).getText();
			
			Pattern p = Pattern.compile("(\\d{4}-\\d{2}-\\d{2})");
			Matcher m = p.matcher(mydate);
			while(m.find())
			{
				currdate=m.group(1);
			    System.out.println(m.group(1));
			}
			 // Print the xml Date
			//System.out.println(currdate);				 
			
			 // Create object of SimpleDateFormat class and decide the format
			 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			 
			 //get current date time with Date()
			 Date date = new Date();
			 
			 // Now format the date
			 String date1= dateFormat.format(date);
			 
			 // Print the Date
			 System.out.println(date1);
			
			 
			// yesterday date
			 Date yesterday = DateUtils.addDays(new Date(), -1);
							 
			 String yesterdaydate = dateFormat.format(yesterday);
			 
			//Day before yesterday date
			 
			 Date daybyesterday = DateUtils.addDays(new Date(), -2);
				
			 String daybyesterdaydate = dateFormat.format(daybyesterday);
			 
			 
				if(currdate.equals(date1)||currdate.equals(yesterdaydate)||currdate.equals(daybyesterdaydate))
					
				{
				System.out.println("date field is correct");
				}				
				else
				{
				System.out.println("date field is incorrect"+ currdate);
				}
				
			// Assert.assertEquals(currdate, date1||yesterdaydate);
			 
			 
				

	}
	
	
	
	
	

}
