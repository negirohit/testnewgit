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

public class getsitemapfeed extends base
{
		
	
	@BeforeMethod
	public void create() throws IOException, InterruptedException
	{
		setup();
		APP_LOGS.debug(CONFIG.getProperty("baseurl")+"/getsitemapfeed");	
	}
	
	
		@Test
		public void get_sitemap_feed() throws IOException, InterruptedException
		{
			
			//BaseURL or Host
				RestAssured.baseURI=CONFIG.getProperty("baseurl");
			
				given().
			       accept(ContentType.JSON).
			       param("starttime","1486447401000").
			       param("endtime","1486620201000").
			       param("pid","2").
			       param("showbody","1").
			       when().
			       get("/getsitemapfeed").
			       then().assertThat().statusCode(200).and().contentType(ContentType.JSON).
			       body("[0].displayDate.year",equalTo(2017));
		
				APP_LOGS.debug("Test Complete");
		}
	
		@AfterMethod
		public void close()
		{
			
			
			
		}
}
