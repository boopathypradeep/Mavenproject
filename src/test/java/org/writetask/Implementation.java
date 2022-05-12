package org.writetask;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Implementation {
public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
File file= new File("C:\\Users\\HP\\eclipse-workspace\\MvnProjects\\src\\test\\write.json");
ObjectMapper mapper=new ObjectMapper();


ArrayList<Datum> arr=new ArrayList<Datum>();
Datum datum=new Datum(7, "michael.lawson@reqres.in", "Michael", "Lawson", "https://reqres.in/img/faces/7-image.jpg");
Datum datum2=new Datum(8, "lindsay.ferguson@reqres.in", "Lindsay", "Ferguson", "https://reqres.in/img/faces/8-image.jpg");
Datum datum3=new Datum(9, "tobias.funke@reqres.in", "Tobias", "Funke", "https://reqres.in/img/faces/9-image.jpg");
Datum datum4=new Datum(10, "byron.fields@reqres.in", "Byron", "Byron", "https://reqres.in/img/faces/10-image.jpg");
Datum datum5=new Datum(11, "george.edwards@reqres.in", "George", "Edwards", "https://reqres.in/img/faces/11-image.jpg");
Datum datum6=new Datum(12, "rachel.howell@reqres.in", "Rachel", "Howell", "https://reqres.in/img/faces/12-image.jpg");

arr.add(datum);
arr.add(datum2);
arr.add(datum3);
arr.add(datum4);
arr.add(datum5);
arr.add(datum6);

Support support=new Support("https://reqres.in/#support-heading", "To keep ReqRes free, contributions towards server costs are appreciated!");
Root root =new Root(2, 6, 12, 2, arr, support);
mapper.writeValue(file,root);





}
}
