package interview;

import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {

    public static void main(String[] args) {
        String inputString = "programming is fun";

        Map<Character, Integer> charCounts = countCharacters(inputString);

        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            System.out.println("Character: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }

    public static Map<Character, Integer> countCharacters(String input) {
        Map<Character, Integer> charCounts = new HashMap<>();

        for (char c : input.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        return charCounts;
    }
}
