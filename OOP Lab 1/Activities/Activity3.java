import java.util.Scanner;

class CarPart {

    String modelNumber;
    String partNumber;
    String cost;

    public void setParams(String a, String b, String c) {
        modelNumber = a;
        partNumber = b;
        cost = c;
    }

    public void display() {
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Part Number: " + partNumber);
        System.out.println("Price: " + cost);
    }

}

public class Activity3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CarPart part1 = new CarPart();
        System.out.print("Enter model number: ");
        String a = input.nextLine();
        System.out.print("Enter part number: ");
        String b = input.nextLine();
        System.out.print("Enter price: ");
        String c = input.nextLine();
        part1.setParams(a, b, c);
        part1.display();
        input.close();
    }
}
