package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(
		
		features = "src/test/resources/features",
		
		glue = {"stepDefinitions", "hooks"},
		plugin = {
				
				"pretty",
				"html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json"
		},
//			tags = "@loginRegression",
				tags = "@dashboard",
		monochrome = true
		
		)

public class TestRunner {

}
