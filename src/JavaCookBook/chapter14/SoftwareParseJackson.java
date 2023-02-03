package JavaCookBook.chapter14;

import java.io.IOException;
import java.io.InputStream;

public class SoftwareParseJackson {
    final static String FILE_NAME = "/json/softwareinfo.json";
    public static void main(String[] args) throws  IOException {
        //ObjectMapper mapper = new ObjectMapper();
        InputStream jsonInput =
                SoftwareParseJackson.class.getResourceAsStream(FILE_NAME);
        if (jsonInput == null) {
            throw new NullPointerException("can't find " + FILE_NAME);
        }
      //  SoftwareInfo sware = null;
      //  try {
            //     sware = mapper.readValue(jsonInput, SoftwareInfo.class);
            //   } catch (JsonMappingException e) {
            //      e.printStackTrace();
            //   }

       // System.out.println(sware);
    }
}
