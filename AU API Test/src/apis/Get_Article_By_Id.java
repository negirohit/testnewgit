package apis;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.base;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Get_Article_By_Id extends base
{

	@BeforeMethod
	public void create() throws IOException, InterruptedException
	{
		setup();
		APP_LOGS.debug(CONFIG.getProperty("baseurl")+"/getArticleById");	
	}
	
	@Test
	public void get_Article_By_Id_API() throws IOException, InterruptedException
	{
	
		//BaseURL or Host
			RestAssured.baseURI=CONFIG.getProperty("baseurl");
		
			given().
		       accept("application/json;charset=utf-8").
		       param("cid","1.864067").
		       param("showbody","1").
		       param("withauthor","1").
		       param("relrequired","1").
		       param("withrelbody","1").
		       param("withrelauthor","1").
		       param("relstart","0").
		       param("relend","10").
		       param("relsearchlimit","10").
		       when().
		       get("/getArticleById").
		       then().assertThat().statusCode(200).and().contentType(ContentType.JSON).
		       and().body("url", equalTo("/celebrities-during-puja/durga-puja-2018-tollywood-celebrities-share-their-puja-plans-dgtl-1.864067")).
               and().body("title", equalTo("Durga Puja 2018: Tollywood celebrities share their Puja plans dgtl")).
               and().body("templateType", equalTo("anandabazar.AUVideoArticle")).
               and().body("ausection", equalTo("true")).
               and().body("isVideo", equalTo("true")).
               and().body("lastUpdatedDate.year", equalTo(2018)).
               and().body("catId", equalTo("2.1601")).
               and().body("isVentunoVideo", equalTo("true")).
               and().body("tags.tagId[0]", equalTo("Celebrity Durga Puja Celebration")).
               and().body("contentSubjectData.arts", equalTo("Festivals/Spl Events")).
               and().body("storyElements.videos", equalTo("true")).
               and().body("otherContentData.contentType", equalTo("Interview")).
               and().body("relatedArticles.articles.tags[0].tagId[0]", equalTo("Celebrity Durga Puja Celebration")).
               and().body("displayDate.year", equalTo(2018));
			
			APP_LOGS.debug("Test Complete");
	}
	
	@AfterMethod
	public void close()
	{
		
		
		
	}
	
}
