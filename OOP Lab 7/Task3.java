abstract class Shape {
    int lineNum;
    String penColor;
    String fillColor;

    public Shape() {
        lineNum = 0;
        penColor = "";
        fillColor = "";
    }

    public Shape(int lineNum, String penColor, String fillColor) {
        this.lineNum = lineNum;
        this.penColor = penColor;
        this.fillColor = fillColor;
    }

    abstract void draw();
}

class Circle extends Shape {
    public Circle() {
        super();
    }

    public Circle(int lineNum, String penColor, String fillColor) {
        super(lineNum, penColor, fillColor);
    }

    void draw() {
        System.out.println("Wow circle");
    }
}

class Square extends Shape {
    public Square() {
        super();
    }

    public Square(int lineNum, String penColor, String fillColor) {
        super(lineNum, penColor, fillColor);
    }

    void draw() {
        System.out.println("Wow Square");
    }
}

class Triangle extends Shape {
    public Triangle() {
        super();
    }

    public Triangle(int lineNum, String penColor, String fillColor) {
        super(lineNum, penColor, fillColor);
    }

    void draw() {
        System.out.println("Wow Triangle");
    }
}

public class Task3 {
    public static void main(String[] args) {
        Circle c1 = new Circle(4,"red", "yellow");
        Square s1 = new Square(2, "green", "blue");
        Triangle t1 = new Triangle(9,"purple","pink");
        t1.draw();
        s1.draw();
        c1.draw();
    }
}
