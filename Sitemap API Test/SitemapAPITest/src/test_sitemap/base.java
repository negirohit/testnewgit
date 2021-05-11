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
	   	
		 		 
		 PropertyConfigurator.configure(System.getProperty("user.dir")+"//config//log4j.properties");
	
		   
	}
	

}
