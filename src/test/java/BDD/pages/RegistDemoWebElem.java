package BDD.pages;

import BDD.utillities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistDemoWebElem {

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firsName;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement phone;

    @FindBy(xpath = "//input[@name='userName']")
    public WebElement email;

    @FindBy(xpath = "//input[@name='address1']")
    public WebElement adress;

    @FindBy(xpath = "//input[@name='city']")
    public WebElement city;

    @FindBy(xpath = "//input[@name='state']")
    public WebElement state;

    @FindBy(xpath = "//input[@name='postalCode']")
    public WebElement postCode ;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement userName;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordFirst;


    @FindBy(xpath = "//input[@name='confirmPassword']")
    public WebElement passwordConfirm;


    @FindBy(xpath = "//select[@name='country']")
    public WebElement dropDown;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement submit;

    @FindBy(xpath = "//table[@width='492']/tbody/tr[3]/td/p/font/b[contains(text(),'Dear')]")
    public WebElement bobMC;

    @FindBy(xpath = "//option[text()='AUSTRIA']")
    public WebElement selectCountry;


    public RegistDemoWebElem(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



}
