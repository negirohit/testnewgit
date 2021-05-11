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

public class getebelaphotosbytimestamp extends base
{

	@BeforeMethod
	public void create() throws IOException, InterruptedException
	{
		setup();
		APP_LOGS.debug(CONFIG.getProperty("baseurl")+"/getebelaphotosbytimestamp");	
	}
	
	
		@Test
		public void get_ebela_photos_by_timestamp() throws IOException, InterruptedException
		{
		
			//BaseURL or Host
				RestAssured.baseURI=CONFIG.getProperty("baseurl");
			
				given().
			       accept(ContentType.JSON).
			       param("starttime","1463423400000").
			       param("endtime","1463509799000").
			       when().
			       get("/getebelaphotosbytimestamp").
			       then().assertThat().statusCode(200).and().contentType(ContentType.JSON).
			       body("[0].displayDate.year",equalTo(2016));
				
				APP_LOGS.debug("Test Complete");
		}
		
		
		@AfterMethod
		public void close()
		{
			
			
			
		}
}
