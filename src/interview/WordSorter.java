package interview;

import java.util.Arrays;

public class WordSorter {
    public static void main(String[] args) {
        String sentence = "Hello world how are you";
        String[] words = sentence.split(" ");

        Arrays.sort(words, String.CASE_INSENSITIVE_ORDER);

        String sortedSentence = String.join(" ", words);
        System.out.println("Sorted sentence: " + sortedSentence);
    }
}