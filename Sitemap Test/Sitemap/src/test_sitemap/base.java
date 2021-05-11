package test_sitemap;



import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.io.File;
import java.util.Date;
import java.util.Iterator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class base {
	public static int flag,flag1,flag2,flag3;
	public static WebDriver driver;
	public static String dynamicUser;
	public static Properties OR;
	public static Properties CONFIG;
	public static String baseurl;
	public static Logger APP_LOGS = Logger.getLogger("devpinoyLogger");
	public static String currdate;
	
	public static void setup() throws IOException, InterruptedException{
	   	
		 CONFIG =new Properties();
		 FileInputStream cn=new FileInputStream(System.getProperty("user.dir")+"\\config\\Config.properties");
		 CONFIG.load(cn);
		 
		 PropertyConfigurator.configure(System.getProperty("user.dir")+"//config//log4j.properties");
	
		    String chromedriver = CONFIG.getProperty("chromedriverpath");
	        System.setProperty("webdriver.chrome.driver", chromedriver);
	        driver = new ChromeDriver();  
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
			
			
			/*driver = new FirefoxDriver();	
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);*/
			driver.manage().window().maximize();
			
			//APP_LOGS.debug("anandbazarsitemap");
		//	APP_LOGS.debug(CONFIG.getProperty("testSiteURL"));
		//	driver.navigate().to(CONFIG.getProperty("testSiteURL"));
		//	driver.manage().window().maximize();	
	}

	
	public String datacheck()
	{
		WebElement links= driver.findElement(By.cssSelector("span.html-attribute-value"));
		System.out.println(links.getText());
		return links.getText();
	}
	
	public void SiteMapcheck(int k) throws InterruptedException, ParseException{
		
		//	driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL, "u"));
			
			List<WebElement> links= driver.findElements(By.cssSelector("span.text"));
			
			//to print all the first 30 span.text values
			int a = links.size();				
			System.out.println(a);	
			for(int i=1;i<30;i++)
			{
			String ab= links.get(i).getText();
			System.out.println("vaue of link" +i + ab );
				
			
			/* int a = links.size();		
			 System.out.println(a);
			 int flag =0;
			 Iterator<WebElement> itr = links.iterator();
			 while(itr.hasNext()) {
			    // System.out.println(itr.next());
			     System.out.println(itr.next().getText());
			     flag++;
			 }
			 System.out.println(flag);
			
		//	APP_LOGS.debug("anandbazarsitemap");
		//	APP_LOGS.debug(CONFIG.getProperty("testSiteURL"));
			 
			List<WebElement> links= driver.findElements(By.cssSelector("span.text"));
					
			
			
			 int a = links.size();				
			 System.out.println(a);	
			
			 for(int i=1;i<abc;i++)
			 {
			 String ab= links1.get(i).getText();
			
			 if(ab.contains("2017"))
			 {
				 flag++;
				 
			 }
			 
			 */
			// System.out.println("vaue of link" +i + ab );
			
			
			 }
			
		
			// to get the 1st date field
			//String currdate= links.get(12).getText();
			
			String mydate= links.get(k).getText();
			
			Pattern p = Pattern.compile("(\\d{4}-\\d{2}-\\d{2})");
			Matcher m = p.matcher(mydate);
			while(m.find())
			{
				currdate=m.group(1);
			    System.out.println(m.group(1));
			}
			 // Print the xml Date
			//System.out.println(currdate);	
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
	
	public void dateSiteMapcheck(int k) throws InterruptedException, ParseException{
		
		//	driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL, "u"));
			
			List<WebElement> links= driver.findElements(By.cssSelector("span.text"));
			
			//to print all the first 30 span.text values
			int a = links.size();				
			System.out.println(a);	
			for(int i=1;i<30;i++)
			{
			String ab= links.get(i).getText();
			System.out.println("vaue of link" +i + ab );
				
			
			/* int a = links.size();		
			 System.out.println(a);
			 int flag =0;
			 Iterator<WebElement> itr = links.iterator();
			 while(itr.hasNext()) {
			    // System.out.println(itr.next());
			     System.out.println(itr.next().getText());
			     flag++;
			 }
			 System.out.println(flag);
			
		//	APP_LOGS.debug("anandbazarsitemap");
		//	APP_LOGS.debug(CONFIG.getProperty("testSiteURL"));
			 
			List<WebElement> links= driver.findElements(By.cssSelector("span.text"));
					
			
			
			 int a = links.size();				
			 System.out.println(a);	
			
			 for(int i=1;i<abc;i++)
			 {
			 String ab= links1.get(i).getText();
			
			 if(ab.contains("2017"))
			 {
				 flag++;
				 
			 }
			 
			 */
			// System.out.println("vaue of link" +i + ab );
			
			
			 }
			
		
			// to get the 1st date field
			//String currdate= links.get(12).getText();
			
			String mydate= links.get(k).getText();
			
			Pattern p = Pattern.compile("(\\d{4}-\\d{2}-\\d{2})");
			Matcher m = p.matcher(mydate);
			while(m.find())
			{
				currdate=m.group(1);
			    System.out.println(m.group(1));
			}
			 // Print the xml Date
			//System.out.println(currdate);	
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
			
			 if(currdate.contains("2016"))
			 {
				 Assert.assertTrue(true);
				 
			 }
				else
				{
				Assert.fail();
				}
				
			// Assert.assertEquals(currdate, date1);
			 
			 APP_LOGS.debug("sitemap check complete");
				
			 
		}
	
public void RssSiteMapcheck(int k) throws InterruptedException, ParseException{
		
		//	driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL, "u"));
			
			List<WebElement> links= driver.findElements(By.cssSelector("span.text"));
			
			//to print all the first 30 span.text values
			int a = links.size();				
			System.out.println(a);	
			for(int i=1;i<30;i++)
			{
			String ab= links.get(i).getText();
			System.out.println("vaue of link" +i + ab );
				
			
			/* int a = links.size();		
			 System.out.println(a);
			 int flag =0;
			 Iterator<WebElement> itr = links.iterator();
			 while(itr.hasNext()) {
			    // System.out.println(itr.next());
			     System.out.println(itr.next().getText());
			     flag++;
			 }
			 System.out.println(flag);
			
		//	APP_LOGS.debug("anandbazarsitemap");
		//	APP_LOGS.debug(CONFIG.getProperty("testSiteURL"));
			 
			List<WebElement> links= driver.findElements(By.cssSelector("span.text"));
					
			
			
			 int a = links.size();				
			 System.out.println(a);	
			
			 for(int i=1;i<abc;i++)
			 {
			 String ab= links1.get(i).getText();
			
			 if(ab.contains("2017"))
			 {
				 flag++;
				 
			 }
			 
			 */
			// System.out.println("vaue of link" +i + ab );
			
			
			 }
			
		
			// to get the 1st date field
			//String currdate= links.get(12).getText();
			
			String mydate= links.get(k).getText();
			
			Pattern p = Pattern.compile("(\\d{4}-\\d{2}-\\d{2})");
			Matcher m = p.matcher(mydate);
			while(m.find())
			{
				currdate=m.group(1);
			    System.out.println(m.group(1));
			}
			 // Print the xml Date
			//System.out.println(currdate);	
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
			
			   //formatDate(currdate, "MMM d, yyyy HH:mm", "yyyy-MM-dd");
			 //System.out.println(formatDate("May 31, 2017 00:12", "MMM d, yyyy HH:mm", "yyyy-MM-dd"));
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


public void otherSiteMapcheck(int k) throws InterruptedException, ParseException{
	
	//	driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL, "u"));
		
		List<WebElement> links= driver.findElements(By.cssSelector("span.text"));
		
		//to print all the first 30 span.text values
		int a = links.size();				
		System.out.println(a);	
		for(int i=1;i<30;i++)
		{
		String ab= links.get(i).getText();
		System.out.println("vaue of link" +i + ab );
			
		
		/* int a = links.size();		
		 System.out.println(a);
		 int flag =0;
		 Iterator<WebElement> itr = links.iterator();
		 while(itr.hasNext()) {
		    // System.out.println(itr.next());
		     System.out.println(itr.next().getText());
		     flag++;
		 }
		 System.out.println(flag);
		
	//	APP_LOGS.debug("anandbazarsitemap");
	//	APP_LOGS.debug(CONFIG.getProperty("testSiteURL"));
		 
		List<WebElement> links= driver.findElements(By.cssSelector("span.text"));
				
		
		
		 int a = links.size();				
		 System.out.println(a);	
		
		 for(int i=1;i<abc;i++)
		 {
		 String ab= links1.get(i).getText();
		
		 if(ab.contains("2017"))
		 {
			 flag++;
			 
		 }
		 
		 */
		// System.out.println("vaue of link" +i + ab );
		
		
		 }
		
	
		// to get the 1st date field
		//String currdate= links.get(12).getText();
		
		String mydate= links.get(k).getText();
		
						 
		
		 // Create object of SimpleDateFormat class and decide the format
		 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		 
		 //get current date time with Date()
		 Date date = new Date();
		 
		 // Now format the date
		 String date1= dateFormat.format(date);
					 
		 // Print the Date
		 System.out.println(date1);
		
		 if(mydate.equals("hourly"))
		 {
			 Assert.assertTrue(true);
			 
		 }
			else
			{
			Assert.fail();
			}
			
		// Assert.assertEquals(currdate, date1);
		 
		 APP_LOGS.debug("sitemap check complete");
			
		 
	}

public void fewlinesdateSiteMapcheck(int k) throws InterruptedException, ParseException{
	
	//	driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL, "u"));
		
		List<WebElement> links= driver.findElements(By.cssSelector("span.text"));
		
		//to print all the first 30 span.text values
		int a = links.size();				
		System.out.println(a);	
		for(int i=1;i<10;i++)
		{
		String ab= links.get(i).getText();
		System.out.println("vaue of link" +i + ab );
			
		
		/* int a = links.size();		
		 System.out.println(a);
		 int flag =0;
		 Iterator<WebElement> itr = links.iterator();
		 while(itr.hasNext()) {
		    // System.out.println(itr.next());
		     System.out.println(itr.next().getText());
		     flag++;
		 }
		 System.out.println(flag);
		
	//	APP_LOGS.debug("anandbazarsitemap");
	//	APP_LOGS.debug(CONFIG.getProperty("testSiteURL"));
		 
		List<WebElement> links= driver.findElements(By.cssSelector("span.text"));
				
		
		
		 int a = links.size();				
		 System.out.println(a);	
		
		 for(int i=1;i<abc;i++)
		 {
		 String ab= links1.get(i).getText();
		
		 if(ab.contains("2017"))
		 {
			 flag++;
			 
		 }
		 
		 */
		// System.out.println("vaue of link" +i + ab );
		
		
		 }
		
	
		// to get the 1st date field
		//String currdate= links.get(12).getText();
		
		String mydate= links.get(k).getText();
		
		Pattern p = Pattern.compile("(\\d{4}-\\d{2}-\\d{2})");
		Matcher m = p.matcher(mydate);
		while(m.find())
		{
			currdate=m.group(1);
		    System.out.println(m.group(1));
		}
		 // Print the xml Date
		//System.out.println(currdate);	
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
		
		 if(currdate.contains("2016"))
		 {
			 Assert.assertTrue(true);
			 
		 }
			else
			{
			Assert.fail();
			}
			
		// Assert.assertEquals(currdate, date1);
		 
		 APP_LOGS.debug("sitemap check complete");
			
		 
	}

	
}
