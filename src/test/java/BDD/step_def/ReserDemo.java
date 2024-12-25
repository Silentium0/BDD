package BDD.step_def;

import BDD.pages.ReserDemoWebElem;
import BDD.utillities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;

public class ReserDemo {

    ReserDemoWebElem reserDemoWebElem = new ReserDemoWebElem();


    @Given("user on main page")
    public void user_on_main_page() {
        Driver.getDriver().get("https://demo.guru99.com/test/newtours/reservation.php");
    }
    @Then("user click Round Trip")
    public void user_click() {
        reserDemoWebElem.oneWay.click();
    }
    @Then("user select passengers {string}")
    public void user_select_passengers(String passenger) {
        Select select = new Select(reserDemoWebElem.selectPassenger);
        select.selectByVisibleText(passenger);
    }
    @Then("user select departing {string}")
    public void user_select_departing(String Seattle) {
        Select select = new Select(reserDemoWebElem.departingPort);
        select.selectByVisibleText(Seattle);
    }
    @Then("user select dates on {string} for {string}")
    public void user_select_dates_on(String May, String three) {
        Select select = new Select(reserDemoWebElem.selectOnMonth);
        select.selectByVisibleText(May);
        Select select2 = new Select(reserDemoWebElem.selectOnDay);
        select2.selectByVisibleText(three);
    }
    @Then("select arrivals {string}")
    public void select_arrivals(String Portland) {
        Select select = new Select(reserDemoWebElem.arrival);
        select.selectByVisibleText(Portland);
    }
    @Then("select Returning {string} for {string}")
    public void select_returning(String month, String day) {
        Select select = new Select(reserDemoWebElem.returningMounth);
        select.selectByVisibleText(month);
        Select select2 = new Select(reserDemoWebElem.returningDay);
        select2.selectByVisibleText(day);
    }
    @Then("user select class Business class")
    public void user_select_class() {
        reserDemoWebElem.buisnesClass.click();
    }
    @Then("user select airline {string}")
    public void user_select_airline(String PangeaAirlines) {
        Select select = new Select(reserDemoWebElem.airLines);
        select.selectByVisibleText(PangeaAirlines);
    }
    @Then("user click continue")
    public void user_click_continue() {
        reserDemoWebElem.continueButton.click();
    }
}
