
public class Point {

    private double x;
    private double y;
    private static int objectCount = 0;

    public Point() {
        this.x = 0;
        this.y = 0;
        objectCount++;
    }
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        objectCount++;
    }
    
    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
        objectCount++;
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
    public static int getObjectCount() {
        return objectCount;
    }

    @Override
    public String toString() {
    return "(" + this.x + ", " + this.y + ") | Total Points: " + objectCount;
    }
}
