package org.apiProjectRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resource\\velsbusiness.feature", glue="org.apistepdef",
monochrome=true, dryRun=false)
public class RunnerClass {

}
