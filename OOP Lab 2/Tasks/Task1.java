
class Circle {
    private double radius;

    public Circle() {
        radius = 0.0;
    }

    public Circle(double radius) {
        if (radius < 0) {
            System.out.println("Radius Cannot be negative!");
        } else {
            this.radius = radius;
        }

    }

    void setRadius(double radius) {
        if (radius < 0) {
            System.out.println("Radius Cannot be negative!");
        } else {
            this.radius = radius;
        }
    }

    double getRadius() {
        return this.radius;
    }

    public void calculateCircumference() {

        System.out.println("Circumference: " + (Math.PI * (radius * 2)));

    }

}

public class Task1 {
    public static void main(String[] args) {
        Circle circle = new Circle(0);
        circle.calculateCircumference();
    }
}