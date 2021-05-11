package test_sitemap;


import static io.restassured.RestAssured.given;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class t2online_topic_sitemap extends base
{

	@Test
	public void t2online_sitemap() throws IOException, InterruptedException
	{
			// TODO Auto-generated method stub
			setup();
			//BaseURL or Host
			RestAssured.baseURI="http://tagt2.t2online.com";
			
		Response res=	given().
			        accept(ContentType.XML).
			       when().
			       get("/topic/sitemap.xml").
			       then().assertThat().statusCode(200).and().contentType(ContentType.XML).extract().response();
		
		String response= res.asString();
		XmlPath x = new XmlPath(response);
		
		int count = x.get("urlset.url.findAll{it.changefreq=='daily'}.size()");
		System.out.println(count);

		APP_LOGS.debug(" Total Number of articles in T2Online Topic sitemap are -" + count);		

		for(int i=0;i<count;i++)
		{
			
			String s= x.get("urlset.url["+i+"].lastmod");
			if(s.contains("2018"))
				{
					continue;
				}
			if(s.contains("2017"))
				{
					continue;
				}
			if(s.contains("2016"))
			{
				continue;
			}
			else
			{
				System.out.println(s);
				Assert.fail("You failed this test"+" "+i);
			}
				
		}
		
	}
	
}
