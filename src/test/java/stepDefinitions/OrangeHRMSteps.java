package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMSteps {

    WebDriver driver;

    @Given("I launch chrome browser")
    public void i_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver","./chromeDriver.exe");
        driver = new ChromeDriver();
    }
    @When("I open Orange HRM home page")
    public void i_open_orange_hrm_home_page() {
    driver.get("https://www.orangehrm.com/");

    }
    @Then("Verify that the the logo is present on the page")
    public void verify_that_the_the_logo_is_present_on_the_page() {
    boolean status = driver.findElement(By.xpath("//img[@alt='OrangeHRM Inc Logo']")).isDisplayed();
        Assert.assertEquals(true,status);

    }
    @Then("Close the browser")
    public void close_the_browser() {
    driver.quit();
    }

}
