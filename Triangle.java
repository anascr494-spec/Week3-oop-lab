
public class Triangle {

    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle() {
        this.p1 = new Point();
        this.p2 = new Point();
        this.p3 = new Point();
    }

    public Triangle(Point p1, Point p2, Point p3) {

        this.p1 = new Point(p1);
        this.p2 = new Point(p2);
        this.p3 = new Point(p3);
    }


    public Triangle(Triangle other) {
        this.p1 = new Point(other.p1);
        this.p2 = new Point(other.p2);
        this.p3 = new Point(other.p3);
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
