package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream {
    public static void main (String args[]) {
        List<Integer> pooya=new ArrayList<>();
        pooya.add(3);
        pooya.add(5);
        pooya.add(2);
        pooya.add(30);
        pooya.stream().map(x->x+1).forEach(System.out::println);
        System.out.println("-find bigger one-");
        pooya.stream().filter(s->s>14).forEach(System.out::println);
        System.out.println("-sorting-");
        pooya.stream().sorted().forEach(System.out::println);
        Double i=pooya.stream().collect(Collectors.averagingInt(x->x));
        System.out.println("this is the avg "+i);
        List<String> po=new ArrayList<>();
        po.add("pooya");
        po.add("fils");
        po.stream().filter(e->e.length()<5).forEach(System.out::println);
        po.stream().map(e->e.toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);


    }
    }
