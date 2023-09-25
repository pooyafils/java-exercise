package httpclient;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.ExecutionException;

public class HttpClientExampleTwo {

    public static void main(String[] args) {
        String url = "https://jsonplaceholder.typicode.com/posts/1"; // Sample URL

        try {
            // Create an HttpClient
            HttpClient httpClient = HttpClient.newBuilder().build();

            // Create an HttpRequest with the specified URL and GET method
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(url))
                    .GET()
                    .build();

            // Send the request and retrieve the response
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            // Get the response code
            int responseCode = response.statusCode();

            // Check if the request was successful
            if (responseCode == 200) {
                // Print the response
                System.out.println("Response: " + response.body());
            } else {
                System.out.println("GET request failed. Response code: " + responseCode);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

