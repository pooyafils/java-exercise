package interview.compareobjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareObjects {
    public static ArrayList<Product> dataSource(){
        ArrayList<Product> arrayList=new ArrayList<>();
        Product product=new Product(1,"a71","phone","samsung phone");
        Product productTwo=new Product(2,"a51","phone","samsung phone");
        Product productThree=new Product(3,"ihpone 10","phone","apple phone");
        Product productFour=new Product(4,"a71","phone","samsung phone");
        Product productFive=new Product(5,"a71","phone","samsung phone");
        arrayList.add(product);
        arrayList.add(productTwo);
        arrayList.add(productThree);
        arrayList.add(productFour);
        arrayList.add(productFive);
        return arrayList;

    }
    public static ArrayList<Product> productSorted(){

        ArrayList<Product> arrayList=dataSource();
        ArrayList<Product> arrayListSorted=new ArrayList<>();

        for(int i=0;i<arrayList.size();i++){
           Product product=arrayList.get(i);
            Product productAfter=new Product();

            if(i<arrayList.size()-1){
                product=arrayList.get(i);
                productAfter=arrayList.get(i+1);

            }
           else {
                product=arrayList.get(i);
                productAfter=arrayList.get(i);
           }
           if(!product.getName().equals(productAfter.getName())){
               arrayListSorted.add(product);
               arrayListSorted.add(productAfter);
           }
        }
        return arrayListSorted;
    }
    public static void print(ArrayList<Product> arrayList){
        for (int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
    }

    public static void main(String[] args) {
       print(productSorted());
    }
}
