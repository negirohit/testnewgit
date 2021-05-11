package test_sitemap;


import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.time.DateUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.xml.XmlPath;
import io.restassured.path.xml.element.Node;
import io.restassured.response.Response;

public class ebela_news_sitemap extends base
{

	@Test
	public void ebela_news_sitemap() throws IOException, InterruptedException
	{
			// TODO Auto-generated method stub
			setup();
			//BaseURL or Host
			RestAssured.baseURI="https://ebela.in";
			
		Response res=	given().
			        accept(ContentType.XML).
			       when().
			       get("/news-sitemap.xml").
			       then().assertThat().statusCode(200).and().contentType(ContentType.XML).extract().response();
		
		String response= res.asString();
		XmlPath x = new XmlPath(response);
		
		/*List<String> links = x.get("**.findAll{it.name()=='name'}.@href");

		
		for (String linkNode : links) {
			  System.out.println(linkNode);
			}
		*/
		int count = x.get("**.findAll{it.name()=='name'}.size()");
		System.out.println(count);
		APP_LOGS.debug(" Total Number of articles in Ebela news sitemap are -" + count);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String current_date= dateFormat.format(date);
		System.out.println(current_date);
		// yesterday date
		
		Date yesterday = DateUtils.addDays(new Date(), -1);
		String yesterdaydate = dateFormat.format(yesterday);
		System.out.println(yesterdaydate);
		//Day before yesterday date
			 
		Date daybyesterday = DateUtils.addDays(new Date(), -2);		
		String daybyesterdaydate = dateFormat.format(daybyesterday);
		System.out.println(daybyesterdaydate);
		
		
		for(int i=0;i<count;i++)
		{
		
			String displayed_date = new XmlPath(response).getString("urlset.url["+i+"].news.publication_date");
	    
		
			if(displayed_date.equals(current_date))
			{
				System.out.println(displayed_date+" "+ i);
			}
		
			else if(displayed_date.equals(yesterdaydate))
			{
				System.out.println(displayed_date+" "+ i);
			}
		
			else if(displayed_date.equals(daybyesterdaydate))
			{
				System.out.println(displayed_date+" "+ i);
			}	
			
			else
			{
				Assert.fail("You have failed This test");
			}
		
		}	
	}
	
}
