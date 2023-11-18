package javacore;

public class InstanceOf {
    public static void main(String[] args) {

        // create a variable of string type
        String name = "Programiz";

        // checks if name is instance of String
        boolean result1 = name instanceof String;
        System.out.println("name is an instance of String: " + result1);

        // create an object of Main
        InstanceOf obj = new InstanceOf();

        // checks if obj is an instance of Main
        boolean result2 = obj instanceof InstanceOf;
        System.out.println("obj is an instance of Main: " + result2);
    }
    }

