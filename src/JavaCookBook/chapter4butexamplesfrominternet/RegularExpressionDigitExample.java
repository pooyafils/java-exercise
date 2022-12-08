package JavaCookBook.chapter4butexamplesfrominternet;

import java.util.regex.Pattern;

public class RegularExpressionDigitExample {
    public static void main(String[] args) {

        System.out.println(Pattern.matches("\\d","1"));
        System.out.println(Pattern.matches("\\D", "m"));//true (non-digit and comes once)
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun22"));

    }
}
