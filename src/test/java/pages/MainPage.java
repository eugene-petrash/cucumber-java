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
public class MainPage {

    WebDriver browser;

    public MainPage(WebDriver browser) {
        PageFactory.initElements(browser, this);
        this.browser = browser;
    }

    @FindBy(how = How.CSS, using = "h1")
    public WebElement header;

    public String getHeaderText() {
        return header.getText();
    }

}
