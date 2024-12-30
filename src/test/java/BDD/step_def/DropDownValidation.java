package BDD.step_def;

import BDD.utillities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DropDownValidation {


    @Given("user on Dropdown page")
    public void user_on_dropdown_page() {
        Driver.getDriver().get("https://loopcamp.vercel.app/dropdown.html");

    }
    @Then("user validate items in dropDown")
    public void user_validate_items_in_drop_down(List<String> items) {

        Select dropDown = new Select(Driver.getDriver().findElement(By.xpath("//select[@id='month']")));
        List<WebElement> option = dropDown.getOptions();
        List<String> actualItems = new ArrayList<>();

        for (int i = 0; i <option.size() ; i++) {
            WebElement each = option.get(i);
            actualItems.add(""+ each.getText());

        }


//        for (WebElement each: option){
//            actualItems.add(each.getText());
//        }
        Assert.assertEquals(items, actualItems);



    }

}
