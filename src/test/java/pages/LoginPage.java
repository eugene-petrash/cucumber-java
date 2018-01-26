package pages;

import base.BaseUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by petrash on 1/26/18.
 */
public class LoginPage{

    WebDriver browser;

    public LoginPage(WebDriver browser) {
        PageFactory.initElements(browser, this);
        this.browser = browser;
    }

    public String loginPageUrl = "http://www.executeautomation.com/demosite/Login.html";

    @FindBy(how = How.NAME, using = "UserName")
    public WebElement inputUserName;

    @FindBy(how = How.NAME, using = "Password")
    public WebElement inputPassword;

    @FindBy(how = How.NAME, using = "Login")
    public WebElement submitButton;

    public void login(String username, String password) {
        inputUserName.sendKeys(username);
        inputPassword.sendKeys(password);
        submitButton.submit();
    }

    public void open() {
        browser.navigate().to(loginPageUrl);
    }

}
