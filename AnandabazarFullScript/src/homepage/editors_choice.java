package homepage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.PageClass;
import base.ebela_base;

public class editors_choice extends ebela_base
{

	@BeforeMethod
	public void openBrowser() throws Exception
	{
		setup();
		
	}
	
	@Test
	public void editors_choice() throws Exception
	{
		
		driver.navigate().to("http://www.anandabazar.com?ref=hm-topnav");
		//skipHomeAd();
		Thread.sleep(1000);	
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(3000);
		PageClass pageclass = new PageClass();
		PageFactory.initElements(driver, pageclass);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(5000);
		
	}
	
}
