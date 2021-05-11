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

public class Get_Articles_By_Tags extends base
{

	@BeforeMethod
	public void create() throws IOException, InterruptedException
	{
		setup();
		APP_LOGS.debug(CONFIG.getProperty("baseurl")+"/getArticlesByTags");	
	}
	
	@Test
	public void Get_Articles_By_Tags_API() throws IOException, InterruptedException
	{
	
		//BaseURL or Host
			RestAssured.baseURI=CONFIG.getProperty("baseurl");
		
			given().
		       accept("application/json;charset=utf-8").
		       param("cid","1.864067").
		       param("showbody","1").
		       param("withauthor","1").
		       param("start","0").
		       param("end","5").
		       param("searchlimit","5").
		       param("tag","\"Celebrity Durga Puja Celebration\" OR \"Durga Puja Celebration\"").
		       param("deptid","2.1601").
		       param("templates","anandabazar.AUStandardArticle,anandabazar.AUPhotoGalleryArticle,anandabazar.AUVideoArticle").
		       when().
		       get("/getArticlesByTags").
		       then().assertThat().statusCode(200).and().contentType(ContentType.JSON).
		       and().body("count", equalTo(5)).
		       and().body("articles.displayDate[0].year", equalTo(2018));
			
			APP_LOGS.debug("Test Complete");
	}
	
	@AfterMethod
	public void close()
	{
		
		
		
	}
	
}
