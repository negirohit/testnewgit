package test_sitemap;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	public static int flag,flag1,flag2,flag3;
	public static WebDriver driver;
	public static String dynamicUser;
	public static Properties OR;
	public static Properties CONFIG;
	public static String baseurl;
	public static Logger APP_LOGS = Logger.getLogger("devpinoyLogger");
	
	
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

}
