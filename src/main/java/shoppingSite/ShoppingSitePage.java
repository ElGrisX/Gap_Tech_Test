package shoppingSite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class ShoppingSitePage {

    ShoppingSite shoppingSite;

    public ShoppingSitePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        shoppingSite = new ShoppingSite(driver);
    }

    public void testProductPageLoadAsExpected(){

        shoppingSite.goToProduct();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(shoppingSite.getPageUrl(),"http://34.205.174.166/product/Miguel_T-Shirt/", "Current page is not correct");
        softAssert.assertEquals(shoppingSite.productTitle().getText(), "Miguel_T-Shirt","Product name doesn't match with the expected product name");
        softAssert.assertEquals(shoppingSite.productPrice().getText(),"$59.00","Product price doesn't match with the expected");
        softAssert.assertAll();

    }
    public void testProductQuantityIsCorrect(){

        shoppingSite.goToProduct();
        shoppingSite.increaseItemQuantity("7");
        Assert.assertEquals(shoppingSite.quantityInput().getAttribute("value"),"7","Product quantity is incorrect");
    }
    public void testAddToCartButton(){

        shoppingSite.goToProduct();
        shoppingSite.increaseItemQuantity("7");
        shoppingSite.clickAddToCartButton();
        Assert.assertEquals(shoppingSite.cartItemsCount().getText(),"7 items","Add to Cart button is not working as expected");
    }
    public void testProductListInfo(){

        shoppingSite.goToProduct();
        shoppingSite.increaseItemQuantity("7");
        shoppingSite.clickAddToCartButton();
        shoppingSite.clickCartIcon();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(shoppingSite.getPageUrl(),"http://34.205.174.166/cart/","Page redirect doesn't work as expected.");
        softAssert.assertTrue(shoppingSite.productNameCart().getText().equals("Miguel_T-Shirt"),"Product name wasn't displayed in the list");
        softAssert.assertEquals(shoppingSite.productPriceCart().getText(),"$59.00","Product price in the list doesn't match with the expected");
        softAssert.assertEquals(shoppingSite.productQuantityCart().getAttribute("value"),"7","Product quantity is incorrect");
        softAssert.assertAll();
    }
}
