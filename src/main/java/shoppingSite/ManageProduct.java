package shoppingSite;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import setup.BaseClass;
import static io.restassured.RestAssured.given;

/**
 * This class contains attributes and methods in order manage all the action related to product like create and delete the product using API
 * @author Miguel A.
 * @version 1.0
 */
public class ManageProduct extends BaseClass {


    /**
     * A method  to create the product via API
     * @param specs1 contains request specification info to make the request
     */
    public String createProduct(RequestSpecification specs1){
        Response response =given(specs1)
                .auth()
                .preemptive()
                .basic("shopmanager", "axY2 rimc SzO9 cobf AZBw NLnX")
                .header("Accept", ContentType.JSON.getAcceptHeader())
                .contentType(ContentType.JSON)
                .body(Payload.getPostProductPayload())
                .when()
                .post("/wp-json/wc/v3/products")
                .then().assertThat().statusCode(201)
                .extract().response();
        JsonPath jsonPath = new JsonPath(response.asString());
        System.out.println("Product Id: "+ jsonPath.getString("id"));
        String productId = jsonPath.getString("id");

        return productId;
    }

    /**
     * A method  to create the product via API
     * @param specs1 contains request specification info to make the request
     * @param productId related to the productId to be deleted via API
     */
    public void deleteProduct(String productId,RequestSpecification specs1){
        Response response =given(specs1)
                .auth()
                .preemptive()
                .basic("shopmanager", "axY2 rimc SzO9 cobf AZBw NLnX")
                .header("Accept", ContentType.JSON.getAcceptHeader())
                .contentType(ContentType.JSON)
                .when()
                .delete("/wp-json/wc/v3/products/"+productId+"?force=true")
                .then().assertThat().statusCode(200)
                .extract().response();

        System.out.println("Product "+productId+" deleted");
        System.out.println("Response:   "+response.asString());
    }
}
