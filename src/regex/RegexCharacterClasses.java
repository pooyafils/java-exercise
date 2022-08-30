package regex;

import java.util.regex.Pattern;

public class RegexCharacterClasses {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[amn]","a"));   // character between a,m,n
        System.out.println(Pattern.matches("[a-z]","v"));   // character between a to z

        Pattern.compile("[a-zA-Z]*").matcher("abcd").matches();             //true


        System.out.println(Pattern.matches("[a-z&&[^bc]]","b"));
        System.out.println(Pattern.matches("[amn]?", "aa"));//true (a or m or n comes one time)


        System.out.println(Pattern.matches("[a]*","a"));
        Pattern.compile("[a?]").matcher("a").matches();
        Pattern.compile("[aX{3}]").matcher("qqq").matches();

        Pattern.compile("[0-9]*").matcher("01234").matches();               //true
        Pattern.compile("[a-zA-Z0-9]*").matcher("+_a1b2c3").matches();
    }
}