package interview;

public class SplitStringVowelsConsonants {
    public static String split(String str) {
        String str1 = str.replaceAll("(?i)[^aeiou]", "");
        String str2 = str.replaceAll("(?i)[aeiou]", "");
        return str1 + str2;
    }

    public static void main(String[] args) {
        System.out.println(split("Pooya12"));
    }
}
