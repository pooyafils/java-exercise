package lambeda;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pooya on 4/12/2020.
 */
public class LambdaExampleOne {
    public interface lambda{
        int sum(int sum);
    }
    public static void main(String[] args) {
        List<Integer> poo=new ArrayList<Integer>();
        poo.add(1);
        poo.add(4);
        poo.add(43);
        poo.forEach(i->System.out.print(i+","));
        lambda ob=(int x)->x+1;
        int x=	ob.sum(12);
        System.out.println("lambda with interface "+x);

    }
}
