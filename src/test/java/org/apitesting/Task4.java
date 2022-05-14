package org.apitesting;

import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class Task4 extends BaseClass {
	@Test
public void implementation() throws IOException, ParseException {
getHeader("content-Type", "application/json", "");	
authentication(readPropertyFile("username"), readPropertyFile("password"));
Response methods = getMethods("POST", Endpoint.LOGIN);
int code = getResponseCode(methods);
System.out.println(code);

String prettyString = getPrettyString(methods);
System.out.println(prettyString);
JSONParser jparser=new JSONParser();
Object parse = jparser.parse(prettyString);
JSONObject object=(JSONObject)parse;
Object object2 = object.get("message");
String s=(String) object2;
System.out.println(s);
Object object3 = object.get("data");
JSONObject obj=(JSONObject) object3;
Object object4 = obj.get("last_name");
String s1=(String) object4;
System.out.println(s1);


}

}
