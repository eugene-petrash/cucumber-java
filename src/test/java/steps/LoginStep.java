package steps;

import base.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import transformation.EmailTransform;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by petrash on 1/22/18.
 */
public class LoginStep extends BaseUtil {

    private BaseUtil base;

    public LoginStep(BaseUtil base) {
        this.base = base;
    }

    @Given("^I navigate to login page$")
    public void iNavigateToLoginPage() throws Throwable {
        System.out.println("I navigate to login page");
        System.out.println("The driver is: " + base.stepInfo);
    }

    @And("^I enter the username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void iEnterTheUsernameAsAndPasswordAs(String username, String password) throws Throwable {
        System.out.println("I enter the username as " + username + " and password as " + password);
    }

    @And("^I enter the following for Login$")
    public void iEnterTheFollowingForLogin(DataTable table) throws Throwable {
        // Create an ArrayList
        List<User> users = new ArrayList<User>();
        // Store all the users
        users = table.asList(User.class);

        for (User user: users) {
            System.out.println("The username is " + user.username);
            System.out.println("The password is " + user.password);
        }
    }

    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {
        System.out.println("I click login button");
    }

    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() throws Throwable {
        System.out.println("I should see the userform page");
    }

    @And("^I enter ([^\"]*) and ([^\"]*) for Login$")
    public void iEnterUsernameAndPasswordForLogin(String username, String password) throws Throwable {
        System.out.println("I enter " + username + " and " + password + " for Login");
    }

    @And("^I enter the users email address as ([^\"]*)$")
    public void iEnterTheUsersEmailAddressAs(@Transform(EmailTransform.class) String email) throws Throwable {
        System.out.println("Email address is: " + email);
    }


    public class User {
        public String username;
        public String password;

        public User(String username, String password) {
            this.username = username;
            this.password = password;
        }
    }

}
