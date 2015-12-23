package week04.Friday;

public class Rectangle implements GeometryFigures{
    private Point ul;
    private Point lr;
    private Point ur;
    private Point ll;

    public Rectangle(Point a, Point b) {
        if (a.getX() == (b.getX()) || b.getY() == a.getY()) {
            System.out.println("Points are on the same axis line.");
        } else {
            ul = a;
            lr = b;
            ur = new Point(lr.getX(), ul.getY());
            ll = new Point(ul.getX(), lr.getY());
        }
    }

    public Rectangle(Rectangle r) {
        this.ul = r.ul;
        this.lr = r.lr;
        this.ur = r.ur;
        this.ll = r.ll;
    }

    public Point getUpperLeft() {
        return ul;
    }

    public Point getUpperRight() {
        return ur;
    }

    public Point getLowerLeft() {
        return ll;
    }

    public Point getLowerRight() {
        return lr;
    }

    public LineSegment up() {
        return new LineSegment(ul, ur);
    }

    public LineSegment down() {
        return new LineSegment(ll, lr);
    }

    public LineSegment right() {
        return new LineSegment(ur, lr);
    }

    public LineSegment left() {
        return new LineSegment(ul, ll);
    }

    public int getWidth() {
        return Math.abs(ur.getX() - ul.getX());
    }

    public int getHeight() {
        return Math.abs(ul.getY() - ll.getY());
    }
    
    @Override
    public int getPerimeter(){
        return 2*this.getHeight() + 2*this.getWidth();
    }
    
    @Override
    public int getArea(){
        return this.getHeight()*this.getWidth();
    }
    
    @Override
    public Point getCenter(){
        Point center = new Point(ll.getX() +this.getWidth()/2, ll.getY() + this.getHeight()/2);
        return center;
    }
    

    public String toString() {
        return "Rectangle: [" + ul + ", (" + this.getHeight() + ", " + this.getWidth() + ")]";
    }

    public int hashCode() {
        int hash = 17;
        hash = hash * 23 + ul.hashCode();
        hash = hash * 23 + ur.hashCode();
        hash = hash * 23 + ll.hashCode();
        hash = hash * 23 + lr.hashCode();
        return hash;
    }
    
    public boolean equals(Rectangle r) {
        return this.getUpperLeft().equals(r.getUpperLeft()) && this.getHeight()==r.getHeight() && this.getWidth() == r.getWidth() ;

    }

    
    public static void main(String[] args) {
        Point p1 = new Point(1, 6);
        Point p2 = new Point(6, 1);
        Rectangle rect = new Rectangle(p1, p2);
        Rectangle rect2 = new Rectangle(p1, p2);
        System.out.println(rect.toString());
System.out.println(rect.hashCode());
        System.out.println(rect.getCenter().toString());
        System.out.println(rect.equals(rect2));
    }
}
