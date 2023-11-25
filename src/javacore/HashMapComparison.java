package javacore;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapComparison {
    public static <K, V> boolean compareMaps(Map<K, V> map1, Map<K, V> map2) {
        // Check if the maps are the same instance
        if (map1 == map2) {
            return true;
        }

        // Check if either map is null
        if (map1 == null || map2 == null) {
            return false;
        }

        // Check if the sizes are the same
        if (map1.size() != map2.size()) {
            return false;
        }

        // Iterate through entries and compare key-value pairs
        for (Map.Entry<K, V> entry : map1.entrySet()) {
            K key = entry.getKey();
            V value1 = entry.getValue();
            V value2 = map2.get(key);

            // Check if the key is present in both maps
            if (value2 == null) {
                return false;
            }

            // Check if the values are equal using Objects.equals to handle null values
            if (!Objects.equals(value1, value2)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Example usage
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("one", 1);
        map1.put("two", 2);
        map1.put("three", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("one", 1);
        map2.put("two", 2);
        map2.put("three", 3);

        boolean result = compareMaps(map1, map2);
        System.out.println("Are the maps equal? " + result);
    }
}
