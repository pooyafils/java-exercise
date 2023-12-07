package interview.compareobjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareObjects {
    public static ArrayList<Product> dataSource() {
        ArrayList<Product> arrayList = new ArrayList<>();
        Product product = new Product(1, "a71", "phone", "s");
        Product productTwo = new Product(2, "a51", "phone", "s");
        Product productThree = new Product(3, "ihpone 10", "phone", "apple phone");
        Product productFour = new Product(4, "a71", "phone", "samsung phone");
        Product productFive = new Product(5, "a71", "phone", "samsung phone");
        arrayList.add(product);
        arrayList.add(productTwo);
        arrayList.add(productThree);
        arrayList.add(productFour);
        arrayList.add(productFive);
        return arrayList;

    }

    public static ArrayList<Product> productSorted() {

        ArrayList<Product> arrayList = dataSource();
        ArrayList<Product> arrayListSorted = new ArrayList<>();

        for (int i = 0; i < arrayList.size(); i++) {
            Product product = arrayList.get(i);
            Product productAfter = new Product();

            if (i < arrayList.size() - 1) {
                product = arrayList.get(i);
                productAfter = arrayList.get(i + 1);

            } else {
                product = arrayList.get(i);
                productAfter = arrayList.get(i);
            }
            if (!product.getName().equals(productAfter.getName())) {
                arrayListSorted.add(product);
                arrayListSorted.add(productAfter);
            }
        }
print(arrayListSorted);
        System.out.println("===========");
        for (int i = 0; i < arrayListSorted.size(); i++) {
            Product products = new Product();
            Product productAfters = new Product();

            if (i < arrayList.size() - 2) {
                products = arrayListSorted.get(i);
                productAfters = arrayListSorted.get(i + 1);

            } else {
                products = arrayListSorted.get(i);
                productAfters = arrayListSorted.get(i);
            }
            if (!products.getDes().equals(productAfters.getDes())) {
              arrayListSorted.add(products);
              arrayListSorted.add(productAfters);
            }
        }
            return arrayListSorted;

    }
        public static void print (ArrayList < Product > arrayList) {
            for (int i = 0; i < arrayList.size(); i++) {
                System.out.println(arrayList.get(i));
            }
        }

        public static boolean find (Product product,ArrayList<Product> products){
            boolean result = false;
            for (Product value : products) {
                if (product.equals(value)) {
                    result = true;

                }
            }
            return result;
        }

    public static void main(String[] args) {
        print(productSorted());
    }
}
