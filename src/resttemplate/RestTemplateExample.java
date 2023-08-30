/*
package resttemplate;


import org.springframework.http.*;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

public class RestTemplateExample {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer <your_token_here>");

        //HttpEntity<String> entity = new HttpEntity<>(headers);

        String url = "http://your-api-url/admin";
        ResponseEntity<String> response = null;
        try {
            // response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);


            if (response.getStatusCode() == HttpStatus.OK) {
                String responseBody = response.getBody();
                System.out.println("Response: " + responseBody);
            } else {
                System.out.println("Request failed with status code: " + response.getStatusCode());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
*/
