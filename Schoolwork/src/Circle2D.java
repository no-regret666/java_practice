public class Circle2D {
    private double x;
    private double y;
    private double radius;

    // No-arg constructor
    public Circle2D() {
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }

    // Constructor with specified x, y, and radius
    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    // Getter methods
    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getRadius() {
        return this.radius;
    }

    // Methods
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public boolean contains(double x, double y) {
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y)) <= this.radius;
    }

    public boolean contains(Circle2D circle) {
        return Math.sqrt((circle.x - this.x) * (circle.x - this.x) + (circle.y - this.y) * (circle.y - this.y)) + circle.radius <= this.radius;
    }

    public boolean overlaps(Circle2D circle) {
        return Math.sqrt((circle.x - this.x) * (circle.x - this.x) + (circle.y - this.y) * (circle.y - this.y)) <= this.radius + circle.radius;
    }
}