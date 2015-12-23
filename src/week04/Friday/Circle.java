package week04.Friday;

public class Circle implements GeometryFigures{
    private Point centerPoint;
    private int R;

    private Point up;
    private Point down;
    private Point left;
    private Point right;

    public Circle(Point centerPoint, int R) {
        this.centerPoint = centerPoint;
        this.R = R;
        up = new Point(centerPoint.getX()+R, centerPoint.getY());
        down = new Point(centerPoint.getX()-R, centerPoint.getY());
        left = new Point(centerPoint.getX(), centerPoint.getY()-R);
        right = new Point(centerPoint.getX(), centerPoint.getY()+R);
    }

    public Circle(Circle c) {
        this.centerPoint = c.centerPoint;
        this.R = c.R;
        this.up = c.up;
        this.down = c.down;
        this.left = c.left;
        this.right = c.right;
        
    }

    public Point getUpper() {
        return up;
    }

    public Point getRight() {
        return right;
    }

    public Point getLower() {
        return down;
    }

    public Point getLeft() {
        return left;
    }

    @Override
    public Point getCenter() {
        return centerPoint;
    }

    @Override
    public int getPerimeter() {
        return (int) (2 * 3.14 * R);
    }

    @Override
    public int getArea() {
        return (int) (3.14 * R * R);
    }

    public String toString() {
        return "Circle: [" + centerPoint + ", " + R + ")]";
    }

    public int hashCode() {
        int hash = 17;
        hash = hash * 23 + up.hashCode();
        hash = hash * 23 + down.hashCode();
        hash = hash * 23 + left.hashCode();
        hash = hash * 23 + right.hashCode();
        return hash;
    }

    public boolean equals(Circle c) {
        return (this.centerPoint.equals(c.centerPoint) && this.R == c.R);

    }

    public static void main(String[] args) {
        Point p1 = new Point(1, 6);

        Circle c = new Circle(p1, 5);
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());
        System.out.println(c.toString());
    }
}
