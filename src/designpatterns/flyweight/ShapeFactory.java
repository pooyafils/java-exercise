package designpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

class ShapeFactory {
    private static final Map<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating a new " + color + " circle.");
        }

        return circle;
    }
}