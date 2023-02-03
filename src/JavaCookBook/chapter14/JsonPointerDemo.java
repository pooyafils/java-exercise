package JavaCookBook.chapter14;

import javax.json.*;
import java.io.StringReader;

public class JsonPointerDemo {
    public static void main(String[] args) {
        String jsonPerson =
                "{\"firstName\":\"Robin\",\"lastName\":\"Williams\"," +
                        "\"age\": 63," +
        "\"id\":0," +
                "\"roles\":[\"Mork\", \"Mrs. Doubtfire\", \"Patch Adams\"]}";
        System.out.println("Input: " + jsonPerson);
        JsonReader rdr =
                Json.createReader(new StringReader(jsonPerson));
        JsonStructure jsonStr = rdr.read();
        rdr.close();
     /*   JsonPointer jsonPointer;
        JsonString jsonString;
        jsonPointer = Json.createPointer("/firstName");
        jsonString = (JsonString)jsonPointer.getValue(jsonStr);
        String firstName = jsonString.getString();
        System.out.println("/firstName => " + firstName);
        JsonNumber num =
                (JsonNumber) Json.createPointer("/age").getValue(jsonStr);
        System.out.println("/age => " + num + "; a " + num.getClass().getName());
        jsonPointer = Json.createPointer("/roles");
        JsonArray roles = (JsonArray) jsonPointer.getValue(jsonStr);
        System.out.println("/roles => " + roles);
        System.out.println("JsonArray roles.get(1) => " + roles.get(1));
        jsonPointer = Json.createPointer("/roles/1");
        jsonString = (JsonString)jsonPointer.getValue(jsonStr);
        System.out.println("/roles/1 => " + jsonString);*/
    }
}