package lambeda;

import java.util.function.Function;

/**
 * Created by pooya on 4/13/2020.
 */
public class FuntionInterface {
    public static void main(String[] args) {
        Function<Integer,Double> div=a->a/2.0;
        System.out.println(div.apply(4));
        Function<Integer, String> functionClass = new FunctionClass();
        //System.out.println(functionClass.apply(2));
        String  a= functionClass.apply(2);
        System.out.println("we convert interger to string eacth function method "+a);
    }

}

