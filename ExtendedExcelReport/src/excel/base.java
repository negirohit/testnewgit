package excel;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class base 
{

	public static WebDriver driver;
	public static String dynamicUser;
	public static Properties OR;
	public static Properties CONFIG;
	public static String baseurl;
	public static Logger APP_LOGS = Logger.getLogger("devpinoyLogger");
	
	
	public static List<String> itemsToAdd = new ArrayList<String>();
	
   //@BeforeClass
	public static void setup() throws IOException, InterruptedException{
		 
		
		 CONFIG =new Properties();
		 FileInputStream cn=new FileInputStream(System.getProperty("user.dir")+"\\config\\config.properties");
		 CONFIG.load(cn);
		 
		 PropertyConfigurator.configure(System.getProperty("user.dir")+"//config//log4j.properties");
	
		    String chromedriver = CONFIG.getProperty("chromedriverpath");
	        System.setProperty("webdriver.chrome.driver", chromedriver);
	        driver = new ChromeDriver();  
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
			
			
			/*driver = new FirefoxDriver();	
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);*/
			driver.manage().window().maximize();
			
			//APP_LOGS.debug("anandbazartest");
			//APP_LOGS.debug(CONFIG.getProperty("testSiteURL"));
		//	driver.navigate().to(CONFIG.getProperty("testSiteURL"));
		//	driver.manage().window().maximize();	
	}
	
	public void exceldataweb(int i,String url , int c ) throws Exception
	{	
		
		driver.findElement(By.id("url")).sendKeys(url);
		Thread.sleep(5000);	
		
		driver.findElement(By.cssSelector(".start_test")).click();
		Thread.sleep(42000);
	
/*
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		 Thread.sleep(4000);
	
		Actions action = new Actions(driver);
	    action.sendKeys(Keys.PAGE_DOWN);
	   Thread.sleep(2000);
	*/	
		
		//List<WebElement> pingdom_stat1= driver.findElements(By.cssSelector("div.rbc-summary-info-value"));
		
		//System.out.println(pingdom_stat1.size());
		try{
			
		
		String time = driver.findElement(By.id("fvFullyLoaded")).getText();
		String requests = driver.findElement(By.id("fvRequests")).getText();
		String BytesIN = driver.findElement(By.id("fvBytesIn")).getText();
		String certificates = driver.findElement(By.id("fvCertificateBytes")).getText();
		
		
		// Create object of SimpleDateFormat class and decide the format
				 DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
				 
				 //get current date time with Date()
				 Date date = new Date();
				 
				 // Now format the date
				 String date1= dateFormat.format(date);
				 
				 // Print the Date
				 System.out.println(date1);
				 	
				 	System.out.println("Load Time "+ time);
					System.out.println("Requests"+ requests);
					System.out.println("Bytes In "+ BytesIN);
					System.out.println("Certificates "+ certificates);
					
					 
				 
				 File excelFile = new File("D:\\Project\\ExtendedExcelReport\\screenshots\\ABPDigital_stats.xls");

			        WritableWorkbook book;
			        WritableSheet sheet;
			        Workbook existingBook = null;

			 /*       if (!excelFile.exists()) {
			            book = Workbook.createWorkbook(excelFile);
			            sheet = book.createSheet("SECTIONPAGE", 1);
			            
			        } else {
			   */
			            existingBook = Workbook.getWorkbook(excelFile);
			            book = Workbook.createWorkbook(excelFile, existingBook);
			            sheet = book.getSheet(i);
			   //   }
		            //int row =0;
		            //row=sheet.getRows();
		           // row=row+1;
			        
			        //Label p = new Label(0,row,date1);
			        Label m = new Label(c, 4, time);
			        Label n = new Label(c, 6, requests);
			        Label r = new Label(c, 5, BytesIN);
			        //Label s = new Label(4, row, certificates);
			        //sheet.addCell(p);
			        sheet.addCell(m);
			        sheet.addCell(n);
			        sheet.addCell(r);
			        //sheet.addCell(s);
			  /*      
			        int n=1;
			        for(int column=1;column<=4;column++)
			        {
			        	
			        	Label m = new Label(column, row, pingdom_stat1.get(n).getText());
			        	sheet.addCell(m);
			        	n++;
			        }
			        
			    */    
			        
			        book.write();
			        book.close();

			        if (existingBook != null)
			            existingBook.close();
					}
		
					catch (Exception e) 
					{
						System.out.println("Issue here");
					}
					finally 
					{
					
						System.out.println("1 time done");
				        driver.close();
				        setup();
				        driver.navigate().to(CONFIG.getProperty("testSiteURL"));
				        Thread.sleep(2000);
						
					}
			        
   		}
	public void exceldatagt(int i,String url , int c) throws Exception
	{
		
		driver.findElement(By.cssSelector(".js-analyze-form-url")).sendKeys(url);
		Thread.sleep(5000);	
		
		driver.findElement(By.cssSelector(".analyze-form-button>button")).click();
		Thread.sleep(42000);
		
		try{
			
			List<WebElement> gtdata = driver.findElements(By.cssSelector(".report-page-detail-value"));
			System.out.println(gtdata.size());
			
			System.out.println("Page Load Time"+ gtdata.get(0).getText());
			System.out.println("Total Page Size"+ gtdata.get(1).getText());
			System.out.println("Requests"+ gtdata.get(2).getText());

			
			
			
			
			// Create object of SimpleDateFormat class and decide the format
					 DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
					 
					 //get current date time with Date()
					 Date date = new Date();
					 
					 // Now format the date
					 String date1= dateFormat.format(date);
					 
					 // Print the Date
					 System.out.println(date1);
					 	

						
						 
					 
					 File excelFile = new File("D:\\Project\\ExtendedExcelReport\\screenshots\\ABPDigital_stats.xls");

				        WritableWorkbook book;
				        WritableSheet sheet;
				        Workbook existingBook = null;

				 /*       if (!excelFile.exists()) {
				            book = Workbook.createWorkbook(excelFile);
				            sheet = book.createSheet("SECTIONPAGE", 1);
				            
				        } else {
				   */
				            existingBook = Workbook.getWorkbook(excelFile);
				            book = Workbook.createWorkbook(excelFile, existingBook);
				            sheet = book.getSheet(i);
				   //   }
			            //int row =0;
			            //row=sheet.getRows();
			           // row=row+1;
				        
				        //Label p = new Label(0,row,date1);
				        Label m = new Label(c,9, gtdata.get(0).getText());
				        Label n = new Label(c,10, gtdata.get(1).getText());
				        Label r = new Label(c,11, gtdata.get(2).getText());
				        //Label s = new Label(4, row, certificates);
				        //sheet.addCell(p);
				        sheet.addCell(m);
				        sheet.addCell(n);
				        sheet.addCell(r);
				        //sheet.addCell(s);
				  /*      
				        int n=1;
				        for(int column=1;column<=4;column++)
				        {
				        	
				        	Label m = new Label(column, row, pingdom_stat1.get(n).getText());
				        	sheet.addCell(m);
				        	n++;
				        }
				        
				    */    
				        List<WebElement> gtdata1 = driver.findElements(By.cssSelector(".report-score-percent"));
				        WebElement SpeedScore = driver.findElement(By.cssSelector(".report-score-grade.color-grade-D"));
				        WebElement YSlowScore = driver.findElement(By.cssSelector(".report-score-grade.color-grade-C"));
				        System.out.println("Page Speed Score"+ SpeedScore.getText());
				        System.out.println("Page YSlow Score"+ YSlowScore.getText());
				        
				        Label u = new Label(c,12, SpeedScore.getText());
				        Label v = new Label(c,13, YSlowScore.getText());
				        
				        sheet.addCell(u);
				        sheet.addCell(v);
				        
				        Thread.sleep(2000);
				        
				        book.write();
				        book.close();

				        if (existingBook != null)
				            existingBook.close();
						}
			
						catch (Exception e) 
						{
							System.out.println("Issue here");
						}
						
					
						finally 
						{
						
							System.out.println("1 time done");
					        driver.close();
					        setup();
					        driver.navigate().to(CONFIG.getProperty("gtmetrixURL"));
					        Thread.sleep(2000);
							
						}
		
	}
	public void exceldatapd(int i,String url , int c) throws Exception
	{
		driver.findElement(By.id("urlinput")).sendKeys(url);
		Thread.sleep(5000);	
		driver.findElement(By.cssSelector("button.button.button-big.button-green.button-starttest")).click();
		Thread.sleep(42000);

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		 Thread.sleep(4000);
	
		Actions action = new Actions(driver);
	    action.sendKeys(Keys.PAGE_DOWN);
	   Thread.sleep(2000);
		
      	
		Thread.sleep(2000);
		
		
		
		
		
		
		
		try{
			
			List<WebElement> pingdom_stat1= driver.findElements(By.cssSelector("div.rbc-summary-info-value"));
			
			System.out.println(pingdom_stat1.size());
			
			
			System.out.println("Page Load Time"+ pingdom_stat1.get(1).getText());
			//System.out.println("Faster than"+ pingdom_stat1.get(2).getText());
			System.out.println("Page size"+ pingdom_stat1.get(3).getText());
			System.out.println("Requests "+ pingdom_stat1.get(4).getText());

			
			
			
			
			// Create object of SimpleDateFormat class and decide the format
					 DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
					 
					 //get current date time with Date()
					 Date date = new Date();
					 
					 // Now format the date
					 String date1= dateFormat.format(date);
					 
					 // Print the Date
					 System.out.println(date1);
					 	

						
						 
					 
					 File excelFile = new File("D:\\Project\\ExtendedExcelReport\\screenshots\\ABPDigital_stats.xls");

				        WritableWorkbook book;
				        WritableSheet sheet;
				        Workbook existingBook = null;

				 /*       if (!excelFile.exists()) {
				            book = Workbook.createWorkbook(excelFile);
				            sheet = book.createSheet("SECTIONPAGE", 1);
				            
				        } else {
				   */
				            existingBook = Workbook.getWorkbook(excelFile);
				            book = Workbook.createWorkbook(excelFile, existingBook);
				            sheet = book.getSheet(i);
				   //   }
			            //int row =0;
			            //row=sheet.getRows();
			           // row=row+1;
				        
				        //Label p = new Label(0,row,date1);
				        Label m = new Label(c,16, pingdom_stat1.get(1).getText());
				//        Label n = new Label(c,11, pingdom_stat1.get(2).getText());
				        Label r1 = new Label(c,17, pingdom_stat1.get(3).getText());
				        Label c1 = new Label(c,18, pingdom_stat1.get(4).getText());
				        //Label s = new Label(4, row, certificates);
				        //sheet.addCell(p);
				        sheet.addCell(m);
				  //      sheet.addCell(n);
				        sheet.addCell(r1);
				        sheet.addCell(c1);
				        //sheet.addCell(s);
				  /*      
				        int n=1;
				        for(int column=1;column<=4;column++)
				        {
				        	
				        	Label m = new Label(column, row, pingdom_stat1.get(n).getText());
				        	sheet.addCell(m);
				        	n++;
				        }
				        
				    */    
				        
				        book.write();
				        book.close();

				        if (existingBook != null)
				            existingBook.close();
						}
			
						catch (Exception e) 
						{
							System.out.println("Issue here");
						}
						
					
						finally 
						{
						
							System.out.println("1 time done");
					        driver.close();
					        setup();
					        driver.navigate().to(CONFIG.getProperty("pingdomURL"));
					        Thread.sleep(2000);
							
						}
		
	}
	
}
