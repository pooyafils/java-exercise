package javacore.findmostrepeatedelement;

public class Vehicle {
    public  String type;
    public String color;
    public int price;

    public Vehicle() {
    }

    public Vehicle(String type, String color, int price) {
        this.type = type;
        this.color = color;
        this.price = price;
    }
    public double calculateVehiclePrice(){
        double tax=price/5.2;
        double finalPrice=tax+price;
        return finalPrice;
    }
    public double calculateColorVehiclePrice(String colorNumber,int price){
        if (colorNumber.contains("FF")){
            return price*2;
        }
   return price*1.4;
    }
}
