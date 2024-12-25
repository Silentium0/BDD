package BDD.pages;

import BDD.utillities.BrowserUtils;
import BDD.utillities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoopRadiobuttonWebElement extends BrowserUtils {

    @FindBy(xpath = "//*[text()='Black']/../input")
    public WebElement radio;


    public LoopRadiobuttonWebElement(){
        PageFactory.initElements(Driver.getDriver(), this);

    }


}
