/*
 * File: Triangle.java
 * Purpose: A Triangle made of three Point objects (composition:
 *          a Triangle "has-a" Point, three times over).
 */
public class Triangle {

    // Attributes: the three corners of the triangle.
    private Point p1;
    private Point p2;
    private Point p3;

    // 1) No-argument constructor: all three corners default to (0,0)
    //    via Point's own no-argument constructor.
    public Triangle() {
        this.p1 = new Point();
        this.p2 = new Point();
        this.p3 = new Point();
    }

    // 2) Parameterized constructor: caller supplies all three corners.
    public Triangle(Point p1, Point p2, Point p3) {
        // We store COPIES, not the same objects the caller passed in.
        // If we just wrote "this.p1 = p1;", both Triangle and the
        // caller's variable would point to the same Point on the heap -
        // changing one would silently change the other too.
        this.p1 = new Point(p1);
        this.p2 = new Point(p2);
        this.p3 = new Point(p3);
    }

    // 3) Copy constructor: builds a fully independent Triangle.
    //    This must be a DEEP copy - copying each Point individually -
    //    not just copying the three references, or the new Triangle
    //    would secretly share its corners with the original.
    public Triangle(Triangle other) {
        this.p1 = new Point(other.p1);
        this.p2 = new Point(other.p2);
        this.p3 = new Point(other.p3);
    }

    public double perimeter() {
        return p1.distanceTo(p2) + p2.distanceTo(p3) + p3.distanceTo(p1);
    }

    // Shoelace formula for triangle area from coordinates.
    public double area() {
        double x1 = p1.getX(), y1 = p1.getY();
        double x2 = p2.getX(), y2 = p2.getY();
        double x3 = p3.getX(), y3 = p3.getY();
        return Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0;
    }

    // A triangle is invalid if all three points are collinear (area = 0).
    public boolean isValid() {
        return area() > 0;
    }

    public void displayState() {
        System.out.print("P1: ");
        p1.displayState();
        System.out.print("P2: ");
        p2.displayState();
        System.out.print("P3: ");
        p3.displayState();
        System.out.println("Perimeter : " + perimeter());
        System.out.println("Area      : " + area());
        System.out.println("Valid     : " + isValid());
        System.out.println();
    }
}
