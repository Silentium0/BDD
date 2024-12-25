package BDD.pages;

import BDD.utillities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebElementsDocuport {


    @FindBy(xpath = "//input[@id='input-14'] ")
    public WebElement username;

    @FindBy(xpath = "//input[@id='input-15'] ")
    public WebElement password;

    @FindBy(xpath = "//span[text()=' Log in '] ")
    public WebElement loginButtom;

    @FindBy(xpath = "//span[text()='Home']")
    public WebElement Home;

    @FindBy(xpath = "//div[@class='col col-4']/button")
    public WebElement hamburgerbuttonm;

    @FindBy(xpath = "//label[text()='First name']/following-sibling::input")
    public WebElement firstName;

    @FindBy(xpath = "//label[text()='Last name']/following-sibling::input")
    public WebElement lastName;
    @FindBy(xpath = "//label[text()='Phone number']/following-sibling::input")
    public WebElement Phone;

    @FindBy(xpath = "//td[text()='test@mgila.omc']/../td/div")
    public WebElement checkbox;

    @FindBy(xpath = "//span[text()='Batch1 Group3']")
    public WebElement accountName;

    @FindBy(xpath = "//span[text()='Log out']")
    public WebElement logOut;

    @FindBy(xpath = "//span[text()='Aldo Meneao']/../following-sibling::td[2]/div/div/div/div/input")
    public WebElement accountnumber;

    @FindBy(xpath = "//thead[@class='v-data-table-header']/tr/th/div/div/div")
    public WebElement leadsCheckBox;




    public WebElementsDocuport() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

}
