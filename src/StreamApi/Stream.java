package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by pooya on 4/13/2020.
 */
public class Stream {
    static void doubleit(int i) {
        System.out.println(i*2);
    }
    public static void main(String[] args) {
        List<Integer> pooya=new ArrayList<Integer>();
        pooya.add(1);
        pooya.add(5);
        pooya.add(3);
        pooya.stream().map(x->x+1).forEach(System.out::println);
        pooya.stream().filter(s->s>0).forEach(System.out::println);
        System.out.println();
        pooya.stream().sorted().forEach(System.out::println);
        Double i=	pooya.stream().collect(Collectors.averagingInt(x -> x));
        System.out.println(i);
        System.out.println("--------");
        List <String> po=new ArrayList<String>();
        po.add("pooya");
        po.add("amir");
        String r=	po.stream().reduce("",(a,b)->a+b+" ");
        System.out.println(r);
    }


}
