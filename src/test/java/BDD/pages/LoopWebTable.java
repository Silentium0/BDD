package BDD.pages;

import BDD.utillities.Driver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoopWebTable {




    public LoopWebTable(){
        PageFactory.initElements(Driver.getDriver(), this);

    }
}
