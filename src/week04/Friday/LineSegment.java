package week04.Friday;

public class LineSegment implements Comparable<LineSegment> {
    private Point a;
    private Point b;

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public LineSegment(Point a, Point b) {
        if (a.equals(b)) {
            System.out.println("Cannot create a line segment with zero length");
        } else {
            this.a = a;
            this.b = b;
        }
    }

    public LineSegment(LineSegment ls) {
        this.a = ls.a;
        this.b = ls.b;
    }

    public double getLength() {
        Integer result = (int) (Math.pow(Math.abs(a.getX() - b.getX()), 2)
                + Math.pow(Math.abs(a.getY() - b.getY()), 2));
        return Math.sqrt(result);
    }

    @Override
    public String toString() {
        return "[" + a + ", " + b + "]";
    }

    public boolean equals(LineSegment l) {
        return this.getA().equals(l.getA()) && this.getB().equals(l.getB());

    }

    public int hashCode() {
        int hash = 17;
        hash = hash * 23 + a.hashCode();
        hash = hash * 23 + b.hashCode();
        return hash;
    }

    public static void main(String[] args) {
        Point p1 = new Point(1, 4);
        Point p2 = new Point(5, 3);
        LineSegment l1 = new LineSegment(p1, p2);
        LineSegment l2 = new LineSegment(new Point(5, 6), new Point(5, 7));
        System.out.println(l2.getLength());
        System.out.println(l1.toString());
        System.out.println(l1.equals(l2));
        System.out.println(l1.compareTo(l2));
    }

    @Override
    public int compareTo(LineSegment l) {
        if ((this.getLength()) == (l.getLength())) {
            return 0;
        } else if ((this.getLength()) < (l.getLength())) {
            return -1;
        }
        return 1;
    }

}
