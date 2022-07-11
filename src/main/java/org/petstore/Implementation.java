package org.petstore;

import java.util.ArrayList;

import org.testng.annotations.Test;
import org.petstore.Root;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class Implementation extends BaseClass {
	@Test(priority=1)
	public void postPet() {
		getHeader("accept", "application/json", "");
		Category c=new Category(10, "dog");
		ArrayList<String> photo=new ArrayList<>();
		photo.add("google");
		photo.add("facebook");
		photo.add("amazon");
		ArrayList<Tag> tag=new ArrayList<>();
		Tag t=new Tag(10, "A");
		Tag t2=new  Tag(20, "B");
		tag.add(t);
		tag.add(t2);
		Root r=new Root(246, c, "hello", photo, tag, "available");
		getBodyObject(r);
		Response methods = getMethods("POST", "https://petstore.swagger.io/v2/pet");
		Root as = methods.as(Root.class); 
		ResponseBody body = getResponseBody(methods);
		System.out.println(getPrettyString(methods));
		System.out.println(getResponseCode(methods));
		
		long id = as.getId();
		System.out.println(id);
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
