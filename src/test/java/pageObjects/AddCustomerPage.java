package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {

    WebDriver driver;

    public AddCustomerPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "(//i[@class='nav-icon far fa-user']//following::p)[1]")
    WebElement linkCustomers;

    @FindBy(xpath = "//p[text()=' Customers']")
    WebElement sublinkCustomers;

    @FindBy(xpath = "//i[@class='fas fa-plus-square']//parent::a")
    WebElement addNewButton;

    @FindBy(id = "Email")
    WebElement emailField;

    @FindBy(id = "Password")
    WebElement passwordField;

    @FindBy(id = "Firstname")
    WebElement firstNameField;

    @FindBy(id = "lastName")
    WebElement lastNameField;

    @FindBy(xpath = "//label[contains(text(),'Male')]//preceding-sibling::input")
    WebElement radioMale;

    @FindBy(id = "DateOfBirth")
    WebElement dobField;

    @FindBy(id = "Company")
    WebElement companyField;

    @FindBy(id = "AdminComment")
    WebElement adminCommentField;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    WebElement saveButton;

    //Return the title of the page
    public String getPageTitle() {
        return driver.getTitle();
    }

    public void clickCustomerMenuItem() {
        linkCustomers.click();
    }

    public void clickCustomerSubMenuItem() {
        sublinkCustomers.click();
    }

    public void clickAddNewCustomer() {
        addNewButton.click();
    }

    public void setEmailField(String email) {
        emailField.sendKeys(email);
    }

    public void setPasswordField(String pass) {
        passwordField.sendKeys(pass);
    }

    public void setFirstNameField(String fName) {
        passwordField.sendKeys(fName);
    }

    public void setLastNameField(String lName) {
        passwordField.sendKeys(lName);
    }

    public void selectGender() {
        radioMale.click();
    }

    public void setDobField(String dob) {
        dobField.sendKeys(dob);
    }

    public void setCompanyField(String company) {
        companyField.sendKeys(company);
    }

    public void clickSave()
    {
        saveButton.click();
    }
}
