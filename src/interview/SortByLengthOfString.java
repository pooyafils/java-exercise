package interview;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SortByLengthOfString {
    public static String sortByLength(String str) {
        return Arrays.stream(str.split("\\s"))
                .sorted((s1, s2) -> s1.compareToIgnoreCase(s2))
                .sorted((s1, s2) -> s1.length() - s2.length())
                .collect(Collectors.joining(" "));
    }
    public static void main(String[] args) {
        System.out.println(sortByLength("java is a good language"));
    }
}
