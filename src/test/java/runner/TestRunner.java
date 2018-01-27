package runner;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

/**
 * Created by petrash on 1/26/18.
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/features"}, glue = "steps")
public class TestRunner {
}
