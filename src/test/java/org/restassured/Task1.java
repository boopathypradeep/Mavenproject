package org.restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Task1 {
    static RequestSpecification reqspec;
	public static void main(String[] args) {
		 reqspec = RestAssured.given();
	
		 reqspec= reqspec.header("context-type", "application/json", args);
		 Response response = reqspec.log().all().put("https://reqres.in/api/users/2");
		 reqspec=reqspec.body("{\r\n" + 
				"    \"name\": \"morpheus\",\r\n" + 
				"    \"job\": \"zion resident\"\r\n" + 
				"}\r\n" + 
				"");
	int code = response.getStatusCode();
	System.out.println(code);
	ResponseBody body = response.getBody();
	String string = body.asString();
	System.out.println(string);
		String string2 = body.asPrettyString();
	System.out.println(string2);
	}

}