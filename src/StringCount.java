import java.util.HashMap;
import java.util.Map;

public class StringCount {

    public static void main(String args[]){

        String str="java is a good";
        countDuplicateCharacters(str);
        System.out.println(countDuplicateCharacters(str));
    }


    public static Map<Character, Integer> countDuplicateCharacters(String str) {
        Map<Character, Integer> result = new HashMap<>();  // or use for(char ch: str.toCharArray()) { ... }
         for (int i = 0; i<str.length(); i++) {    char ch = str.charAt(i);
         result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);  }  return result;}


}
