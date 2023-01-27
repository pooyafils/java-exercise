package stream_review;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPartOne {
        public static info  wordInfo(String word){
            info a=new info();
            a.setLenght(word.length());
            a.setWord(word);
            return a;

        }

    public static void main(String args[]) {
        ArrayList<String> names = new ArrayList<>();

        names.add("pooya");
        names.add("springboot");
        names.add("java");
        names.add("sara");

        List<info> myList=  names.stream().map(StreamPartOne::wordInfo).collect(Collectors.toList());
        System.out.println(myList);
    myList.sort(
            Comparator.comparing((info a) -> a.word)
    );
    System.out.println(myList);
    }
    }
