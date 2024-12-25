package BDD.step_def;

import BDD.pages.ProductPageElemMeth;
import BDD.utillities.BrowserUtils;
import BDD.utillities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;
import java.util.Map;

public class Fruit_step {

    ProductPageElemMeth productPageElemMeth = new ProductPageElemMeth();


    @Given("user on homePage")
    public void user_on_home_page() {
        Driver.getDriver().get("https://tropicalfruitbox.com/");

    }
    @Then("User extract date from product")
    public void user_extract_date_from_product(List<Map<String, String >> productDetails) {

        for (Map<String , String > each : productDetails){
           // System.out.println(each);
            productPageElemMeth.clickCategory(each.get("Category"));
            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
            js.executeScript("window.scroll(0,200)");


            String acrualprice = productPageElemMeth.getTextProductPrice(each.get("Product"));
            String expected = each.get("Price");
            Assert.assertEquals(expected, acrualprice );

            System.out.print(each.get("Product"));
            System.out.println(each.get("Price"));
            BrowserUtils.takeScreenshot();
        }




    }


}
