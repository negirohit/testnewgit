

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.sun.jna.platform.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

@SuppressWarnings("deprecation")
public class EventListenerProject implements WebDriverEventListener
{

	@Override
	public void afterChangeValueOf(WebElement arg0, WebDriver arg1) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterClickOn(WebElement arg0, WebDriver arg1) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterNavigateBack(WebDriver arg0) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterNavigateForward(WebDriver arg0) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterNavigateRefresh(WebDriver arg0) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterNavigateTo(String arg0, WebDriver arg1) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterScript(String arg0, WebDriver arg1) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeClickOn(WebElement arg0, WebDriver arg1) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateBack(WebDriver arg0) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateForward(WebDriver arg0) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateRefresh(WebDriver arg0) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateTo(String arg0, WebDriver arg1) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeScript(String arg0, WebDriver arg1) 
	{
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void onException(Throwable arg0, WebDriver arg1) 
	{
		// TODO Auto-generated method stub
		File file = ((TakesScreenshot)arg1).getScreenshotAs(OutputType.FILE);
		File destFile = new File("./pictureq12.png");
		try {
			org.apache.commons.io.FileUtils.copyFile(file, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	private Object newFile(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
