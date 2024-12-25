package BDD.pages;

import BDD.utillities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ScrollWebEleme {

    @FindBy(xpath = "//*[text()='Duck Diver, LLC.']")
    public WebElement siteLink;


    public ScrollWebEleme(){
        PageFactory.initElements(Driver.getDriver(), this);

    }
}
