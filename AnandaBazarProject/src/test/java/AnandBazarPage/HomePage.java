package AnandBazarPage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import AnandBazarTest.TestBase;

public class HomePage extends TestBase {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	private static final String PAGETITLE = ".d-in-blk.logo-abp>img"; 
    private static final String LEAD_STORY = ".au-lead-story";
    private static final String THREE_STORIES = ".grey-bg";
    private static final String SECTION_HEADING = ".section-heading>h2";
    private static final String OWL_ACTIVE_ITEM = ".owl-item.active";
    private static final String EVENT_HEADING = ".au-event-heading";
    private static final String LOAD_MORE_CONTENT = "//*[@id='load-more-content_2.1599']/div[2]/div[1]/ul/li[1]/h5/a";
    private static final String FOUR_COLUMN_STORY = ".four-column-story>ul>li>h5>a";
    private static final String SUB_STORY_SECTION = ".sub-story-caption>h3>a";
    private static final String FOUR_STORY_SECTION_COLUMN = ".col-sm-6";
    private static final String LOAD_MORE_BUTTON = ".one>span>a";
    private static final String MAHISHASUR_PALA_WIDGET = ".maheshsur-pala-lead-widget";
    private static final String MAHISHASUR_PALA_SUBLINKS = ".maheshsur-pala-widget .responsive";
    private static final String MAIN_CARD_LINKS = ".main-card-inner";
    private static final String GAMES_SECTION = ".btn-game-01";
    private static final String FOOTER = ".au-footer";
    private static final String CROSS_BUTTON = "html>body>div>a";
    private static final String BREAD_CRUMB = ".breadcrumb";
    private static final String FOOD_SECTION_WIDGET = ".item>h5>a";
    
	

	// Using FindBy for locating elements
	@FindBy(css = PAGETITLE)
	WebElement pageTitle;
	@FindBy(css = BREAD_CRUMB)
	WebElement breadCrumb;
	@FindBy(css = CROSS_BUTTON)
	WebElement crossButton;
	@FindBy(css = FOOTER)
	WebElement footer;
	@FindBys({@FindBy(css = GAMES_SECTION)})
	private List<WebElement> gamesSection;
	@FindBy(css = MAHISHASUR_PALA_WIDGET)
	WebElement mahishasurPala;
	@FindBys({@FindBy(css=FOUR_STORY_SECTION_COLUMN)})
	private List<WebElement> fourStorySectionColumn;
	@FindBys({@FindBy(css=MAIN_CARD_LINKS)})
	private List<WebElement> mainCardLinks;
	@FindBys({@FindBy(css=MAHISHASUR_PALA_SUBLINKS)})
	private List<WebElement> mahishasurPalaSublinks;
	@FindBy(css = SUB_STORY_SECTION)
	WebElement subStorySection;
	@FindBys({@FindBy(css=LEAD_STORY)})
	private List<WebElement> leadStory;
	@FindBys({@FindBy(css=THREE_STORIES)})
	private List<WebElement> threeStories;
	@FindBys({@FindBy(css=SECTION_HEADING)})
	private List<WebElement> sectionHeading;
	@FindBys({@FindBy(css=OWL_ACTIVE_ITEM)})
	private List<WebElement> owlActiveItem;
	@FindBys({@FindBy(css=EVENT_HEADING)})
	private List<WebElement> eventHeading;
	@FindBy(css = LOAD_MORE_CONTENT)
	WebElement loadMoreContent;
	@FindBys({@FindBy(css=FOUR_COLUMN_STORY)})
	private List<WebElement> fourColumnStory;
	@FindBys({@FindBy(css=FOOD_SECTION_WIDGET)})
	private List<WebElement> foodSectionWidgetLinks;
	@FindBys({@FindBy(css=LOAD_MORE_BUTTON)})
	private List<WebElement> loadMorebutton;
	
	
	public HomePage getTitle() throws InterruptedException {
		Thread.sleep(10000);
	pageTitle.isDisplayed();
		return this;
		
	}
	
