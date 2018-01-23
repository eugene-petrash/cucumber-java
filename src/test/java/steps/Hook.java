package steps;

import base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * Created by petrash on 1/23/18.
 */
public class Hook extends BaseUtil {

    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void testSetup(Scenario scenario) {
        System.out.println("Opening browser : MOCK");

        // Passing a dummy WebDriver instance
        base.stepInfo = "ChromeDriver";
    }

    @After
    public void testTearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take screenshot
            System.out.println(scenario.getName());
        }
        System.out.println("Close browser: MOCK");
    }
}
