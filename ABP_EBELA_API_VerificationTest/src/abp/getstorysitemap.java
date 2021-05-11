package abp;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import apis.base;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class getstorysitemap extends base
{
	
	@BeforeMethod
	public void create() throws IOException, InterruptedException
	{
		setup();
		APP_LOGS.debug(CONFIG.getProperty("baseurl")+"/getstorysitemap");	
	}
	

	@Test
	public void get_article_by_Pq_Id() throws IOException, InterruptedException
	{
	
		//BaseURL or Host
			RestAssured.baseURI=CONFIG.getProperty("baseurl");
		
			given().
		       accept(ContentType.JSON).
		       param("starttime","1480464001000").
		       param("endtime","1480550399000").
		       param("pid", "2").
		       when().
		       get("/getstorysitemap").
		       then().assertThat().statusCode(200).and().contentType(ContentType.JSON).
		       body("[0].displayDate.year",equalTo(2016));
	
			APP_LOGS.debug("Test Complete");
	}
	
	@AfterMethod
	public void close()
	{
		
		
		
	}
}