	public HomePage pageRefresh() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(5000);
			return this;
			
		}
	
	public HomePage clickCrossButton() throws InterruptedException {
		if(crossButton.isDisplayed()) {
			crossButton.click();
		}else {
			System.out.println("no cross button");
		}
			return this;
		}
	
	
	public HomePage clickOnLeadStory() {
		leadStory.get(0).click();
		scroll(); 
		return this;
	}
	
	public HomePage clickOnThreeStories() throws InterruptedException {
		Thread.sleep(5000);
		scroll();
		threeStories.get(0).click();
		breadCrumb.isDisplayed();
		driver.navigate().back();
		Thread.sleep(5000);
		scroll(); 
		return this;
	}
	
	public HomePage assertSectionHeading() {
		sectionHeading.get(0).getText();
		//Assert.assertEquals(sectionHeading.get(0).getText(), "সাজাব যতনে");
		return this;
	}
	
	public HomePage assertOwlItemActive() {
		owlActiveItem.get(0).getText();
		return this;
	}
	
	public HomePage assertSectionHeading_2() {
		sectionHeading.get(1).getText();
		return this;
	}
	
	public HomePage clickOnFoodSectionLinks() throws InterruptedException {
		foodSectionWidgetLinks.get(0).click();
		breadCrumb.isDisplayed();
		driver.navigate().back();
		Thread.sleep(5000);
		return this;
	}
	
	public HomePage asserteventHeading() {
		eventHeading.get(1).isDisplayed();
		return this;
	}
	
	
	public HomePage clickOnThreeStories_2() throws InterruptedException {
		threeStories.get(6).click();
		driver.navigate().back();
		Thread.sleep(5000);
		scroll(); 
		return this;
	}
	
	public HomePage assertSectionHeading_3() {
		sectionHeading.get(2).getText();
		return this;
	}
	
	public HomePage clickOnfourColumnStory() throws InterruptedException {
		Thread.sleep(5000);
		scroll();
		scroll();
		fourColumnStory.get(0).click();
		driver.navigate().back();
		Thread.sleep(5000);
		scroll(); 
		return this;
	}
	
	public HomePage assertSectionHeading_4() {
		sectionHeading.get(3).getText();
		return this;
	}
	
	public HomePage clickOnSubStorySection() throws InterruptedException {
		scroll();
		scroll();
		scroll();
		subStorySection.click();
		breadCrumb.isDisplayed();
		driver.navigate().back();
		Thread.sleep(5000);
		return this;
	}
	
	public HomePage clickOnSubStorySectionColumn() throws InterruptedException {
		fourStorySectionColumn.get(5).click();
		driver.navigate().back();
		Thread.sleep(5000); 
		return this;
	}
	
	public HomePage clickOnLoadMoreButton() throws InterruptedException {
		loadMorebutton.get(2).click();
		breadCrumb.isDisplayed();
		driver.navigate().back();
		Thread.sleep(5000);
		scroll(); 
		return this;
	}
	
	public HomePage assertSectionHeading_5() {
		sectionHeading.get(4).getText();
		return this;
	}
	
	public HomePage clickOnMahishasurWidget() throws InterruptedException {
		mahishasurPala.click();
		breadCrumb.isDisplayed();
		driver.navigate().back();
		waitFor(60);
		return this;
	}
	
	public HomePage clickOnMahishasurWidgetSublinks() throws InterruptedException {
		mahishasurPalaSublinks.get(0).click();
		driver.navigate().back();
		Thread.sleep(5000); 
		scroll();
		return this;
	}
	
	public HomePage assertOwlItemActive_3() throws InterruptedException {
		owlActiveItem.get(3).click();
		driver.navigate().back();
		Thread.sleep(5000); 
		scroll();
		return this;
	}
	
	public HomePage assertSectionHeading_6() {
		sectionHeading.get(5).getText();
		return this;
	}
	
	public HomePage clickOnMainCardSublinks() throws InterruptedException{
		Thread.sleep(5000);
		mahishasurPalaSublinks.get(3).click();
		breadCrumb.isDisplayed();
		driver.navigate().back();
		waitFor(50); 
		scroll();
		return this;
	}
	
	public HomePage assertSectionHeading_7() {
		sectionHeading.get(6).getText();
		return this;
	}
	
	public HomePage assertOwlItemActive_4() throws InterruptedException {
		owlActiveItem.get(7).click();
		driver.navigate().back();
		Thread.sleep(5000);
		scroll();
		return this;
	}
	
	public HomePage assertSectionHeading_8() {
		sectionHeading.get(7).getText();
		return this;
	}
	
	public HomePage clickOnGamesSectionLinks() throws InterruptedException{
		scroll();
		scroll();
		scroll();
		scroll();
		scroll();
		gamesSection.get(0).click();
		driver.navigate().back();
		Thread.sleep(5000);
		scroll();
		return this;
	}
	
	public HomePage getFooter() {
		footer.isDisplayed();
			return this;
			
		}
	

	
		
}
