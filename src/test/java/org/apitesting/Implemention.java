package org.apitesting;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Implemention {
public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
	File file=new File("C:\\Users\\HP\\eclipse-workspace\\MvnProjects\\src\\test\\Task4.json");
	ObjectMapper mapper=new ObjectMapper();
	Root value = mapper.readValue(file, Root.class);
	int page = value.getPage();
	System.out.println(page);
	int per_page = value.getPer_page();
	System.out.println(per_page);
	int total = value.getTotal();
	System.out.println(total);
	int total_pages = value.getTotal_pages();
	System.out.println(total_pages);
ArrayList<Datum> data = value.getData();
	for (int i = 0; i <data.size(); i++) {
		System.out.println(data.get(i).getId());
		System.out.println(data.get(i).getEmail());
		System.out.println(data.get(i).getFirst_name() );
		System.out.println(data.get(i).getLast_name());
		System.out.println(data.get(i).getAvatar());
	}
	Support support = value.getSupport(); 
	System.out.println(support.getUrl());
	System.out.println(support.getText());
	
}
}
