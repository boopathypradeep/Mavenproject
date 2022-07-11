package org.apistepdef;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import com.github.dockerjava.transport.DockerHttpClient.Request.Method;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class StepDefinition extends BaseClass {
	public static String logToken;
	public static  Response res;
	public static String address_id;

	@When("user add header key {string} and value {string}")
	public void user_add_header_key_and_value(String string, String string2) {
	   header(string, string2, "");
	}
	@When("user enters authentication username {string} and password {string}")
	public void user_enters_authentication_username_and_password(String string, String string2) {
	   authentication(string, string2);
	}
	@When("user sends the post http request")
	public void user_sends_the_post_http_request() {
	   res = reqMethods("POST", EndPoints.LOGIN);
	}

	@When("verify the status code")
	public void verify_the_status_code() {
	   ResponseBody bodys = getBodys(res);
	   String string = bodyAsPrettyString(res);
	   print(string);
int code = getStatusCode(res);
printInt(code);
	}

	@Then("user should verify the login with message {string}")
	public void user_should_verify_the_login_with_message(String string) {
		String string2 = jsonpath(body, "message");
		System.out.println(string2); 
		 logToken = jsonpath(body, "data.logtoken");
		 System.out.println(logToken);
//  Assert.assertEquals(string2,string,"login has been done sucessfully");
	}
	@When("user adds the header key {string} and value {string} and adds authentication key {string} and value {string}")
	public void user_adds_the_header_key_and_value_and_adds_authentication_key_and_value(String string, String string2, String string3, String string4) {
	  List<Header>l=new ArrayList<>();
		Header head=new Header(string, string2);
	   Header head1=new Header(string3, string4+logToken);
	   l.add(head);
	   l.add(head1);
	   Headers header=new Headers(l);
	   headers(header);
	   
	}

	@When("user adds the response body")
	public void user_adds_the_response_body() {
		Root root=new Root("Boopathy", "pradeep", "9876543210", "hello", 33, 3378, 101, "65422", "knpatty", "appartment");
		 spec.body(root);  
	}

	@When("user sends the request")
	public void user_sends_the_request() {
	    res = reqMethods("POST", EndPoints.ADD_ADDRESS);
	   
	}

	@When("verify the status code and verify")
	public void verify_the_status_code_and_verify() {
	   int code = getStatusCode(res);
	   printInt(code);
	}

	@Then("the new address is created")
	public void the_new_address_is_created() {
	  Add__Address_Output as = res.as(Add__Address_Output.class);
	 String address_id2 = as.getAddress_id();
	  System.out.println(address_id2);
	}
	@When("user add the header key {string} and value {string} and adds authentication token key {string} and value {string}")
	public void user_add_the_header_key_and_value_and_adds_authentication_token_key_and_value(String string, String string2, String string3, String string4) {
	   List<Header>l=new ArrayList<>();
	   Header head=new Header(string, string2);
	   Header head1=new Header(string3, string4+logToken);
	   l.add(head);
	   l.add(head1);
	   Headers headers=new Headers(l);
	   headers(headers);
	}

	@When("user adds  response body")
	public void user_adds_response_body() {
	    Update_Address_Input up=new Update_Address_Input(""+address_id+"", "Ram", "Sarath", "9876543210", "hello", 33, 3378, 101, "987657", "hello", "home");
	    body(up);
	}

	@When("user sends request methods")
	public void user_sends_request_methods() {
	    res = reqMethods("PUT", EndPoints.UPDATE_ADDRESS);
	}

	@Then("verify the message and status code address is successfully updated")
	public void verify_the_message_and_status_code_address_is_successfully_updated() {
	    Update_Address_Output as = res.as(Update_Address_Output.class);
	String message = as.getMessage();
	print(message);
	}
	@When("user add the header key {string} and values {string} and adds authentication token key {string} and value {string}")
	public void user_add_the_header_key_and_values_and_adds_authentication_token_key_and_value(String string, String string2, String string3, String string4) {
	  List<Header>l=new ArrayList<Header>();
		Header head	=  new Header(string, string2);
	  Header head1=new Header(string3, string4);
	  Headers header=new Headers(l);
	  headers(header);
	  
	}
	@When("user gives the request body")
	public void user_gives_the_request_body() {
	 
	}


	@When("user send request methods")
	public void user_send_request_methods() {
		reqMethods("GET", EndPoints.GET_ADDRESS);
	    
	}

	@Then("verify the message and status code address is successfully get")
	public void verify_the_message_and_status_code_address_is_successfully_get() {
	   
	}
	@When("user added the header key {string} and values {string} and adds authentication token key {string} and value {string}")
	public void user_added_the_header_key_and_values_and_adds_authentication_token_key_and_value(String string, String string2, String string3, String string4) {
		List<Header>l=new ArrayList<>();
		Header head=new Header(string, string2);
	   Header head1=new Header(string3, string4+logToken);
	   l.add(head);
	   l.add(head1);
	   Headers header=new Headers(l);
	   headers(header);
	}

	@When("adds the request methods")
	public void adds_the_request_methods() {
	   Delete_Address_Input in=new Delete_Address_Input(""+address_id+"");
	}

	@When("user sendss request methods")
	public void user_sendss_request_methods() {
	    reqMethods("DELETE", EndPoints.DELETE_ADDRESS);
	}

	@Then("verify the messages and status code address is successfully get")
	public void verify_the_messages_and_status_code_address_is_successfully_get() {
	    
	}









}
