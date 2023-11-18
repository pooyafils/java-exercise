package designpatterns.decorator;
public class BasicBeverage implements Beverage {
    @Override
    public double cost() {
        return 2.0; // Basic cost of the beverage
    }
}