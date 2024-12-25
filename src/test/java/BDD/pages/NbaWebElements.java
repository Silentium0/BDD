package BDD.pages;

import BDD.utillities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NbaWebElements {


    @FindBy(xpath = "//input[@type='text']")
    public  WebElement inputPlayer;


    @FindBy(xpath = "//div[@class='PlayerList_content__kwT7z']/div/div[6]/label")
    public  WebElement slideButton;


    @FindBy(xpath = "//span[text()=' Sorry, no games were found for the selected filters. ']")
    public  WebElement massage;

    @FindBy(xpath = "//select[@ng-model='selectedOption']")
    public  WebElement  selectOption;



    public NbaWebElements(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


}
