class Car {

    String category; // Sedan, Coupe, Hatchback etc
    double engineCapacity; // Engine Capacity in Litres
    String color;
    String manufacturer;
    String model;

    public void displayInfo() {
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
        System.out.println("Category: " + category);
        System.out.println("Engine Capacity: " + engineCapacity + "L");
        System.out.println("Color: " + color);
    }

    public void startCar() {
        System.out.println("Engine Started");
    }

    public void engineOff() {
        System.out.println("Engine Turned Off");
    }

}

public class Task3 {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.category = "Sedan";
        car1.engineCapacity = 2;
        car1.color = "Red";
        car1.manufacturer = "Hyundai";
        car1.model = "Elantra";

        car1.displayInfo();
        car1.startCar();
        car1.engineOff();

    }
}