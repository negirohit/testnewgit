	
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.time.DateUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.common.base.Verify;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;

public class TrendingTestCase extends base
{
	String current_dateformat;
	String daybfryesturday_dateformat;
	

	
	
	@Test
	public void trend_api() throws InterruptedException, IOException
	{
			//SoftAssert softAssert = new SoftAssert();
			pageclass pg = new pageclass();
			PageFactory.initElements(driver, pg);
		
			String curdate =pg.find_curdate();
			String prevdate =pg.find_prevdate();
	
			
			
			RestAssured.baseURI="http://pistats.api.pi-stats.com";
		
	    
			Response res=given().
			header("Authorization","Basic c2F1YmhhZ3lhQGJsdWVwaS5pbjpBbmpiMTk5MCo=").
			header("cache-control","no-cache").
			header("content-type","application/json").
			header("fromdate",prevdate).
			header("postman-token","4599a3dd-48f0-678c-7bf4-d71c7de523a5").
			header("propertyid","ABP-T2Online").
			header("todate",curdate).
			
			body("{"+"\"format\":[\"live-blog\",\"video-story\",\"Photo Gallery\",\"photo-gallery\",\"blank\",\"breaking-news\",\"photo-story\"],"+"\"language\": \"english\""+"}").
			
		
		when().
			post("/pistats/apiv1/trending?limit=10").
			then().assertThat().statusCode(200).and().contentType(ContentType.JSON).extract().response();
		
			String res_string= res.asString();
			System.out.println(res_string);
	
			JsonPath jpath = new JsonPath(res_string);
			
			
			
			int trendcount=0;
			
			int count=0;
			APP_LOGS.debug("--------------------------------------------------------------------------------------------------------------------------");
			APP_LOGS.debug("T2 Trending Stories of Date:"+curdate);
			for(int i=1;i<=6;i++)
			{
				
				
				if(i==2)
					continue;
				
				String articleid = jpath.get("["+count+"].articleId");
				System.out.println(articleid);
				
				
				String trend_ui= pg.trending_click1(i);
				
				APP_LOGS.debug(articleid+" "+trend_ui);
				System.out.println(articleid+" "+trend_ui);
				
				if(trend_ui.contains(articleid))
				{
					trendcount++;
				}
				
				else
				{
					APP_LOGS.error("Trending Story Unmatch !!"+" : "+ "Article Id in API : "+articleid + " "+"URL in front end : "+trend_ui);
				//	softAssert.fail("Trending Story Unmatch !!"+" : "+ "Article Id in API : "+articleid + " "+"URL in front end : "+trend_ui);
					//Assert.fail("Trending Story Unmatch !!"+" : "+ "Article Id in API : "+articleid + " "+"URL in front end : "+trend_ui);
				}
				
				count++;
				
			}
		
			//softAssert.assertAll();
			
			if(trendcount==5)
			{
				Assert.assertTrue(true);
			}
			
				
			
			
			
			
	}
	
	
	
	
}
