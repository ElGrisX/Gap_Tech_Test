package shoppingSite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Wait;

/**
 * This class contains methods that return shopping page web elements, this class implements all methods from interface ShoppingSiteWebElement
 * @author Miguel A.
 * @version 1.0
 */
public class ShoppingSiteWebElements implements ShoppingSiteWebElement{

    Wait wait;
    WebDriver driver;
    /**
     * A Constructor for shoppingSiteWebElement class
     * @param driver initialized webdriver
     */
    public  ShoppingSiteWebElements(WebDriver driver){
        wait = new Wait(driver);
        this.driver = driver;
    }

    @Override
    public WebElement productTitle(){
        String xpath = "//h1[@class='product_title entry-title']";//declare the xpath
        return wait.waitBy(xpath);// invoke wait method to wait until web element is ready to interact with
    }
    @Override
    public WebElement productPrice(){
        String xpath = "//p[@class='price']//span[@class='woocommerce-Price-amount amount']";
        return wait.waitBy(xpath);
    }
    @Override
    public WebElement quantityInput(){
        String xpath = "//input[@type='number']";
        return wait.waitBy(xpath);
    }
    @Override
    public WebElement addToCartButton(){
        String xpath = "//button[@name='add-to-cart']";
        return wait.waitBy(xpath);
    }
    @Override
    public WebElement cartItemsCount(){
        String xpath = "//a[@class='cart-contents']//span[@class='count']";
        return wait.waitBy(xpath);
    }
    @Override
    public WebElement cartIcon(){
        String xpath = "//a[@class='cart-contents']";
        return wait.waitBy(xpath);
    }
    @Override
    public WebElement productNameCart(){
        String xpath = "//td[@class='product-name']/a";
        return wait.waitBy(xpath);
    }
    @Override
    public WebElement productPriceCart(){
        String xpath = "//td[@class='product-price']/span[@class='woocommerce-Price-amount amount']";
        return wait.waitBy(xpath);
    }
    @Override
    public WebElement productQuantityCart(){
        String xpath = "//td[@class='product-quantity']/div[@class='quantity']/input";
        return wait.waitBy(xpath);
    }
}
