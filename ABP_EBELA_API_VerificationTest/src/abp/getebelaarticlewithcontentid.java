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

public class getebelaarticlewithcontentid extends base
{

	@BeforeMethod
	public void create() throws IOException, InterruptedException
	{
		setup();
		APP_LOGS.debug(CONFIG.getProperty("baseurl")+"/getebelaarticlewithcontentid");	
	}
	
	@Test
	public void get_ebela_article_with_contentid() throws IOException, InterruptedException
	{
		
			

			//BaseURL or Host
			RestAssured.baseURI=CONFIG.getProperty("baseurl");
			
				given().
			       accept(ContentType.JSON).
			       param("cid","1.530362").
			       when().
			       get("/getebelaarticlewithcontentid").
			       then().assertThat().statusCode(200).and().contentType(ContentType.JSON).
			       body("article[0].cmsContentId",equalTo("1.530362"));
		
				APP_LOGS.debug("Test Complete");
	}
	
	@AfterMethod
	public void close()
	{
		
		
		
	}	
}
