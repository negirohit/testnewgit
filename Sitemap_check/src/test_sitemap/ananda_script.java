package test_sitemap;


import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ananda_script extends base {
	
	@BeforeTest
	public void openBrowser() throws InterruptedException, IOException{
		setup();
	  }
	
	@BeforeMethod
	public void openUrl() throws InterruptedException{
		driver.navigate().to(CONFIG.getProperty("view"));
		//skipHomeAd();
		Thread.sleep(1000);	
	}

	@Test(priority=1)
	public void abpSiteMap() throws InterruptedException, ParseException{
		
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
		 System.out.println(flag);
		 
		/*System.out.println(a);	
		for(int i=1;i<30;i++)
		{
		String ab= links.get(i).getText();
		System.out.println("vaue of link" +i + ab );

		}*/
		 
	}
}


