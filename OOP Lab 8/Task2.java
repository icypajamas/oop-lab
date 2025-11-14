abstract class Person {
    String name;

    public Person() {

    }

    public Person(String name) {
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract public boolean isOutstanding();

}

class Student extends Person {
    double CGPA;

    public Student() {
        super();
    }

    public Student(String name, double CGPA) {
        super(name);
        this.CGPA = CGPA;
    }

    public boolean isOutstanding() {
        if (CGPA > 3.5) {
            return true;
        } else
            return false;
    }

}

class Professor extends Person {
    int publications;

    public Professor() {
        super();
    }

    public Professor(String name, int publications) {
        super(name);
        this.publications = publications;
    }

    public boolean isOutstanding() {
        if (publications > 50) {
            return true;
        } else
            return false;
    }
}

public class Task2 {
    public static void main(String[] args) {
        Student s1 = new Student("Little Timmy", 3.6);
        Person p1 = new Student("Big Tom", 1.2);
        Professor pro1 = new Professor("Big Boss", 67);
        Person p2 = new Professor("Little Boss", 12);
        Person[] personArray = new Person[]{ s1, p1, pro1, p2 };
        for (int i = 0; i < personArray.length; i++) {
            System.out.println(personArray[i].isOutstanding());
        }
    }
}
