package paintingShapes;

public abstract class Shape {
    public String shapeName;
    public abstract double Area();

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "shapeName='" + shapeName + '\'' +
                '}';
    }
}
