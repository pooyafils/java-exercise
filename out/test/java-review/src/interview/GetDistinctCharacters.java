package interview;

import java.util.HashMap;
import java.util.Map;

public class GetDistinctCharacters {
    public static void distinctCharacters (String text){
        char[] chars=text.toCharArray();
        Map<Character,Integer> characterIntegerMap=new HashMap<>();
        for(char c:chars){
            if(characterIntegerMap.containsKey(c)){
                characterIntegerMap.put(c,characterIntegerMap.get(c)+1);
            }
            else {
                characterIntegerMap.put(c,1);
            }
        }
        System.out.println(characterIntegerMap);

    }

    public static void main(String[] args) {
        distinctCharacters("pooya");
    }
}
