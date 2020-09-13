import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import setup.BaseClass;
import shoppingSite.ShoppingSitePage;

/**
 * This class contains annotations to control the test execution workflow and test methods in order to run the test
 * @author Miguel A.
 * @version 1.0
 */
public class ShoppingSite_Tests extends BaseClass {

    WebDriver driver;
    ShoppingSitePage shoppingSitePage;

    /**
     * Before method to initialize the webdriver and open the shopping site before every test method
     */
    @BeforeMethod
    public void setupMethod() {
        this.driver = setWebDriver();
        openShoppingSite();
    }
    /**
     * After method to quit the webdriver and close the browser after every test method
     */
    @AfterMethod
    public void tearDownDriver(){
        driver.quit();
    }

    /**
     * Test method in order to verify if the product page is loading as expected
     */
    @Test(priority=1)
    public void verifyProductPageLoadAsExpected(){
        shoppingSitePage = new ShoppingSitePage(driver);
        shoppingSitePage.testProductPageLoadAsExpected();
    }

    /**
     * Test method in order to verify if the product quantity
     */
    @Test(priority=2)
    public void verifyProductQuantityIsCorrect(){
        shoppingSitePage = new ShoppingSitePage(driver);
        shoppingSitePage.testProductQuantityIsCorrect();
    }
    /**
     * Test method in order to verify if the product quantity
     */
    @Test(priority=3)
    public void verifyAddToCartButton(){
        shoppingSitePage = new ShoppingSitePage(driver);
        shoppingSitePage.testAddToCartButton();
    }
    /**
     * Test method in order to verify if the product quantity
     */
    @Test(priority=4)
    public void verifyProductListInfo(){
        shoppingSitePage = new ShoppingSitePage(driver);
        shoppingSitePage.testProductListInfo();
    }

}
