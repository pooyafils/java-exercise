package javacore.findmostrepeatedelement;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle("bmv","red",10000);
        System.out.println("vehicle type is:"+vehicle.type);
        System.out.println("vehicle color is:"+vehicle.color);
        System.out.println("vehicle price is:"+vehicle.price);
        System.out.println("final price is:"+vehicle.calculateVehiclePrice());
        System.out.println("method for color price:"+vehicle.calculateColorVehiclePrice("#800000",1100));
    }
}
