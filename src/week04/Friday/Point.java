package week04.Friday;

public class Point {
    private final Integer x;
    private final Integer y;

    private static final Point a = new Point();

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(Point a) {
        this(a.getX(), a.getY());
        // this.x = a.getX();
        // this.y = a.getY();
    }

    public static void add(Point point1, Point point2) {
        LineSegment ls = new LineSegment(point1, point2);
        System.out.println(ls.toString());
    }

    public String toString() {
        return "(" + getX() + ", " + getY() + ")";
    }

    public static void origin() {
        System.out.println(a.toString());
    }

    public boolean equals(Point a) {
        return this.x == a.x && this.y == a.y;
    }

    public int hashCode() {
        int hash = 17;
        hash = hash * 23 + x.hashCode();
        hash = hash * 23 + y.hashCode();
        return hash;
    }

    public static void main(String[] args) {
        Point myPoint1 = new Point(2, 3);
        Point myPoint2 = new Point(4, 5);

        add(myPoint1, myPoint2);
        origin();
        System.out.println(myPoint2.toString());

    }
}
