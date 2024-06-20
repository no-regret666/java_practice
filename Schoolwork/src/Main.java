import java.awt.*;

abstract class GeometricObject {
    public abstract double getArea();
}

class Circle extends GeometricObject {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

public class Main {
    public static double sumArea(GeometricObject[] a) {
        double totalArea = 0;
        for (GeometricObject obj : a) {
            totalArea += obj.getArea();
        }
        return totalArea;
    }

    public static void main(String[] args) {
        GeometricObject[] objects = {
                new Circle(5.0),
                new Rectangle(4.0, 6.0),
                new Circle(7.0),
                new Rectangle(3.0, 8.0)
        };

        double totalArea = sumArea(objects);
        System.out.println("The total area is " + totalArea);
    }
}