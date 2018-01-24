package steps;

import cucumber.api.PendingException;
import cucumber.api.java8.En;

/**
 * Created by petrash on 1/24/18.
 */
public class Java8VersionStep implements En {
    public Java8VersionStep() {
        And("^I just wanjt to see how step looks for Cucumber-Java(\\d+)$", (Integer arg0) -> {
            System.out.println("The value from new step class is " + arg0);
        });
    }
}
