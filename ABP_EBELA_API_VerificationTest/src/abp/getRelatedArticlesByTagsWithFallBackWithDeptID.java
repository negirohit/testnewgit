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

public class getRelatedArticlesByTagsWithFallBackWithDeptID extends base
{
	@BeforeMethod
	public void create() throws IOException, InterruptedException
	{
		setup();
		APP_LOGS.debug(CONFIG.getProperty("baseurl")+"/getRelatedArticlesByTagsWithFallBackWithDeptID");	
	}
	
	@Test
	public void get_Related_Articles_By_Tags_With_FallBack_With_DeptID() throws IOException, InterruptedException
	{
		
		//BaseURL or Host
			RestAssured.baseURI=CONFIG.getProperty("baseurl");
		
			given().
		       accept(ContentType.JSON).
		       param("start","0").
		       param("end","4").
		       param("showBody","0").
		       param("cid","1.821851").
		       param("deptId","2.655").
		       param("tag","\"depression\"+OR+\"rainfall\"+OR+\"Monsoon\"+OR+\"Kolkata rain\"+OR+\"Kolkata\"").
		       when().
		       get("/getRelatedArticlesByTagsWithFallBack").
		       then().assertThat().statusCode(200).and().contentType(ContentType.JSON).
		       body("count",equalTo(4));
	
			APP_LOGS.debug("Test Complete");
	}

	@AfterMethod
	public void close()
	{
		
		
		
	}
}
