class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
        numerator = 0;
        denominator = 1;

    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator == 0) {
            System.out.println("Denominator must not be zero. Setting default value: 1");
            this.denominator = 1;
        } else {
            this.denominator = denominator;
        }
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            System.out.println("Denominator must not be zero. Retaining old value");
        } else {
            this.denominator = denominator;
        }
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void display() {
        System.out.println(numerator + "/" + denominator);
    }

    public boolean equals(Fraction fraction) {
        return (this.numerator * fraction.denominator) == (this.denominator * fraction.numerator);
    }

}

public class Task3 {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(6, 10);
        Fraction f2 = new Fraction(3, 6);
        f1.display();
        f2.display();
        System.out.println(f1.equals(f2));
    }
}
