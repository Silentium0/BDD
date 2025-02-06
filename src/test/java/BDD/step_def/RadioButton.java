package BDD.step_def;

import BDD.pages.LoopRadiobuttonWebElement;
import BDD.utillities.BrowserUtils;
import BDD.utillities.ConfigurationReader;
import BDD.utillities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class RadioButton {

      LoopRadiobuttonWebElement loopRadiobuttonWebElement = new LoopRadiobuttonWebElement();


    @Given("user on loop radio page")
    public void user_on_loop_radio_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("radio.button"));

    }

    @Then("user click on radio button  {string}")
    public void userClickOnRadioButton(String radio) {
        BrowserUtils.clickWithNormalizeSpace(radio);
        Assert.assertTrue(loopRadiobuttonWebElement.radio.isEnabled());
        BrowserUtils.takeScreenshot();
    }
}
