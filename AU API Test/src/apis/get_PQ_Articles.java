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

public class get_PQ_Articles extends base
{

	@BeforeMethod
	public void create() throws IOException, InterruptedException
	{
		setup();
		APP_LOGS.debug(CONFIG.getProperty("baseurl")+"/getPQArticles");	
	}
	
	@Test
	public void Get_Articles_By_Tags_API() throws IOException, InterruptedException
	{
	
		//BaseURL or Host
			RestAssured.baseURI=CONFIG.getProperty("baseurl");
		
			given().
		       accept("application/json;charset=utf-8").
		       param("pid","1.861773").
		       param("start","0").
		       param("end","5").
		       param("showbody","1").
		       param("withauthor","1").
		       when().
		       get("/getPQArticles").
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
