package BDD.step_def;

import BDD.pages.NbaWebElements;
import BDD.utillities.BrowserUtils;
import BDD.utillities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Nba {


    NbaWebElements nbaWebElements = new NbaWebElements();


    @Given("user on NBA page")
    public void user_on_nba_page() {
        Driver.getDriver().get("https://www.nba.com/");


    }
    @Then("user  type in search bar {string}")
    public void user_type_in_search_bar(String name) {
        nbaWebElements.inputPlayer.sendKeys(name);


    }

    @Then("user click on  slideButton team")
    public void userClickOnCHATeam() throws InterruptedException {
        BrowserUtils.waitForVisibility(nbaWebElements.slideButton,10).click();
        Assert.assertEquals(nbaWebElements.slideButton.getAttribute("data-is-active"),"true");


    }


    @Given("user on NBA ticket page")
    public void userOnNBATicketPage() {
        Driver.getDriver().get("https://nbatickets.nba.com/?cid=nba:tickets:institutional:nbacom:domsites:rd");

    }

    @Then("user select from dropdown box {string}")
    public void userSelecyFromDropdownBox(String text) {
        Select dropdown = new Select(nbaWebElements.selectOption);
        dropdown.selectByVisibleText(text);


    }

    @Then("user select from dropdown box team  {string}")
    public void userSelectFromDropdownBoxTeam(String team) {
        Select dropdown = new Select(Driver.getDriver().findElement(By.xpath("//select[@ng-model='selectedTeam']")));
        dropdown.selectByVisibleText(team);
        //BrowserUtils.clickWithJS();
    }

    @Then("user validate word {string}")
    public void userValidateWord(String massage) {
        Assert.assertEquals( massage,nbaWebElements.massage.getText());
    }
}
