package interview.compareobjects.withJson;

import com.google.gson.Gson;
import interview.compareobjects.Product;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class CompareObjectJsonDynamicly {
    public static ArrayList<Product> dataSource() {
        ArrayList<Product> arrayList = new ArrayList<>();
        Product product = new Product(1, "a71", "phone", "s");
        Product productTwo = new Product(2, "a51", "phone", "s");
        Product productThree = new Product(3, "iphone 10", "phone", "apple phone");
        Product productFour = new Product(4, "a71", "phone", "samsung phone");
        Product productFive = new Product(5, "a71", "phone", "samsung phone");
        arrayList.add(product);
        arrayList.add(productTwo);
        arrayList.add(productThree);
        arrayList.add(productFour);
        arrayList.add(productFive);

        return arrayList;
    }

    public static String convertObjectToJsonString(Product product) {
        Gson gson = new Gson();
        return gson.toJson(product);
    }

    public static JSONArray findDiff(String... fieldsToCompare) {
        ArrayList<Product> products = dataSource();
        JSONArray jsonArraySorted = new JSONArray();

        for (int i = 0; i < products.size() - 1; i++) {
            Product currentProduct = products.get(i);
            Product nextProduct = products.get(i + 1);

            boolean isDifferent = false;
            for (String field : fieldsToCompare) {
                if (!getFieldValue(currentProduct, field).equals(getFieldValue(nextProduct, field))) {
                    isDifferent = true;
                    break;
                }
            }

            if (isDifferent) {
                jsonArraySorted.put(convertObjectToJsonString(currentProduct));
                jsonArraySorted.put(convertObjectToJsonString(nextProduct));
            }
        }

        return jsonArraySorted;
    }

    private static Object getFieldValue(Product product, String fieldName) {
        switch (fieldName) {
            case "id":
                return product.getId();
            case "name":
                return product.getName();
            case "category":
                return product.getCategory();
            case "des":
                return product.getDes();
            default:
                throw new IllegalArgumentException("Invalid field name: " + fieldName);
        }
    }

    public static void main(String[] args) {
        // Choose the fields to compare dynamically
        String[] fieldsToCompare = {"name", "des"};

        System.out.println(findDiff(fieldsToCompare));
    }
}