package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

/**
 * Created by petrash on 1/26/18.
 */

//@RunWith(Cucumber.class) - for JUnit
@CucumberOptions(
        features = {"src/test/java/features"},
        glue = "steps",
        format = {
                "json:target/cucumber.json",
                "html:target/html-reports/"
        }
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
