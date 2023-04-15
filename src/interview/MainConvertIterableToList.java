package interview;

import java.util.Arrays;

public class MainConvertIterableToList {
    public static void main(String[] args) {

        // let's consider the next Iterable
        Iterable<String> iterable = Arrays.asList("ana", "george", "mark");

        System.out.println("iterableToList1(): " + ConvertIterableToList.iterableToList1(iterable));
        System.out.println("iterableToList2(): " + ConvertIterableToList.iterableToList2(iterable));
        System.out.println("iterableToList3(): " + ConvertIterableToList.iterableToList3(iterable));
        System.out.println("iterableToList4(): " + ConvertIterableToList.iterableToList4(iterable));
        System.out.println("iterableToList5(): " + ConvertIterableToList.iterableToList5(iterable));
        System.out.println("iterableToList6(): " + ConvertIterableToList.iterableToList6(iterable));
    }
}
