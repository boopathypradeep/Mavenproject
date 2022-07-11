package org.apistepdef;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class BaseClass {
	public static RequestSpecification spec;
	public static Response response;
	public static ResponseBody body;
	public void header(String key, String value, String dummy) {
		 spec = RestAssured.given().header(key, value, dummy);

	}
	public Response reqMethods(String method, String http) {
		switch (method) {
		case "GET":
			 response = spec.log().all().get(http);
			break;
		case "PUT":
			 response = spec.log().all().put(http);
			break;
		default:
			break;
		case "POST":
			 response = spec.log().all().post(http);
			break;
		case "DELETE":
			 response = spec.log().all().delete(http);
			break;
		}
		return response;
		
	 

	}
	public int getStatusCode(Response response) {
		int code = response.getStatusCode();
		return code;

	}
	public void authentication(String username, String password) {
		spec = spec.auth().preemptive().basic(username, password);

	}
	public ResponseBody getBodys(Response response) {
		 body = response.getBody();
		return body;

	}
	public String bodyAsPrettyString(Response response) {
		String asPrettyString = getBodys(response).asPrettyString();
		return asPrettyString;

	}
	public void print(String value) {
		System.out.println(value);

	}
	public void printInt(int value) {
		System.out.println(value);

	}
	public String jsonpath(ResponseBody body,String value) {
		JsonPath jsonPath = body.jsonPath();
Object object = jsonPath.get(value);
String s=(String)object;
return s;

	}
public void headers(Headers headers ) {
	spec = spec.headers(headers);

}
public void body(Object object) {
	spec = spec.body(object);

}
public void bodyString(String body) {
	spec=spec.body(body);

}
}
