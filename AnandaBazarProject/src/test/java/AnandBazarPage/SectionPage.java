package AnandBazarPage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.testng.Assert;

import AnandBazarTest.TestBase;

public class SectionPage extends TestBase {
	WebDriver driver;

	public SectionPage(WebDriver driver) {
		this.driver = driver;
	}

	private static final String SECTION_HEADING = ".section-heading>h1";
	private static final String SUB_LINKS = ".col-md-8.col-sm-12.col-xs-12.section-listing.mar-t10>ul>li>h3>a";
	private static final String SECTION_PAGE_LINK = ".nav.navbar-nav>li>a";
	private static final String BREAD_CRUMB = ".breadcrumb";

	@FindBy(css = SECTION_HEADING)
	WebElement sectionHeading;
	@FindBy(css = BREAD_CRUMB)
	WebElement breadCrumb;
	@FindBys({ @FindBy(css = SUB_LINKS) })
	private List<WebElement> subLinks;
	@FindBys({ @FindBy(css = SECTION_PAGE_LINK) })
	private List<WebElement> sectionPageLink;

	public SectionPage clickOnSectionpageLink() throws InterruptedException {
		sectionPageLink.get(1).click();
		waitFor(60);
		return this;
	}
	
	public SectionPage assertbreadCrumb() {
		breadCrumb.isDisplayed();
		return this;
	}


	public SectionPage assertSectionHeading() {
		return this;
	}

	public SectionPage clickOnSublinks() throws InterruptedException {
		subLinks.get(0).click();
		breadCrumb.isDisplayed();
		driver.navigate().back();
		Thread.sleep(5000);
		scroll();
		return this;
	}

}
