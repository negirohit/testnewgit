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


public class getebelaotherarticlesbytag extends base
{
	@BeforeMethod
	public void create() throws IOException, InterruptedException
	{
		setup();
		APP_LOGS.debug(CONFIG.getProperty("baseurl")+"/getebelaotherarticlesbytag");	
	}

	@Test
	public void get_ebela_other_articles_bytag() throws IOException, InterruptedException
	{
		
			

			//BaseURL or Host
			RestAssured.baseURI=CONFIG.getProperty("baseurl");
			
				given().
			       accept(ContentType.JSON).
			       param("tag","Bankrobbery").
			       param("start","0").
			       param("end","1").
			       param("cid","1.663269").
			       param("departmentId","2.1105").
			       when().
			       get("/getebelaotherarticlesbytag").
			       then().assertThat().statusCode(200).and().contentType(ContentType.JSON).
			       body("article[0].catName",equalTo("national"));
		
				APP_LOGS.debug("Test Complete");
	}
	
	@AfterMethod
	public void close()
	{
		
		
		
	}
}
