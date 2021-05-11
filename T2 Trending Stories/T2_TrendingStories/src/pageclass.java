import java.io.File;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.time.DateUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class pageclass extends base
{

	
	
	
	public void storyload() throws IOException, InterruptedException
	{
		
		setup();
		driver.navigate().to("http://t2online.com/entertainment/saif-ali-khan-goes-back-to-the-blues-for-a-tv-show/cid/1.66354");
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
		
	}
	
	public String trending_click1(int i) throws IOException, InterruptedException
	{
		
		
		storyload();
		
	    WebElement trending1 = driver.findElement(By.xpath("html/body/div[4]/div/div[2]/div["+i+"]/article/div[1]/a/img"));
		trending1.click();
		Thread.sleep(2000);
		String trending1url = driver.getCurrentUrl();
		
		driver.close();
		
	    return trending1url;
	}
	
	public String find_curdate()
	{
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		 
		 //get current date time with Date()
		 Date date = new Date();
		 
		 // Now format the date
		 String date1= dateFormat.format(date);
		
		 String current_dateformat=date1 + "T14:00:00.000Z";
		 
		 // Print the Date
		System.out.println(current_dateformat);
		
		return current_dateformat;
		
	}
	
	public String find_prevdate()
	{
	
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		 
		Date daybyesterday = DateUtils.addDays(new Date(), -2);
		String daybyesterdaydate = dateFormat.format(daybyesterday);
		 
		String daybfryesturday_dateformat= daybyesterdaydate +"T14:00:00.000Z";
		System.out.println(daybfryesturday_dateformat);
		 
		return daybfryesturday_dateformat;
	}
	
	
}
