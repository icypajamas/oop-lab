class Student {
    String name;
    String program;
    String registeration;

    public void displayInfo(){
        System.out.println("Student name: " + name);
        System.out.println("Program Enrolled in: " + program);
        System.out.println("Registration number: " + registeration);

    }

}

public class Task1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Tom";
        student1.program = "BS CS";
        student1.registeration = "FA25-BCS-11";
        student1.displayInfo();
    }
}
