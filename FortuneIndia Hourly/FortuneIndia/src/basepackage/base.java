package basepackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class base 
{


	public static WebDriver driver;
	public static String dynamicUser;
	public static Properties OR;
	public static Properties CONFIG;
	public static String baseurl;
	public static Logger APP_LOGS = Logger.getLogger("devpinoyLogger");
	
	
	//public static List<String> itemsToAdd = new ArrayList<String>();
	
   //@BeforeClass
	public static void setup(String browser_name,String testname) throws IOException, InterruptedException{
   	
		 CONFIG =new Properties();
		 FileInputStream cn=new FileInputStream(System.getProperty("user.dir")+"\\config\\config.properties");
		 CONFIG.load(cn);
		 
		 PropertyConfigurator.configure(System.getProperty("user.dir")+"//config//log4j.properties");
		 browser(browser_name,testname);
		 
	}
	
	
	public static void browser(String browser,String testname) throws MalformedURLException
	{
		//String browser="chrome-win-saucelabs";
		
		String URL = "https://DebadityaB:3fb1057d-a901-42d5-8a2a-6fda52e0b1ab@ondemand.saucelabs.com:443/wd/hub";
		DesiredCapabilities caps=null;
		
		switch(browser.toLowerCase())
		{
		
		case "chrome-win-saucelabs":
			
		caps = DesiredCapabilities.chrome();
		caps.setCapability("name", testname);
		caps.setCapability("platform", "Windows 10");
		caps.setCapability("version", "67.0");
		caps.setCapability("screenResolution", "1280x960");
		caps.setCapability("extendedDebugging" , "true");
		
		break;
		
		case "safari-saucelabs":
			
			caps = DesiredCapabilities.safari();
			caps.setCapability("name", testname);
			caps.setCapability("platform", "macOS 10.12");
			caps.setCapability("version", "11.0");
			caps.setCapability("screenResolution", "1280x960");
			caps.setCapability("extendedDebugging" , "true");
			
			break;
			
		case "firefox-win-saucelabs":
			
			caps = DesiredCapabilities.firefox();
			caps.setCapability("name", testname);
			caps.setCapability("platform", "Windows 10");
			caps.setCapability("version", "61.0");
			caps.setCapability("screenResolution", "1280x960");
			caps.setCapability("extendedDebugging" , "true");
			
			break;
			
		default:
		System.out.println("Please enter a correct browser value to test in SauceLabs");	
		break;	
		
		}
		
		
		driver= new RemoteWebDriver(new URL(URL), caps);
		
		
	}
}
