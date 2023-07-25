package uk.co.library.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resouces/featurefile/",
        glue = "src/test/java",
        tags = "@smoke",
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html"}
)
public class TestRunners {
}
