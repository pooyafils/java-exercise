package lambeda;

import java.util.function.Function;

/**
 * Created by pooya on 4/13/2020.
 */
public class FunctionInterfaceExample implements Function<Long,Long> {
    @Override
    public Long apply(Long aLong) {
        return aLong + 5;
    }
    public static void main(String[] args) {
        Function<Long, Long> ex = new FunctionInterfaceExample();
        Function <Long,Long> a=(value)->value+3;
        Long result = ex.apply((long) 4);
        System.out.println("result = " + result);
        Function<Integer,Double> divied=(v)->v/2.0;
        double p=divied.apply(4);
        System.out.println(p);


    }

}

