import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import setup.BaseClass;
import shoppingSite.ShoppingSitePage;
import utilities.TestAnnotationUtils;

public class ShoppingSite_Tests extends BaseClass {

    WebDriver driver;
    ShoppingSitePage shoppingSitePage;

    @BeforeMethod
    public void setupMethod() {
        this.driver = setWebDriver();
        openShoppingSite();
    }
    @AfterMethod
    public void tearDownDriver(){
        driver.quit();
    }

    /**
     * Test method in order to verify if the product page is loading as expected
     */
    @TestAnnotationUtils.TestAnnotation(value = "Verify if the product page is loading as expected")
    @Test(priority=1)
    public void verifyProductPageLoadAsExpected(){
        shoppingSitePage = new ShoppingSitePage(driver);
        shoppingSitePage.testProductPageLoadAsExpected();
    }

    /**
     * Test method in order to verify if the product quantity
     */
    @TestAnnotationUtils.TestAnnotation(value = "Verify if the product quantity is working as expected")
    @Test(priority=2)
    public void verifyProductQuantityIsCorrect(){
        shoppingSitePage = new ShoppingSitePage(driver);
        shoppingSitePage.testProductQuantityIsCorrect();
    }
    /**
     * Test method in order to verify if the product quantity
     */
    @TestAnnotationUtils.TestAnnotation(value = "Verify if Add to Card functionality is working as expected")
    @Test(priority=3)
    public void verifyAddToCartButton(){
        shoppingSitePage = new ShoppingSitePage(driver);
        shoppingSitePage.testAddToCartButton();
    }
    /**
     * Test method in order to verify if the product quantity
     */
    @TestAnnotationUtils.TestAnnotation(value = "Verify if Product list is displaying the correct info")
    @Test(priority=4)
    public void verifyProductListInfo(){
        shoppingSitePage = new ShoppingSitePage(driver);
        shoppingSitePage.testProductListInfo();
    }

}
