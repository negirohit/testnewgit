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

public class getebelavideobytimestamp extends base
{

	@BeforeMethod
	public void create() throws IOException, InterruptedException
	{
		setup();
		APP_LOGS.debug(CONFIG.getProperty("baseurl")+"/getebelavideobytimestamp");	
	}
	
	@Test
	public void get_ebela_video_by_time_stamp() throws IOException, InterruptedException
	{
	
		//BaseURL or Host
			RestAssured.baseURI=CONFIG.getProperty("baseurl");
		
			given().
		       accept(ContentType.JSON).
		       param("starttime","1503534160000").
		       param("endtime","1514074960000").
		       when().
		       get("/getebelavideobytimestamp").
		       then().assertThat().statusCode(200).and().contentType(ContentType.JSON).
		       body("video[0].cmsContentId.",equalTo("1.704963"));
			
			APP_LOGS.debug("Test Complete");
	}
	
	@AfterMethod
	public void close()
	{
		
		
		
	}
}
