package Ebela.Mvn;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.xml.sax.Locator;



public class pageClass 
{
	
	@FindBy(how=How.ID, using="wzrk-cancel")
	WebElement Clevertap;

	@FindBy(how=How.CSS, using=".ebela-sprite.logo") 
	WebElement EbelaLogo;
	
	@FindAll({@FindBy(css= "#menu-anchor")})
	public List<WebElement> SportsNav;
	
	@FindAll({@FindBy(css= ".trending_scrollar_list")})
	public List<WebElement> TrendingList;
	
	@FindBy(how=How.CSS, using=".fa.fa-facebook.fa-stack-1x")
	WebElement facebook;
	
	@FindBy(how=How.CSS, using=".fa.fa-twitter.fa-stack-1x")
	WebElement Twitter;
	
	@FindAll({@FindBy(css= ".black_footer_span2>a")})
	public List<WebElement> FooterPrivacy;
	
	@FindBy(how=How.CSS, using=".opinion_col.pos-rel>h3")
	public By pollwait;
	
	@FindAll({@FindBy(css= ".radio-inline>input")})
	public List<WebElement> radiobttn;
	
	
	@FindBy(how=How.CSS, using=".btn.btn-default.opinion_submit")
	WebElement submitpoll;
	
	@FindBy(how=How.XPATH, using=".//*[@id='opinoin_ques']/p")
	WebElement pollresult;
	
	@FindAll({@FindBy(css= ".Readerchoice>span")})
	public List<WebElement> curatedstories;
	
	@FindBy(how=How.CSS, using = ".fa.fa-2x.fa-arrow-circle-up")
	WebElement BackToTopBttn ;
	public void clevertap_click()
	{
		Clevertap.click();	
	}
	
	public void logo_click()
	{
		EbelaLogo.click();
	}
	
	public void sport_nav_click()
	{
		
		SportsNav.get(3).click();
	}
	
	public void trending_check(int i) throws Exception
	{
		
		TrendingList.get(i).click();
		Thread.sleep(5000);
		
	}
	
	public void facebook_click()
	{
		facebook.click();
	}
	
	public void twitter_click()
	{
		
		Twitter.click();
	}
	
	public void windowhandles(WebDriver driver,String firstwindowhandle)
	{
		
		String secondwindowhandle = " ";
	    Set<String> windowhandles = driver.getWindowHandles();
	    
	    for(String id : windowhandles)
	    {
	    	
	    	if(!firstwindowhandle.equalsIgnoreCase(id))
	    		secondwindowhandle=id;
	    	
	    }
	    driver.switchTo().window(secondwindowhandle);
		
	}
	
	public void footer_click()
	{
		
		FooterPrivacy.get(1).click();
		
	}
	
	public void Poll_click(EventFiringWebDriver firingdriver) throws Exception
	{
		Thread.sleep(5000);
	    JavascriptExecutor jse = (JavascriptExecutor)firingdriver;
	    	jse.executeScript("window.scrollBy(0,500)", "");
	    	
	    	Thread.sleep(3000);
	    	
		radiobttn.get(1).click();
		
		Thread.sleep(2000);
		
		submitpoll.click();
		
		new WebDriverWait(firingdriver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".qtn")));
		
		Assert.assertTrue(pollresult.isDisplayed());
		
	}
	
	public void BackToTop(EventFiringWebDriver firingdriver) throws Exception
	{
		
		 JavascriptExecutor jse = (JavascriptExecutor)firingdriver;
	    	jse.executeScript("window.scrollBy(0,1500)", "");
	
	    	BackToTopBttn.click();
	}
	
	public int TotalCuratedStories()
	{
		
		int totalsize = curatedstories.size();

		return totalsize;
		
		
	}
}
