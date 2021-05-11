package AnandBazarPage;



import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;


import AnandBazarTest.TestBase;

public class StoryPage extends TestBase {
	WebDriver driver;

	public StoryPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private static final String HOME_PAGE_LINK = ".au-icon-home";
	private static final String CONTENT_BLOCK = "#emailinput";
	private static final String BREAD_CRUMB = ".breadcrumb";
	private static final String OTHER_STORIES = ".other-stories.rt-sub-stories>ul>li>h5>a";
	private static final String OTHER_STORIES_BOTTOM = ".other-stories>ul>li>h5>a";
	private static final String TAGS = ".tag-left-section>a";
	private static final String LEAD_STORY = ".au-lead-story>h4>a";
	public String pageTitile; 

	 @FindBy(css = HOME_PAGE_LINK)
	WebElement homePageLink;
	 @FindBy(css = CONTENT_BLOCK)
	WebElement contentBlock;
	@FindBys({@FindBy(css=LEAD_STORY)})
	private List<WebElement> leadStory;
	@FindBys({ @FindBy(css = TAGS) })
	private List<WebElement> tags;
	@FindBys({ @FindBy(css = OTHER_STORIES) })
	private List<WebElement> otherStories;
	@FindBys({ @FindBy(css = OTHER_STORIES_BOTTOM) })
	private List<WebElement> otherStoriesbottom;
	@FindBy(css = BREAD_CRUMB)
	WebElement breadCrumb;
	
	
	public StoryPage clickOnHomepageLink() throws InterruptedException {
		waitFor(70);
		homePageLink.click();
		waitFor(60);
		return this;
	}
	public StoryPage clickOnLeadStory() {
		driver.navigate().to("https://anandautsav.anandabazar.com/durgotsav-gallery/durga-puja-2018-weird-shoes-to-try-this-festive-season-dgtl-1.882097?ref=anandautsav-hm-new-stry");
		return this;
	}
	
	public StoryPage clickOnOtherStories() throws InterruptedException {
		waitFor(10);
		otherStories.get(0).click();
		breadCrumb.isDisplayed();
		pageTitile = driver.getTitle();
		driver.navigate().back();
		waitFor(30);
		scroll();
		return this;
	}
	
	public StoryPage clickOnTags() throws InterruptedException {
		WebElement element = driver.findElements(By.cssSelector(TAGS)).get(0);
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.perform();
		breadCrumb.isDisplayed();
		driver.navigate().back();
		waitFor(30);
		
		return this;
	}
	
	public StoryPage assertOtherStories() {
		otherStoriesbottom.get(0).click();
		breadCrumb.isDisplayed();
		Assert.assertNotEquals(driver.getTitle(), pageTitile);
		driver.navigate().back();
		waitFor(30);
		return this;
	}
	
	public StoryPage assertbreadCrumb() {
		waitFor(20);
		breadCrumb.isDisplayed();
		return this;
	}
	
	public StoryPage assertpageTitle() {
		driver.getTitle();
		scroll();
		return this;
	}
}
