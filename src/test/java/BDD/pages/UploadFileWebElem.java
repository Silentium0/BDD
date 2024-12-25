package BDD.pages;

import BDD.utillities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadFileWebElem {

    @FindBy(xpath = "//input[@id='photoimg']")
    public WebElement  upload;

    @FindBy(xpath = "//font[contains(text(),Successful)] ")
    public WebElement  seccessMasage;



    public UploadFileWebElem() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


}
