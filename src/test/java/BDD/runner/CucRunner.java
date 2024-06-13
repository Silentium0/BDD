package BDD.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/html-reports/cucumber-report.html",
        "json:target/json-repots/json-report.json"},
        features = "src/test/resources/features",
        glue = "BDD/step_def",
        dryRun = false,
        tags = "@MultipleSrarch"
)
public class CucRunner {
}
