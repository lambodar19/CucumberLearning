package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "Email")
    @CacheLookup
    WebElement userNameField;

    @FindBy(id = "Password")
    @CacheLookup
    WebElement passwordField;

    @FindBy(xpath = "//button[text()='Log in']")
    @CacheLookup
    WebElement loginButton;

    @FindBy(linkText = "Logout")
    @CacheLookup
    WebElement logOutLink;

    public void setUserName(String userName) {
        userNameField.clear();
        userNameField.sendKeys(userName);
    }

    public void setPassword(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickLogin()
    {
        loginButton.click();
    }

    public void clickLogout()
    {
        logOutLink.click();
    }
}
