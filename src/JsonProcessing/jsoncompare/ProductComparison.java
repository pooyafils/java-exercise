package JsonProcessing.jsoncompare;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Iterator;

public class ProductComparison {
    public static void main(String[] args) throws Exception {
        // Creating two Product objects
        Product product1 = new Product(1, "Laptop", "High-performance laptop", "Electronics");
        Product product2 = new Product(2, "Phone", "Smartphone with latest features", "Electronics");

        // Converting Product objects to JSON
        JsonNode json1 = convertToJsonNode(product1);
        JsonNode json2 = convertToJsonNode(product2);

        // Finding differences
        findDifferences(json1, json2);
    }

    private static JsonNode convertToJsonNode(Product product) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.valueToTree(product);
    }

    private static void findDifferences(JsonNode node1, JsonNode node2) {
        if (!node1.equals(node2)) {
            if (node1.isObject() && node2.isObject()) {
                // If both nodes are objects, compare their fields
                for (Iterator<String> it = node1.fieldNames(); it.hasNext(); ) {
                    String fieldName = it.next();
                    JsonNode childNode1 = node1.get(fieldName);
                    JsonNode childNode2 = node2.get(fieldName);
                    findDifferences(childNode1, childNode2);
                }
            } else {
                // Print the difference
                System.out.println("Difference: " + node1 + " vs " + node2);
            }
        }
    }
}
