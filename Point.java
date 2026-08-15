/*
 * File: Point.java
 * Purpose: Represents a single point in 2D space (x, y).
 */
public class Point {

    // Attributes: coordinates of the point.
    private double x;
    private double y;

    // 1) No-argument constructor: defaults to the origin (0, 0).
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    // 2) Parameterized constructor: set both coordinates directly.
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // 3) Copy constructor: builds a new, independent Point with the same
    //    coordinates as "other".
    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Straight-line (Euclidean) distance from this point to another.
    public double distanceTo(Point other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public void displayState() {
        System.out.println("(" + this.x + ", " + this.y + ")");
    }
}
