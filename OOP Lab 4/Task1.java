class Distance {
    private int feet;
    private int inches;

    public Distance() {
        feet = 0;
        inches = 0;
    }

    public Distance(int feet, int inches) {
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

    public boolean check(int feet, int inches) {
        return (feet>=0 && inches >= 0);
    }

    public void setDistance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public int getFeet() {
        return feet;
    }

    public int getInches() {
        return inches;
    }

    public void display() {
        System.out.println(feet + " Feet and " + inches + " inches");
    }

    public Distance addDistance(Distance d1) {
        Distance temp = new Distance();

        temp.feet = this.feet + d1.feet;
        temp.inches = this.inches + d1.inches;
        if (temp.inches >= 12) {
            feet += (temp.inches / 12);
            temp.inches = inches % 12;
            temp.feet = feet;

        }

        return temp;
    }

}

public class Task1 {
    public static void main(String[] args) {
        Distance dist1 = new Distance(5, 2);
        Distance dist2 = new Distance(2, 18);
        Distance dist3 = new Distance();
        dist3 = dist1.addDistance(dist2);
        dist3.display();
    }
}
