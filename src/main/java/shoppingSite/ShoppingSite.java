package shoppingSite;

import org.openqa.selenium.WebDriver;
import utilities.Wait;

/**
 * This class contains attributes and action methods to interact with the shopping page and implement method from ShoppingSiteActions interface
 * @author Miguel A.
 * @version 1.0
 */
public class ShoppingSite extends ShoppingSiteWebElements implements ShoppingSiteActions{

    WebDriver driver;
    Wait wait;
    ShoppingSiteWebElements shoppingSiteWebElements;

    /**
     * Constructor for shopping class
     * @param driver initialized webdriver
     */
    public ShoppingSite(WebDriver driver) {
        super(driver);
        this.driver = driver;
        wait = new Wait(driver);
        shoppingSiteWebElements = new ShoppingSiteWebElements(driver);
    }
    /**
     * A method to redirect to the specific product page
     */
    @Override
    public void goToProduct(){
        driver.get("http://34.205.174.166/product/Miguel_T-Shirt/");
    }

    /**
     * A method  to get the current page url
     */
    @Override
    public String getPageUrl(){
        return driver.getCurrentUrl();
    }
    /**
     * A method  to increase the item quantity
     */
    @Override
    public void increaseItemQuantity(String itemNumber){
        quantityInput().clear();
        quantityInput().sendKeys(itemNumber);
    }
    /**
     * A method  to click on the Add to cart button
     */
    @Override
    public void clickAddToCartButton(){
        addToCartButton().click();
    }
    /**
     * A method  to click cart icon
     */
    @Override
    public void clickCartIcon(){
        cartIcon().click();
    }

}
