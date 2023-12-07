package interview.compareobjects.withJson;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import interview.compareobjects.Product;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.json.Json;
import java.util.ArrayList;

public class CompareObjectJson {
    public static ArrayList<Product> dataSource() {
        ArrayList<Product> arrayList = new ArrayList<>();
        Product product = new Product(1, "a71", "phone", "s");
        Product productTwo = new Product(2, "a51", "phone", "s");
        Product productThree = new Product(3, "ihpone 10", "phone", "apple phone");
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
        String jsonString = gson.toJson(product);
        return jsonString;
    }
    public static JSONArray convert(){
        JSONArray jsonArray=new JSONArray();
        for(int i=0; i<dataSource().size();i++){

            JSONObject jsonObject=new JSONObject(convertObjectToJsonString(dataSource().get(i)));
          jsonArray.put(jsonObject);

        }
        return jsonArray;
    }
    public static  JSONArray findDiff(){
        JSONArray jsonArray=convert();
        JSONArray jsonArraySorted=new JSONArray();
        for(int i=0;i<jsonArray.length()-1;i++){
            JSONObject jsonObject=jsonArray.getJSONObject(i);
            JSONObject jsonObject1=jsonArray.getJSONObject(i+1);
            if (!jsonObject.get("name").equals(jsonObject1.get("name"))
            &&!jsonObject.get("des").equals(jsonObject1.get("des"))){
                jsonArraySorted.put(jsonObject);
                jsonArraySorted.put(jsonObject1);
            }
        }
        return jsonArraySorted;
    }

    public static void main(String[] args) {
      convert();

      System.out.println(findDiff());
    }

}
