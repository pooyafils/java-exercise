package javacore;

import java.util.List;

public class LocalVariableTypeInferenceExample {
    public static void main(String[] args) {
        // Using 'var' for local variable type inference
        var message = "Hello, Java 11!";
        var number = 42;

        System.out.println(message); // Output: Hello, Java 11!
        System.out.println(number);  // Output: 42

        // 'var' can be used in a for-each loop
        var numbers = new int[]{1, 2, 3, 4, 5};
        for (var n : numbers) {
            System.out.print(n + " "); // Output: 1 2 3 4 5
        }

        // 'var' can be used with collections
        var list = List.of("Apple", "Banana", "Cherry");
        for (var fruit : list) {
            System.out.println(fruit);
        }
    }
}
