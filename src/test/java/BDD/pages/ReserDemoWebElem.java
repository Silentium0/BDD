package BDD.pages;

import BDD.utillities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReserDemoWebElem {


    @FindBy(xpath = "//input[@value='oneway']")
    public WebElement oneWay;

    @FindBy(xpath = "//select[@name='passCount']")
    public WebElement selectPassenger;

    @FindBy(xpath = "//select[@name='fromPort']")
    public WebElement departingPort;

    @FindBy(xpath = "//select[@name='fromMonth']")
    public WebElement selectOnMonth;

    @FindBy(xpath = "//select[@name='fromDay']")
    public WebElement selectOnDay;

    @FindBy(xpath = "//select[@name='toPort']")
    public WebElement arrival;

    @FindBy(xpath = "//select[@name='toMonth']")
    public WebElement returningMounth;

    @FindBy(xpath = "//select[@name='toDay']")
    public WebElement returningDay;

    @FindBy(xpath = "//input[@value='Business']")
    public WebElement buisnesClass;


    @FindBy(xpath = "//select[@name='airline']")
    public WebElement airLines;

    @FindBy(xpath = "//input[@name='findFlights']")
    public WebElement continueButton;


    public ReserDemoWebElem(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
