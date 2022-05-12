package org.apitesting;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Task2 {
	public static void main(String[] args) throws IOException, ParseException {
		FileReader reader=new FileReader("C:\\Users\\HP\\eclipse-workspace\\MvnProjects\\src\\test\\task2.json");
		JSONParser jparser=new JSONParser();
		Object object = jparser.parse(reader);
		JSONObject obj=(JSONObject) object;
		Object object2 = obj.get("course");
		System.out.println(object2);
		JSONArray arr= (JSONArray) object2;
		Object object3 = arr.get(2);
		System.out.println(object3);
		for (int i = 0; i < arr.size(); i++) {
			Object object4 = arr.get(i);
			System.out.println(object4);
			
		}
	
	}

}
