package week04.Friday;

public class Ellipse implements GeometryFigures{
    private Point centerPoint;
    private int R;
    private int r;

    private Point up;
    private Point down;
    private Point left;
    private Point right;
    
    public Ellipse(Point centerPoint, int R, int r) {
        if (R==0 || r==0) {
            System.out.println("This is not an ellipse.");
        } else {
           this.centerPoint = centerPoint;
           this.R = R;
           this.r = r;
           up = new Point(centerPoint.getX()+r, centerPoint.getY());
           down = new Point(centerPoint.getX()-r, centerPoint.getY());
           left = new Point(centerPoint.getX(), centerPoint.getY()-R);
           right = new Point(centerPoint.getX(), centerPoint.getY()+R);
        }
    }

    public Ellipse(Ellipse e) {
        this.centerPoint = e.centerPoint;
        this.R = e.R;
        this.r = e.r;
        this.up = e.up;
        this.down = e.down;
        this.left = e.left;
        this.right = e.right;
        
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
    public Point getCenter(){
        return centerPoint;
    }
    
    @Override
    public int getPerimeter(){
        return (int) (2*3.14*Math.sqrt((R*R+r*r)/2));
    }
    
    @Override
    public int getArea(){
        return (int) (3.14*R*r);
    }
    
    public String toString() {
        return "Ellipse: [" + centerPoint + ", (" + R*2 + ", " + r*2 + ")]";
    }

    public int hashCode() {
        int hash = 17;
        hash = hash * 23 + up.hashCode();
        hash = hash * 23 + down.hashCode();
        hash = hash * 23 + left.hashCode();
        hash = hash * 23 + right.hashCode();
        return hash;
    }
    
    public boolean equals(Ellipse e) {
        return (this.centerPoint.equals(e.centerPoint) && this.R == e.R && this.r == e.r) ;

    }

    public static void main(String[] args) {
        Point p1 = new Point(1, 6);

        Ellipse e = new Ellipse(p1, 5, 7);
        System.out.println(e.getArea());
        System.out.println(e.getPerimeter());
        System.out.println(e.toString());

    }

}
