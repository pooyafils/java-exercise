package designpatterns.abstractfactory;

class MotorcycleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Motorcycle();
    }
}