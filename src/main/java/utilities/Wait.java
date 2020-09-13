package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
    WebDriver driver;
    public Wait(WebDriver webDriver) {
        this.driver = webDriver;
        PageFactory.initElements(driver,this);
    }

    public WebElement waitBy(String xpath){
        WebDriverWait wait = new WebDriverWait(driver,15);
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
    }

    public void hoverOverElement(WebElement element){
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();
    }
}
