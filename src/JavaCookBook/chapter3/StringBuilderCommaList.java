package JavaCookBook.chapter3;

public class StringBuilderCommaList {
    public static final String SAMPLE_STRING = "Alpha Bravo Charlie";
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        for (String word : SAMPLE_STRING.split(" ")) {
            if (sb1.length() > 0) {
                sb1.append(", ");
            }
            sb1.append(word);
        }
        System.out.println(sb1);
}}
