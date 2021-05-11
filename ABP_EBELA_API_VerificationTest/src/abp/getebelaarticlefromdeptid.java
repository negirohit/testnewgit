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

public class getebelaarticlefromdeptid extends base
{

	@BeforeMethod
	public void create() throws IOException, InterruptedException
	{
		setup();
		APP_LOGS.debug(CONFIG.getProperty("baseurl")+"/getebelaarticlefromdeptid");	
	}
	
	@Test
	public void get_ebela_article_from_deptid() throws IOException, InterruptedException
	{
		
		//BaseURL or Host
			RestAssured.baseURI=CONFIG.getProperty("baseurl");
		
			given().
		       accept(ContentType.JSON).
		       param("deptID","2.1110").
		       param("cid","1.530216,1.530362,1.530209,1.530204,1.530197,1.530187,1.528133,1.527475,1.528638,1.528641,1.528999,1.527887,1.527910,1.528627,1.527919,1.527936,1.527315,1.527006,1.527022").
		       param("start","0").
		       param("end","5").
		       when().
		       get("/getebelaarticlefromdeptid").
		       then().assertThat().statusCode(200).and().contentType(ContentType.JSON).
		       body("count",equalTo(5));
	
			APP_LOGS.debug("Test Complete");
	}
	
	@AfterMethod
	public void close()
	{
		
		
		
	}	
}
