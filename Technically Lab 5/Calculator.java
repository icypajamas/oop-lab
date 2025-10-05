import java.util.Scanner;

class TwoDigitCalculator {
    static double num1;
    static double num2;

    public static double addition() {
        return (num1 + num2);
    }

    public static double subtraction() {
        return (num1 - num2);
    }

    public static double multiplication() {
        return (num1 * num2);
    }

    public static double division() {
        return (num1 / num2);
    }

}

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice = 1;

        do {
            System.out.print("Input first number: ");
            TwoDigitCalculator.num1 = scanner.nextDouble();
            System.out.print("Input second number: ");
            TwoDigitCalculator.num2 = scanner.nextDouble();
            System.out.print("Enter operation: (+, -, x, /) ");
            char op = scanner.next().charAt(0);
            switch (op) {
                case '+':
                    System.out.println("Result: " + TwoDigitCalculator.addition());
                    break;
                case '-':
                    System.out.println("Result: " + TwoDigitCalculator.subtraction());
                    break;
                case 'x':
                    System.out.println("Result: " + TwoDigitCalculator.multiplication());
                    break;
                case '/':
                    System.out.println("Result: " + TwoDigitCalculator.division());
                    break;
                default:
                    System.out.println("Invalid input!");
                    break;
            }
            System.out.print("Run again? (e to exit): ");
            choice = scanner.next().charAt(0);
        } while (choice != 'e');


    }
}
