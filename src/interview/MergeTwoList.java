package interview;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoList {
    public static void main(String[] args) {
        List<String> list1=new ArrayList<>();
        list1.add("1");
        List<String> list2=new ArrayList<>();
        list2.add("2");
        list2.addAll(list1);
        list2.stream().forEach(System.out::println);
    }
}
