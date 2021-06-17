package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WaitHelper;

import java.util.List;

public class SearchCustomerPage {

    WebDriver driver;
    WaitHelper waitHelper;

    public SearchCustomerPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        waitHelper = new WaitHelper(driver);
    }
    @FindBy(id= "SearchEmail")
    WebElement searchEmailField;

    @FindBy(id= "search-customers")
    WebElement searchCustomerButton;

    @FindBy(xpath="//table[@id='customers-grid']//tbody//tr")
    List<WebElement> rowsInTable;

    @FindBy(xpath = "//table[@id='customers-grid']//tbody//td")
    List<WebElement> colsInTable;

    public void setSearchEmailField(String email)
    {
        searchEmailField.clear();
        searchEmailField.sendKeys(email);
    }

    public void clickSearchButton()
    {
        searchCustomerButton.click();
    }

    public boolean searchEmailInTable(String email)
    {
       int rows = rowsInTable.size();
       boolean flag = false;
       for(int i=1;i<=rows;i++)
       {
            String emailID = driver.findElement(By.xpath("//table[@id='customers-grid']//tbody//tr["+i+"]//td[2]")).getText();
            System.out.println("Email ID is available the Customers table: "+emailID);
            if (emailID.equals(email))
            {
                flag =true;
            }
       }
        return flag;
    }

}
