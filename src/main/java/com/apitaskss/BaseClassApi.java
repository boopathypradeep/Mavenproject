package com.apitaskss;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class BaseClassApi {
	static RequestSpecification spec;
	public static Response response;
	public void getHeader(String key, String value,String dummy) {
spec = RestAssured.given().header(key, value, dummy);

	}
	public void getPathparam(String key, String value) {
		spec = spec.pathParam(key, value);

	}
public  void getQueryparam(String key, String value) {
	spec=spec.queryParam(key, value);

}
public static Response getmethod(String type, String endpoint) {
	switch (type) {
	case "GET":
		 response = spec.log().all().get(endpoint);
		break;
	case "POST":
		 response = spec.log().all().post(endpoint);
		break;
	case "PUT":
		 response = spec.log().all().put(endpoint);
		break;
	case "DELETE":
		 response = spec.log().all().delete(endpoint);
		break;
	default:
		break;
	}
	return response;

}
public void getBasicAuth(String key, String value) {
	spec = spec.auth().preemptive().basic(key, value);
}
public ResponseBody getResponseBody(Response response) {
	ResponseBody body = response.getBody();
	return body;

}
public int getResponseCode(Response response) {
int statusCode = response.getStatusCode();
return statusCode;

}
public String getString() {
	String asString = getResponseBody(response).asString();
	return asString;

}
public String getPrettyString() {
String asPrettyString = getResponseBody(response).asPrettyString();
return asPrettyString;

}
public String datasPropertyFile(String key) throws IOException {
	FileInputStream stream=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resource\\Api.properties");
	Properties properties=new Properties();
	properties.load(stream);
	Object object = properties.get(key);
	String s=(String) object;
	return s;

}








}
