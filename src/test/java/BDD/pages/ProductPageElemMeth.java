package BDD.pages;

import BDD.utillities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class ProductPageElemMeth {


    public void  clickCategory(String category){
        Driver.getDriver().findElement(By.xpath("//nav[@class='main__navigation main__navigation--center main__navigation--underline font__size--base']/span//a[contains(text(), '"+category+"')]")).click();
    }

    public String  getTextProductPrice(String product){
        String actualPrice = Driver.getDriver().findElement(By.xpath("//a[normalize-space(.)='"+product+"']/../span/span")).getText();
        return  actualPrice.substring(1);

    }
    public ProductPageElemMeth(){
        PageFactory.initElements(Driver.getDriver(),this);
    }





}
