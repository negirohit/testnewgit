import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Trendingstories extends base
{

	@BeforeMethod
	public void openHomepage()
	{
		File file = new File("D:\\chromedriver.exe");
	    System.setProperty("webdriver.chrome.driver", file.getAbsolutePath() );
	    
	    
	}
	@Test
	public void story_TrendingStories() throws Exception
	{
		APP_LOGS.debug("Checking Trending Stories from Story Page");
		WebDriver driver = new ChromeDriver();
	    driver.get("http://t2online.com/entertainment/new-bollywood-jodis-to-look-forward-to-in-2017-deepika-shahid-tapsee-amit-sushant-kriti-and-more/cid/1.63912");
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	    
        Thread.sleep(2000);
		
		WebElement trending1 = driver.findElement(By.xpath(".//*/div[2]/div[2]/trending/div/div[1]/div[1]/div/article-thumb/div[1]/div/div/div[2]/a/span"));
		trending1.click();
		Thread.sleep(2000);
		String trending1url = driver.getCurrentUrl();
		Thread.sleep(2000);
	    System.out.println(trending1url);
	    
		WebElement trending2 = driver.findElement(By.xpath(".//*/div[2]/div[2]/trending/div/div[1]/div[1]/div/article-thumb/div[1]/div/div/div[2]/a/span"));
		Thread.sleep(2000);
		trending2.click();
		Thread.sleep(2000);
		String trending2url = driver.getCurrentUrl();
		Thread.sleep(2000);
		
		
		WebElement trending3 = driver.findElement(By.xpath(".//*/div[2]/div[2]/trending/div/div[2]/div[1]/div/article-thumb/div[1]/div/div/div[2]/a/span"));
		Thread.sleep(2000);
		trending3.click();
		Thread.sleep(2000);
		String trending3url = driver.getCurrentUrl();
		Thread.sleep(2000);
		
		
		WebElement trending4 = driver.findElement(By.xpath(".//*/div[2]/div[2]/trending/div/div[3]/div[1]/div/article-thumb/div[1]/div/div/div[2]/a/span"));
		Thread.sleep(2000);
		trending4.click();
		Thread.sleep(5000);
		String trending4url = driver.getCurrentUrl();
		Thread.sleep(2000);
		
		
		WebElement trending5 = driver.findElement(By.xpath(".//*/div[2]/div[2]/trending/div/div[4]/div[1]/div/article-thumb/div[1]/div/div/div[2]/a/span"));
		Thread.sleep(2000);
		trending5.click();
		Thread.sleep(5000);
		String trending5url = driver.getCurrentUrl();
		Thread.sleep(2000);                                                    
		
		driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("debaditya.bhattacharya@abpdigital.in");
		driver.findElement(By.xpath(".//*[@id='next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("Menaka*111");
		driver.findElement(By.xpath(".//*[@id='signIn']")).click();
		Thread.sleep(2000);
		
		String txt = "analytics";
		
		WebElement analyticstab=driver.findElement(By.xpath(".//*[@id=':2z']"));
		analyticstab.click();
		Thread.sleep(2000);
		java.util.List<WebElement> a = driver.findElements(By.xpath("//*[@class='yW']/span"));
        System.out.println(a.size());
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i).getText());
            if (a.get(i).getText().equalsIgnoreCase(txt)) //to click on a specific mail.
                {                                           
                a.get(i).click();
            }
        }
        Thread.sleep(5000);
        
        
        List<WebElement> trend1 = driver.findElements(By.cssSelector("a[target='_blank']"));
        
      
        
        System.out.println(trend1.get(30).getText());
        System.out.println(trend1.get(31).getText());
        System.out.println(trend1.get(32).getText());
        System.out.println(trend1.get(33).getText());
        System.out.println(trend1.get(34).getText());
       
        
        Assert.assertEquals(trending1url, trend1.get(30).getText());
        Assert.assertEquals(trending2url, trend1.get(31).getText());
        Assert.assertEquals(trending3url, trend1.get(32).getText());
        Assert.assertEquals(trending4url, trend1.get(33).getText());
        Assert.assertEquals(trending5url, trend1.get(34).getText());
      
        Thread.sleep(2000);
        driver.close();
		
		
	}
	
}
