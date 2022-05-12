package org.apitesting;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Task1 {
	public static void main(String[] args) throws IOException, ParseException {
		FileReader reader=new FileReader("C:\\Users\\HP\\eclipse-workspace\\MvnProjects\\src\\test\\task.json");
		JSONParser jparser=new JSONParser();
		Object parse = jparser.parse(reader);
		JSONObject obj=(JSONObject) parse;
		Object object = obj.get("data");
JSONObject obj2=(JSONObject) object;
Object object2 = obj2.get("id");
System.out.println(object2);
Object object3 = obj2.get("email");
System.out.println(object3);
Object object4 = obj2.get("first_name");
		System.out.println(object4);
		Object object5 = obj2.get("last_name");
		System.out.println(object5 );
		Object object6 = obj2.get("avatar");
		System.out.println(object6);
		Object object7 = obj.get("support");
		Object supp = obj.get("support");
	JSONObject objjj=(JSONObject) supp;
	Object object8 = objjj.get("url");
	System.out.println(object8);
	Object object9 = objjj.get("text");
	System.out.println(object9);
		
		
		
	} 

}
