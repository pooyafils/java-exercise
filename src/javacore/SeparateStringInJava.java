package javacore;

import java.util.List;
import java.util.stream.Collectors;

public class SeparateStringInJava {
    public static void main(String[] args) {
        String multilineString = "java helps \n \n developers \n  to make applications.";
        List<String> lines = multilineString.lines()
                .filter(line -> !line.isBlank())
                .map(String::strip)
                .collect(Collectors.toList());
        System.out.println(lines);
    }
}
