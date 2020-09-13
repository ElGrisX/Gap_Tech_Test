package shoppingSite;

/**
 * This class contains the product payload for create a new product via API
 * @author Miguel A.
 * @version 1.0
 */
public class Payload {

    /**
     * A method that return product payload to be used in the post body to use in the endpoint for the creation of a new product via API
     */
    public static String getPostProductPayload(){

        String payload ="{\n" +
                "  \"name\": \"Miguel_T-Shirt\",\n" +
                "  \"type\": \"simple\",\n" +
                "  \"regular_price\": \"59.00\",\n" +
                "  \"description\": \"GAP test API.\",\n" +
                "  \"short_description\": \"This is a test for shopping site.\",\n" +
                "  \"categories\": [],\n" +
                "  \"images\": []\n" +
                "}";
        return payload;
    }
}
