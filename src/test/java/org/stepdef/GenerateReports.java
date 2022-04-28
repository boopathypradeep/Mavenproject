package org.stepdef;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class GenerateReports {
public static void generateJVMReports(String json) {
	File file=new File("C:\\Users\\HP\\Pictures\\Java SS\\reports.file");
Configuration configuration=new Configuration(file, "AdactinHotel");
configuration.addClassifications("Browser name", "chrome");
configuration.addClassifications("Sprint", "38");
configuration.addClassifications("platform", "win-11");
configuration.addClassifications("environment", "UAT");
List<String>li=new ArrayList<>();
li.add(json);
ReportBuilder builder=new ReportBuilder(li, configuration);
builder.generateReports();

}
}
