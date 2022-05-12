package org.apitesting;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Task3 {
	public static void main(String[] args) throws IOException, ParseException {
		FileReader reader=new FileReader("C:\\Users\\HP\\eclipse-workspace\\MvnProjects\\src\\test\\resource1\\Task3.json");
		JSONParser jparser=new JSONParser();
		Object parse = jparser.parse(reader);
		JSONObject object=(JSONObject) parse;
		Object object2 = object.get("studetails");
		JSONArray arr=(JSONArray) object2;
		for (int i = 0; i <arr.size(); i++) {
			Object object3 = arr.get(i);
		JSONObject obj=(JSONObject) object3;
		System.out.println(obj.get("name"));
		System.out.println(obj.get("email"));
		System.out.println(obj.get("phone"));
			
		}
	}

}
