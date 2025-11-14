class Point {
    private double x;
    private double y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void display() {
        System.out.println("X-cord: " + x);
        System.out.println("Y-cord: " + y);
    }
}

class Line {
    Point startPoint;
    Point endPoint;

    public Line() {
        startPoint = null;
        endPoint = null;

    }

    public Line(Point a, Point b) {
        startPoint = a;
        endPoint = b;

    }

    public double findLength() {
        
        return (Math.sqrt((Math.pow(endPoint.getX() - startPoint.getX(), 2)) + (Math.pow(endPoint.getY() - 
        startPoint.getY(), 2))));
    }
}

public class Task3 {
    public static void main(String[] args) {
        Point p1 = new Point(2,3);
        Point p2 = new Point(3,2);
        Line line1 = new Line(p1,p2);
        System.out.println(line1.findLength());
        Point p3 = new Point(5,6);
        Point p4 = new Point(4,3);
        Line line2 = new Line(p3,p4);
        System.out.println(line2.findLength());

    }
}
