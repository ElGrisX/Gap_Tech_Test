package setup;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import shoppingSite.ManageProduct;

public class BaseClass {

    public WebDriver driver;
    public RequestSpecification specs1;
    public ManageProduct manageProduct;
    public String productId ="";

    @BeforeSuite(alwaysRun = true)
    public void setup() {
        connectAPI();
    }

    public void openShoppingSite(){
        driver.get("http://34.205.174.166/");
        driver.manage().window().maximize();
    }

    public  WebDriver setWebDriver(){
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        this.driver = driver;
        return this.driver;
    }

    public void connectAPI(){
        createSpecs();
        createProd();
    }

    public void createSpecs(){
        specs1 = new RequestSpecBuilder()
                .setBaseUri("http://34.205.174.166/")
                .setUrlEncodingEnabled(true)
                .build();
    }

    @AfterSuite
    public void clean(){
        deleteProd();
    }

    public void createProd(){
        manageProduct = new ManageProduct();
        productId = manageProduct.createProduct(specs1);
    }
    public void deleteProd(){
        manageProduct = new ManageProduct();
        manageProduct.deleteProduct(productId, specs1);
    }
}
