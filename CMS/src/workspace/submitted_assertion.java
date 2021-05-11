package workspace;

import java.awt.AWTException;
import java.io.IOException;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.ITestResult;

import base.cms_base;
import base.pageClass;


public class submitted_assertion extends cms_base
{
	pageClass pageclass;
	
	@BeforeMethod
	public void create() throws IOException, InterruptedException
	{

	}


	@Test
	@Parameters("browser_name")
	public void for_approvalstory_assertion(String browser_name) throws IOException, InterruptedException, AWTException
	{
		String testname = "CMS : WorkSpace/Panner - Assert Submitted Story count";
		setup(browser_name,testname);
		
		pageclass = new pageClass(driver);
		Thread.sleep(5000);
		pageclass.planner_page_wait();
		pageclass.select_website(3);
		Thread.sleep(6000); 
		String openstory_planner= pageclass.approval();
		Thread.sleep(1000); 
		pageclass.menu_click();
		Thread.sleep(1000);
		pageclass.menu_optionclick(2);
		Thread.sleep(6000);
		String openstory_wokrspace= pageclass.forapproval_b();
		Assert.assertEquals(openstory_planner, openstory_wokrspace);
		
	}
	
	
}
