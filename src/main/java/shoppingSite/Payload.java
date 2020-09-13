package shoppingSite;

public class Payload {

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
