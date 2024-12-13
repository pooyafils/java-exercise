package Bulider.SimpleBuilder;

public class Main {
    public static void main(String[] args) {
       CarBuilder carBuilder= new CarBuilder();
        carBuilder.id(2)
                .engine("car");
        Car car=carBuilder.build();
        System.out.println(car.toString());

    }
}
