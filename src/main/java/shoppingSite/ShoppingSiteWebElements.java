package shoppingSite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Wait;

public class ShoppingSiteWebElements {

    Wait wait;
    WebDriver driver;

    public  ShoppingSiteWebElements(WebDriver driver){
        wait = new Wait(driver);
        this.driver = driver;
    }


    WebElement productTitle(){
        String xpath = "//h1[@class='product_title entry-title']";
        return wait.waitBy(xpath);
    }
    WebElement productPrice(){
        String xpath = "//p[@class='price']//span[@class='woocommerce-Price-amount amount']";
        return wait.waitBy(xpath);
    }
    WebElement increaseQuantityButton(){
        String xpath = "//div[@class='quantity']";
        return wait.waitBy(xpath);
    }
    WebElement quantityInput(){
        String xpath = "//input[@type='number']";
        return wait.waitBy(xpath);
    }
    WebElement addToCartButton(){
        String xpath = "//button[@name='add-to-cart']";
        return wait.waitBy(xpath);
    }
    WebElement cartItemsCount(){
        String xpath = "//a[@class='cart-contents']//span[@class='count']";
        return wait.waitBy(xpath);
    }
    WebElement cartIcon(){
        String xpath = "//a[@class='cart-contents']";
        return wait.waitBy(xpath);
    }
    WebElement productNameCart(){
        String xpath = "//td[@class='product-name']/a";
        return wait.waitBy(xpath);
    }
    WebElement productPriceCart(){
        String xpath = "//td[@class='product-price']/span[@class='woocommerce-Price-amount amount']";
        return wait.waitBy(xpath);
    }
    WebElement productQuantityCart(){
        String xpath = "//td[@class='product-quantity']/div[@class='quantity']/input";
        return wait.waitBy(xpath);
    }
}
