package AnandBazarTest;

	import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
	 
	public class TestBase {
	 
		 public static  WebDriver driver ;
		 public static String emailid ="";
			public static String dynamicUser;
			public static Properties OR;
			public static Properties CONFIG;
			public static String baseurl;
			
	 
	 @SuppressWarnings("deprecation")
	@BeforeTest
		@Parameters({"BrowserName"})
		 public static WebDriver BrowserFactory(@Optional("chrome") String BrowserName) throws IOException {
		 CONFIG =new Properties();
		 FileInputStream cn=new FileInputStream(System.getProperty("user.dir")+"\\config\\Config.properties");
		 CONFIG.load(cn);
		 
		
	
		 	String chromedriver = System.getProperty("user.dir") + "\\drivers\\chromedriver.exe";
	        System.setProperty("webdriver.chrome.driver", chromedriver);
	       // adblock();

			//ChromeOptions options = new ChromeOptions();
			//options.addArguments("load-extension=C:\\Content\\1.13.4_0");
			//DesiredCapabilities capabilities = new DesiredCapabilities();
			//capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	        //driver = new ChromeDriver(capabilities); 
	        driver = new ChromeDriver(); 
		//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
			
			/*driver = new FirefoxDriver();	
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);*/
			driver.manage().window().maximize();
			
			
		//	driver.navigate().to(CONFIG.getProperty("testSiteURL"));
		//	driver.manage().window().maximize();	

		 
//				File file = new File("drivers\\geckodriver.exe");
//				System.out.println(file.getAbsolutePath());
//				System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
////				 DesiredCapabilities capabilities = new DesiredCapabilities();
////
////				 capabilities = DesiredCapabilities.firefox();
////				 capabilities.setBrowserName("Firefox");
////				 capabilities.setPlatform(Platform.WINDOWS);
////				 capabilities.setCapability("marionette", false);
//				
//				 File pathBinary = new File("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
//				 FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);   
//				 DesiredCapabilities desired = DesiredCapabilities.firefox();
//				 FirefoxOptions options = new FirefoxOptions();
//				 desired.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options.setBinary(firefoxBinary));
//				 driver = new FirefoxDriver(options);
//	                 
			        if(BrowserName.equals("chrome"))
			        {
			            driver.manage().window().maximize();
			            driver.get("https://anandautsav.anandabazar.com/");
			        }
			        return driver;

			    }
	 
	 @AfterTest
	 public void afterClass() {
		 waitFor(90);
			driver.close();
		}
	 
	    
	 public void waitFor(int seconds) {
		 driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	 }
	 
	 public void scroll() {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,500)");
	 }

	}

