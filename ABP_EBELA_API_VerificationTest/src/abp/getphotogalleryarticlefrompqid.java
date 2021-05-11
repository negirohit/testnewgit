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

public class getphotogalleryarticlefrompqid extends base
{

	@BeforeMethod
	public void create() throws IOException, InterruptedException
	{
		setup();
		APP_LOGS.debug(CONFIG.getProperty("baseurl")+"/getphotogalleryarticlefrompqid");	
	}
	
	@Test
	public void get_photogallery_article_from_pq_id() throws IOException, InterruptedException
	{
		
		//BaseURL or Host
			RestAssured.baseURI=CONFIG.getProperty("baseurl");
		
			given().
		       accept(ContentType.JSON).
		       param("pid","1.148668").
		       param("start","0").
		       param("end","5").
		       when().
		       get("/getphotogalleryarticlefrompqid").
		       then().assertThat().statusCode(200).and().contentType(ContentType.JSON).
		       body("count",equalTo(5));
	
			APP_LOGS.debug("Test Complete");
	}
	
	@AfterMethod
	public void close()
	{
		
		
		
	}
}
