package stepDefinitions;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import pageObjects.AddCustomerPage;
import pageObjects.LoginPage;
import pageObjects.SearchCustomerPage;

public class BaseClass {

    public WebDriver driver;
    public LoginPage loginPage;
    public AddCustomerPage addCustomerPage;
    public SearchCustomerPage searchCustomerPage;

    //Generate random string for email address
    public static String randomStringGenerator()
    {
       String randomData=  RandomStringUtils.randomAlphanumeric(5);
       return(randomData);
    }

}
