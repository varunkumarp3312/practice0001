package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(
		
		features = "src/test/resources/features/login.feature",
		glue = {"stepDefinitions", "hooks"},
		plugin = {"pretty"},
//		tags="@emptyusername",
		monochrome = true
		
		)

public class TestRunner {

}
