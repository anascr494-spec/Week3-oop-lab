
public class Triangle {

    private Point p1;
    private Point p2;
    private Point p3;
    private static int objectCount = 0;

    public Triangle() {
        this.p1 = new Point();
        this.p2 = new Point();
        this.p3 = new Point();
        objectCount++;
    }

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = new Point(p1);
        this.p2 = new Point(p2);
        this.p3 = new Point(p3);
        objectCount++;
    }

    public Triangle(Triangle other) {
        this.p1 = new Point(other.p1);
        this.p2 = new Point(other.p2);
        this.p3 = new Point(other.p3);
        objectCount++; 
    }
    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    public void setP1(Point p1) {
        this.p1 = new Point(p1);
    }

    public void setP2(Point p2) {
        this.p2 = new Point(p2);
    }

    public void setP3(Point p3) {
       this.p3 = new Point(p3);
    }
     public static int getObjectCount() {
        return objectCount;
    }

   @Override
    public String toString() {
       return "P1: (" + p1.getX() + ", " + p1.getY() + ")\n" +
              "P2: (" + p2.getX() + ", " + p2.getY() + ")\n" +
              "P3: (" + p3.getX() + ", " + p3.getY() + ")\n" +
              "Total Triangles: " + objectCount;
    }
}
