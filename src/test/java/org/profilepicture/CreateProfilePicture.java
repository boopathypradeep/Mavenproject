package org.profilepicture;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apitesting.Endpoint;
import org.serialization.Login_Output_Pojo;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class CreateProfilePicture extends BaseClass {
	String logToken;
	@Test(priority=1)
	private void login() throws IOException {
getHeader("Content-Type", "application/json", "");
authentication(readPropertyFile("username"), readPropertyFile("password"));
Response response = getMethods("POST", Endpoint.LOGIN);
System.out.println(getPrettyString(response)); 
System.out.println(getResponseCode(response));
JsonPath jsonPath = response.jsonPath();
Object object = jsonPath.get("data.logtoken");
 logToken=(String) object;
System.out.println(logToken);


	}
	@Test(priority=2)
	private void postProfilePic() {
	
		List<Header>l=new ArrayList<>();
		Header header2=new Header("accept", "application/json");
		Header header=new Header("Content-Type", "multipart/form-data");
		Header header1=new Header("Authorization", "Bearer "+logToken);
		l.add(header);
		l.add(header1);
		l.add(header2);
		Headers head=new Headers(l);
		getHeaders(head);
		getMultiParts();
		Response reponse = getMethods("POST", EndPoints.CHANGE_PROFILEPIC);
		System.out.println(getPrettyString(reponse));
		System.out.println(getResponseCode(reponse));
		String jsonPath = getJsonPath(reponse, "message");
		Assert.assertEquals(jsonPath, "Profile updated Successfully","profile photo updated successfully");
		

	}
	

	

}
