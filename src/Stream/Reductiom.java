package Stream;

import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Reductiom {
    public static int listString(ArrayList<String> list){
        System.out.println(list.size());
        return list.size();
    }
    public static void main (String args[]) {
int [] value={3,6,4,1,9,5,20};
        System.out.println("mulitiple of all numbers "+ IntStream.of(value).reduce((e1,e2)->e1*e2));
        System.out.println("sum of the all value "+IntStream.of(value).reduce((e1,e2)->e1+e2));
        //example of method refreance
        ArrayList<String> example=new ArrayList<>();
        example.add("popuya");
        Stream.of(example).forEach(Reductiom::listString);
    }
    }
