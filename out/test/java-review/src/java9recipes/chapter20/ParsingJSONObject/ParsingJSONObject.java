package java9recipes.chapter20.ParsingJSONObject;

import javax.json.Json;
import javax.json.stream.JsonParser;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.Reader;

public class ParsingJSONObject {
    public  void parseObject() throws FileNotFoundException {
        FileInputStream fins=new FileInputStream("C:\\Users\\User\\Desktop\\New folder\\java-exercise\\src\\java9recipes\\chapter20\\JSONObjectToFile\\book.json");

        Reader fileReader = new InputStreamReader(fins);
        JsonParser parser = Json.createParser(fileReader);
        while (parser.hasNext()){
            JsonParser.Event ev=parser.next();
            System.out.println(ev);
            if (ev.equals(JsonParser.Event.VALUE_STRING)) {
                System.out.println(parser.getString());
            }
        }

    }

    public static void main(String[] args) throws FileNotFoundException {
        ParsingJSONObject parsingJSONObject=new ParsingJSONObject();
        parsingJSONObject.parseObject();
    }
}
