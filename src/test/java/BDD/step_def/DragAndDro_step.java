package BDD.step_def;

import BDD.pages.DragDropWeb;
import BDD.utillities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class DragAndDro_step {
    DragDropWeb dragDropWeb = new DragDropWeb();


    @Given("user on loop  page")
    public void user_on_loop_page() {
        Driver.getDriver().get("https://loopcamp.vercel.app/drag-and-drop-circles.html");

    }
    @Then("user darg and drop sircle")
    public void user_darg_and_drop_sircle() {
        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDrop(dragDropWeb.smallSircut, dragDropWeb.bigSircle).perform();

    }

    @Then("validate")
    public void validate() {

        Assert.assertEquals(dragDropWeb.youDidGrate.getText(), dragDropWeb.expected);


    }






























}
