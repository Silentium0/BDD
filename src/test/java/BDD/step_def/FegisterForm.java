package BDD.step_def;

import BDD.pages.RegisterFormElements;
import BDD.utillities.BrowserUtils;
import BDD.utillities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.InputMismatchException;
import java.util.Map;

public class FegisterForm {

    RegisterFormElements registerFormElements = new RegisterFormElements();

    @Given("user on register form page")
    public void userOnRegisterFormPage() {
        Driver.getDriver().get("https://loopcamp.vercel.app/registration_form.html");
    }

    @When("user feel the form")
    public void user_feel_the_form(Map<String , String> input) {
        for (Map.Entry<String,String> entry : input.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            if (key.equals("First name")){
                registerFormElements.firstname.sendKeys(value);
            } else if (key.equals("Last Name")) {
                registerFormElements.lastname.sendKeys(value);
            } else if (key.equals("Username")) {
                registerFormElements.userName.sendKeys(value);
            } else if (key.equals("Email")) {
                registerFormElements.email.sendKeys(value);
            } else if (key.equals("Password")) {
                registerFormElements.password.sendKeys(value);
            } else if (key.equals("Phone Number")) {
                registerFormElements.phone.sendKeys(value);
            }else {
                throw new InputMismatchException("Invalid input");
            }
        }
    }
    @Then("user click on Female redio button")
    public void user_click_on_redio_button() {
        registerFormElements.radioButtonFemail.click();
    }
    @Then("user  put date of birthd {string}")
    public void user_put_date_of_birthd(String birthday) {
        registerFormElements.birthday.sendKeys(birthday);
    }
    @Then("user select Accounting Office")
    public void user_select_accounting_office() {
        Select office =new Select( Driver.getDriver().findElement(By.xpath(registerFormElements.departmen)));
        office.selectByVisibleText(registerFormElements.office);
    }
    @Then("user select job title Developer")
    public void user_select_job_title_developer() {
        Select jobTitle1 =new Select( Driver.getDriver().findElement(By.xpath(registerFormElements.title)));
        jobTitle1.selectByVisibleText(registerFormElements.jobTitle);

    }
    @Then("user click checkzbox C+")
    public void user_click_checkbox() {
        registerFormElements.CPluss.click();

    }



    @Then("user click  {string}")
    public void userClick(String signUp) {
       BrowserUtils.clickWithNormalizeSpace(signUp);
    }

    @Then("user validate items{string}")
    public void userValidateItems(String Thanks) {
        Assert.assertEquals(Thanks,registerFormElements.Thanksforsigningup.getText() );

    }


}
