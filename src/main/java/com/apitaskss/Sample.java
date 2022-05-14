package com.apitaskss;

import java.io.IOException;

import io.restassured.response.Response;

public class Sample extends BaseClassApi {
	public void implementation() throws IOException {
		getHeader("context-Type", "application/api", "");
		getBasicAuth(datasPropertyFile("username"), datasPropertyFile("password"));
Response getmethod = getmethod("POST", Endpointss.LOGIN);
int responseCode = getResponseCode(getmethod);
System.out.println(responseCode);
String string = getPrettyString();
System.out.println(string);
		
	
		
	}
	public static void main(String[] args) throws IOException {
Sample s=new Sample();
s.implementation();
	}

}
