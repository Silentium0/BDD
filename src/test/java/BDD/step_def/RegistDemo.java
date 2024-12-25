package BDD.step_def;

import BDD.pages.RegistDemoWebElem;
import BDD.utillities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.InputMismatchException;
import java.util.Map;

public class RegistDemo {

    RegistDemoWebElem registDemoWebElem = new RegistDemoWebElem();


    @Given("user on register form page demo")
    public void user_on_register_form_page_demo() {
        Driver.getDriver().get("https://demo.guru99.com/test/newtours/register.php");

    }
    @Then("user enter  data")
    public void user_enter_data(Map<String, String> Data) {

        for (Map.Entry<String, String> entry : Data.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            if (key.equals("Firs Name")) {
                registDemoWebElem.firsName.sendKeys(value);
            } else if (key.equals("Last Name")) {
                registDemoWebElem.lastName.sendKeys(value);
            } else if (key.equals("Phone")) {
                registDemoWebElem.phone.sendKeys(value);
            } else if (key.equals("Email")) {
                registDemoWebElem.email.sendKeys(value);
            } else if (key.equals("Address")) {
                registDemoWebElem.adress.sendKeys(value);
            } else if (key.equals("City")) {
                registDemoWebElem.city.sendKeys(value);
            } else if (key.equals("State Province")) {
                registDemoWebElem.state.sendKeys(value);
            } else if (key.equals("Postal Code")) {
                registDemoWebElem.postCode.sendKeys(value);
            } else {
                throw new InputMismatchException("Invalid input");
            }
        }
    }

    @Then("user select country")
    public void user_select_country() {
        Select select = new Select(registDemoWebElem.dropDown);
        select.selectByVisibleText(registDemoWebElem.selectCountry.getText());
    }
    @Then("user fill form")
    public void user_fill_form(Map<String, String> input) {

        for (Map.Entry<String, String> entry : input.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            if (key.equals("User Name")) {
                registDemoWebElem.userName.sendKeys(value);
            } else if (key.equals("Password")) {
                registDemoWebElem.passwordFirst.sendKeys(value);
            } else if (key.equals("Confirm Password")) {
                registDemoWebElem.passwordConfirm.sendKeys(value);
            } else {
                throw new InputMismatchException("Invalid input");
            }
        }
    }
    @Then("user click on submit")
    public void userClickOnSubmit() {
        registDemoWebElem.submit.click();
    }


    @Then("verify if user is created {string}")
    public void verifyIfUserIsCreated(String created) {
        Assert.assertEquals(created, registDemoWebElem.bobMC.getText() );
    }
}
