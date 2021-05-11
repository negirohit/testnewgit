package workspace;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.ITestResult;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.cms_base;
import base.pageClass;


public class Openstory_assertion extends cms_base
{
	pageClass pageclass;
	
	@BeforeMethod
	public void create() throws IOException, InterruptedException
	{

	}


	@Test
	@Parameters("browser_name")
	public void openstory_assertion(String browser_name) throws IOException, InterruptedException, AWTException
	{
		String testname = "CMS : WorkSpace/Panner - Assert OpenStory count";
		setup(browser_name,testname);
		
		pageclass = new pageClass(driver);
		Thread.sleep(35000);
		pageclass.planner_page_wait();
		pageclass.select_website(3);
		Thread.sleep(3000); 
		String openstory_planner= pageclass.openstoryblock_click();
		pageclass.menu_click();
		Thread.sleep(1000);
		pageclass.menu_optionclick(2);
		Thread.sleep(3000);
		String openstory_wokrspace= pageclass.openstoryb();
	//	Assert.assertEquals(openstory_planner, openstory_wokrspace);
	}
	
	
	
	
}
