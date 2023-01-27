package JavaCookBook.chapter7;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] argv) {

        Map<String,String> map = new HashMap<String,String>();

        map.put("Adobe", "Mountain View, CA");
        map.put("IBM", "White Plains, NY");
        map.put("Learning Tree", "Los Angeles, CA");
        map.put("Microsoft", "Redmond, WA");
        map.put("Netscape", "Mountain View, CA");
        map.put("O'Reilly", "Sebastopol, CA");
        map.put("Sun", "Mountain View, CA");

        String queryString = "O'Reilly";
        System.out.println("You asked about " + queryString + ".");
        String resultString = map.get(queryString);
        System.out.println("They are located in: " + resultString);
        System.out.println();

        for( String key : map.keySet()) {
            System.out.println("Key " + key +
                    "; Value " + map.get(key));
        }
        map.entrySet().forEach(mE ->
                System.out.println("Key + " + mE.getKey()+
                        "; Value " +mE.getValue()));

}
}
