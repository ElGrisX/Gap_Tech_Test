package shoppingSite;

import org.openqa.selenium.WebDriver;
import utilities.Wait;

public class ShoppingSite extends ShoppingSiteWebElements{

    WebDriver driver;
    Wait wait;
    ShoppingSiteWebElements shoppingSiteWebElements;

    public ShoppingSite(WebDriver driver) {
        super(driver);
        this.driver = driver;
        wait = new Wait(driver);
        shoppingSiteWebElements = new ShoppingSiteWebElements(driver);
    }

    public void goToProduct(){
        driver.get("http://34.205.174.166/product/Miguel_T-Shirt/");
    }

    public String getPageUrl(){
        return driver.getCurrentUrl();
    }
    public void increaseItemQuantity(String itemNumber){
        quantityInput().clear();
        quantityInput().sendKeys(itemNumber);
    }
    public void clickAddToCartButton(){
        addToCartButton().click();
    }
    public void clickCartIcon(){
        cartIcon().click();
    }

}
