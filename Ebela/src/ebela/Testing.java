package ebela;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testing extends ebela_base
{

	
	
	@Test
	public void sport_carousal_socialshare_fb() throws Exception
	{
		setup();
		String s = "https://ebela.in/sports?google_nofetch=true&param=something";
		carousal_socialshare_fb(s);
		
	}
}
