package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.LoginPage;

public class nop_stepsLogin {

    public WebDriver driver;
    public  LoginPage loginPage;

    @Given("User launches the chrome browser")
    public void user_launches_the_chrome_browser() {
        System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        loginPage= new LoginPage(driver);
    }
    @When("user opens the URL {string}")
    public void user_opens_the_url(String url) {
    driver.get(url);
    driver.manage().window().maximize();
    }
    @When("User enters username as {string} and password {string}")
    public void user_enters_username_as_and_password(String uName, String pass) {
    loginPage.setUserName(uName);
    loginPage.setPassword(pass);
    }
    @When("Click on Login")
    public void click_on_login() {
    loginPage.clickLogin();
    }
    @Then("The Page Title should be {string}")
    public void the_page_title_should_be(String title) {

        if(driver.getPageSource().contains("Login was unsuccessful"))
        {
            System.out.println("Login attempt failed");
            driver.quit();
            Assert.assertTrue(false);
        }
        else
        {
            Assert.assertEquals(title,driver.getTitle());
        }
    }
    @When("User clicks on the Logout Link")
    public void user_clicks_on_the_logout_link() {
    loginPage.clickLogout();
    }

    @Then("Close browser")
    public void close_browser() {
    driver.quit();
    }
}
