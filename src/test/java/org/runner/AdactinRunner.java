package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdef.GenerateReports;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resource\\Adactinhotel.feature",glue="org.stepdef",
plugin= {"json:C:\\Users\\HP\\eclipse-workspace\\AxisBank1\\target\\report.json"})
public class AdactinRunner {
@AfterClass
public static void reportGeneration() {
	GenerateReports.generateJVMReports("C:\\Users\\HP\\eclipse-workspace\\AxisBank1\\target\\report.json");

}
}
