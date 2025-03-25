package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {"json:target/cucumber-report/cucumber.json"},
        features = {"src/test/resources/Features"},
        glue = {"stepDefinitions", "configuration"}
)

public abstract class TestRunner {
}
