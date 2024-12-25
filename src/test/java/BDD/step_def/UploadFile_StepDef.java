package BDD.step_def;

import BDD.pages.UploadFileWebElem;
import BDD.utillities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class UploadFile_StepDef {

    UploadFileWebElem uploadFileWebElem = new UploadFileWebElem();


    @Given("User on home page")
    public void user_on_home_page() {
        Driver.getDriver().get("https://demo.guru99.com/test/image_upload/");

    }
    @Then("User send file")
    public void user_send_file() {
        String file = "C:\\Users\\sergi\\OneDrive\\Desktop\\Replite.txt";
        uploadFileWebElem.upload.sendKeys(file);

    }
    @Then("Validate That User sent file")
    public void validate_that_user_sent_file() {
        System.out.println(uploadFileWebElem.seccessMasage.getText());
        Assert.assertEquals("File Upload Successful", uploadFileWebElem.seccessMasage.getText() );



    }
}
