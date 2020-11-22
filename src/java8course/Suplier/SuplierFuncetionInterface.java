package java8course.Suplier;

import java.util.function.Supplier;

public class SuplierFuncetionInterface {
    Supplier<String[]> fruitSuplier=()-> new String[]{"apple","Orange"};
    public void testSupplier(){
        String[] frutis=fruitSuplier.get();
        for(String fruit:frutis){
            System.out.println("this is the fruits "+fruit);
        }

    }
    public static void main(String args[]) {
        new SuplierFuncetionInterface().testSupplier();
    }
    }
