package TestCase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.sun.jna.platform.win32.SetupApi;

import base.ebela_base;
import junit.framework.Assert;

public class TestCase1 extends ebela_base
{
	private SoftAssert softAssert = new SoftAssert();
	
	public void login() throws IOException, InterruptedException
	{
		
		setup();
		driver.navigate().to("http://cm.ttef.in/polopoly/Login.jsp?returnPath=%2Fpolopoly%2FCM");
		
		WebElement username = driver.findElement(By.xpath(".//*[@id='username']"));
		username.sendKeys("sysadmin");
		
		WebElement password = driver.findElement(By.xpath(".//*[@id='password']"));
		password.sendKeys("sysadmin");
		
		
		WebElement login = driver.findElement(By.xpath("html/body/div[1]/form/div[3]/input"));
		login.click();
		
		
		
	}
	
	
	
	public String StringExtraction(int i) throws IOException, InterruptedException
	{
			
		String string1="";
		 
			while(i<119)
			{
				File src=new File("C:/Content/book.xlsx");


				FileInputStream fis=new FileInputStream(src);

				XSSFWorkbook wb=new XSSFWorkbook(fis);

				XSSFSheet sh1= wb.getSheetAt(0);
			
				string1 = sh1.getRow(i).getCell(0).getStringCellValue();
				
				
				
				break;
		
			 }
			return string1;
			
	}
	
	@Test
	public void TestCaseOne() throws IOException, InterruptedException
	{
		int i;
		
		for(i=0;i<119;i++)
		{

			int k=0,m=0,flag=0;
			
			String id =StringExtraction(i);
			login();
			System.out.println(id);
		//	System.out.println("---------------------------------------------");
			driver.switchTo().frame(3);
			WebElement entertext = driver.findElement(By.xpath(".//*[@id='search_8']"));
			entertext.sendKeys(id);
			entertext.sendKeys(Keys.ENTER);
			
			driver.switchTo().defaultContent();
			Thread.sleep(2000);
			
			driver.switchTo().frame(driver.findElement(By.id("work")));
			List<WebElement> tag =driver.findElements(By.cssSelector(".select2-search-choice"));
			
			Thread.sleep(5000);
			String ar[]= new String[tag.size()];
			System.out.println("size"+" ");
			Thread.sleep(5000);
			for(WebElement t : tag)
			{
				
				ar[k]=t.getText();
				Thread.sleep(3000);
				k++;
			}
			
			
		//	System.out.println("abc");
			Thread.sleep(2000);
						
			
			
			
			System.out.println("def");
			int z=0;
			WebElement trendingk = driver.findElement(By.xpath("html/body/form/div[6]/table/tbody/tr/td/div/div/div/div[2]/fieldset[2]/span"));
			Thread.sleep(2000);

			StringTokenizer str = new StringTokenizer(trendingk.getText(),",");
		
			while(str.hasMoreTokens())
			{
			
				str.nextToken();
				z++;
	
			}
			
			StringTokenizer str1 = new StringTokenizer(trendingk.getText(),",");
			String ar1[]= new String[z];
			int s=0;
			
			while(str1.hasMoreTokens())
			{
			
				
				ar1[s]=str1.nextToken();
				s++;
	
			}
			
			System.out.println("size"+" "+z);
			
			for(int a=0;a<z;a++)
				System.out.println(ar1[a]+" "+"Trending Keywords");
			
			for(k=0;k<ar.length;k++)
				System.out.println(ar[k]+" "+"Tag");
			
			for(z=0;z<ar1.length;z++)
			{ 
				
				for(k=0;k<ar.length;k++)
				{ 
					
					if((ar1[z].equals(ar[k])))
					{ 
						flag++;
						System.out.println("Action"+" "+flag); 
						break;
					}
					else
					{ 
						System.out.println("Action cannot be set"); 
					} 
					
				} 
				
			}
			
			if(flag!=s)
			{
				softAssert.fail("Data from Trending Keywords are absent in Tags.");
				System.out.println("Data from Trending Keywords are absent in Tags.");
			}
			driver.close();
		}
	
		
	}
	
	@Test
	public void TestCaseTwo() throws IOException, InterruptedException
	{
		int i;
		
		for(i=0;i<119;i++)
		{
			
			String id =StringExtraction(i);
			login();
			
			System.out.println(id);
			System.out.println("---------------------------------------------");
			
			driver.switchTo().frame(3);
			WebElement entertext = driver.findElement(By.xpath(".//*[@id='search_8']"));
			entertext.sendKeys(id);
			entertext.sendKeys(Keys.ENTER);
			
			driver.switchTo().defaultContent();
			Thread.sleep(2000);
			
			driver.switchTo().frame(driver.findElement(By.id("work")));
			
			
			 
			
				
				WebElement currdate = driver.findElement(By.xpath("html/body/form/div[6]/table/tbody/tr/td/div/div/div/div[2]/table[1]/tbody/tr/td/fieldset/span"));
				
				if(currdate.isDisplayed())
				{
					String currdate1 = currdate.getText().substring(0,10);
					System.out.println("hola"+currdate1+" ");
					SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
				 
					//get current date time with Date()
					Date date = new Date();
				 
					// Now format the date
					String date1= dateFormat.format(date);
							 
					// Print the Date
					System.out.println(date1);
					String datenew = "2016-04-01";
					
					
					if (currdate1.compareTo(datenew) < 0)
					{
						softAssert.fail("Date Failure");
						System.out.println("Date Failure");
					}
			
				}
				else
				{
					WebElement currdatenew = driver.findElement(By.xpath("html/body/form/div[6]/table/tbody/tr/td/div/div/div/div[2]/table[3]/tbody/tr/td/div/div/fieldset/div[3]/div[1]/div[1]/div[3]/p"));
				
					String currdate1 = currdatenew.getText().substring(9,19);
					System.out.println("hola"+currdate1+" ");
					SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
				 
					//get current date time with Date()
					Date date = new Date();
				 
					// Now format the date
					String date1= dateFormat.format(date);
					
					String datenew = "2016-04-01";
					// Print the Date
					System.out.println(date1);
					
					
					if (currdate1.compareTo(datenew) < 0)
					{
						softAssert.fail("Date Failure");
						System.out.println("Date Failure");
					}
			
				}
				driver.close();
		}
		
	}
	
	
}
