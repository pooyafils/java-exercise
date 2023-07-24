package JsonProcessing.JSONOBJECT;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.util.List;
import java.util.Map;

public class JsonObjectMapperExample {

public static String objectMappers() throws JsonProcessingException {
    ObjectMapper objectMapper=new ObjectMapper();
    Map<String, Integer> map = Map.of("one", 1, "two", 2);
    String s = objectMapper.writeValueAsString(map);
return s;
}

public static void convertObjectToJson() throws JsonProcessingException {
    MyObject myObject = new MyObject(3, "test String",
            List.of("one", "two"));
    ObjectMapper om = new ObjectMapper();
    om.enable(SerializationFeature.INDENT_OUTPUT);
    String s = om.writeValueAsString(myObject);
    System.out.println(s);
}

    public static void main(String[] args) throws JsonProcessingException {
        System.out.println(objectMappers());
        System.out.println("create json object with list on it");
        convertObjectToJson();
    }



}
