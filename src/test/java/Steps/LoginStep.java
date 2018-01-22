package Steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.List;

/**
 * Created by petrash on 1/22/18.
 */
public class LoginStep {
    @Given("^I navigate to login page$")
    public void iNavigateToLoginPage() throws Throwable {
        System.out.println("I navigate to login page");
    }

    @And("^I enter the username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void iEnterTheUsernameAsAndPasswordAs(String username, String password) throws Throwable {
        System.out.println("I enter the username as " + username + " and password as " + password);
    }

    @And("^I enter the following for Login$")
    public void iEnterTheFollowingForLogin(DataTable table) throws Throwable {
        List<List<String>> data = table.raw();
        System.out.println(data.get(0).get(0));
        System.out.println(data.get(0).get(1));
    }

    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {
        System.out.println("I click login button");
    }

    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() throws Throwable {
        System.out.println("I should see the userform page");
    }

}
