package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This class contains a wait method utility to wait until a web element is ready to interact with
 * @author Miguel A.
 * @version 1.0
 */
public class Wait {
    WebDriver driver;
    /**
     * Constructor for Wait class
     * @param webDriver initialized webdriver
     */
    public Wait(WebDriver webDriver) {
        this.driver = webDriver;
        PageFactory.initElements(driver,this);
    }
    /**
     * A method to wait for a web element and then return it.
     * @param xpath web element xpath
     */
    public WebElement waitBy(String xpath){
        WebDriverWait wait = new WebDriverWait(driver,15);
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
    }
}
