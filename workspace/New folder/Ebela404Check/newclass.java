package TestCase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ebela_base;

public class newclass extends ebela_base
{

	
	

	public void openCMPolopoly() throws InterruptedException
	{
		Thread.sleep(4000);	
		driver.get("http://cm.ttef.in/polopoly/");
		WebElement polUserName=driver.findElement(By.id("username"));
		polUserName.click();
		polUserName.clear();
		polUserName.sendKeys("sysadmin");

	WebElement polPass=driver.findElement(By.id("password"));
		polPass.click();
		polPass.clear();
		polPass.sendKeys("sysadmin");

	WebElement polLogin=driver.findElement(By.xpath("//input[@value='Login']"));
		polLogin.click();
		Thread.sleep(2000);
	}
	

		@BeforeTest
		public void openBrowser() throws InterruptedException, IOException{
			
			setup();
			driver.navigate().to("http://cm.ttef.in/polopoly/");
			openCMPolopoly();
		}
		
		@BeforeMethod
		public void openABPFolder() throws InterruptedException{
		
			       //click on à¦†à¦¨à¦¨à§�à¦¦à¦¬à¦¾à¦œà¦¾à¦° folder
					WebDriver elementFrame=  driver.switchTo().frame(driver.findElement(By.id("nav")));
						elementFrame.findElement(By.xpath(".//*[@id='nav_10_8']/a[3]")).click();
						Thread.sleep(4000);
					driver.switchTo().defaultContent();
					APP_LOGS.debug("executing open ABP folder");
		}
		
		@Test(priority=3)
		public void openCMKolkata() throws InterruptedException{		
			APP_LOGS.debug("executing open CM Kolkata");
				//goto sub pages
				driver.switchTo().frame(driver.findElement(By.id("work_298"))).findElement(By.xpath("//form/div[6]/table/tbody/tr/td/div/div/div/div[2]/div[1]/fieldset/div/fieldset/div[2]/fieldset/fieldset/span")).click();
					Thread.sleep(3000);
			//goto à¦•à¦²à¦•à¦¾à¦¤à¦¾ sub pages
					System.out.println("*******Sub sites and pages Kolkata*******");
					driver.findElement(By.xpath(".//form/div[5]/table/tbody/tr/td/div/div/div[2]/div[1]/div/fieldset/div[3]/div[1]/div/div/h2/a")).click();
				 Thread.sleep(3000);
					//lead story
				driver.findElement(By.xpath(".//fieldset/div[3]/div/div/div[1]/div[2]/a")).click();
				 Thread.sleep(3000);
					//click on story		
				driver.findElement(By.xpath(".//form/div[6]/table/tbody/tr/td/div/div/div/fieldset/div[3]/div/div/div[1]/div[2]/a")).click();
					Thread.sleep(3000);	
		            //pick the bengali title
					String stringTitleKolkata=driver.findElement(By.xpath("//form/div[6]/table/tbody/tr/td/div/div/div/div[2]/div[1]/fieldset/div/fieldset/div[2]/fieldset/fieldset/span")).getText();	
					//pick the english title										
					String str2=driver.findElement(By.xpath("//form/div[6]/table/tbody/tr/td/div/div/div/div[2]/div[1]/fieldset/div/fieldset/div[1]/fieldset/fieldset/span")).getText();	
					System.out.println(str2);
					APP_LOGS.debug("kolkata section top story title: "+str2);
					driver.findElement(By.xpath(".//form/div[3]/div[1]/ul/li[5]/span/button")).click();
					driver.findElement(By.xpath(".//form/div[3]/div[1]/ul/li[4]/span/button")).click();
					driver.findElement(By.xpath(".//form/div[3]/div[1]/ul/li[3]/span/button")).click();
					
					driver.switchTo().defaultContent();
				//driver.close();	
					
			}
		
		
		
				

	
			
		@AfterClass
		public void closeBrowser() throws Exception 
		  {
				driver.quit();	   
		  }
			
		
		
		
	
}
