package lambeda;

/**
 * Created by pooya on 4/15/2020.
 */
import java.util.function.Predicate;

public class PredicateExample {
 /*   static void mymethod(int i,Predicate<Integer> predicate) {
        if (predicate.test(i)) {
            System.out.println(i);
        }
    }
    */
    //write the mrt
public static void main(String[]args){
    Predicate<Integer> ob=i->(i>10);
   // System.out.println(ob.test(8));
Predicate<Integer> myob=i->(i>10);
    boolean resultand =ob.and(myob).test(234);
    boolean resultnegate =ob.and(myob).negate().test(12);
    boolean resultor=ob.or(myob).test(12);

    System.out.println(resultand+" "+resultnegate+" "+resultor);
//mymethod(7,i->i>10);
}

}
