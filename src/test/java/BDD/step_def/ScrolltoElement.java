package BDD.step_def;

import BDD.pages.ScrollWebEleme;
import BDD.utillities.BrowserUtils;
import BDD.utillities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;

public class ScrolltoElement {

    ScrollWebEleme scrollWebEleme = new ScrollWebEleme();


    @Given("user on scroll  page")
    public void user_on_scroll_page() {
        Driver.getDriver().get("https://www.southfloridadiving.com/#");

    }
    @Then("user scroll page downt to  the element")
    public void user_scroll_page_downt_to_the_element() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scroll(0,5000)");

    }
    @Then("user click on link  {string}")
    public void user_click_on_link(String link) {
        BrowserUtils.justWait(10);
        BrowserUtils.justClick(link);
    }

    @Then("user click on link")
    public void userClickOnLink() {
        scrollWebEleme.siteLink.click();

    }
}
