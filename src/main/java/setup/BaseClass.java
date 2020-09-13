package setup;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import shoppingSite.ManageProduct;

/**
 * This class contains attributes and methods in order to initialize the webdriver and invoke creation and delete a product via API.
 * @author Miguel A.
 * @version 1.0
 */
public class BaseClass {

    public WebDriver driver;
    public RequestSpecification specs1;
    public ManageProduct manageProduct;
    public String productId ="";

    /**
     * A method  to invoke methods in order to connect to the API before execution of test suite
     */
    @BeforeSuite(alwaysRun = true)
    public void setup() {
        connectAPI();
    }

    /**
     * A method  to open the shopping web site
     */
    public void openShoppingSite(){
        driver.get("http://34.205.174.166/");
        driver.manage().window().maximize();
    }
    /**
     * A method  to initialize webdriver and return it
     */
    public  WebDriver setWebDriver(){
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        this.driver = driver;
        return this.driver;
    }

    /**
     * A method  to invoke the api method to connect to API and create the product
     */
    public void connectAPI(){
        createSpecs();
        createProd();
    }

    /**
     * A method  to creates specs to connect to api
     */
    public void createSpecs(){
        specs1 = new RequestSpecBuilder()
                .setBaseUri("http://34.205.174.166/")
                .setUrlEncodingEnabled(true)
                .build();
    }

    /**
     * A method  to delete the product after all test methods are executed
     */
    @AfterSuite
    public void clean(){
        deleteProd();
    }

    /**
     * A method  to invoke the create product method from ManageProduct class
     */
    public void createProd(){
        manageProduct = new ManageProduct();
        productId = manageProduct.createProduct(specs1);
    }
    /**
     * A method  to invoke the delete product method from ManageProduct class
     */
    public void deleteProd(){
        manageProduct = new ManageProduct();
        manageProduct.deleteProduct(productId, specs1);
    }
}
