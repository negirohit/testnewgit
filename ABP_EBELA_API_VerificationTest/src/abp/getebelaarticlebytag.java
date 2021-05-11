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

public class getebelaarticlebytag extends base
{

	@BeforeMethod
	public void create() throws IOException, InterruptedException
	{
		setup();
		APP_LOGS.debug(CONFIG.getProperty("baseurl")+"/getebelaarticlebytag");	
	}
	
		//https://abpdemo.ttef.in/getebelaarticlebytag?tag=latestblog&start=0&end=9
		@Test
		public void get_ebela_article_by_tag() throws IOException, InterruptedException
		{
			
			//BaseURL or Host
				RestAssured.baseURI=CONFIG.getProperty("baseurl");
			
				given().
			       accept(ContentType.JSON).
			       param("tag","latestblog").
			       param("start","0").
			       param("end","9").
			       when().
			       get("/getebelaarticlebytag").
			       then().assertThat().statusCode(200).and().contentType(ContentType.JSON).
			       body("count",equalTo(9));
		
				APP_LOGS.debug("Test Complete");
		}
	
		@AfterMethod
		public void close()
		{
			
			
			
		}	
}
