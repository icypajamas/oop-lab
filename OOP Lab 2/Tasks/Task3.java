class Distance {
    private int feet;
    private double inches;

    public Distance() {
        feet = 0;
        inches = 0.0;
    }

    public boolean check(int feet, double inches) {
        if (feet < 0 || inches < 0) {
            return false;
        } else {
            return true;
        }
    }

    public Distance(int feet, double inches) {
        boolean check = check(feet, inches);
        if (check) {
            if (inches >= 12) {
                feet += (inches / 12);
                this.inches = inches % 12;
                this.feet = feet;

            } else {
                this.feet = feet;
                this.inches = inches;
            }
        } else {
            System.out.println("Distance cannot be negative");
            
        }

    }

    public void display() {
        boolean check = check(feet, inches);
        if (check) {
            System.out.println("Feet: " + feet);
            System.out.println("Inches: " + inches);
        } else {
            System.out.println();
        }

    }
}

public class Task3 {
    public static void main(String[] args) {
        Distance dist = new Distance(2, -32);
        dist.display();
    }
}
