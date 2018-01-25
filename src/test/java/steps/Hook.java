package steps;

import base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
        base.browser = new ChromeDriver();
//        browser = new FirefoxDriver();
    }

    @After
    public void testTearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take screenshot
            System.out.println(scenario.getName());
        }
        base.browser.quit();
    }
}
