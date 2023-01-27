package JsonProcessing.JSONOBJECT;

import com.google.gson.Gson;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.lang.reflect.Array;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class JsonObjectMain {

    public static void jsonObjectSimpleExample() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .uri(URI.create("https://api.nobitex.ir/v2/orderbook/BTCIRT"))
                .headers("Accept-Enconding", "gzip, deflate")
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String responseBody = response.body();
        JSONObject jsonObject = new JSONObject(responseBody);
        System.out.println(" status is "+jsonObject.get("status")+",last update is "+jsonObject.get("lastUpdate"));

    }

    public static void jsonObjectNested() throws IOException, InterruptedException {
        //https://api.nobitex.ir/market/stats
        HttpClient httpClient=HttpClient.newHttpClient();
        HttpRequest request=HttpRequest.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .uri(URI.create("https://api.nobitex.ir/market/stats"))
                .headers("Accept-Enconding", "gzip, deflate")
                .build();
        HttpResponse<String> response=httpClient.send(request,HttpResponse.BodyHandlers.ofString());
        String res=response.body().toString();
        JSONObject jsonObject = new JSONObject(res);
        JSONObject insideObj = jsonObject.getJSONObject("global");
        System.out.println(insideObj.get("binance"));

    }

    public static void jsonArrayExample(){
        List jsonArray=new ArrayList();
        jsonArray.add(1);
        jsonArray.add(2);
        JSONArray jsonArray1=new JSONArray(new Gson().toJson(jsonArray));
        JSONObject result = new JSONObject();
        result.put("count", jsonArray.size());
        result.put("result",jsonArray1);
        System.out.println(result.toMap());
    }

    public static void main(String[] args) throws IOException, InterruptedException {
       // jsonObjectSimpleExample();
       // jsonObjectNested();
        jsonArrayExample();


    }
}
