import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Square square1 = new Square();

        System.out.println("Enter Length: ");
        int length = in.nextInt();

        System.out.println("Enter Width: ");
        int width = in.nextInt();
        square1.calculateArea(length, width);
    }
}

class Square {
    public void calculateArea(int length, int width) {
        int result;
        result = length * width;

        System.out.println(result);
    }
}
