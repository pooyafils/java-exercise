package JavaCookBook.chapter8;

import java.util.ArrayList;
import java.util.Optional;

public class OptionalTypeExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add(null);
        Optional<String> getString = Optional.ofNullable(arrayList.get(2));
        if(getString.isPresent()){
            System.out.println("it is present");
        }
        if(getString.isEmpty()){
            System.out.println("is empty");
        }
        System.out.println(getString.get()); // it will throw exception
    }
}
