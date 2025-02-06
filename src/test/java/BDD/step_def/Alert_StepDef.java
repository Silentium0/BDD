package BDD.step_def;

import BDD.pages.AllertWebElements;
import BDD.utillities.ConfigurationReader;
import BDD.utillities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Alert;

public class Alert_StepDef {
    AllertWebElements allertWebElements = new AllertWebElements();

    @Given("user on alerts page")
    public void user_on_alerts_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("alert"));

    }
    @Then("user Accept allert")
    public void user_accept_allert() {
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();


    }
    @Then("user validate alert")
    public void user_validate_alert() {
        Assert.assertEquals("You successfully clicked an alert",allertWebElements.successAllerValid.getText());
    }
}
