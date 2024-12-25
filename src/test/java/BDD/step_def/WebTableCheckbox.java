package BDD.step_def;

import BDD.utillities.BrowserUtils;
import BDD.utillities.Driver;
import BDD.utillities.PizzaOrderWebTableUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class WebTableCheckbox {

    @Given("user on landing page")
    public void user_on_landing_page() {
        Driver.getDriver().get("https://loopcamp.vercel.app/web-tables.html");
        BrowserUtils.takeScreenshot();

    }


    @When("user  enter a card number {string} check box gets click")
    public void userEnterACardNumberCheckBoxGetsClick(String Name) {
        PizzaOrderWebTableUtils.checkBoxWebTable(Name);
        BrowserUtils.takeScreenshot();
    }


}
