package lambeda;

import java.util.function.Supplier;

/**
 * Created by pooya on 4/15/2020.
 */
public class SupplierExample {

    public static void main(String []args){
        Supplier<Integer> si=()->13;
        System.out.println(si.get());
    }
}