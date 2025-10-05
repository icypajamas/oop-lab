import java.util.Scanner;

class Rectangle {
    double length;
    double width;

    public void setDimensions(double a, double b) {
        length = a;
        width = b;
    }

    public void calculateArea() {
        System.out.println("Area: " + (length * width));
    }

    public void calculatePerimeter() {
        System.out.println("Perimeter: " + (2 * (length + width)));
    }
}

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rectangle rectangle1 = new Rectangle();

        System.out.print("Enter Length: ");
        double a = input.nextDouble();
        System.out.print("Enter Width: ");
        double b = input.nextDouble();

        rectangle1.setDimensions(a, b);
        rectangle1.calculateArea();
        rectangle1.calculatePerimeter();
        input.close();
    }
}
