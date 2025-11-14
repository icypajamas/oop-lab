abstract class Convert {
    double val1, val2;

    public Convert() {

    }

    public Convert(double val1) {
        this.val1 = val1;
        this.val2 = 0.0;
    }

    abstract double compute();
}

class LtoG extends Convert {
    public LtoG() {
        super();
    }

    public LtoG(double val1) {
        super(val1);
    }

    public double compute() {
        val2 = val1 / 3.785;
        return val2;
    }
}

class FtoC extends Convert {
    public FtoC() {
        super();
    }

    public FtoC(double val1) {
        super(val1);
    }

    public double compute(){
        val2 = ((val1 - 32) * 5/9);
        return val2;
    }

}

class FtoM extends Convert {

    public FtoM() {
        super();
    }

    public FtoM(double val1) {
        super(val1);
    }

    public double compute() {
        val2 = val1 / 3.281;
        return val2;
    }
}

public class Task3 {
    public static void main(String[] args) {
        Convert Farenheit = new FtoC(25);
        Convert Meter = new FtoM(50);
        Convert Gallon = new LtoG(30);
        System.out.println(Farenheit.compute());
        System.out.println(Meter.compute());
        System.out.println(Gallon.compute());

    }  
}
