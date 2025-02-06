package BDD.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/html-reports/cucumber-report.html",
        "json:target/json-repots/json-report.json",
        "rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        glue = "BDD/step_def",
        dryRun = false,
        tags = "@fillForm"
)
public class CukesRunner {
  }
