

import java.util.EventListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class CallEvent 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		EventFiringWebDriver firingdriver = new EventFiringWebDriver(driver);
		firingdriver.navigate().to("http://learn-automation.com/advance-selenium-webdriver-tutorials/");
		Thread.sleep(3000);
		
		WebElement mtlink = firingdriver.findElement(By.id("kpc"));
		
		
		
			EventListenerProject listener = new EventListenerProject();
			firingdriver.register(listener);
			mtlink.click();
			firingdriver.unregister(listener);
	}
	
}
