package org.stepdefinition;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import org.baseclass.BaseClass;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class generateReport extends BaseClass {
public static void generateJVMReport(String json) {
	File file=new File("C:\\Users\\HP\\eclipse-workspace\\MvnProjects\\target\\hotel.file");
	Configuration configuration= new Configuration(file, "Adactinhotel");
	configuration.addClassifications("spring", "35");
	configuration.addClassifications("environment", "UAT");
	List<String> li=new LinkedList<>();
	li.add(json);
	ReportBuilder builder=new ReportBuilder(li, configuration);
	builder.generateReports();

}
}
