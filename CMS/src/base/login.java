package base;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class login extends cms_base
{

	
	@Test
	@Parameters("browser_name")
	public void login_pagetest(String browser_name) throws IOException, InterruptedException
	{
		String testname = "CMS : Login";
		setup(browser_name,testname);
	}
	
	@Test
	@Parameters("browser_name")
	public void hamburger_click(String browser_name) throws IOException, InterruptedException
	{
		String testname = "CMS : Hamburger Click";
		setup(browser_name,testname);
		
		pageClass pageclass = new pageClass(driver);
		Thread.sleep(5000);
		pageclass.planner_page_wait();
		pageclass.menu_click();
		Thread.sleep(2000);
		pageclass.newstory_click();
	}
	
	
	
	
}
