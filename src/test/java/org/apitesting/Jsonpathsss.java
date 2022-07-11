package org.apitesting;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.profilepicture.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Jsonpathsss extends BaseClass {
	public static String logToken;
	public static int address_id=1215;
	@Test(priority=1)
	private void dataGetting() throws IOException {
		getHeader("Content-Type", "application/json", "");
	authentication(readPropertyFile("username") , readPropertyFile("password"));
		
		
Response response = getMethods("POST", Endpoint.LOGIN);

ResponseBody responseBody = getResponseBody(response);
System.out.println(responseBody.asPrettyString());
JsonPath jsonPath = responseBody.jsonPath();
Object msg = jsonPath.get("message");
String s=(String) msg;
Object object = jsonPath.get("data.logtoken");
logToken=(String) object;

Assert.assertEquals(msg, "Login successfully","login done successfully");


	}
	@Test(priority=2)
	private void addAddress() {
		List<Header>l=new LinkedList<Header>();
		Header header=new Header("accept", "application/json");
		Header header2=new Header("Content-Type", "application/json");
		Header header3=new Header("Authorization", "Bearer "+logToken);
		l.add(header);
		l.add(header2);
		l.add(header3);
	Headers head=new Headers(l);
getHeaders(head);

getBody("{\r\n" + 
		"  \"first_name\": \"Raj\",\r\n" + 
		"  \"last_name\": \"Khundra\",\r\n" + 
		"  \"mobile\": \"1234567898\",\r\n" + 
		"  \"apartment\": \"apartment\",\r\n" + 
		"  \"state\": 33,\r\n" + 
		"  \"city\": 3378,\r\n" + 
		"  \"country\": 101,\r\n" + 
		"  \"zipcode\": \"202020\",\r\n" + 
		"  \"address\": \"64/63 partap nagar\",\r\n" + 
		"  \"address_type\": \"home\"\r\n" + 
		"}");
Response response = getMethods("POST", Endpoint.ADD_ADDRESS);
ResponseBody responseBody = getResponseBody(response);
System.out.println(getResponseCode(response));
System.out.println(responseBody.asPrettyString());
JsonPath jsonPath = responseBody.jsonPath();
Object msg = jsonPath.get("message");
String s=(String) msg;

Assert.assertEquals(msg, "Address added successfully","address added successfully");



	}
	@Test(priority=3)
	public void updateAddress() {
		List<Header>l=new LinkedList<Header>();
		Header header=new Header("accept", "application/json");
		Header header2=new Header("Content-Type", "application/json");
		Header header3=new Header("Authorization", "Bearer "+logToken);
		l.add(header);
		l.add(header2);
		l.add(header3);
	Headers head=new Headers(l);
getHeaders(head);

getBody("{\r\n" + 
		"  \"address_id\": \""+address_id+"\",\r\n" + 
		"  \"first_name\": \"Raj\",\r\n" + 
		"  \"last_name\": \"Khundra\",\r\n" + 
		"  \"mobile\": \"1234567898\",\r\n" + 
		"  \"apartment\": \"apartment\",\r\n" + 
		"  \"state\": 33,\r\n" + 
		"  \"city\": 3378,\r\n" + 
		"  \"country\": 101,\r\n" + 
		"  \"zipcode\": \"202020\",\r\n" + 
		"  \"address\": \"64/63 partap nagar\",\r\n" + 
		"  \"address_type\": \"home\"\r\n" + 
		"}");
Response response = getMethods("PUT", Endpoint.UPDATE_ADDRESS);
ResponseBody responseBody = getResponseBody(response);
System.out.println(responseBody.asPrettyString());
System.out.println(getResponseCode(response));
JsonPath jsonPath = responseBody.jsonPath();
Object msg = jsonPath.get("message");
String s=(String) msg;

Assert.assertEquals(msg, "Address updated successfully","address updated successfully");

	}

	@Test(priority=4)
	public void getAddress() {
		List<Header>l=new LinkedList<Header>();
		Header header=new Header("accept", "application/json");
		Header header2=new Header("Content-Type", "application/json");
		Header header3=new Header("Authorization", "Bearer "+logToken);
		l.add(header);
		l.add(header2);
		l.add(header3);
	Headers head=new Headers(l);
getHeaders(head);

Response response = getMethods("GET", Endpoint.GET_ADDRESS);
ResponseBody responseBody = getResponseBody(response);
System.out.println(getResponseCode(response));
System.out.println(responseBody.asPrettyString());
JsonPath jsonPath = responseBody.jsonPath();
Object msg = jsonPath.get("message");
String s=(String) msg;

Assert.assertEquals(msg, "OK","ok message displayed successfully");
	}
	@Test(priority=5)
	private void deleteAddress() {
		List<Header>l=new LinkedList<Header>();
		Header header=new Header("accept", "application/json");
		Header header2=new Header("Content-Type", "application/json");
		Header header3=new Header("Authorization", "Bearer "+logToken);
		l.add(header);
		l.add(header2);
		l.add(header3);
	Headers head=new Headers(l);
getHeaders(head);	
getBody("{\r\n" + 
		"  \"address_id\": \""+address_id+"\"\r\n" + 
		"}");
Response response = getMethods("DELETE", Endpoint.DELETE_ADDRESS);
ResponseBody responseBody = getResponseBody(response);
System.out.println(getResponseCode(response));
System.out.println(responseBody.asPrettyString());


	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
