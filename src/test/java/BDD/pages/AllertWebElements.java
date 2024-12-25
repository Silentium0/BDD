package BDD.pages;

import BDD.utillities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllertWebElements {


    @FindBy(xpath = "//*[text()='You successfully clicked an alert']")
    public WebElement successAllerValid;


    public AllertWebElements(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
