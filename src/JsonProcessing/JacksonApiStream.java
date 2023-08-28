package JsonProcessing;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;

import java.io.IOException;

public class JacksonApiStream {
    public static void main(String[] args) throws IOException {
        String json
                = "{\"name\":\"Tom\",\"age\":25,\"address\":[\"Poland\",\"5th avenue\"]}";
        JsonFactory jfactory = new JsonFactory();
        JsonParser jParser = jfactory.createParser(json);
    }
}
