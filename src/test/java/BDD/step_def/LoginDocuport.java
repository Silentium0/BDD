package BDD.step_def;

import BDD.pages.LoginPage;
import BDD.utillities.BrowserUtils;
import BDD.utillities.ConfigurationReader;
import BDD.utillities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;
import static org.junit.Assert.assertEquals;

public class LoginDocuport {


    LoginPage loginPage = new LoginPage();


    @Given("User on login page")
    public void user_on_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("docuport"));
    }
    @When("user enter credentials")
    public void  user_enter_credentials(Map<String, String> dataTable) {
        loginPage.loginDocuport(dataTable.get("username"),dataTable.get("password"));
    }

        @Then("user on home page")
    public void user_on_home_page() {
        Assert.assertEquals(loginPage.Home.getText(), "Home");
    }

    @Then("user validate items")
    public void user_validate_items(List<String> items) {
        LoginPage.validation(items);
    }

    @When("user click hamburger button items is not present")
    public void user_click_hamburger_button_items_is_not_present(List<String> items)  {
        loginPage.hamburgerbuttonm.click();
        LoginPage.validation(items);
        BrowserUtils.takeScreenshot();
    }
    @Then("user click on button")
    public void user_click_on(List<String> Batch1Group3)  {
        LoginPage.clickButton(Batch1Group3);

    }


    @Then("user click on {string}")
    public void userClickOn(String test) {
        loginPage.clickButtonByText(test);
    }

    @Then("user enter First Name {string}")
    public void userEnterFirstName(String Batch12) {
        loginPage.lastName.clear();
        loginPage.firstName.sendKeys(Batch12);

    }

    @Then("user enter Last Name {string}")
    public void userEnterLastName(String Group32) {
        loginPage.lastName.clear();
        loginPage.lastName.sendKeys(Group32);
        BrowserUtils.takeScreenshot();
    }

    @Then("user enter Phone {string}")
    public void userEnterPhone(String phone) {
            loginPage.Phone.clear();
           loginPage.Phone.sendKeys(phone);
    }

    @When("user enter credentials with map")
    public void userEnterCredentialsWithMap(Map <String, String > data) {
        for (Map.Entry<String, String> entry : data.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            switch (key) {
                case "First Name":
                    loginPage.firstName.clear();
                    loginPage.firstName.sendKeys(value);
                    break;
                case "Last Name":
                    loginPage.lastName.clear();
                    loginPage.lastName.sendKeys(value);
                    break;
                case "Phone":
                    loginPage.Phone.clear();
                    loginPage.Phone.sendKeys(value);
                default:
                    System.out.println("No matching field found for key: " + key);
            }
        }

    }



    @And("user  lick checkbox with Email test@mgila.omc")
    public void userLickCheckboxWithEmailTestMgilaOmc() {
        loginPage.checkbox.click();
    }

    @Then("user logOut")
    public void userLogOut() {
        loginPage.logOut();
    }


    @Then("user some date to {string} to account number field")
    public void userSomeDateToToAccountNumberField(String number) {
        loginPage.accountnumber.sendKeys(number);
    }


    @Then("validate if is created")
    public void validateIfIsCreated() throws InterruptedException {
        assertEquals("true",loginPage.accountnumber.getAttribute("aria-haspopup"));
    }
}
