class Marks {
    private double mark1;
    private double mark2;
    private double mark3;

    public Marks() {
        mark1 = 0.0;
        mark2 = 0.0;
        mark3 = 0.0;
    }

    public Marks(double mark1, double mark2, double mark3) {
        if (mark1 < 0 || mark2 < 0 || mark3 < 0) {
            System.out.println("Marks cannot be negative!");
        } else {
            this.mark1 = mark1;
            this.mark2 = mark2;
            this.mark3 = mark3;
        }

    }

    void setMarks(double mark1, double mark2, double mark3) {
        if (mark1 < 0 || mark2 < 0 || mark3 < 0) {
            System.out.println("Marks cannot be negative!");
        } else {
            this.mark1 = mark1;
            this.mark2 = mark2;
            this.mark3 = mark3;
        }
    }

    void setMark1(double mark1){
        if (mark1 < 0){
            System.out.println("Marks cannot be negative!");
        }else{
            this.mark1 = mark1;
        }
    }
    void setMark2(double mark2){
        if (mark2 < 0){
            System.out.println("Marks cannot be negative!");
        }else{
            this.mark2 = mark1;
        }
    }
    void setMark3(double mark3){
        if (mark3 < 0){
            System.out.println("Marks cannot be negative!");
        }else{
            this.mark3 = mark1;
        }
    }

    public double calculateSum() {
        return (mark1 + mark2 + mark3);
    }

}

public class Task4 {
    public static void main(String[] args) {
        Marks marks = new Marks(23, -10, 5);
        System.out.println("Total Marks: " + marks.calculateSum());

    }
}
