package org.apitesting;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class API {
	public static void main(String[] args) throws IOException, ParseException {
		FileReader reader=new FileReader("C:\\Users\\HP\\eclipse-workspace\\MvnProjects\\src\\test\\personalinformation.json");
JSONParser jsonparser=new JSONParser();
Object obj = jsonparser.parse(reader);
JSONObject obj2= (JSONObject) obj;
Object name = obj2.get("name");
System.out.println(name);
Object phone = obj2.get("phone");
System.out.println(phone); 
Object object = obj2.get("address");
JSONObject obj3=(JSONObject) object;
Object object2 = obj3.get("street");
System.out.println(object2);
Object object5 = obj3.get("area");
	System.out.println(object5);
	
	
	
	}

}
