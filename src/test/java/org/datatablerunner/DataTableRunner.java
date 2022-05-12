package org.datatablerunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) 
@CucumberOptions(features="C:src\\test\\datatable\\datatable.feature",
glue="C:\\Users\\HP\\eclipse-workspace\\MvnProjects\\src\\test\\java\\org\\datatablestepdef\\Stepdef.java")
public class DataTableRunner {
	

}

