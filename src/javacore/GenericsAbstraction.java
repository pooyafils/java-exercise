package javacore;

import java.util.ArrayList;
import java.util.List;

public class GenericsAbstraction<E> {
    public GenericsAbstraction(List<E> database) {
        this.database = database;
    }

    List<E> database = new ArrayList<>();
    public List<E> returnData(){
        // do some filter on data
        System.out.println("we can do filtering on our generic data");
        return database;
    }



}
