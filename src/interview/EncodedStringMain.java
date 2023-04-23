package interview;

import java.util.Arrays;

public class EncodedStringMain {
    public static void main(String[] args) {

        char[] str = "x ".toCharArray();

        System.out.println("Before: " + Arrays.toString(str));

        char[] result = EncodedString.encodeWhitespaces(str);

        System.out.println("After: " + Arrays.toString(result));
    }
}
