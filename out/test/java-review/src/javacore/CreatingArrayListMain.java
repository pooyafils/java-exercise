package JavaCore;

import java.util.ArrayList;

/**
 * Created by pooya on 4/18/2020.
 */
public class CreatingArrayListMain {
    public static void main(String[]args) {
    CreatingArrayList ob=new CreatingArrayList();
    ArrayList<Integer> mylist=new ArrayList<Integer>();
    mylist.add(1);
    mylist.add(3);
    mylist.add(10);
    mylist.add(32);
    ArrayList<Integer> c=new ArrayList<Integer>();
    c.add(99);

    //inserting a element
    System.out.println("1 "+ob.showArrayList(mylist));
    //print the arraylist with loop
    for(int i:ob.showArrayList(mylist)) {
        //System.out.println(i);
    }
    //print specfic index
    System.out.println("2 "+ob.showArrayListIndex(mylist,6));

    System.out.println("3 "+ ob.updateIndex(mylist, 0, 10));

    System.out.println("4 "+ob.searchInArrayList(mylist, 1));

    System.out.println("6 "+ob.add(mylist, c));
    System.out.println("7 "+ob.reverse(mylist));

    System.out.println("5 "+ob.removeAll(mylist));



}
}

