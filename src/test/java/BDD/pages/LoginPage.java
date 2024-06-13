package BDD.pages;

import BDD.utillities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


    @FindBy(xpath = "//input[@id='input-14'] ")
    public WebElement username;

    @FindBy(xpath = "//input[@id='input-15'] ")
    public WebElement password;

    @FindBy(xpath = "//span[text()=' Log in '] ")
    public WebElement loginButtom;

    @FindBy(xpath = "//span[text()='Home']")
    public WebElement Home;

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void  Login(){
        username.click();
        password.click();
        loginButtom.click();
    }
}
