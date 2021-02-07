package JavaCore;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by pooya on 4/18/2020.
 */
public class ComparingArrayList {
    public static void main(String args[])
    {
        //first arraylist
        ArrayList<String> firstList=new ArrayList<String>();
        //adds elements to the array list
        firstList.add("Apple");
        firstList.add("Pears");
        firstList.add("Guava");
        firstList.add("Peach");
        Collections.reverse(firstList);
        System.out.println("revers list "+firstList);
        //second array list
        ArrayList<String> secondList=new ArrayList<String>();
        //adds elements to the array list
        secondList.add("Apple");
        secondList.add("Pears");
        secondList.add("Papaya");
        secondList.add("Peach");

        //removes all elements from the first list
        //returns empty list if all the elements of first list match with elements of second list
        secondList.removeAll(firstList);
        //prints the element of second list which does not match with the element of the first list
        System.out.println(secondList);

    }
}
