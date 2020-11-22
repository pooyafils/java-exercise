package lambda_review;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

public class FunctionalInterfaceExample {
    @FunctionalInterface
    interface price {
        int tax();
    }

    int i;

    public int taxCalculator(int amount, price p) {
        if (amount > 100) {
            return p.tax() + amount;
        } else
            return amount;
    }

    @FunctionalInterface
    interface shiping {
        int shipingPrice(int i);
    }

    shiping s = (int i) -> i + 20;

    public static void main(String args[]) {
        int iphone = 300;
        int jacket = 50;
        int food = 20;
        FunctionalInterfaceExample ob = new FunctionalInterfaceExample();
        int taxForIphone = ob.taxCalculator(iphone, () -> iphone / 2);
        int taxForJacket = ob.taxCalculator(jacket, () -> jacket / 4);
        System.out.println(taxForIphone);
        System.out.println(taxForJacket);
        int foodPrice = ob.s.shipingPrice(food);
        System.out.println(foodPrice);

    }
}
