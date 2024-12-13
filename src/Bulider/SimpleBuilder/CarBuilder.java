package Bulider.SimpleBuilder;

public class CarBuilder  {

    private int id;
    private int height;
    private String brand;
    private String model;
    private String color;
    private String engine;
    private int nbrOfDoors;

    public CarBuilder id(int id) {
        this.id = id;
        return this;
    }

    public CarBuilder brand(String brand) {
        this.brand = brand;
        return this;
    }

    public CarBuilder model(String model) {
        this.model = model;
        return this;
    }


    public CarBuilder color(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder height(int height) {
        this.height = height;
        return this;
    }

    public CarBuilder engine(String engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder nbrOfDoors(int nbrOfDoors) {
        this.nbrOfDoors = nbrOfDoors;
        return this;
    }

    public Car build() {
        return new Car(id, brand, model, color, height, engine, nbrOfDoors);
    }

    @Override
    public String toString() {
        return "CarBuilder{" +
                "id=" + id +
                ", height=" + height +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                ", nbrOfDoors=" + nbrOfDoors +
                '}';
    }
}