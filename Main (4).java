/*
 * File: Main.java
 * Purpose: Demonstrates Point and Triangle, all three constructors,
 *          and proves that copies are independent (deep copy).
 */
public class Main {
    public static void main(String[] args) {

        // Build a triangle from three points using the parameterized constructor.
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 3);
        Triangle t1 = new Triangle(a, b, c); // classic 3-4-5 right triangle

        System.out.println("--- t1 (3-4-5 triangle) ---");
        t1.displayState();

        // No-argument constructor: a degenerate triangle at the origin.
        Triangle t2 = new Triangle();
        System.out.println("--- t2 (default, all points at origin) ---");
        t2.displayState(); // area 0, isValid should print false

        // Copy constructor: t3 starts identical to t1.
        Triangle t3 = new Triangle(t1);

        // Now move one of t1's original points AFTER building t3.
        // Because Triangle's constructor deep-copies each Point, t3 is
        // unaffected - proving t1 and t3 don't secretly share corners.
        a.setX(100);
        System.out.println("--- after changing the ORIGINAL point 'a' ---");
        System.out.println("t1 (uses its own copy of a's old value):");
        t1.displayState();
        System.out.println("t3 (copy of t1, also unaffected by the change to a):");
        t3.displayState();
    }
}
