package paintingShapes;


public class Sphere extends Shape {
 public double radius;

    public Sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }

    @Override
    public double Area() {
        return 4*Math.PI*radius*radius;
    }
}
