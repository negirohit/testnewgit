package homepage;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.base;
import base.pageClass;

public class epaper extends base
{

	@BeforeMethod
	public void CallSetup() throws Exception
	{
		

	}
	
	@Test(priority=1)
	public void Logo_clickable() throws Exception
	{
		
		driver.navigate().to(CONFIG.getProperty("homePage"));
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
		
		String firstwindowhandle=driver.getWindowHandle();
		pageClass pageclass1 = new pageClass();
		PageFactory.initElements(driver, pageclass1);
		
		pageclass1.epaper_click();
		Thread.sleep(2000);
		String secondwindowhandle="";
		Set<String> windowhandles=driver.getWindowHandles();
		for(String i :windowhandles)
		{
			if(i.equalsIgnoreCase(firstwindowhandle))
			{
				continue;
			}
			else
			{
				secondwindowhandle=i;
			}
		}
		
		driver.switchTo().window(secondwindowhandle);
		Thread.sleep(2000);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		APP_LOGS.debug(currentUrl);
		
		Date today = new Date();
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(today);
		
		int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
		
		SimpleDateFormat formatdate1 = new SimpleDateFormat("dd");
		String formatteddate1 = formatdate1.format(cal.getTime());
		System.out.println(formatteddate1);
		
		int month = cal.get(Calendar.MONTH) +1;
		
		SimpleDateFormat formatmonth1 = new SimpleDateFormat("MM");
		String formattedmonth1 = formatmonth1.format(cal.getTime());
		System.out.println(formattedmonth1);
		
		int year = cal.get(Calendar.YEAR);
		System.out.println(dayOfMonth+" "+month+" "+year);
		//String todays_url="http://epaper.ebela.in/paper/1-9-"+formatteddate1+"@"+formattedmonth1+"@"+year+".html";
		String todays_url="http://epaper.ebela.in/?_ga=2.124343689.2033854763.1519879288-1012290547.1519879287";
		System.out.println(todays_url);
		System.out.println("HomeTC_13");
		Assert.assertEquals(todays_url, currentUrl);
		
		Thread.sleep(2000);
		
		
		
		
		
	}
	
	
	@AfterMethod
	public void close()
	{
		
	}
	
}
