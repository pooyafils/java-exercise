package interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class GetFirstNonRepeatingCharacterMain {
    public static Character getNonRepeatedCharacter(String str){
        Map<Character,Integer> countCharecters=new LinkedHashMap<Character,Integer>() ; //it can also be hashmap
        for(int i=0;i<str.length();i++){ //go throw our map
            Character c=str.charAt(i); //put the char base in string index
            if(!countCharecters.containsKey(c)){
                countCharecters.put(c,1); // we set the char as a key and time that repeated as a value and
                //if it repeated add 1 if not add new key and value to the map
            }else {
                countCharecters.put(c,countCharecters.get(c)+1);
            }
        }
        for (Map.Entry<Character, Integer> e : countCharecters.entrySet()) {
            if (e.getValue() == 1) // we return the first value that the value is 1
                return e.getKey();

        }
        return null;
    }


    public static void main(String[] args) {
        System.out.println(        getNonRepeatedCharacter("anisa"));
    }

}
