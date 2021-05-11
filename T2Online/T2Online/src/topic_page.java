import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class topic_page extends base
{
	
			
	@BeforeMethod
	  public void startdriver() throws Exception {
	    
		APP_LOGS.debug("Starting the robots test");

		setup();
		
	}

	@Test
	public void TopicpageTest1() throws Exception
	{
		boolean value = false ;
		driver.navigate().to("http://t2online.com/topic/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement topic_click1 = driver.findElement(By.xpath(".//*[@id='wrapper']/div[1]/div[2]/div/div[2]/ul[1]/li[31]/a"));
		String topic_name = topic_click1.getText();
		topic_click1.click();
		Thread.sleep(2000);
		
		WebElement topic_click2 = driver.findElement(By.xpath(".//*[@id='topic-section']/div[2]/div/div[2]/a"));
		String topic_name2 = topic_click2.getText();
		topic_click2.click();
		Thread.sleep(2000);
		int count = 0 ;
		java.util.List<WebElement> breadcrumbs = driver.findElements(By.cssSelector(".ng-binding"));
		
		for(WebElement i : breadcrumbs)
		{
			count ++;
			System.out.println("Breadcrumb"+" "+count+" "+i.getText());
		}
		Assert.assertEquals(breadcrumbs.get(21).getText(), breadcrumbs.get(22).getText());
		

		Thread.sleep(2000);
		
		java.util.List<WebElement> tags = driver.findElements(By.cssSelector(".tag-text.ng-binding"));
		
		for(WebElement i : tags)
		{
			if(i.getText().equals(topic_name))
			{
				value = true ;
				System.out.println("I've done it");
				APP_LOGS.debug("I've done it");
				break;
			}
			
		}
		if(value==false)
		{
			Assert.fail("Tag is not present in story");
		}
		driver.close();
		
	}
	@Test
	public void TopicpageTest2() throws Exception
	{
		
		boolean value = false ;
		driver.navigate().to("http://t2online.com/topic/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement topic_click1 = driver.findElement(By.xpath(".//*[@id='wrapper']/div[1]/div[2]/div/div[2]/ul[26]/li[4]/a"));
		String topic_name = topic_click1.getText();
		topic_click1.click();
		Thread.sleep(5000);
		
		WebElement topic_click2 = driver.findElement(By.xpath(".//*[@id='topic-section']/div[2]/div/div[2]/a"));
		String topic_name2 = topic_click2.getText();
		topic_click2.click();
		Thread.sleep(2000);
		int count = 0 ;
		java.util.List<WebElement> breadcrumbs = driver.findElements(By.cssSelector(".ng-binding"));
		
		for(WebElement i : breadcrumbs)
		{
			count ++;
			System.out.println("Breadcrumb"+" "+count+" "+i.getText());
		}
		Assert.assertEquals(breadcrumbs.get(21).getText(), breadcrumbs.get(22).getText());
		

		Thread.sleep(5000);
		
		java.util.List<WebElement> tags = driver.findElements(By.cssSelector(".tag-text.ng-binding"));
		
		for(WebElement i : tags)
		{
			if(i.getText().equals(topic_name))
			{
				value = true ;
				System.out.println("I've done it");
				APP_LOGS.debug("I've done it");
				break;
			}
			
		}
		if(value==false)
		{
			Assert.fail("Tag is not present in story");
		}
		driver.close();
		
	}
	
	@AfterMethod
	public void close()
	{
		driver.quit();
	}
	
}
