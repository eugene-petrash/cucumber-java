package steps;

import base.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import pages.LoginPage;
import transformation.EmailTransform;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by petrash on 1/22/18.
 */
public class LoginStep extends BaseUtil {

    private BaseUtil base;
    private LoginPage page;

    public LoginStep(BaseUtil base) {
        this.base = base;
        this.page = new LoginPage(base.browser);
    }

    @Given("^I navigate to login page$")
    public void iNavigateToLoginPage() throws Throwable {
        page.open();
    }

    @And("^I enter the username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void iEnterTheUsernameAsAndPasswordAs(String username, String password) throws Throwable {
        System.out.println("I enter the username as " + username + " and password as " + password);
    }

    @And("^I enter the following for login and submit login$")
    public void iEnterTheFollowingForLogin(DataTable table) throws Throwable {
        // Create an ArrayList
        List<User> users = new ArrayList<User>();
        // Store all the users
        users = table.asList(User.class);

        for (User user: users) {
            page.login(user.username, user.password);
        }
    }

    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {
        base.browser.findElement(By.name("Login")).submit();
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
