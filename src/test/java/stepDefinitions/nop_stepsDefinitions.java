package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.LoginPage;

public class nop_stepsDefinitions extends BaseClass{



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


    @Then("User can view Dashboard")
    public void user_can_view_dashboard() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User clicks on Customer Menu")
    public void user_clicks_on_customer_menu() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Clicks on Customer Menu Item")
    public void clicks_on_customer_menu_item() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Clicks on Add New Button")
    public void clicks_on_add_new_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User can view Add Customer Page")
    public void user_can_view_add_customer_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User enters Customer Info")
    public void user_enters_customer_info() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Clicks on Save Button")
    public void clicks_on_save_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User can view confirmation message {string}")
    public void user_can_view_confirmation_message(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
