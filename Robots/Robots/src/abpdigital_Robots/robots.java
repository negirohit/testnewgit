package abpdigital_Robots;


import org.testng.Assert;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class robots extends base{
	//Production response
	String abp_RobotString="User-agent: * "+'\n'+"Disallow:"+'\n'+'\n'+"User-agent: Googlebot-News"+'\n'+"Disallow: /video"+'\n'+"Disallow: /photogallery"+'\n'+"Disallow: /horoscope"+'\n'+"Disallow: /topic"+'\n'+"Disallow: /privacy"+'\n'+"Disallow: /termsofuse"+'\n'+"Disallow: /aboutus"+'\n'+"Disallow: /contactus"+'\n'+"Disallow: /sitemap"+'\n'+"Disallow: /feedback"+'\n'+"Disallow: /advertise"+'\n'+"Disallow: /others/comics"+'\n'+"Disallow: /others/crossword"+'\n'+"Disallow: /others/dinponji"+'\n'+"Disallow: /people"+'\n'+"Disallow: /searchresult";
	String ebela_RobotString="User-agent: *"+'\n'+"Disallow: /1088475/"+'\n'+'\n'+"User-agent: Googlebot-News"+'\n'+"Disallow: /search-results-page"+'\n'+"Disallow: /caricature"+'\n'+"Disallow: /videogallery"+'\n'+"Disallow: /photogallery"+'\n'+"Disallow: /horoscope"+'\n'+"Disallow: /topic"+'\n'+"Disallow: /advertise"+'\n'+"Disallow: /terms"+'\n'+"Disallow: /aboutus"+'\n'+"Disallow: /privacy"+'\n'+"Disallow: /sitemap";
	String t2online_RobotString="User-agent: *"+'\n'+"Disallow:/search"+'\n'+'\n'+"User-agent: Googlebot-News"+'\n'+"Disallow: /author"+'\n'+"Disallow: /gallery"+'\n'+"Disallow: /topic"+'\n'+"Disallow: /search";
	
	//"User-agent: Twitterbot"+'\n'+"Disallow:"+'\n'+'\n'+"User-agent: *"+'\n'+"Disallow:";
	
	String fortuneindia_RobotString="User-agent: *"+'\n'+"Disallow: "+'\n'+'\n'+"User-agent: Googlebot-News"+'\n'+"Disallow: /author"+'\n'+"Disallow: /topic"+'\n'+"Disallow: /fortune-500"+'\n'+"Disallow: /mpw"+'\n'+"Disallow: /40under40"+'\n'+"Disallow: /next-500"+'\n'+"Disallow: /psu";
	//Staging response
	String abp_StagingRobot="User-agent: *"+'\n'+"Disallow: /";
	String ebela_StagingRobot="User-agent: *"+'\n'+"Disallow: /";
	String t2online_StagingRobot="User-agent: *"+'\n'+"Disallow: / ";
	String fortuneindia_StagingRobot="User-agent: *"+'\n'+"Disallow: /";
	//New robots
	String CMttef_Robot="User-agent: * "+'\n'+"Disallow: /";
	String stagettefRobot="User-agent: *"+'\n'+"Disallow: /";
	String fortunebetaRobot="User-agent: *"+'\n'+"Disallow: /";
	String fortunespecialstageRobot="User-agent: *"+'\n'+"Disallow: /";
	String fortunespecialprodRobot="User-agent: *"+'\n'+"Disallow: /";
	String images1ABP_Robots="#Robots.txt for ABP"+'\n'+"User-agent: * "+'\n'+"Allow: /polopoly_fs/"+'\n'+"Allow: /img/"+'\n'+"Disallow: /";
	String imagesABP_Robots="#Robots.txt for ABP"+'\n'+"User-agent: * "+'\n'+"Allow: /polopoly_fs/"+"\n"+"Allow: /img/"+'\n'+"Disallow: /";
	String originABP_Robots="User-agent: * "+'\n'+"Disallow:"+'\n'+'\n'+"User-agent: Googlebot-News"+'\n'+"Disallow: /video"+'\n'+"Disallow: /photogallery"+'\n'+"Disallow: /horoscope"+'\n'+"Disallow: /topic"+'\n'+"Disallow: /privacy"+'\n'+"Disallow: /termsofuse"+'\n'+"Disallow: /aboutus"+'\n'+"Disallow: /contactus"+'\n'+"Disallow: /sitemap"+'\n'+"Disallow: /feedback"+'\n'+"Disallow: /advertise"+'\n'+"Disallow: /others/comics"+'\n'+"Disallow: /others/crossword"+'\n'+"Disallow: /others/dinponji"+'\n'+"Disallow: /people"+'\n'+"Disallow: /searchresult";
	String origin_imagesABP_Robots ="#Robots.txt for ABP"+'\n'+"User-agent: * "+'\n'+"Allow: /polopoly_fs/"+"\n"+"Allow: /img/"+'\n'+"Disallow: /";
	String origin_images1ABP_Robots="#Robots.txt for ABP"+'\n'+"User-agent: * "+'\n'+"Allow: /polopoly_fs/"+'\n'+"Allow: /img/"+'\n'+"Disallow: /";
	String telegraphindia_Robots="User-agent: *"+'\n'+"Disallow: */print.html$"+'\n'+"Disallow: */jsp/story"+'\n'+"Disallow: */pressrelease/"+'\n'+'\n'+"User-agent: Googlebot-News"+'\n'+"Disallow: /sports/horse-racing/"+'\n'+"Disallow: /photo-gallery/"+'\n'+"Disallow: /leisure/sudoku"+'\n'+"Disallow: /leisure/crossword"+'\n'+"Disallow: /leisure/jumble"+'\n'+"Disallow: /archives/"+'\n'+"Disallow: /about-us"+'\n'+"Disallow: /advertise"+'\n'+"Disallow: /feedback"+'\n'+"Disallow: /contact-us"+'\n'+'\n'+"User-agent: bingbot"+'\n'+"Crawl-delay: 10";
	String imagesEbela_Robots="User-agent: * "+'\n'+"Disallow: /";
	@BeforeClass
	  public void startdriver() throws Exception {
	    
		APP_LOGS.debug("Starting the robots test");

		setup();
		
	}

	
	@Test (priority=1)
	public void test_Prod_ABP_Robots(){
		driver.navigate().to(CONFIG.getProperty("ABPurl"));
		String robot=driver.findElement(By.cssSelector("html>body>pre")).getText();
		APP_LOGS.debug("URL is.."+CONFIG.getProperty("ABPurl"));
		APP_LOGS.debug("robots text is \n \n"+robot+'\n');
		Assert.assertEquals(robot,abp_RobotString);
		//Assert.assertNotEquals("hello", "hello");
		APP_LOGS.warn("URL is.."+CONFIG.getProperty("ABPurl"));
		
	}
	
	@Test (priority=2)
	public void test_Prod_Ebela_Robots(){
		driver.navigate().to(CONFIG.getProperty("Ebelaurl"));
		String robot=driver.findElement(By.cssSelector("html>body>pre")).getText();
		APP_LOGS.debug("URL is.."+CONFIG.getProperty("Ebelaurl"));
		APP_LOGS.debug("robots text is \n \n"+robot+'\n');
		Assert.assertEquals(robot,ebela_RobotString);
		
		
	}
	
	
	@Test (priority=3)
	public void test_Prod_T2online_Robots(){
		driver.navigate().to(CONFIG.getProperty("T2onlineurl"));
		String robot=driver.findElement(By.cssSelector("html>body>pre")).getText();
		APP_LOGS.debug("URL is.."+CONFIG.getProperty("T2onlineurl"));
		APP_LOGS.debug("robots text is \n \n"+robot+'\n');
		Assert.assertEquals(robot,t2online_RobotString);
	
	}
	
	@Test (priority=4)
	public void test_Prod_Fortuneindia_Robots(){
		driver.navigate().to(CONFIG.getProperty("Fortuneindiaurl"));
		String robot=driver.findElement(By.cssSelector("html>body>pre")).getText();
		APP_LOGS.debug("URL is.."+CONFIG.getProperty("Fortuneindiaurl"));
		APP_LOGS.debug("robots text is \n \n"+robot+'\n');
		Assert.assertEquals(robot,fortuneindia_RobotString);
	
	}
	
	@Test (priority=5)
	public void test_Staging_ABP__Robots(){
		driver.navigate().to(CONFIG.getProperty("ABP_Stagingurl"));
		String robot=driver.findElement(By.cssSelector("html>body>pre")).getText();
		APP_LOGS.debug("URL is.."+CONFIG.getProperty("ABP_Stagingurl"));
		APP_LOGS.debug("robots text is \n \n"+robot+'\n');
		Assert.assertEquals(robot,abp_StagingRobot);
		
	
	}
	
	@Test (priority=6)
	public void test_Staging_Ebela__Robots(){
		driver.navigate().to(CONFIG.getProperty("Ebela_Stagingurl"));
		String robot=driver.findElement(By.cssSelector("html>body>pre")).getText();
		APP_LOGS.debug("URL is.."+CONFIG.getProperty("Ebela_Stagingurl"));
		APP_LOGS.debug("robots text is \n \n"+robot+'\n');
		Assert.assertEquals(robot,ebela_StagingRobot);
		
		
	}
	
	@Test (priority=7)
	public void test_Staging_t2online_Robots(){
		driver.navigate().to(CONFIG.getProperty("T2online_Stagingurl"));
		String robot=driver.findElement(By.cssSelector("html>body>pre")).getText();
		APP_LOGS.debug("URL is.."+CONFIG.getProperty("T2online_Stagingurl"));
		APP_LOGS.debug("robots text is \n \n"+robot+'\n');
		Assert.assertEquals(robot,t2online_StagingRobot);
	
	}
	
	//@Test (priority=8)
	public void test_Staging_Fortuneindia_Robots(){
		driver.navigate().to(CONFIG.getProperty("Fortuneindia_Stagingurl"));
		String robot=driver.findElement(By.cssSelector("html>body>pre")).getText();
		APP_LOGS.debug("URL is.."+CONFIG.getProperty("Fortuneindia_Stagingurl"));
		APP_LOGS.debug("robots text is \n \n"+robot+'\n');
		Assert.assertEquals(robot,fortuneindia_StagingRobot);
	
	}
	
	@Test (priority=9)
	public void test_CMttef_Robots(){
		driver.navigate().to(CONFIG.getProperty("CMttef"));
		String robot=driver.findElement(By.cssSelector("html>body>pre")).getText();
		APP_LOGS.debug("URL is.."+CONFIG.getProperty("CMttef"));
		APP_LOGS.debug("robots text is \n \n"+robot+'\n');
		Assert.assertEquals(robot,CMttef_Robot);
	
	}
	
	//@Test (priority=10)
	public void test_stagettef_Robots(){
		driver.navigate().to(CONFIG.getProperty("stagettef"));
		String robot=driver.findElement(By.cssSelector("html>body>pre")).getText();
		APP_LOGS.debug("URL is.."+CONFIG.getProperty("stagettef"));
		APP_LOGS.debug("robots text is \n \n"+robot+'\n');
		Assert.assertEquals(robot,stagettefRobot);
	
	}
	
	//@Test (priority=11)
	public void test_fortunebeta_Robots(){
		driver.navigate().to(CONFIG.getProperty("fortunebeta"));
		String robot=driver.findElement(By.cssSelector("html>body>pre")).getText();
		APP_LOGS.debug("URL is.."+CONFIG.getProperty("fortunebeta"));
		APP_LOGS.debug("robots text is \n \n"+robot+'\n');
		Assert.assertEquals(robot,fortunebetaRobot);
	
	}
	
	//@Test (priority=12)
	public void test_fortunespecialstage_Robots(){
		driver.navigate().to(CONFIG.getProperty("fortunespecialstage"));
		String robot=driver.findElement(By.cssSelector("html>body>pre")).getText();
		APP_LOGS.debug("URL is.."+CONFIG.getProperty("fortunespecialstage"));
		APP_LOGS.debug("robots text is \n \n"+robot+'\n');
		Assert.assertEquals(robot,fortunespecialstageRobot);
	
	}
	
	//@Test (priority=13)
	public void test_fortunespecialprod_Robots(){
		driver.navigate().to(CONFIG.getProperty("fortunespecialprod"));
		String robot=driver.findElement(By.cssSelector("html>body>pre")).getText();
		APP_LOGS.debug("URL is.."+CONFIG.getProperty("fortunespecialprod"));
		APP_LOGS.debug("robots text is \n \n"+robot+'\n');
		Assert.assertEquals(robot,fortunespecialprodRobot);	
	}
	
	@Test
	public void test_images1ABP_Robots(){
		driver.navigate().to(CONFIG.getProperty("images1ABP"));
		String robot=driver.findElement(By.cssSelector("html>body>pre")).getText();
		APP_LOGS.debug("URL is.."+CONFIG.getProperty("images1ABP"));
		APP_LOGS.debug("robots text is \n \n"+robot+'\n');
		Assert.assertEquals(robot,images1ABP_Robots);
		
	}
		@Test
		public void test_imagesABP_Robots(){
			driver.navigate().to(CONFIG.getProperty("imagesABP"));
			String robot=driver.findElement(By.cssSelector("html>body>pre")).getText();
			APP_LOGS.debug("URL is.."+CONFIG.getProperty("imagesABP"));
			APP_LOGS.debug("robots text is \n \n"+robot+'\n');
			Assert.assertEquals(robot,imagesABP_Robots);
	}		
			@Test
			public void test_originABP_Robots(){
				driver.navigate().to(CONFIG.getProperty("originABP"));
				String origin_abp= driver.getCurrentUrl();
				Assert.assertEquals(origin_abp, "https://www.anandabazar.com/robots.txt");
				String robot=driver.findElement(By.cssSelector("html>body>pre")).getText();
				APP_LOGS.debug("URL is.."+CONFIG.getProperty("originABP"));
				APP_LOGS.debug("robots text is \n \n"+robot+'\n');
				Assert.assertEquals(robot,originABP_Robots);
	}			
				@Test
				public void test_origin_imagesABP_Robots(){
					driver.navigate().to(CONFIG.getProperty("origin_imagesABP"));
					String origin_imagesabp= driver.getCurrentUrl();
					Assert.assertEquals(origin_imagesabp, "https://images.anandabazar.com/robots.txt");
					String robot=driver.findElement(By.cssSelector("html>body>pre")).getText();
					APP_LOGS.debug("URL is.."+CONFIG.getProperty("origin_imagesABP"));
					APP_LOGS.debug("robots text is \n \n"+robot+'\n');
					Assert.assertEquals(robot,origin_imagesABP_Robots);	
	}				

					@Test
					public void test_origin_images1ABP_Robots()
					{
						driver.navigate().to(CONFIG.getProperty("origin_images1ABP"));
						String origin_images1abp= driver.getCurrentUrl();
						Assert.assertEquals(origin_images1abp, "https://images1.anandabazar.com/robots.txt");
						String robot=driver.findElement(By.cssSelector("html>body>pre")).getText();
						APP_LOGS.debug("URL is.."+CONFIG.getProperty("origin_images1ABP"));
						APP_LOGS.debug("robots text is \n \n"+robot+'\n');
						Assert.assertEquals(robot,origin_images1ABP_Robots);					
	}
	
					@Test
					public void test_telegraphindia_Robots()
					{
						driver.navigate().to(CONFIG.getProperty("telegraphindia"));
						String robot=driver.findElement(By.cssSelector("html>body>pre")).getText();
						APP_LOGS.debug("URL is.."+CONFIG.getProperty("telegraphindia"));
						APP_LOGS.debug("robots text is \n \n"+robot+'\n');
						Assert.assertEquals(robot,telegraphindia_Robots);					
	}				
					
					@Test
					public void test_imagesEbela_Robots()
					{
						driver.navigate().to(CONFIG.getProperty("imagesEbela"));
						String robot=driver.findElement(By.cssSelector("html>body>pre")).getText();
						APP_LOGS.debug("URL is.."+CONFIG.getProperty("imagesEbela"));
						APP_LOGS.debug("robots text is \n \n"+robot+'\n');
						Assert.assertEquals(robot,imagesEbela_Robots);					
	}				
						/*	 @DataProvider
     public Object [][] robotdata(){
			Object [][] data= new Object [3][2];
			
			data[0][0]="http://www.anandabazar.com/robots.txt";
			data[0][1]="User-Agent: *"+'\n'+ "Disallow: /1088475/";		
     	
			data[1][0]="http://ebela.in/robots.txt";
			data[1][1]="User-agent: *"+'\n'+"Disallow: /1088475/"+'\n'+"User-agent: Googlebot-News"+'\n'+"Disallow: /search-results-page/"+'\n'+"Disallow: /photogallery/";
			
			data[2][0]="http://t2online.com/robots.txt";
			data[2][1]="User-agent: Twitterbot"+'\n'+"Disallow: /"+'\n'+"User-agent: *"+'\n'+"Disallow:";
     	
     	return data;*/
	
 
	@AfterSuite(alwaysRun = true)
	public void tearDown() throws Exception {
	//	EmailUtil.sendmail();
		driver.quit();
  
	} 	
	
     }
	 

	 

