package JsonProcessing.JSONOBJECT.JacksonInject;

import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.time.LocalDateTime;

public class ExampleMain {
    public static void main(String[] args) throws IOException {
        String s = "{\"pair\":\"USD/JPY\",\"rate\":109.15}";
        System.out.println("JSON input: " + s);

        InjectableValues iv = new InjectableValues.Std();
        ((InjectableValues.Std) iv).addValue("lastUpdated", LocalDateTime.now());

        ObjectMapper om = new ObjectMapper();
        om.setInjectableValues(iv);
        CurrencyRate cr = om.readValue(s, CurrencyRate.class);
        System.out.println(cr);
    }
}