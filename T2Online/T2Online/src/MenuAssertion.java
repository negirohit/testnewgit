import java.io.File;
import java.util.concurrent.TimeUnit;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MenuAssertion extends base
{


	
	
	/*
	@Test
	public void special_getthelook() throws Exception
	{
		APP_LOGS.debug("Checking Get the look from Special Page");
		WebDriver driver = new ChromeDriver();
	    driver.get("http://t2online.com/entertainment/ki-and-ka-effect-five-times-kareena-kapoor-stunned-us-with-her-razor-sharp-tongue/cid/1.35368");
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    Assert.assertNotEquals("http://t2online.com/404/", driver.getCurrentUrl());
	       Thread.sleep(2000);
		   JavascriptExecutor jse = (JavascriptExecutor)driver;
		   jse.executeScript("window.scrollBy(0,5750)", "");
		   Thread.sleep(5000);
		   
		   WebElement getlook = driver.findElement(By.xpath(".//*[@id='1.35368']/div[2]/div[1]/div[11]/div/get-the-look/div/div[1]/div[1]/img"));
		   getlook.click();
		   
		   Thread.sleep(2000);
		   String assertion = driver.findElement(By.cssSelector(".t2-take-heading")).getText();
		   System.out.println(assertion);
		   Assert.assertEquals(assertion,"T2's TAKE");
		   
		   driver.findElement(By.cssSelector(".t2icon-cancel")).click();
		   
		    Thread.sleep(5000);
			String assertcheck = driver.findElement(By.xpath(".//*[@id='1.35368']/div[1]/div/ol/li[2]/a/span")).getText();
			String assertcheck1 = driver.findElement(By.xpath("")).getText();
			
			System.out.println(assertcheck+"firstone");
			System.out.println(assertcheck1+"secondone");
			org.testng.Assert.assertEquals(assertcheck,assertcheck1);
			
			//NextPrevButton("http://t2online.com/entertainment/ki-and-ka-effect-five-times-kareena-kapoor-stunned-us-with-her-razor-sharp-tongue/cid/1.35368");
			driver.close();
	}
	*/
	
	@Test
	public void entertainment_submenucontents() throws Exception
	{
		setup();
	    driver.navigate().to(CONFIG.getProperty("homePage"));
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	
		
	   
	    
	    
	    Actions action = new Actions(driver);
	    Thread.sleep(2000);
	    WebElement entertainment = driver.findElement(By.xpath(".//*[@id='desktop-nav']/div[2]/div/div/div[2]/ul/li[1]/a"));
	    action.moveToElement(entertainment);
	    action.build().perform();
	    Thread.sleep(3000);
	    
	   
		List<WebElement> entertainmentmenu = driver.findElements(By.cssSelector("span.title-content.ng-binding.ng-scope"));
	    Thread.sleep(2000);
	    String ar[]=new String[6];
	    ar[0]=entertainmentmenu.get(0).getText();
	    ar[1]=entertainmentmenu.get(1).getText();
	    ar[2]=entertainmentmenu.get(2).getText();
	    ar[3]=entertainmentmenu.get(3).getText();
	    ar[4]=entertainmentmenu.get(4).getText();
	    ar[5]=entertainmentmenu.get(5).getText();
	    for(int i=0;i<6;i++)
	    System.out.println(ar[i]);
	    
	    
	    
	    
	    
	    
	    

	    
	    WebElement logo = driver.findElement(By.xpath(".//*[@id='title_nav']"));
	    Thread.sleep(2000);  
	    
	    action.moveToElement(logo);
	    action.build().perform();
	    Thread.sleep(3000);
	    
	    List<WebElement> menu1 = driver.findElements(By.cssSelector("span.title-content.ng-binding"));
	    Thread.sleep(2000);
	    
	    
	    
	    Assert.assertEquals(ar[0],menu1.get(8).getText());
	    Assert.assertEquals(menu1.get(9).getText(),ar[1]);
	    Assert.assertEquals(menu1.get(10).getText(),ar[2]);
	    System.out.println(" assert"+menu1.get(8).getText()+" "+ entertainmentmenu.get(0).getText());
	    System.out.println(" assert"+menu1.get(9).getText()+" "+ entertainmentmenu.get(1).getText());
	    System.out.println(" assert"+menu1.get(10).getText()+" "+ entertainmentmenu.get(2).getText());
	    
	   
	    Thread.sleep(2000);  
	    action.moveToElement(logo);
	    action.build().perform();
	    Thread.sleep(3000);
	    
	    WebElement menuclick1 = driver.findElement(By.xpath(".//*[@id='parallax']/ng-view/div[3]/div[1]/category-item/div/div/div[2]/div[3]"));
	    menuclick1.click();
	    
	    List<WebElement> menu2 = driver.findElements(By.cssSelector("span.title-content.ng-binding"));
	    for(WebElement i : menu2)
	    {
	    	System.out.println(" Menus2"+i.getText());
	    }
	    Thread.sleep(2000);
	    
	    Assert.assertEquals(menu2.get(11).getText(),ar[3]);
	    Assert.assertEquals(menu2.get(12).getText(),ar[4]);
	    Assert.assertEquals(menu2.get(13).getText(),ar[5]);
	    System.out.println(" assert"+menu1.get(11).getText()+" "+ ar[3]);
	    System.out.println(" assert"+menu1.get(12).getText()+" "+ ar[4]);
	    System.out.println(" assert"+menu1.get(13).getText()+" "+ ar[5]);
	    Thread.sleep(3000);
		
		
	} 
	@Test
	public void lifestyle_submenucontents() throws Exception
	{
		setup();
	    driver.navigate().to(CONFIG.getProperty("homePage"));
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	
		
	   
	    
	    
	    Actions action = new Actions(driver);
	    Thread.sleep(2000);
	    WebElement lifestyle = driver.findElement(By.xpath(".//*[@id='desktop-nav']/div[2]/div/div/div[2]/ul/li[2]/a"));
	    action.moveToElement(lifestyle);
	    action.build().perform();
	    Thread.sleep(3000);
	    
	   
		List<WebElement> lifestylemenu = driver.findElements(By.cssSelector("span.title-content.ng-binding.ng-scope"));
	    Thread.sleep(2000);
	    String ar[]=new String[6];
	    ar[0]=lifestylemenu.get(0).getText();
	    ar[1]=lifestylemenu.get(1).getText();
	    ar[2]=lifestylemenu.get(2).getText();
	    ar[3]=lifestylemenu.get(3).getText();
	    ar[4]=lifestylemenu.get(4).getText();
	    ar[5]=lifestylemenu.get(5).getText();
	    for(int i=0;i<6;i++)
	    System.out.println(ar[i]);
	    
	    
	    
	    
	    
	    
	    

	    
	    WebElement logo = driver.findElement(By.xpath(".//*[@id='title_nav']"));
	    Thread.sleep(2000);  
	    
	    action.moveToElement(logo);
	    action.build().perform();
	    Thread.sleep(3000);
	    
	    List<WebElement> menu1 = driver.findElements(By.cssSelector("span.title-content.ng-binding"));
	    Thread.sleep(2000);
	    
	    
	    
	    Assert.assertEquals(ar[0],menu1.get(14).getText());
	    Assert.assertEquals(menu1.get(15).getText(),ar[1]);
	    Assert.assertEquals(menu1.get(16).getText(),ar[2]);
	    System.out.println(" assert"+menu1.get(14).getText()+" "+ lifestylemenu.get(0).getText());
	    System.out.println(" assert"+menu1.get(15).getText()+" "+ lifestylemenu.get(1).getText());
	    System.out.println(" assert"+menu1.get(16).getText()+" "+ lifestylemenu.get(2).getText());
	    
	   
	    Thread.sleep(2000);  
	    action.moveToElement(logo);
	    action.build().perform();
	    Thread.sleep(3000);
	    
	    WebElement menuclick1 = driver.findElement(By.xpath(".//*[@id='parallax']/ng-view/div[3]/div[2]/category-item/div/div/div[2]/div[3]"));
	    menuclick1.click();
	    
	    List<WebElement> menu2 = driver.findElements(By.cssSelector("span.title-content.ng-binding"));
	    for(WebElement i : menu2)
	    {
	    	System.out.println(" Menus2"+i.getText());
	    }
	    Thread.sleep(2000);
	    
	    Assert.assertEquals(menu2.get(17).getText(),ar[3]);
	    Assert.assertEquals(menu2.get(18).getText(),ar[4]);
	    Assert.assertEquals(menu2.get(19).getText(),ar[5]);
	    System.out.println(" assert"+menu1.get(17).getText()+" "+ ar[3]);
	    System.out.println(" assert"+menu1.get(18).getText()+" "+ ar[4]);
	    System.out.println(" assert"+menu1.get(19).getText()+" "+ ar[5]);
	    Thread.sleep(3000);
		
		
	}
	@Test
	public void tech_submenucontents() throws Exception
	{
		setup();
	    driver.navigate().to(CONFIG.getProperty("homePage"));
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	
		
	   
	    
	    
	    Actions action = new Actions(driver);
	    Thread.sleep(2000);
	    WebElement tech = driver.findElement(By.xpath(".//*[@id='desktop-nav']/div[2]/div/div/div[2]/ul/li[3]/a"));
	    action.moveToElement(tech);
	    action.build().perform();
	    Thread.sleep(3000);
	    
	   
		List<WebElement> techmenu = driver.findElements(By.cssSelector("span.title-content.ng-binding.ng-scope"));
	    Thread.sleep(2000);
	    String ar[]=new String[6];
	    ar[0]=techmenu.get(0).getText();
	    ar[1]=techmenu.get(1).getText();
	    ar[2]=techmenu.get(2).getText();
	    ar[3]=techmenu.get(3).getText();
	    ar[4]=techmenu.get(4).getText();
	    ar[5]=techmenu.get(5).getText();
	    for(int i=0;i<6;i++)
	    System.out.println(ar[i]);
	    
	    
	    
	    
	    
	    
	    

	    
	    WebElement logo = driver.findElement(By.xpath(".//*[@id='title_nav']"));
	    Thread.sleep(2000);  
	    
	    action.moveToElement(logo);
	    action.build().perform();
	    Thread.sleep(3000);
	    
	    List<WebElement> menu1 = driver.findElements(By.cssSelector("span.title-content.ng-binding"));
	    Thread.sleep(2000);
	    
	    
	    
	    Assert.assertEquals(ar[0],menu1.get(20).getText());
	    Assert.assertEquals(menu1.get(21).getText(),ar[1]);
	    Assert.assertEquals(menu1.get(22).getText(),ar[2]);
	    System.out.println(" assert"+menu1.get(20).getText()+" "+ techmenu.get(0).getText());
	    System.out.println(" assert"+menu1.get(21).getText()+" "+ techmenu.get(1).getText());
	    System.out.println(" assert"+menu1.get(22).getText()+" "+ techmenu.get(2).getText());
	    
	   
	    Thread.sleep(2000);  
	    action.moveToElement(logo);
	    action.build().perform();
	    Thread.sleep(3000);
	    
	    WebElement menuclick1 = driver.findElement(By.xpath(".//*[@id='parallax']/ng-view/div[3]/div[3]/category-item/div/div/div[2]/div[3]"));
	    menuclick1.click();
	    
	    List<WebElement> menu2 = driver.findElements(By.cssSelector("span.title-content.ng-binding"));
	    for(WebElement i : menu2)
	    {
	    	System.out.println(" Menus2"+i.getText());
	    }
	    Thread.sleep(2000);
	    
	    Assert.assertEquals(menu2.get(23).getText(),ar[3]);
	    Assert.assertEquals(menu2.get(24).getText(),ar[4]);
	    Assert.assertEquals(menu2.get(25).getText(),ar[5]);
	    System.out.println(" assert"+menu1.get(23).getText()+" "+ ar[3]);
	    System.out.println(" assert"+menu1.get(24).getText()+" "+ ar[4]);
	    System.out.println(" assert"+menu1.get(25).getText()+" "+ ar[5]);
	    Thread.sleep(3000);
		
		
	}
	@Test
	public void sports_submenucontents() throws Exception
	{
		setup();
	    driver.navigate().to(CONFIG.getProperty("homePage"));
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	
		
	   
	    
	    
	    Actions action = new Actions(driver);
	    Thread.sleep(2000);
	    WebElement sports = driver.findElement(By.xpath(".//*[@id='desktop-nav']/div[2]/div/div/div[2]/ul/li[4]/a"));
	    action.moveToElement(sports);
	    action.build().perform();
	    Thread.sleep(3000);
	    
	   
		List<WebElement> sportsmenu = driver.findElements(By.cssSelector("span.title-content.ng-binding.ng-scope"));
	    Thread.sleep(2000);
	    String ar[]=new String[6];
	    ar[0]=sportsmenu.get(0).getText();
	    ar[1]=sportsmenu.get(1).getText();
	    ar[2]=sportsmenu.get(2).getText();
	    ar[3]=sportsmenu.get(3).getText();
	    ar[4]=sportsmenu.get(4).getText();
	    ar[5]=sportsmenu.get(5).getText();
	    for(int i=0;i<6;i++)
	    System.out.println(ar[i]);
	    
	    
	    
	    
	    
	    
	    

	    
	    WebElement logo = driver.findElement(By.xpath(".//*[@id='title_nav']"));
	    Thread.sleep(2000);  
	    
	    action.moveToElement(logo);
	    action.build().perform();
	    Thread.sleep(3000);
	    
	    List<WebElement> menu1 = driver.findElements(By.cssSelector("span.title-content.ng-binding"));
	    Thread.sleep(2000);
	    
	    
	    
	    Assert.assertEquals(ar[0],menu1.get(26).getText());
	    Assert.assertEquals(menu1.get(27).getText(),ar[1]);
	    Assert.assertEquals(menu1.get(28).getText(),ar[2]);
	    System.out.println(" assert"+menu1.get(26).getText()+" "+ sportsmenu.get(0).getText());
	    System.out.println(" assert"+menu1.get(27).getText()+" "+ sportsmenu.get(1).getText());
	    System.out.println(" assert"+menu1.get(28).getText()+" "+ sportsmenu.get(2).getText());
	    
	   
	    Thread.sleep(2000);  
	    action.moveToElement(logo);
	    action.build().perform();
	    Thread.sleep(3000);
	    
	    WebElement menuclick1 = driver.findElement(By.xpath(".//*[@id='parallax']/ng-view/div[3]/div[6]/category-item/div/div/div[2]/div[3]"));
	    menuclick1.click();
	    
	    List<WebElement> menu2 = driver.findElements(By.cssSelector("span.title-content.ng-binding"));
	    for(WebElement i : menu2)
	    {
	    	System.out.println(" Menus2"+i.getText());
	    }
	    Thread.sleep(2000);
	    
	    Assert.assertEquals(menu2.get(29).getText(),ar[3]);
	    Assert.assertEquals(menu2.get(30).getText(),ar[4]);
	    Assert.assertEquals(menu2.get(31).getText(),ar[5]);
	    System.out.println(" assert"+menu1.get(29).getText()+" "+ ar[3]);
	    System.out.println(" assert"+menu1.get(30).getText()+" "+ ar[4]);
	    System.out.println(" assert"+menu1.get(31).getText()+" "+ ar[5]);
	    Thread.sleep(3000);
		
		
	}
	@Test
	public void spin_submenucontents() throws Exception
	{
		setup();
	    driver.navigate().to(CONFIG.getProperty("homePage"));
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	
		
	   
	    
	    
	    Actions action = new Actions(driver);
	    Thread.sleep(2000);
	    WebElement spin = driver.findElement(By.xpath(".//*[@id='desktop-nav']/div[2]/div/div/div[2]/ul/li[5]/a"));
	    action.moveToElement(spin);
	    action.build().perform();
	    Thread.sleep(3000);
	    
	   
		List<WebElement> spinmenu = driver.findElements(By.cssSelector("span.title-content.ng-binding.ng-scope"));
	    Thread.sleep(2000);
	    String ar[]=new String[6];
	    ar[0]=spinmenu.get(0).getText();
	    ar[1]=spinmenu.get(1).getText();
	    ar[2]=spinmenu.get(2).getText();
	    ar[3]=spinmenu.get(3).getText();
	    ar[4]=spinmenu.get(4).getText();
	    ar[5]=spinmenu.get(5).getText();
	    for(int i=0;i<6;i++)
	    System.out.println(ar[i]);
	    
	    
	    
	    
	    
	    
	    

	    
	    WebElement logo = driver.findElement(By.xpath(".//*[@id='title_nav']"));
	    Thread.sleep(2000);  
	    
	    action.moveToElement(logo);
	    action.build().perform();
	    Thread.sleep(3000);
	    
	    List<WebElement> menu1 = driver.findElements(By.cssSelector("span.title-content.ng-binding"));
	    Thread.sleep(2000);
	    
	    
	    
	    Assert.assertEquals(ar[0],menu1.get(32).getText());
	    Assert.assertEquals(menu1.get(33).getText(),ar[1]);
	    Assert.assertEquals(menu1.get(34).getText(),ar[2]);
	    System.out.println(" assert"+menu1.get(32).getText()+" "+ spinmenu.get(0).getText());
	    System.out.println(" assert"+menu1.get(33).getText()+" "+ spinmenu.get(1).getText());
	    System.out.println(" assert"+menu1.get(34).getText()+" "+ spinmenu.get(2).getText());
	    
	   
	    Thread.sleep(2000);  
	    action.moveToElement(logo);
	    action.build().perform();
	    Thread.sleep(3000);
	    
	    WebElement menuclick1 = driver.findElement(By.xpath(".//*[@id='parallax']/ng-view/div[3]/div[7]/category-item/div/div/div[2]/div[3]"));
	    menuclick1.click();
	    
	    List<WebElement> menu2 = driver.findElements(By.cssSelector("span.title-content.ng-binding"));
	    for(WebElement i : menu2)
	    {
	    	System.out.println(" Menus2"+i.getText());
	    }
	    Thread.sleep(2000);
	    
	    Assert.assertEquals(menu2.get(35).getText(),ar[3]);
	    Assert.assertEquals(menu2.get(36).getText(),ar[4]);
	    Assert.assertEquals(menu2.get(37).getText(),ar[5]);
	    System.out.println(" assert"+menu1.get(35).getText()+" "+ ar[3]);
	    System.out.println(" assert"+menu1.get(36).getText()+" "+ ar[4]);
	    System.out.println(" assert"+menu1.get(37).getText()+" "+ ar[5]);
	    Thread.sleep(3000);
		
		
	}
	@Test
	public void video_submenucontents() throws Exception
	{
		setup();
	    driver.navigate().to(CONFIG.getProperty("homePage"));
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	
		
	   
	    
	    
	    Actions action = new Actions(driver);
	    Thread.sleep(2000);
	    WebElement video = driver.findElement(By.xpath(".//*[@id='desktop-nav']/div[2]/div/div/div[2]/ul/li[6]/a"));
	    action.moveToElement(video);
	    action.build().perform();
	    Thread.sleep(3000);
	    
	   
		List<WebElement> videomenu = driver.findElements(By.cssSelector("span.title-content.ng-binding.ng-scope"));
	    Thread.sleep(2000);
	    String ar[]=new String[6];
	    ar[0]=videomenu.get(0).getText();
	    ar[1]=videomenu.get(1).getText();
	    ar[2]=videomenu.get(2).getText();
	    ar[3]=videomenu.get(3).getText();
	    ar[4]=videomenu.get(4).getText();
	    ar[5]=videomenu.get(5).getText();
	    for(int i=0;i<6;i++)
	    System.out.println(ar[i]);
	    
	    
	    
	    
	    
	    
	    

	    
	    WebElement logo = driver.findElement(By.xpath(".//*[@id='title_nav']"));
	    Thread.sleep(2000);  
	    
	    action.moveToElement(logo);
	    action.build().perform();
	    Thread.sleep(3000);
	    
	    List<WebElement> menu1 = driver.findElements(By.cssSelector("span.title-content.ng-binding"));
	    Thread.sleep(2000);
	    
	    
	    
	    Assert.assertEquals(ar[0],menu1.get(38).getText());
	    Assert.assertEquals(menu1.get(39).getText(),ar[1]);
	    Assert.assertEquals(menu1.get(40).getText(),ar[2]);
	    System.out.println(" assert"+menu1.get(38).getText()+" "+ videomenu.get(0).getText());
	    System.out.println(" assert"+menu1.get(39).getText()+" "+ videomenu.get(1).getText());
	    System.out.println(" assert"+menu1.get(40).getText()+" "+ videomenu.get(2).getText());
	    
	   
	    Thread.sleep(2000);  
	    action.moveToElement(logo);
	    action.build().perform();
	    Thread.sleep(3000);
	    
	    WebElement menuclick1 = driver.findElement(By.xpath(".//*[@id='parallax']/ng-view/div[3]/div[10]/category-item/div/div/div[2]/div[3]"));
	    menuclick1.click();
	    
	    List<WebElement> menu2 = driver.findElements(By.cssSelector("span.title-content.ng-binding"));
	    for(WebElement i : menu2)
	    {
	    	System.out.println(" Menus2"+i.getText());
	    }
	    Thread.sleep(2000);
	    
	    Assert.assertEquals(menu2.get(41).getText(),ar[3]);
	    Assert.assertEquals(menu2.get(42).getText(),ar[4]);
	    Assert.assertEquals(menu2.get(43).getText(),ar[5]);
	    System.out.println(" assert"+menu1.get(41).getText()+" "+ ar[3]);
	    System.out.println(" assert"+menu1.get(42).getText()+" "+ ar[4]);
	    System.out.println(" assert"+menu1.get(43).getText()+" "+ ar[5]);
	    Thread.sleep(3000);
		
		
	}
	
	@AfterMethod
	public void close()
	{
		driver.quit();
	}
	
}
