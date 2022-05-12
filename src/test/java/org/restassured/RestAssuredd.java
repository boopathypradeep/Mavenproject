package org.restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class RestAssuredd {
	static RequestSpecification reqspec;
public static void main(String[] args) {
	
	RestAssured restassured=new RestAssured();
	 reqspec = restassured.given();
  
	
	Response response = reqspec.log().all().put("https://reqres.in/api/users/2");
	int code = response.getStatusCode();
	System.out.println(code);
	ResponseBody body = response.getBody();
	String asString = body.asString();
	System.out.println(asString );
	String asPrettyString = body.asPrettyString();
	System.out.println(asPrettyString);
	
	
	
	
	
	
	
	
	
	
}
}
