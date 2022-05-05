package JavaCookBook.chapter3;

public class BreakingStringToWords {

    public static void main(String[] args) {
        String sentences="java is programming language";
        for(String word:sentences.split(" ")){
            System.out.println(word);
        }

    }
}
