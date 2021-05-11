package apis;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.base;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Get_Sub_Pages_By_Page_Id extends base
{

	@BeforeMethod
	public void create() throws IOException, InterruptedException
	{
		setup();
		APP_LOGS.debug(CONFIG.getProperty("baseurl")+"/getSubPagesByPageId");	
	}
	
	@Test
	public void Get_Sub_Pages_By_Using_Page_Id() throws IOException, InterruptedException
	{
	
		//BaseURL or Host
			RestAssured.baseURI=CONFIG.getProperty("baseurl");
		
			given().
		       accept("application/json;charset=utf-8").
		       param("pageId","2.1598").
		       when().
		       get("/getSubPagesByPageId").
		       then().assertThat().statusCode(200).and().contentType(ContentType.JSON).
		       and().body("cmsContentId[0]", equalTo("2.1599")).
		       and().body("cmsContentId[1]", equalTo("2.1600")).
		       and().body("cmsContentId[2]", equalTo("2.1602")).
		       and().body("cmsContentId[3]", equalTo("2.1603")).
		       and().body("cmsContentId[4]", equalTo("2.1601")).
		       and().body("cmsContentId[5]", equalTo("2.1604")).
		       and().body("cmsContentId[6]", equalTo("2.1605")).
		       and().body("cmsContentId[7]", equalTo("2.1606")).
		       and().body("cmsContentId[8]", equalTo("2.1607")).
		       and().body("cmsContentId[9]", equalTo("2.1608")).
		       and().body("cmsContentId[10]", equalTo("2.1609"));
	
			APP_LOGS.debug("Test Complete");
	}
	
	@AfterMethod
	public void close()
	{
		
		
		
	}
	
}
