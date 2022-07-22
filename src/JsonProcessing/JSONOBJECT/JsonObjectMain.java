package JsonProcessing.JSONOBJECT;

import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

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

    public static void main(String[] args) throws IOException, InterruptedException {
        jsonObjectSimpleExample();

    }
}
