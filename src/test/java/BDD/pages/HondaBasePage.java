package BDD.pages;

import BDD.utillities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HondaBasePage {




    @FindBy(name = "q")
    public  WebElement searchBox;

    @FindBy(xpath = "//input[@class='RNmpXc']/preceding-sibling::input")
    public  WebElement submit ;

    @FindBy(xpath = "//div[@class='PZPZlf ssJ7i B5dxMb']")
    public  WebElement car ;





    public HondaBasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
