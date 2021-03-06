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

public class getebelaarticlesbycontentid extends base
{
	
	@BeforeMethod
	public void create() throws IOException, InterruptedException
	{
		setup();
		APP_LOGS.debug(CONFIG.getProperty("baseurl")+"/getebelaarticlesbycontentid");	
	}

	@Test
	public void get_ebela_articles_by_contentid() throws IOException, InterruptedException
	{
	
		//BaseURL or Host
			RestAssured.baseURI=CONFIG.getProperty("baseurl");
		
			given().
		       accept(ContentType.JSON).
		       param("cid","1.663269").
		       when().
		       get("/getebelaarticlesbycontentid").
		       then().assertThat().statusCode(200).and().contentType(ContentType.JSON).
		       body("[0].cmsContentId",equalTo("1.663269"));
	
			APP_LOGS.debug("Test Complete");
	}

	@AfterMethod
	public void close()
	{
		
		
		
	}	
}
