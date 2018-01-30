package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.BaseApiTest;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class RestassuredApiTest{
	
	@Test
	public void get1()
	{
		
	try{
		
		given().when().get("https://api.qa.talentscreen.io/v1/subjects?authentication=false").then().statusCode(200);
	}catch(Exception e){
		e.printStackTrace();
	}
			}
	@Test
	public void get2()
	{
		
	try{
		
		Response response;
		response=
		given().when().get("https://api.qa.talentscreen.io/v1/subjects?authentication=false").then().statusCode(200).extract().response();
		System.out.println("This is response....." +response.asString());
		
	}catch(Exception e){
		e.printStackTrace();
	}
			}
	@Test
	public void get3()
	{
		
	try{
		given().when().get("https://api.qa.talentscreen.io/v1/subjects?authentication=false").then().statusCode(200)
		.body("[0].id", equalTo(2))
		.body("[0].name",equalTo("C#"));
	}catch(Exception e){
		e.printStackTrace();
	}
			}
	
/*	@Test
	public void postdata1()
	{
		try{
			
			given().contentType(ContentType.JSON).body("{\"categoryid\":\"1\","+"\"name\":\"RESTAssured_17.9.11\","+"\"icon_class\":\"RestAssurednew\"}")
	
		
		.when().post("https://api.qa.talentscreen.io/v1/subjects?authentication=false").then().statusCode(201);
		
		}catch(Exception e){
			e.printStackTrace();
		}
	}*/
		@Test
		public void postdata2()
		{
			try{
		Response response;
		response=given().contentType(ContentType.JSON).body("{\"categoryid\":\"1\","+"\"name\":\"RESTAssured_18.9.1\","+"\"icon_class\":\"RestAssured\"}")
				
				
			//given().contentType(ContentType.JSON)
				//		.body(" {\"categoryid\":\"1\"+"\"name\":\"Restassured\","+"\"icon_class\":\"restassured\"} ")
			.when().post("https://api.qa.talentscreen.io/v1/subjects?authentication=false").then().statusCode(201).extract().response();
		System.out.println("This is response....." +response.asString());
		System.out.println("The generated id no of the response....." +response.path("id"));
		
			}catch(Exception e){
				e.printStackTrace();
			}
		
	}
		
		
	/*	
		

		@Test
		public void postdata3()
		{
			Response response;
			response=
			given().contentType(ContentType.JSON).body("{\"categoryid\":\"1\","+"\"name\":\"RESTAssured_19.9.1\","+"\"icon_class\":\"RestAssured\"}")
			.when().post("https://api.qa.talentscreen.io/v1/subjects?authentication=false").then().statusCode(201).extract().response();
			//System.out.println(response.asString());
			System.out.println("the generated id no of the subbject----"+response.path("id"));
			
		//	id_put=response.path("id");///stored that response id in a variable for the put and delete.
		//	System.out.println("the generated subject name of the subbject for post ----"+response.path("name"));
			
			Assert.assertEquals(response.path("categoryid"),"1");
			
		}*/
		
		
		
	/*	@Test
		public void putdata1()
		{
			Response response;
			response=
			given().contentType(ContentType.JSON).body("{\"categoryid\":\"1\","+"\"name\":\"RESTAssured_7.1\","+"\"icon_class\":\"RestAssured\"}")
			.when().put(endPoint+"/171?authentication=false").then().statusCode(200).extract().response();
			//System.out.println(response.asString());
			//System.out.println("the generated id no of the subbject----"+response.path("id"));
			System.out.println("the generated id no of the subbject----"+response.path("name"));
			
			Assert.assertEquals(response.path("categoryid"),"1");
			
		}
		
	
		
		//used for generated id from post for ding put operation
		
		
		
		
		
		@Test(dependsOnMethods="postdata2")
		public void putdata1()
		{
			Response response;
			response=
			given().contentType(ContentType.JSON).body("{\"categoryid\":\"2\","+"\"name\":\"RESTAssured_modified\","+"\"icon_class\":\"RestAssured\"}")
			.when().put("https://api.qa.talentscreen.io/v1/subjects/2?authentication=false").then().statusCode(200).extract().response();
			//System.out.println(response.asString());
			//System.out.println("the generated id no of the subbject----"+response.path("id"));
			//String modifiedname=response.path("name");
			System.out.println("the generated subject name after put----"+response.path("name"));
			
			Assert.assertEquals(response.path("categoryid"),"1");
			
		}
		
		
		
		@Test(dependsOnMethods="postdata2")
		public void delete()
		{
			Response response;
			response=
			given().contentType(ContentType.JSON).body("")
			.when().delete("https://api.qa.talentscreen.io/v1/subjects/140?authentication=false").then().statusCode(204).extract().response();
			System.out.println("response after delete----"+response.asString());
			//System.out.println("the generated id no of the subbject----"+response.path("id"));
			//String modifiedname=response.path("name");
			//System.out.println("the generated subject name after put----"+response.path("name"));
			
			//Assert.assertEquals(response.path("categoryid"),"1");
			
		}
		*/
		
		
		
		
		
		

	}

	
	
	
	
	
	
	

