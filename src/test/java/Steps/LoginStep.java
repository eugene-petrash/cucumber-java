package Steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.ArrayList;
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


    public class User {
        public String username;
        public String password;

        public User(String username, String password) {
            this.username = username;
            this.password = password;
        }
    }

}
