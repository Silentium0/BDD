package BDD.pages;

import BDD.utillities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterFormElements {

    @FindBy(xpath = "//input[@name='firstname']")
        public WebElement firstname;

    @FindBy(xpath = "//input[@name='lastname']")
    public WebElement lastname;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement phone;

    @FindBy(xpath = "//input[@value='female']")
    public WebElement radioButtonFemail;

    @FindBy(xpath = "//input[@name='birthday']")
    public WebElement birthday;
    @FindBy(xpath = "//label[text()='C++']/preceding-sibling::input")
    public WebElement CPluss;

    @FindBy(xpath = "//button[@type='submit'] ")
    public WebElement signUp;


    @FindBy(xpath = "//*[text()='Thanks for signing up!']")
    public WebElement Thanksforsigningup;





    public  String departmen = "//select[@name='department']";
    public String office = "MCR";

    public  String title = "//select[@name='job_title']";
    public String jobTitle = "SDET";







    public RegisterFormElements(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
