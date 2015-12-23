package week04.Friday;

public class Triangle implements GeometryFigures{
    private Point one;
    private Point two;
    private Point three;


    public Triangle(Point a, Point b, Point c) {
        if ((a.getX() == b.getX() && b.getX()== c.getX()) || (b.getY() == a.getY() && a.getY()==c.getY())) {
            System.out.println("Points are on the same axis line.");
        } else {
            one = a;
            two = b;
            three = c;
        }
    }

    public Triangle(Triangle t) {
        this.one = t.one;
        this.two = t.two;
        this.three = t.three;
    }

    public Point getOne() {
        return one;
    }

    public Point getTwo() {
        return two;
    }

    public Point getThree() {
        return three;
    }
    
    public LineSegment first() {
        return new LineSegment(one, two);
    }

    public LineSegment second() {
        return new LineSegment(two, three);
    }

    public LineSegment third() {
        return new LineSegment(three, one);
    }
    
    public int getHeight1(){
        return (int) (2*this.getArea()/this.first().getLength());
    }
    
    public int getHeight2(){
        return (int) (2*this.getArea()/this.second().getLength());
    }
    
    public int getHeight3(){
        return (int) (2*this.getArea()/this.third().getLength());
    }
    
    @Override
    public int getPerimeter(){
        return (int) (this.first().getLength() + this.second().getLength() + this.third().getLength());
    }
    
    @Override
    public Point getCenter(){
        int x = (this.one.getX() + this.two.getX() + this.three.getX())/3;
        int y = (this.one.getY() + this.two.getY() + this.three.getY())/3;
        return new Point(x,y);
    }
    
    @Override
    public int getArea(){
        double half = this.getPerimeter()/2.0;
        return (int) Math.sqrt(half*(half - this.first().getLength())*(half - this.second().getLength())*(half - this.third().getLength()));
    }
    
    public String toString() {
        return "Triangle: [" + one + ", " + this.getHeight1() + ", " + this.second().toString() + ")]";
    }

    public int hashCode() {
        int hash = 17;
        hash = hash * 23 + one.hashCode();
        hash = hash * 23 + two.hashCode();
        hash = hash * 23 + three.hashCode();
        return hash;
    }
    
    public boolean equals(Triangle t) {
        return this.getOne().equals(t.getOne()) && this.getTwo().equals(t.getTwo()) && this.getThree().equals(t.getThree()) ;

    }
    
    public static void main(String[] args) {
        Point p1 = new Point(1, 6);
        Point p2 = new Point(6, 1);
        Point p3 = new Point(5,7);
        Triangle tr = new Triangle(p1, p2, p3);
        System.out.println(tr.getArea());
        System.out.println(tr.getPerimeter());
        System.out.println(tr.getHeight3());
        //Triangle rect2 = new Triangle(p1, p2);
        System.out.println(tr.toString());
    }

}
