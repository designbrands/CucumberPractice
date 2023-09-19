package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/Features/loginwithdataTables.feature",
							glue="stepDefinitions")

public class TestNGRunnerDataTables extends AbstractTestNGCucumberTests {

}
