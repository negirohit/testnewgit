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

public class gethorroscopearticlebydepartmentid extends base
{
	
	@BeforeMethod
	public void create() throws IOException, InterruptedException
	{
		setup();
		APP_LOGS.debug(CONFIG.getProperty("baseurl")+"/gethorroscopearticlebydepartmentid");	
	}
	

	@Test
	public void get_horroscope_article_by_departmentid() throws IOException, InterruptedException
	{
		
			

			//BaseURL or Host
			RestAssured.baseURI=CONFIG.getProperty("baseurl");
			
				given().
			       accept(ContentType.JSON).
			       param("deptid","2.1443").
			       param("start","0").
			       param("end","10").
			       when().
			       get("/gethorroscopearticlebydepartmentid").
			       then().assertThat().statusCode(200).and().contentType(ContentType.JSON).
			       body("article[0].catName",equalTo("travel"));
		
				APP_LOGS.debug("Test Complete");
	}
	
	@AfterMethod
	public void close()
	{
		
		
		
	}
}
