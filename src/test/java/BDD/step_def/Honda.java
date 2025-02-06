package BDD.step_def;

import BDD.pages.HondaBasePage;
import BDD.utillities.BrowserUtils;
import BDD.utillities.ConfigurationReader;
import BDD.utillities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.assertEquals;

import java.util.List;

public class Honda {

       HondaBasePage hondaBasePage = new HondaBasePage();

    @Given("user on google page")
    public void user_on_google_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("google.url"));
    }
    @When("user type honda Accord in the google search box")
    public void user_type_honde_accord_in_the_google_search_box() {
        hondaBasePage.searchBox.sendKeys("Honda Accord 2023"+ Keys.ENTER);
    }
    @Then("user should see  honda accord in title")
    public void user_shoul_see_honda_accord_in_title() throws InterruptedException {
       //Driver.getDriver().getTitle();
        Thread.sleep(1000);
        assertEquals("Honda Accord 2023 - Google Search",Driver.getDriver().getTitle());
    }


    @When("user type {string} in the google search box")
    public void user_type_in_the_google_search_box(String userInput) {
        hondaBasePage.searchBox.sendKeys(userInput+ Keys.ENTER);
    }

    @Then("user should see  {string} in title")
    public void user_should_see_in_title(String validation) throws InterruptedException {
        Thread.sleep(1000);

        Assert.assertEquals(validation,Driver.getDriver().getTitle());


    }

    @Then("user search multiple items")
    public void user_search_multiple_items(List<String> items) {

            for (String each : items){
                hondaBasePage.searchBox.clear();
                hondaBasePage.searchBox.sendKeys(each + Keys.ENTER);
                Assert.assertEquals(each + " - Google Search",Driver.getDriver().getTitle());
            }


    }


}
