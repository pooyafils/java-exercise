package interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListAdvancedSample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        System.out.println("Iterating through the ArrayList using an enhanced for loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        fruits.add(1, "Orange");

        Collections.sort(fruits);

        System.out.println("\nIterating through the sorted ArrayList using an Iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        fruits.remove("Cherry");

        fruits.remove(0);

        boolean containsBanana = fruits.contains("Banana");
        System.out.println("\nContains 'Banana': " + containsBanana);

        int size = fruits.size();
        System.out.println("ArrayList size: " + size);

        boolean isEmpty = fruits.isEmpty();
        System.out.println("Is the ArrayList empty: " + isEmpty);

        String[] fruitArray = fruits.toArray(new String[0]);

        fruits.clear();

        System.out.println("\nArrayList after clearing: " + fruits);
    }
}
