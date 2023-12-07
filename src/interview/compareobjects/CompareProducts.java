package interview.compareobjects;

import java.util.ArrayList;

public class CompareProducts {
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

        for (int i = 0; i < arrayList.size() - 1; i++) {
            Product product = arrayList.get(i);
            Product productAfter = arrayList.get(i + 1);
        System.out.println(product.getId()+"-->"+productAfter.getId());
            if (!product.getName().equals(productAfter.getName()) &&
                    !product.getDes().equals(productAfter.getDes())) {
                arrayListSorted.add(product);
                arrayListSorted.add(productAfter);
            }
        }

        return arrayListSorted;
    }

    public static void main(String[] args) {
        System.out.println(productSorted());
    }
}
