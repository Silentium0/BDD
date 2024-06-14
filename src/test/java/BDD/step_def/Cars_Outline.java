package BDD.step_def;

import BDD.pages.HondaBasePage;
import BDD.utillities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

import static org.junit.Assert.assertEquals;

public class Cars_Outline {

     HondaBasePage hondaBasePage = new HondaBasePage();

    @When("user search cars {string}")
    public void user_search_cars(String brand) throws InterruptedException {
        hondaBasePage.searchBox.sendKeys(brand + Keys.ENTER );
        BrowserUtils.justWait(5);

    }
    @Then("user shouls see cat {string} in the result")
    public void user_shouls_see_cat_in_the_result(String models) {
       assertEquals(hondaBasePage.car.getText(), models);
    }
}
