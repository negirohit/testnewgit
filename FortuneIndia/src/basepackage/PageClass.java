package basepackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageClass 
{
	//EventFiringWebDriver firingdriver;
	
	//homepage
	@FindBy(how=How.XPATH, using = ".//*[@id='container']/div[2]/div[3]/section[1]/div[3]/article[1]/a/h3/span")
	WebElement homestory;
	
	@FindAll({@FindBy(xpath=".//*[@id='google_ads_iframe_/1088475/Ft_Desk_1140x200_HM_0__container__']")})
	public List<WebElement> find_homebanner;
	
	@FindBy(how=How.CSS, using="#slick-slide-control00")
	WebElement carousal1;
	
	@FindBy(how=How.CSS, using="#slick-slide-control01")
	WebElement carousal2;
	
	@FindBy(how=How.CSS, using="#slick-slide-control02")
	WebElement carousal3;
	
	@FindAll({@FindBy(css=".home-carousel__story__headline.js-truncate-two-line")})
	public List<WebElement> carousalstory;
	
	
	
	//sectionpage
	@FindBy(how=How.CSS, using="#toggle-main-nav")
	WebElement menu;
	
	@FindAll({@FindBy(css=".menu-anchor.section-anchor")})
	public List<WebElement> menuoptions;
	
	@FindAll({@FindBy(css=".headline>a")})
	public List<WebElement> sectionstories;
	
	@FindBy(how=How.CSS, using=".section-lead__image-container>a>figure>img")
	WebElement sectionleadstory;
	
	
	
	//specialpage
	@FindBy(how=How.CSS, using=".explore_500")
	WebElement explore500;
	
	@FindAll({@FindBy(css = ".image-grayscale")})
	public List<WebElement> mpwprofile1;
	
	//searchpage
	@FindBy(how=How.CSS, using="#toggle-search-bar")
	WebElement searchbtn;
	
	@FindBy(how=How.CSS, using="#story-search-input")
	WebElement searchinput;
	
	//homepage
	public void homestory_click(EventFiringWebDriver firingdriver) throws InterruptedException
	{
			
		System.out.println(find_homebanner.size());
		if(find_homebanner.size()==1)
		{
			System.out.println(find_homebanner.size());
			scroll("250",firingdriver);
			Thread.sleep(1000);
		}
		
			
			homestory.click();
		
			Thread.sleep(1000);	
	}
	
	public void homeCarousalClick(EventFiringWebDriver firingdriver) throws InterruptedException
	{
			
		System.out.println(find_homebanner.size());
		if(find_homebanner.size()==1)
		{
			System.out.println(find_homebanner.size());
			scroll("1500",firingdriver);
			Thread.sleep(2000);
		}
		carousal1.click();
		carousal2.click();
		carousal3.click();
		Thread.sleep(1000);
	}
	
	//sectionpage
	public void menu_click()
	{
		menu.click();
	}
	
	public void menuoptions_click(int i)
	{
		int count = 0;
		for(WebElement  a : menuoptions)
		{
			System.out.println(a.getText());
			count++;
			System.out.println(count+"total");
			
		}
	
		System.out.println(menuoptions);
		menuoptions.get(i).click();
	}
	
	public void sectionstory_click(int i)
	{
		sectionstories.get(i).click();
	}
	
	public void sectionleadstory_click()
	{
		sectionleadstory.click();
	}
	
	//specialpage
	public void special500_click()
	{
		
		explore500.click();
		
	}
	
	public void mpw_click()
	{

	//	(new WebDriverWait(driver, 30))
	//	.until(ExpectedConditions.visibilityOf(mpwprofile1.get(0)));
		 
		mpwprofile1.get(0).click();
		
	}
	
	//searchpage	
	public void search_click(WebDriver driver,String text)
	{
		
		searchbtn.click();
		searchinput.sendKeys(text);
		searchinput.sendKeys(Keys.ENTER);
	}
	
	//misc
	public void scroll(String scroll,EventFiringWebDriver firingdriver)
	{
		
		
		JavascriptExecutor jse = (JavascriptExecutor)firingdriver;	
		jse.executeScript("window.scrollBy(0,"+scroll+")", "");
		
	}
	
}

