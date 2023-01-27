package java9recipes.chapter20.JSONObjectToFile;

import javax.json.Json;
import javax.json.JsonObject;

import java.io.FileWriter;
import java.io.IOException;

import static java9recipes.chapter20.BuildingJSONObject.BuildingJSONObject.buildBookObject;

public class JSONObjectToFile {
    public static void writeJson() throws IOException {
        JsonObject jsonObject = buildBookObject();
        try(javax.json.JsonWriter json= Json.createWriter(new FileWriter("C:\\Users\\User\\Desktop\\New folder\\java-exercise\\src\\java9recipes\\chapter20\\JSONObjectToFile\\book.json"))){
            json.writeObject(jsonObject);

        }
        catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) throws IOException {
        writeJson();
    }
}
