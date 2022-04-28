package org.runner;

import org.junit.runner.RunWith;
import org.stepdef.HooksClass;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resource\\FeatureFile.feature",glue="org.stepdef")
public class TestRunner  {

}
