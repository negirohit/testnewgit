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

public class Get_Articles_Between_Time extends base
{

	
	
		@BeforeMethod
		public void create() throws IOException, InterruptedException
		{
			setup();
			APP_LOGS.debug(CONFIG.getProperty("baseurl")+"/getArticlesBetweenTime");	
		}
		
		@Test
		public void get_Articles_Between_Time() throws IOException, InterruptedException
		{
		
			//BaseURL or Host
				RestAssured.baseURI=CONFIG.getProperty("baseurl");
			
				given().
			       accept("application/json;charset=utf-8").
			       param("templates","anandabazar.AUStandardArticle,anandabazar.AUPhotoGalleryArticle,anandabazar.AUVideoArticle").
			       param("starttime","1535740200000").
			       param("endtime","1536863400000").
			       param("searchlimit","10").
			       when().
			       get("/getArticlesBetweenTime").
			       then().assertThat().statusCode(200).and().contentType(ContentType.JSON).
			       and().body("count", equalTo(10)).
			       and().body("articles.displayDate[0].year", equalTo(2018));
				
				APP_LOGS.debug("Test Complete");
		}
		
		@AfterMethod
		public void close()
		{
			
			
			
		}
}
