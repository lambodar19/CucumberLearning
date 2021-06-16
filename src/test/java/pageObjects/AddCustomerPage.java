package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {

    WebDriver driver;

    public AddCustomerPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath="(//i[@class='nav-icon far fa-user']//following::p)[1]")
    WebElement linkCustomers;

    @FindBy(xpath="//p[text()=' Customers']")
    WebElement sublinkCustomers;

    @FindBy(xpath= "//i[@class='fas fa-plus-square']//parent::a")
    WebElement addNewButton;

    @FindBy(id="Email")
    WebElement emailField;

    @FindBy(id="Password")
    WebElement passwordField;

    @FindBy(id="Firstname")
    WebElement firstNameField;

    @FindBy(id="lastName")
    WebElement lastNameField;

    @FindBy(xpath="(//button[@type='submit'])[2]")
    WebElement saveButton;
}
