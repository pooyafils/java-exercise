package javacore;

import java.util.ArrayList;

public class GenericsAbstractionMain {
    public static void main(String[] args) {
        ArrayList<String> nameData=new ArrayList<>();
        nameData.add("java");
        GenericsAbstraction abstraction=new GenericsAbstraction(nameData);
        System.out.println(abstraction.returnData());
        // we can also assign integer
        ArrayList<Integer> numberData=new ArrayList<>();
        numberData.add(23);
        GenericsAbstraction abstractionNumber=new GenericsAbstraction(numberData);
        System.out.println(abstractionNumber.returnData());


    }
}
