class Simple {
    int num1;
    int num2;

    public Simple() {
        num1 = 0;
        num2 = 0;
    }

    public Simple(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    void add() {
        System.out.println(num1 + num2);
    }

    void sub() {
        System.out.println(num1 - num2);
    }

    void mul() {
        System.out.println(num1 * num2);
    }

    void div() {
        System.out.println(num1 / num2);
    }

    public String toString() {
        return ("First Number: " + num1 + "\nSecond Number: " + num2);
    }
}

class VerifiedSimple extends Simple {

    public VerifiedSimple() {
        super();
    }

    public VerifiedSimple(int num1, int num2) {
        super(num1, num2);
    }

    void add() {
        if (num1 != 0 && num2 != 0) {
            super.add();
        } else
            System.out.println("Error! Given Number can't be 0");
    }

    void sub() {
        if (num1 != 0 && num2 != 0) {
            super.sub();
        } else
            System.out.println("Error! Given Number can't be 0");
    }

    void mul() {
        if (num1 != 0 && num2 != 0) {
            super.mul();
        } else
            System.out.println("Error! Given Number can't be 0");
    }

    void div() {
        if (num1 != 0 && num2 != 0) {
            super.div();
        } else
            System.out.println("Error! Given Number can't be 0");
    }

    public String toString() {
        return ("First Number: " + num1 + "\nSecond Number: " + num2);
    }
}

public class Task2 {
    public static void main(String[] args) {
        VerifiedSimple vf = new VerifiedSimple(0, 2);
        vf.add();
        vf.mul();
        vf.div();
        vf.sub();
        System.out.println(vf);
    }
}
