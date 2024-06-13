package BDD.step_def;

import BDD.utillities.BrowserUtils;
import BDD.utillities.Driver;
import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Hooks {


    @Before
    public void setUp(){
        Driver.getDriver();


    }

    @After
    public void tesrDown(){
        //Driver.getDriver().close();
    }
    public void scenarShot(Scenario scenario){
        final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "imag/png", scenario.getName());
    }
}
