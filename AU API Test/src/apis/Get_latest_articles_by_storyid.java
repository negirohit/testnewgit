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

public class Get_latest_articles_by_storyid extends base
{

	@BeforeMethod
	public void create() throws IOException, InterruptedException
	{
		setup();
		APP_LOGS.debug(CONFIG.getProperty("baseurl")+"/getLatestArticles"+" "+"By Story ID");	
	}
	
	@Test
	public void get_Latest_Articles_Standard_Article() throws IOException, InterruptedException
	{
	
		//BaseURL or Host
			RestAssured.baseURI=CONFIG.getProperty("baseurl");
		
			given().
		       accept("application/json;charset=utf-8").
		       param("cid","1.863633").
		       param("templates","anandabazar.AUStandardArticle").
		       param("showbody","1").
		       param("withauthor","1").
		       param("start","0").
		       param("end","10").
		       param("searchlimit","10").
		       when().
		       get("/getLatestArticles").
		       then().assertThat().statusCode(200).and().contentType(ContentType.JSON).
		       body("count",equalTo(10)).
		       and().body("articles.displayDate[0].year", equalTo(2018));
	
			APP_LOGS.debug("Test Complete");
	}
	
	@AfterMethod
	public void close()
	{
		
		
		
	}
	
}
