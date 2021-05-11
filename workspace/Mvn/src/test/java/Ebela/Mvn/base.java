package Ebela.Mvn;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class base 
{

	public static String emailid ="";
	public static WebDriver driver;
	public static String dynamicUser;
	public static Properties OR;
	public static Properties CONFIG;
	public static String baseurl;
	public static Logger APP_LOGS = Logger.getLogger("devpinoyLogger");
	public static ExtentReports extentReport;
	public static ExtentTest extentTest;
	public static EventFiringWebDriver firingdriver;
	public static List<String> itemsToAdd = new ArrayList<String>();

	
	public static void SetUp() throws Exception
	{
		
		 CONFIG =new Properties();
		 FileInputStream cn=new FileInputStream(System.getProperty("user.dir")+"\\config\\Config.properties");
		 CONFIG.load(cn);
		 
		 PropertyConfigurator.configure(System.getProperty("user.dir")+"//config//log4j.properties");
	
		 	String chromedriver = CONFIG.getProperty("chromedriverpath");
	        System.setProperty("webdriver.chrome.driver", chromedriver);
	        driver = new ChromeDriver();
	        
		//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
			
			/*driver = new FirefoxDriver();	
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);*/
	        driver.manage().window().maximize();
			
			APP_LOGS.debug("anandbazartest");
			APP_LOGS.debug(CONFIG.getProperty("homePage"));
		//	driver.navigate().to(CONFIG.getProperty("testSiteURL"));
		//	driver.manage().window().maximize();	
		
	}	
	
	@BeforeSuite
	public void call() throws Exception, Exception
	{
		extentReport = new ExtentReports("C://Content//Debs Backup//Project//Mvn//screenshots//test_reportv2.html", true);
		extentReport.addSystemInfo("Ebela Automation Test", "Testing of homepage, sectionpage, searchpage");
	}
	
	@AfterSuite
	public void end()
	{
		extentReport.flush();
	}
}
