package shoppingSite;

import org.openqa.selenium.WebElement;

/**
 * Interface for shopping site webelements methods
 * @author Miguel A.
 * @version 1.0
 */
public interface ShoppingSiteWebElement {
    WebElement productTitle();
    WebElement productPrice();
    WebElement quantityInput();
    WebElement addToCartButton();
    WebElement cartItemsCount();
    WebElement cartIcon();
    WebElement productNameCart();
    WebElement productPriceCart();
    WebElement productQuantityCart();
}
