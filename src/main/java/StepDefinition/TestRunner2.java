package StepDefinition;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@src\\test\\java\\feature",strict = false, dryRun = false, glue = "StepDefinition", monochrome = true, plugin = 
		"html:target")

public class TestRunner2 {

}
