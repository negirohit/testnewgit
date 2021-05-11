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

public class getebelavideoarticlebyid extends base
{
	@BeforeMethod
	public void create() throws IOException, InterruptedException
	{
		setup();
		APP_LOGS.debug(CONFIG.getProperty("baseurl")+"/getebelavideoarticlebyid");	
	}

	@Test
	public void get_ebela_video_article_by_id() throws IOException, InterruptedException
	{
		
		//BaseURL or Host
			RestAssured.baseURI=CONFIG.getProperty("baseurl");
		
			given().
		       accept(ContentType.JSON).
		       param("cid","1.663217").
		       when().
		       get("/getebelavideoarticlebyid").
		       then().assertThat().statusCode(200).and().contentType(ContentType.JSON).
		       body("video.cmsContentId[0]",equalTo("1.663217"));
	
			APP_LOGS.debug("Test Complete");
	}
	
	@AfterMethod
	public void close()
	{
		
		
		
	}
}
