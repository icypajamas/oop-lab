
class Student {
    private String name;
    private int[] result_array;

    public Student() {
        name = null;
        result_array = new int[5];
    }

    public Student(String name, int[] array) {
        this.name = name;
        result_array = array;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArray(int[] array) {
        result_array = array;
    }

    public String getName() {
        return name;
    }

    public int[] getArray() {
        return result_array;
    }

    public double average() {
        int sum = 0;
        double average = 0;
        for (int i = 0; i < result_array.length; i++) {
            sum += result_array[i];
        }
        average = sum / 5;
        return average;
    }

    public void compare(Student a) {
        double average1 = this.average();
        double average2 = a.average();
        if (average1 > average2) {
            System.out.println(this.name + "has higher marks than " + a.name);
        } else if (average1 == average2) {
            System.out.println("Both have equal marks");
        } else {
            System.out.println(a.name + " has higher marks than " + this.name);
        }
    }

}

public class Task3 {
    public static void main(String[] args) {
        int[] markS1 = { 2, 3, 3, 4, 5 };
        int[] markS2 = { 4, 4, 5, 5, 3 };
        Student s1 = new Student("John", markS1);
        Student s2 = new Student("Younas", markS2);
        System.out.println(s1.average());
        System.out.println(s2.average());
        s1.compare(s2);
        Student s3 = new Student(s1.getName(), s2.getArray());
    }
}
