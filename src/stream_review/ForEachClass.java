package stream_review;

import Stream.Stream;

import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.util.List;

public class ForEachClass {

    public static void main(String[] arg){
        ArrayList<String> f=new ArrayList<>();
        f.add("ddd");
        f.add("two");
        f.stream().forEach(System.out::println);
        info info=new info();
        info.setLenght(1);
        info.setWord("a");

        info infotwo=new info();
        infotwo.setLenght(2);
        infotwo.setWord("ab");
    ArrayList<info> sample=new ArrayList<>();
    sample.add(info);
    sample.add(infotwo);
    sample.stream().forEach(System.out::println);


    }

}
