
public class Main {
    public static void main(String[] args) {

        Point a = new Point();
        Point b = new Point(4, 0);
        Point c = new Point(0, 3);

        Triangle t1 = new Triangle(a, b, c);
        System.out.println("--- t1 ---");
        System.out.println(t1);

        Triangle t2 = new Triangle();
        System.out.println("\n--- t2 (default) ---");
        System.out.println(t2);

        Triangle t3 = new Triangle(t1);
        System.out.println("\n--- t3 ---");
        System.out.println(t3);
        
        System.out.println("\nt1's P2 coordinates: (" + t1.getP2().getX() + ", " + t1.getP2().getY() + ")");

        t2.setP1(new Point(9, 9));
        System.out.println("\n--- t2 ---");
        System.out.println(t2);

        a.setX(100);
        System.out.println("\n--- after changing original point 'a' ---");
        System.out.println("t1 :\n" + t1);
        System.out.println("t3 :\n" + t3);

        System.out.println("\nTotal Points created: " + Point.getObjectCount());
        System.out.println("Total Triangles created: " + Triangle.getObjectCount());
    }
}
