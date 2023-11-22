package JavaCookBook.lambda_review;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReface {
    public static String changeTheWord(String word){
        int wordSize=word.length();
        String wordSizeNumber= String.valueOf(wordSize);
        String changeW=word+" method ref."+" "+wordSizeNumber;
        return changeW;
    }
    public static void main (String args[]) {
        List<String> words = new ArrayList<>();
        words.add("pooya");
        words.add("java");
        words.add("spring");
        words.add("springboot");
     Long i=   words.stream().collect(Collectors.counting());
    System.out.println("size of the array list "+i);
    System.out.println("-method reference-");
       words.stream().forEach(MethodReface::changeTheWord);
        words.stream().map(MethodReface::changeTheWord).forEach(System.out::println);

    }


}
