package AnandBazarTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import AnandBazarPage.HomePage;
import AnandBazarPage.SectionPage;
import AnandBazarPage.StoryPage;

public class pagetest extends TestBase {
	

	@Test(priority = 1)
	public void validate_lead_stories() throws Exception {
		HomePage homePage = new HomePage(driver);
		PageFactory.initElements(driver, homePage);
		homePage.pageRefresh().getTitle().assertSectionHeading()
		.clickOnThreeStories().assertOwlItemActive()
				.asserteventHeading();

	}

	@Test(priority = 2)
	public void validate_puja_parikrama() throws Exception {
		HomePage homePage = new HomePage(driver);
		PageFactory.initElements(driver, homePage);
		homePage.assertSectionHeading_2();

	}

	@Test(priority = 3)
	public void validate_celebrities_during_puja() throws Exception {
		HomePage homePage = new HomePage(driver);
		PageFactory.initElements(driver, homePage);
		homePage.clickOnSubStorySection();

	}

	@Test(priority = 4)
	public void validate_mahishasur_pala() throws Exception {
		HomePage homePage = new HomePage(driver);
		PageFactory.initElements(driver, homePage);
		homePage.clickOnMahishasurWidget();
				

	}

	@Test(priority = 5)
	public void validate_lifestyle_section() throws Exception {
		HomePage homePage = new HomePage(driver);
		PageFactory.initElements(driver, homePage);
		homePage.clickOnMahishasurWidget();

	}

	@Test(priority = 6)
	public void validate_food_section() throws Exception {
		HomePage homePage = new HomePage(driver);
		PageFactory.initElements(driver, homePage);
		homePage.clickOnFoodSectionLinks();

	}

	@Test(priority = 7)
	public void validate_homeAndDecor() throws Exception {
		HomePage homePage = new HomePage(driver);
		PageFactory.initElements(driver, homePage);
		homePage.clickOnGamesSectionLinks().getFooter();

	}

	@Test(priority = 8)
	public void validate_sectionPage() throws Exception {
		SectionPage sectionPage = new SectionPage(driver);
		PageFactory.initElements(driver, sectionPage);
		sectionPage.clickOnSectionpageLink().assertbreadCrumb().assertSectionHeading().clickOnSublinks();

	}

	@Test(priority = 9)
	public void validate_storyPage() throws Exception {
		StoryPage storyPage = new StoryPage(driver);
		PageFactory.initElements(driver, storyPage);
		storyPage
		.clickOnHomepageLink()
		.clickOnLeadStory()
		.assertbreadCrumb().assertpageTitle()
		.clickOnOtherStories()
		.assertOtherStories()
		.clickOnTags();
		
				
	}

}
