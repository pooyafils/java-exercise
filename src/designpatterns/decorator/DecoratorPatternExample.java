package designpatterns.decorator;

public class DecoratorPatternExample {
    public static void main(String[] args) {
        Beverage basicBeverage = new BasicBeverage();

        Beverage milkBeverage = new MilkDecorator(basicBeverage);
        System.out.println("Cost of milk beverage: $" + milkBeverage.cost());

        Beverage sugarMilkBeverage = new SugarDecorator(milkBeverage);
        System.out.println("Cost of milk beverage with sugar: $" + sugarMilkBeverage.cost());
    }
}