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

public class gettopicsbytag_ABP extends base
{

	@BeforeMethod
	public void create() throws IOException, InterruptedException
	{
		setup();
		APP_LOGS.debug(CONFIG.getProperty("baseurl")+"/gettopicsbytag/?showbody=2&pid=2&start=0&end=10");	
	}
	
	@Test
	public void get_topics_by_tag_ABP() throws IOException, InterruptedException
	{
	
		//BaseURL or Host
			RestAssured.baseURI=CONFIG.getProperty("baseurl");
		
			given().
		       accept(ContentType.JSON).
		       param("tag","\"ritabrata\"+\"banerjee\"").
		       when().
		       get("/gettopicsbytag/?showbody=2&pid=2&start=0&end=10").
		       then().assertThat().statusCode(200).and().contentType(ContentType.JSON).
		       body("count",equalTo(10));
	
			APP_LOGS.debug("Test Complete");
	}

	@AfterMethod
	public void close()
	{
		
		
		
	}
}
