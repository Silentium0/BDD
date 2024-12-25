package BDD.step_def;

import BDD.utillities.BrowserUtils;
import BDD.utillities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ClickButtonsMethod {

    @Given("user on loop page")
    public void user_on_loop_page() {
        Driver.getDriver().get("https://loopcamp.vercel.app/index.html");
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,1500);");


    }


    @Then("user on {string}")
    public void userOn(String arg0) {
        BrowserUtils.clickWithNormalizeSpace(arg0);
    }
}
