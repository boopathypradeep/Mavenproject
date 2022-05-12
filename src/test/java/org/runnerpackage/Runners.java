package org.runnerpackage;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.generateReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resource1\\manualtesting.feature",glue="org.stepdefinition",dryRun=false
,monochrome=true,
plugin= {"pretty","json:C:\\Users\\HP\\eclipse-workspace\\MvnProjects\\target\\adactin.json"})
public class Runners {
@AfterClass
public static void report() {
	generateReport.generateJVMReport("C:\\\\Users\\\\HP\\\\eclipse-workspace\\\\MvnProjects\\\\target\\\\adactin.json");

}
}
