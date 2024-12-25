package BDD.pages;

import BDD.utillities.BrowserUtils;
import BDD.utillities.DocuportConstants;
import BDD.utillities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import javax.xml.validation.Validator;
import java.util.List;
import java.util.logging.Logger;

public class LoginPage extends WebElementsDocuport {

    private static final Logger logger = Logger.getLogger(Validator.class.getName());


    public static void validation(List<String> elements) {
        for (int i = 0; i < elements.size(); i++) {
            String elementText = elements.get(i);

            List<WebElement> element = Driver.getDriver().findElements(By.xpath("//*[text()='" + elementText + "']"));
            if (!element.isEmpty()) {
                logger.info("Element with text '" + elementText + "' is displayed.");
            } else {
                logger.severe("Element with text '" + elementText + "' was not found.");
                throw new RuntimeException();
            }

        }
    }


    public void loginDocuport(String username1, String password1) {
        BrowserUtils.waitForVisibility(username, DocuportConstants.SMALL);
        username.clear();
        username.sendKeys(username1);
        password.clear();
        password.sendKeys(password1);
        loginButtom.click();

        BrowserUtils.justWait(DocuportConstants.SMALL);

    }

    public void logOut (){
       accountName.click();
       logOut.click();
    }

    public static void clickButton(List<String> elements) {
        for (int i = 0; i < elements.size(); i++) {
            String elementText = elements.get(i);
            try {
                List<WebElement> element = Driver.getDriver().findElements(By.xpath("//label[text()='" + elementText + "']"));
                if (!element.isEmpty()) {
                    element.get(i).click();
                } else {
                    logger.warning("Element with text '" + elementText + "' is not displayed.");
                }
            } catch (NoSuchElementException e) {
                logger.severe("Element with text '" + elementText + "' was not found.");
            }
        }
    }

    public  void clickButtonByText(String elementText) {
        try {
            List<WebElement> foundElements = Driver.getDriver().findElements(By.xpath("//*[text()='" + elementText + "']"));
            if (!foundElements.isEmpty()) {
                for (WebElement el : foundElements) {
                    try {
                        el.click();
                        logger.info("Clicked element with text: '" + elementText + "'");
                        break; // Stop after the first click if only one click is desired
                    } catch (Exception e) {
                        logger.severe("Failed to click element with text: '" + elementText + "'. Exception: " + e.getMessage());
                    }
                }
            } else {
                logger.warning("Element with text '" + elementText + "' is not displayed.");
            }
        } catch (Exception e) {
            logger.severe("Error finding elements with text: '" + elementText + "'. Exception: " + e.getMessage());
        }
    }


}