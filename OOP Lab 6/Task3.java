class Computer {
    int wordSize;
    int memorySize;
    int storageSize;
    int speed;

    public Computer() {
        this.wordSize = 0;
        this.memorySize = 0;
        this.storageSize = 0;
        this.speed = 0;
    }

    public Computer(int wordSize, int memorySize, int storageSize, int speed) {
        this.wordSize = wordSize;
        this.memorySize = memorySize;
        this.storageSize = storageSize;
        this.speed = speed;
    }

    public void display() {
        System.out.printf("WordSize: %s bits\nMemory Size: %s MB\nStorage Size: %s MB\nSpeed: %s MHz\n", wordSize,
                memorySize,
                storageSize, speed);
    }

}

class Laptop extends Computer {
    double length;
    double width;
    double height;
    double weight;

    public Laptop() {
        super();
        length = 0.0;
        width = 0.0;
        height = 0.0;
        weight = 0.0;
    }

    public Laptop(int wordSize, int memorySize, int storageSize, int speed,
            double length, double width, double height, double weight) {
        super(wordSize, memorySize, storageSize, speed);
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public void display() {
        super.display();
        System.out.printf("Length: %.2f inches\nWidth: %.2f inches\nHeight: %.2f inches\nWeight: %.2f kg\n", length,
                width, height, weight);
    }

}

public class Task3 {
    public static void main(String[] args) {
        Computer c1 = new Computer(64, 8192, 512000, 2400);
        c1.display();
        Laptop lappy = new Laptop(64, 8192, 512000, 2400, 8, 12, 0.5, 2);
        lappy.display();
    }
}
