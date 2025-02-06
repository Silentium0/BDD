package BDD.step_def;

import BDD.pages.WebElementsDocuport;
import BDD.utillities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DocuportCheckBox {


    WebElementsDocuport webElementsDocuport = new WebElementsDocuport();


    @When("user click checkbox")
    public void user_click_checkbox() {
        webElementsDocuport.leadsCheckBox.click();

    }



    @Then("send email {string}")
    public void sendEmail(String email) {
        webElementsDocuport.InputFieldEmail.sendKeys(email);

    }

    @Then("user click on share button")
    public void userClickOnShareButton() {
        webElementsDocuport.shareButton.click();


    }

}
