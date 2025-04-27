package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepDefinitions", "hooks"},
        tags = "@TC005",
        		plugin = {
        	            "pretty",
        	            "html:test-output/reports/cucumber-report.html",
        	            "json:test-output/reports/cucumber-report.json"
        	        },
        monochrome = true
)
public class TestRunner {
}