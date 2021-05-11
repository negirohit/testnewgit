package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PageClass 
{

	//homepage
	@FindAll({@FindBy(css=".PQTopStories")})
	public List<WebElement> pqlist;
	                            
	//@FindBy(how=How.CSS, using="div.col-lg-12.col-md-12.col-sm-12.col-xs-12.leftpadding0.rightpadding0.columns.bottommargin20 > h1")
	//WebElement storyheadline;
	
	@FindAll({@FindBy(css="div.col-lg-12.col-md-12.col-sm-12.col-xs-12.leftpadding0.rightpadding0.columns.bottommargin20 > h1")})
	public List<WebElement> storyheadline;
	
	@FindAll({@FindBy(css=".leadstoryheading>a")})
	public List<WebElement> leadstory;
	
	//@FindBy(how=How.CSS, using=".abp-new-carousel-wrap>h1")
	//WebElement photoheadline;
	
	@FindAll({@FindBy(css=".abp-new-carousel-wrap>h1")})
	public List<WebElement> photoheadline;
	
	@FindBy(how=How.CSS, using=".abp-new-carousel-wrap>h1")
	WebElement photohead;
	
	@FindBy(how=How.CSS, using="div.col-lg-12.col-md-12.col-sm-12.col-xs-12.leftpadding0.rightpadding0.columns.bottommargin20 > h1")
	WebElement storyhead;
	//sectionpage
	
	@FindBy(how=How.CSS, using=".col-lg-12.leadstory-section-heading.leftpadding0.rightpadding0>a")
	WebElement leadsectionstory;
	

	@FindAll({@FindBy(css=".sectionstoryheading.toppadding10>a")})
	public List<WebElement> featuredsectionstory;
	
	//specialpage
	
	@FindAll({@FindBy(css=".gallery-item-caption")})
	public List<WebElement> photogallerystoryone;
	
	@FindBy(how=How.CSS, using=".abp-new-carousel-wrap>h1")
	WebElement photostoryheadline;
	
	@FindAll({@FindBy(css=".horoscope-sign>h3")})
	public List<WebElement> rashifal;
	
	@FindBy(how=How.CSS, using=".rf-details-tab>h4>strong")
	WebElement rashifalhead;
	
	@FindBy(how=How.CSS, using=".col-md-12.col-xs-12.rf-desc-2>h3>strong")
	WebElement rashifalsubhead;
	
	@FindAll({@FindBy(css=".col-md-12.col-xs-12.rf-desc-2.rf-birthday-desc>h3")})
	public List<WebElement> birthdayheading;
	
	@FindBy(how=How.CSS, using=".col-lg-12.col-md-12.col-sm-12.col-xs-12.leftpadding0.rightpadding0.columns.bottommargin20>h1")
	WebElement QnAhead;
	
	@FindAll({@FindBy(css=".media>a>h4")})
	public List<WebElement> jyotish;
	
	
	
	@FindBy(how=How.CSS, using=".col-md-12.col-xs-12>h1")
	WebElement jyotishhead;
	
	
	//searchpage
	
	@FindBy(how=How.CSS, using="#search-open2")
	WebElement searchbutton;
	
	@FindBy(how=How.CSS, using="#search-text")
	WebElement searchtext;
	
	@FindBy(how=How.XPATH, using="html/body/header/div/div[5]/div/div[1]/div[2]/form/a/i")
	WebElement searchclick;
	
	@FindBy(how=How.CSS, using=".search-header")
	WebElement searchheader;
	
	//homepage
	public void homepq(int i) throws InterruptedException
	{
		Thread.sleep(2000);
		pqlist.get(i).click();
		for (WebElement j : pqlist) 
		{
		System.out.println(j.getText());	
		}
	}
	
	public boolean storyhead(JavascriptExecutor jse) throws InterruptedException
	{
		Thread.sleep(5000);
		
		jse.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(3000);
		
		boolean headlinevalue1 = storyheadline.size()>0;
		boolean headlinevalue2 = photoheadline.size()>0;
		
		
		if(headlinevalue1==true)
		{
		
			boolean newheadlinevalue1 = storyhead.isDisplayed();
			if(newheadlinevalue1 ==true)
			{
				return true;
			}	
			
			else
			{
				Assert.fail();
				return false;
			}
			
		}
		
		if(headlinevalue2==true)
		{
			
			boolean newheadlinevalue2 = photohead.isDisplayed();
			if( newheadlinevalue2==true)
			{
				return true;
			}	
			
			else
			{
				Assert.fail();
				return false;
			}
			
		}
		
		else
		{
			Assert.fail("404 Url Found");
			return false;
			
		}
			

		
	}
	
	
	
	public void leadstoryclick(int i) throws InterruptedException
	{
		Thread.sleep(5000);
		leadstory.get(i).click();
	}
	//sectionpage
	
	public void leadsectionstoryclick() throws InterruptedException
	{
		Thread.sleep(5000);
		leadsectionstory.click();
	}
	
	
	public void featuredsectionstoryclick(int i) throws InterruptedException
	{
		Thread.sleep(5000);
		featuredsectionstory.get(i).click();
	}

	
	//specialpage
	
	public void photogallerystoryOneClick(int i) throws InterruptedException
	{
		Thread.sleep(5000);
		photogallerystoryone.get(i).click();
	}
	
	
	public boolean photostoryhead()
	{
		
		boolean headlinevalue = photostoryheadline.isDisplayed();
		if(headlinevalue==true)
		{
			return headlinevalue;
		}	
		else
		{
			Assert.fail();
			return false;
		}
	}
	//searchpage	
	
	
	public void JR_rashifal(int i) throws InterruptedException
	{
		Thread.sleep(5000);
		rashifal.get(i).click();
	}
	
	public boolean rashihead()
	{
		
		boolean headlinevalue = rashifalhead.isDisplayed();
		boolean headlinevalue2 = rashifalsubhead.isDisplayed();
		
		if(headlinevalue && headlinevalue2==true)
		{
			return headlinevalue;
		}	
		else
		{
			Assert.fail();
			return false;
		}
	}
	
	public boolean birthdayhead()
	{
		
		boolean headlinevalue = birthdayheading.get(0).isDisplayed();
		boolean headlinevalue2 = birthdayheading.get(1).isDisplayed();
		boolean headlinevalue3 = birthdayheading.get(2).isDisplayed();
		if(headlinevalue && headlinevalue2 && headlinevalue3==true)
		{
			return headlinevalue;
		}	
		else
		{
			Assert.fail();
			return false;
		}
	}
	
	public boolean QnAhead_display()
	{
		boolean headlinevalue = QnAhead.isDisplayed();
		if(headlinevalue ==true)
		{
			return headlinevalue;
		}	
		else
		{
			Assert.fail();
			return false;
		}
	}
	
	public void JR_jyotish(int i) throws InterruptedException
	{
		Thread.sleep(5000);
		jyotish.get(i).click();
	}
	
	public boolean jyotishkotha_display()
	{
		boolean headlinevalue = jyotishhead.isDisplayed();
		if(headlinevalue ==true)
		{
			return headlinevalue;
		}	
		else
		{
			Assert.fail();
			return false;
		}
	}
	
	
	public void searchcheck()
	{
		searchbutton.click();
	}


	public void searchenter(String stringname)
	{
		searchtext.sendKeys(stringname);
	}

	public void searchenterpress()
	{
		searchtext.sendKeys(Keys.ENTER);
	}
	public void searchclick()
	{
		searchclick.click();
	}
	
	public void searchheader()
	{
		if (searchheader.isDisplayed()) 
		{
		Assert.assertTrue(true);	
		} 
		else 
		{
		Assert.fail();
		}
		
	}
	
	
}

