package steps;

import base.BaseUtil;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.MainPage;

/**
 * Created by petrash on 1/26/18.
 */
public class MainPageSteps extends BaseUtil {

    private BaseUtil base;
    private MainPage page;

    public MainPageSteps(BaseUtil base) {
        this.base = base;
        this.page = new MainPage(base.browser);
    }

    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() throws Throwable {
        Assert.assertEquals(page.getHeaderText(), "Execute Automation Selenium Test Site");
    }

}
