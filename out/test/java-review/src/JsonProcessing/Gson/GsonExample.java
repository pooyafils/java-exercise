package JsonProcessing.Gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonExample {
    public static void main(String[] args) {
        String name = "{\"firstName\":\"John\",\"lastName\":\"Doe\",\"middleName\":\"Blocks\",\"email\":\"john@doe.com\"}";
        GsonBuilder builder=new GsonBuilder();
        Gson gson = builder.create();
        GsonExampleModel gsonExampleModel=gson.fromJson(name,GsonExampleModel.class);
        System.out.println(gsonExampleModel.getEmail());

    }
}
