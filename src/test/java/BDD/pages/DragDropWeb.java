package BDD.pages;

import BDD.utillities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragDropWeb {




    @FindBy(xpath = "//div[@id='draggable']")
    public WebElement smallSircut ;

    @FindBy(xpath = "//div[@id='draggable']/preceding-sibling::div")
    public  WebElement bigSircle ;

    @FindBy(xpath = "//div[@id='draggable']/preceding-sibling::div")
    public  WebElement youDidGrate  ;
    public String expected = "You did great!";





    public DragDropWeb(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
