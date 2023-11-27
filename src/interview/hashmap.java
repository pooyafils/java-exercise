import java.util.HashMap;

public class HashTableComparisonExample {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, String> hashTable = new HashMap<>();

        // Add key-value pairs to the hash table
        hashTable.put("key1", "value1");
        hashTable.put("key2", "value2");
        hashTable.put("key3", "value3");

        // Retrieve values using keys
        String value1 = hashTable.get("key1");
        String value2 = hashTable.get("key2");
        String value3 = hashTable.get("key3");

        // Compare values
        if (value1.equals(value2)) {
            System.out.println("value1 is equal to value2");
        } else {
            System.out.println("value1 is not equal to value2");
        }

        // Using equalsIgnoreCase for case-insensitive string comparison
        if (value2.equalsIgnoreCase(value3)) {
            System.out.println("value2 is equal to value3 (case-insensitive)");
        } else {
            System.out.println("value2 is not equal to value3 (case-insensitive)");
        }
    }
}
