import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Pingdomtest extends base
{

	@BeforeTest
	public void openBrowser() throws InterruptedException, IOException{
		
		APP_LOGS.debug("executing ABPcmSection.openBrowser");		
		setup();
	
	}	
	@BeforeMethod
	public void openFortuneIndiaFolder() throws InterruptedException{
		
		
	}
	@Test(priority=1)
	public void Pingdomcall() throws Exception{
		
		driver.navigate().to(CONFIG.getProperty("pingdomURL"));
		//driver.findElement(By.id("url")).sendKeys(CONFIG.getProperty("homePage"));
		APP_LOGS.debug("ABP Homepage-  http://www.anandabazar.com");
		String ar[]= new String[15];
		ar[0] = CONFIG.getProperty("homePage");
		ar[1] = CONFIG.getProperty("sectionPage");
		ar[2] = CONFIG.getProperty("storyPage");
		ar[3] = CONFIG.getProperty("hthomepage");
		ar[4] = CONFIG.getProperty("htsectionpage");
		ar[5] = CONFIG.getProperty("htstorypage");
		ar[6] = CONFIG.getProperty("toihomepage");
		ar[7] = CONFIG.getProperty("toisectionpage");
		ar[8] = CONFIG.getProperty("toistorypage");
		ar[9] = CONFIG.getProperty("bhaskarhomepage");
		ar[10] = CONFIG.getProperty("bhaskarsectionpage");
		ar[11] = CONFIG.getProperty("bhaskarstorypage");
		ar[12] = CONFIG.getProperty("hinduhomepage");
		ar[13] = CONFIG.getProperty("hindusectionpage");
		ar[14] = CONFIG.getProperty("hindustorypage");

		
		int column =1;
		int columnvalue=0;
		for(int i=0;i<15;i++)
		{
			if(columnvalue==3)
			{
				columnvalue=0;
				column++;
			}
			
			exceldatapd(0,ar[i],column);
			column ++;
			columnvalue++;
		}
		
		driver.close();
	}
	@Test(priority=1)
	public void Pingdomcall2() throws Exception{
		
		driver.navigate().to(CONFIG.getProperty("pingdomURL"));
		//driver.findElement(By.id("url")).sendKeys(CONFIG.getProperty("homePage"));
		APP_LOGS.debug("T2Online");
		String ar[]= new String[9];
		ar[0] = CONFIG.getProperty("t2homepage");
		ar[1] = CONFIG.getProperty("t2sectionpage");
		ar[2] = CONFIG.getProperty("t2storypage");
		ar[3] = CONFIG.getProperty("mensxphomegape");
		ar[4] = CONFIG.getProperty("mensxpsectionpage");
		ar[5] = CONFIG.getProperty("mensxpstorypage");
		ar[6] = CONFIG.getProperty("missmalinihomepage");
		ar[7] = CONFIG.getProperty("missmalinisectionpage");
		ar[8] = CONFIG.getProperty("missmalinistorypage");


		
		int column =1;
		int columnvalue=0;
		for(int i=0;i<9;i++)
		{
			if(columnvalue==3)
			{
				columnvalue=0;
				column++;
			}
			
			exceldatapd(1,ar[i],column);
			column ++;
			columnvalue++;
		}
		
		driver.close();
	}
	@Test(priority=1)
	public void Pingdomcall3() throws Exception{
		
		driver.navigate().to(CONFIG.getProperty("pingdomURL"));
		//driver.findElement(By.id("url")).sendKeys(CONFIG.getProperty("homePage"));
		APP_LOGS.debug("Ebela");
		String ar[]= new String[12];
		ar[0] = CONFIG.getProperty("ebelahomepage");
		ar[1] = CONFIG.getProperty("ebelasectionpage");
		ar[2] = CONFIG.getProperty("ebelastorypage");
		ar[3] = CONFIG.getProperty("huffingtonhomepage");
		ar[4] = CONFIG.getProperty("huffingtonsectionpage");
		ar[5] = CONFIG.getProperty("huffingtonstorypage");
		ar[6] = CONFIG.getProperty("buzzfeedhomepage");
		ar[7] = CONFIG.getProperty("buzzfeedsectionpage");
		ar[8] = CONFIG.getProperty("buzzfeedstorypage");
		ar[9] = CONFIG.getProperty("vagabombhomepage");
		ar[10] = CONFIG.getProperty("vagabombsectionpage");
		ar[11] = CONFIG.getProperty("vagabombstorypage");

		
		int column =1;
		int columnvalue=0;
		for(int i=0;i<12;i++)
		{
			if(columnvalue==3)
			{
				columnvalue=0;
				column++;
			}
			
			exceldatapd(2,ar[i],column);
			column ++;
			columnvalue++;
		}
		
		driver.close();
	}
	@Test(priority=1)
	public void Pingdomcall4() throws Exception{
		
		driver.navigate().to(CONFIG.getProperty("pingdomURL"));
		//driver.findElement(By.id("url")).sendKeys(CONFIG.getProperty("homePage"));
		APP_LOGS.debug("Fortune");
		String ar[]= new String[12];
		ar[0] = CONFIG.getProperty("fortunehomepage");
		ar[1] = CONFIG.getProperty("fortunesectionpage");
		ar[2] = CONFIG.getProperty("fortunestorypage");
		ar[3] = CONFIG.getProperty("liveminthomepage");
		ar[4] = CONFIG.getProperty("livemintsectionpage");
		ar[5] = CONFIG.getProperty("livemintstorypage");
		ar[6] = CONFIG.getProperty("financialexhomepage");
		ar[7] = CONFIG.getProperty("financialexsectionpage");
		ar[8] = CONFIG.getProperty("financialexstorypage");
		ar[9] = CONFIG.getProperty("businesshomepage");
		ar[10] = CONFIG.getProperty("businesssectionpage");
		ar[11] = CONFIG.getProperty("businessstorypage");


		
		int column =1;
		int columnvalue=0;
		for(int i=0;i<12;i++)
		{
			if(columnvalue==3)
			{
				columnvalue=0;
				column++;
			}
			
			exceldatapd(3,ar[i],column);
			column ++;
			columnvalue++;
		}
		
		driver.close();
	}
	 /* @AfterMethod
	public void takeScreenShotOnStarted(ITestResult testResult) throws IOException { 
     //   if (testResult.getStatus() == ITestResult.STARTED) { 
                
               File scrFile = ((TakesScreenshot) driver)
                     .getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File(CONFIG.getProperty("scrfolder")+ testResult.getName()+".jpg"));
                  
               }
	*/
}
