package lambeda;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Created by pooya on 4/15/2020.
 */
public class ConsumerE {

    public static void main(String[] args) {
        Consumer<Long> lambdaConsumer = (Long t) -> System.out.println(t*t);
        lambdaConsumer.accept(new Long(5));
        Consumer<Integer> number= a->System.out.println(a+2);
       number.accept(3);
        // where is list come from?
        // why we have a here?
        Consumer <List<Integer>> ob=list->list.stream().forEach(a->System.out.println(a));
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(1);
        list.add(3);
        ob.accept(list);
        Consumer<String> myconsumer=new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        myconsumer.accept("pooya");
    }
}