package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.AddCustomerPage;
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
        addCustomerPage = new AddCustomerPage(driver);
        Assert.assertEquals("Dashboard / nopCommerce administration",addCustomerPage.getPageTitle());
    }

    @When("User clicks on Customer Menu")
    public void user_clicks_on_customer_menu() {
        addCustomerPage.clickCustomerMenuItem();
    }

    @When("Clicks on Customer Menu Item")
    public void clicks_on_customer_menu_item() throws InterruptedException {
        addCustomerPage.clickCustomerSubMenuItem();
        Thread.sleep(3000);
    }

    @When("Clicks on Add New Button")
    public void clicks_on_add_new_button() throws InterruptedException {
        addCustomerPage.clickAddNewCustomer();
        Thread.sleep(3000);
    }

    @Then("User can view Add Customer Page")
    public void user_can_view_add_customer_page() {
    Assert.assertEquals("Add a new customer / nopCommerce administration",addCustomerPage.getPageTitle());
    }

    //Enters data in all required field
    @When("User enters Customer Info")
    public void user_enters_customer_info() {
        String email = randomStringGenerator()+"@gmail.com";
        addCustomerPage.setEmailField(email);
        addCustomerPage.setPasswordField("Paswef");
        addCustomerPage.setFirstNameField("Rakesh");
        addCustomerPage.setLastNameField("Singh");
        addCustomerPage.selectGender();
        addCustomerPage.setDobField("01/01/1993");
        addCustomerPage.setCompanyField("Cognizant");

    }

    @When("Clicks on Save Button")
    public void clicks_on_save_button() throws InterruptedException {
        addCustomerPage.clickSave();
        Thread.sleep(3000);
    }

    @Then("User can view confirmation message {string}")
    public void user_can_view_confirmation_message(String message) {
    Assert.assertTrue(driver.findElement(By.tagName("body"))
            .getText().contains("The new customer has been added successfully."));
    }
}
