class CourseResult{
     String studentName;
     String courseName;
     String grade;

    public void display(){
        System.out.println("Student name is " + studentName + ". Course name is " + courseName + ". Grade is " + grade);
    }
}


public class Activity1 {
    public static void main(String[] args) {
        CourseResult cr1 = new CourseResult();
        cr1.studentName = "John Wick";
        cr1.courseName = "Sociology";
        cr1.grade = "A+";
        cr1.display();

        CourseResult cr2 = new CourseResult();
        cr2.studentName = "Abraham Lincoln";
        cr2.courseName = "Philosophy";
        cr2.grade = "D";
        cr2.display();
    }
}