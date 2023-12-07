package interview.compareobjects.withJson;

import com.google.gson.Gson;
import interview.compareobjects.Product;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class aerodynamically {
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
    public static int compareJsonObjects(JSONObject jsonObject1, JSONObject jsonObject2, ArrayList<String> keysToCompare) {
        int d=0;
        System.out.println(keysToCompare);
        for (int i=0;i<keysToCompare.size();i++) {
            if (!jsonObject1.get(keysToCompare.get(i)).equals(jsonObject2.get(keysToCompare.get(i)))) {
                d=d+1;
            }
        }
        return d;
    }
    public static void main(String[] args) {
        JSONArray jsonArray = convert();
        JSONArray jsonArraySorted = new JSONArray();

       ArrayList<String> keysToCompare = new ArrayList<>(Arrays.asList("name", "des"));


        for(int i=0;i<jsonArray.length()-1;i++){
            JSONObject jsonObject=jsonArray.getJSONObject(i);
            JSONObject jsonObject1=jsonArray.getJSONObject(i+1);
     int  aa=   compareJsonObjects(jsonObject,jsonObject1,keysToCompare);
     System.out.println(aa);
      if (aa==keysToCompare.size()){
          jsonArraySorted.put(jsonObject);
          jsonArraySorted.put(jsonObject1);
      }


        }
        System.out.println("===========");
        System.out.println(jsonArraySorted);
    }
    //    JSONObject jsonObject=jsonArray.getJSONObject(3);
   //     JSONObject jsonObject1=jsonArray.getJSONObject(4);
      //  int  aa=   compareJsonObjects(jsonObject,jsonObject1,keysToCompare);
     //   System.out.println(aa);
  //  }
}
