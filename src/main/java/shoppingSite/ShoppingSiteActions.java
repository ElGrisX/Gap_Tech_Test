package shoppingSite;

/**
 * Interface for shopping site actions methods
 * @author Miguel A.
 * @version 1.0
 */
public interface ShoppingSiteActions {
    void goToProduct();
    String getPageUrl();
    void increaseItemQuantity(String itemNumber);
    void clickAddToCartButton();
    void clickCartIcon();
}
