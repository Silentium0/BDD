package BDD.step_def;

import BDD.pages.LoginPage;
import BDD.utillities.BrowserUtils;
import BDD.utillities.ConfigurationReader;
import BDD.utillities.DocuportConstants;
import BDD.utillities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login {


    LoginPage loginPage = new LoginPage();


    @Given("User on login page")
    public void user_on_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("docuport"));
    }

    @When("user enter username")
    public void user_enter_password() {
        loginPage.username.sendKeys(DocuportConstants.USERNAME_ADVISOR);

    }

    @When("used enter password")
    public void used_enter_username() {
        loginPage.password.sendKeys(DocuportConstants.PASSWORD_DOCUPORT);
    }

    @When("user click login button")
    public void user_click_login_button() {
        System.out.println("login BUtton");
        BrowserUtils.waitForVisibility(loginPage.loginButtom, 10).click();
    }

    @Then("user on home page")
    public void user_on_home_page() {
        Assert.assertEquals(loginPage.Home.getText(), "Home");

    }
}
