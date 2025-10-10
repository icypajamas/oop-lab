import javax.security.auth.Subject;

class Person {
    String name;
    String address;
    String phoneNum;
    String emailAddress;

    public Person() {
        name = "";
        address = "";
        phoneNum = "";
        emailAddress = "";
    }

    public Person(String name, String address, String phoneNum, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
        this.emailAddress = emailAddress;
    }

    public void display() {
        System.out.printf("Name: %s\nAddress: %s\nPhoneNumber: %s\nEmail: %s\n", name, address, phoneNum, emailAddress);
    }

}

class Student extends Person { // Child of Person
    String status;

    public Student() {
        status = "";
    }

    public Student(String name, String address, String phoneNum, String emailAddress, String status) {
        super(name, address, phoneNum, emailAddress);
        this.status = status;
    }

    public void display() {
        System.out.println("----Student Details----");
        super.display();
        System.out.println("Student status: " + status);
    }
}

class Employee extends Person { // Child of Person
    String office;
    double salary;
    Date dateHired;

    public Employee() {
        office = "";
        salary = 0.0;
        dateHired = null;
    }

    public Employee(String name, String address, String phoneNum, String emailAddress, String office, double salary,
            Date dateHired) {
        super(name, address, phoneNum, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public void display() {
        System.out.println("----Employee Details----");
        super.display();
        System.out.printf("Office: %s\nSalary: %.2f\nDate Hired: %s\n", office, salary, dateHired.getDate());
    }

}

class Faculty extends Employee { // Child of Employee
    String officeHours;
    String rank;

    public Faculty() {
        officeHours = "";
        rank = "";

    }

    public Faculty(String name, String address, String phoneNum, String emailAddress, String office, double salary,
            Date dateHired, String officeHours, String rank) {
        super(name, address, phoneNum, emailAddress, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;

    }

    public void display() {
        System.out.println("----Faculty Details----");
        super.display();
        System.out.printf("Office Hours: %s\nRank: %s\n", officeHours, rank);
    }

}

class Staff extends Employee { // Child of Employee
    String title;

    public Staff() {
        title = "";
    }

    public Staff(String name, String address, String phoneNum, String emailAddress, String office, double salary,
            Date dateHired, String title) {
        super(name, address, phoneNum, emailAddress, office, salary, dateHired);
        this.title = title;
    }

    public void display() {
        System.out.println("----Staff Details----");
        super.display();
        System.out.println("Title: " + title);
    }
}

class Date { // To be used for Employee class
    String date;

    public Date() {
        date = "";
    }

    public Date(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void display() {
        System.out.println(date);
    }
}

public class Task1 {
    public static void main(String[] args) {
        Person p1 = new Person("John", "Street 12", "+921313", "john@email.com");
        p1.display();
        Student s1 = new Student("John", "Street 12", "+921313", "john@email.com", "Enrolled");
        s1.display();
        Date dateHired = new Date("October 12, 2026");
        Employee e1 = new Employee("John", "Street 12", "+921313", "john@email.com", "Office Banana", 5000, dateHired);
        e1.display();
        Faculty f1 = new Faculty("John", "Street 12", "+921313", "john@email.com", "Office Banana", 5000, dateHired,
                "9:00 - 5:00", "Rank 2");
        f1.display();
        Staff staff1 = new Staff("John", "Street 12", "+921313", "john@email.com", "Office Banana", 5000, dateHired,
                "Staff Title");
        staff1.display();
    }
}
