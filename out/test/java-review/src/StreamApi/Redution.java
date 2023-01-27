package StreamApi;

/**
 * Created by pooya on 4/19/2020.
 */
 import java.util.ArrayList;
 import java.util.stream.IntStream;
 import java.util.stream.Stream;
public class Redution {
    public static int  le(ArrayList<String> strings){
        return strings.size();
    }
    public static void main(String []args){
        int[] values = {3, 4, 1, 5, 20, 1, 3, 3, 4, 6};
        System.out.println("the sum of all value ultiple"
                        + IntStream.of(values).reduce(1, (e1, e2) -> e1 * e2)
        );
        String[] names = {"John", "Peter", "Susan", "Kim", "Jen",
                 "George", "Alan", "Stacy", "Michelle", "john"};
        System.out.println("combaing all the strings"
                        + Stream.of(names).reduce((x, y) -> x + y).get()
        );
        ArrayList<String> pooya=new ArrayList<String>();
        pooya.add("pooya");
       Stream.of(pooya).forEach(Redution::le);
     //   System.out.print(  Stream.of(pooya).forEach(Redution::le));
    }



}
