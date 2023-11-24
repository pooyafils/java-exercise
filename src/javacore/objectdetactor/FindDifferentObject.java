package javacore.objectdetactor;

import java.util.ArrayList;

public class FindDifferentObject {
    public static void main(String[] args) {
Product product=new Product(12,"a50","samsung");
        Product producttwo=new Product(12,"a50","samsung");

        Product productthree=new Product(10,"a50","samsung");

        Product productfource=new Product(10,"a50","samsung");

        Product productfive=new Product(12,"a50","samsung");
        ArrayList<Product> productArrayList=new ArrayList<>();
        productArrayList.add(product);
        productArrayList.add(producttwo);
        productArrayList.add(productthree);
        productArrayList.add(productfource);
        productArrayList.add(productfive);
        for (int i=0;i<productArrayList.size();i++){
            if (i>0){
                checkPriceChange(productArrayList.get(i-1),productArrayList.get(i));
            }
        }

    }
    private static void checkPriceChange(Product previousProduct, Product currentProduct) {
        if (previousProduct.getPrice() != currentProduct.getPrice()) {
            System.out.println("Price changed: " + previousProduct.getPrice() + " -> " + currentProduct.getPrice());
        }
    }
}
