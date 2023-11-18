package interview;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveRepeatedCharacters {
    public static String unrepeated(String str) {
        return Arrays.stream(str.split("")).distinct().collect(Collectors.joining());

    }

    public static void main(String[] args) {
        System.out.println(unrepeated("hellow too"));
    }
}
