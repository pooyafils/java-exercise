import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * Created by pooya on 4/18/2020.
 */
public class Set {

    public static void main(String[] args) {
        LinkedHashSet<Integer> ob= new LinkedHashSet<>();
        ArrayList al = new ArrayList();

        // add elements to the array list
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        Iterator iterator = al.iterator();
        Iterator<String> namesIterator = al.iterator();

        while(iterator.hasNext())
            System.out.println(iterator.next());


    }

}

