package java9recipes.chapter20.BuildingJSONObject;

import javax.json.Json;
import javax.json.JsonBuilderFactory;
import javax.json.JsonObject;

public class BuildingJSONObject {
    public static JsonObject buildBookObject() {
        JsonBuilderFactory factory= Json.createBuilderFactory(null);
        JsonObject obj=factory.createObjectBuilder()

                .add("title", "Java 9 Recipes")
                .add("author", "Josh Juneau")
                .add("projectCoordinator", "Jill Balzano")
                .add("editor", "Jonathan Gennick")
                .build();
        return obj;
}

    public static void main(String[] args) {
        System.out.println(buildBookObject());
    }
}
