package SchoolWork3;

public class RegularPolygon {
    private int n = 3; // Default number of sides
    private double side = 1.0; // Default side length
    private double x = 0.0; // Default x-coordinate of the center
    private double y = 0.0; // Default y-coordinate of the center

    // No-arg constructor
    public RegularPolygon() {}

    // Constructor with specified sides and side length
    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
    }

    // Constructor with all parameters
    public RegularPolygon(int n, double side, double x, double y) {
        this(n, side);
        this.x = x;
        this.y = y;
    }

    // Getters and Setters
    public int getN() { return n; }
    public void setN(int n) { this.n = n; }

    public double getSide() { return side; }
    public void setSide(double side) { this.side = side; }

    public double getX() { return x; }
    public void setX(double x) { this.x = x; }

    public double getY() { return y; }
    public void setY(double y) { this.y = y; }

    // Calculate and return the perimeter
    public double getPerimeter() {
        return n * side;
    }

    // Calculate and return the area using the simplified formula
    public double getArea() {
        // The formula derived from the apothem method is simplified for calculation purposes
        // Using the direct relationship without explicitly calculating the apothem
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }
}