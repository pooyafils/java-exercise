package JavaCore;

import java.util.ArrayList;

/**
 * Created by pooya on 4/18/2020.
 */
public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        c1.add("p");
        ArrayList<String> c2= new ArrayList<String>();
        ArrayList<String> c4= new ArrayList<String>();

        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        c2.add("a");
        //Storing the comparison output in ArrayList<String>
        ArrayList<String> c3 = new ArrayList<String>();
       for (String e : c1)
            c3.add(c2.contains(e) ? "yes" : "no");
        System.out.println(c3);
        c2.removeAll(c1);
        System.out.println( c2);
        System.out.println( "-------------------------");



    }

}

