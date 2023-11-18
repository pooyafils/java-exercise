package JsonProcessing.JSONOBJECT.JsonSerialize;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.time.LocalDateTime;

public class ExampleMain {
    // https://www.logicbig.com/tutorials/misc/jackson/json-serialize-deserialize-converter.html
    public static void main(String[] args) throws IOException {
        System.out.println("-- Java object to JSON --");
        CurrencyRate cr = new CurrencyRate();
        cr.setPair("USD/JPY");
        cr.setRate(109.15);
        cr.setLastUpdated(LocalDateTime.now());
        System.out.println("Java object: " + cr);

        ObjectMapper om = new ObjectMapper();
        String s2 = om.writeValueAsString(cr);
        System.out.println("JSON string: " + s2);

        System.out.println("-- JSON to Java object --");
        CurrencyRate cr2 = om.readValue(s2, CurrencyRate.class);
        System.out.println("Java Object: " + cr2);
    }
}