package interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkAndArrayList {

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        LinkedList<Integer> ll1 = new LinkedList<>();
        ll.descendingIterator().forEachRemaining(ll1::add);
        System.out.println(ll1);

        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayListReverse = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        Collections.reverse(arrayList);
      //  for (int i = arrayList.size() - 1; i >= 0; i--) {
       //     arrayList.get(i);
    //    }
        System.out.println(arrayListReverse);
    }
}
