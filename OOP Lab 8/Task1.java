abstract class Package {
    String senderAddress, senderName, recAddress, recName;
    double weight; // in ounces
    double costPerOunce; // shipment cost

    public Package() {
    }

    public Package(String senderAddress, String senderName, String recAddress, String recName, double weight,
            double costPerOunce) {
        this.senderAddress = senderAddress;
        this.senderName = senderName;
        this.recAddress = recAddress;
        this.recName = recName;
        if (weight > 0 && costPerOunce > 0) {
            this.weight = weight;
            this.costPerOunce = costPerOunce;
        } else
            System.out.println("Negative values not allowed. Setting to 0");

    }

    public String getSenderAddress() {
        return this.senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public String getSenderName() {
        return this.senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getRecAddress() {
        return this.recAddress;
    }

    public void setRecAddress(String recAddress) {
        this.recAddress = recAddress;
    }

    public String getRecName() {
        return this.recName;
    }

    public void setRecName(String recName) {
        this.recName = recName;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        } else
            System.out.println("Negative values not allowed. Value not changed");
    }

    public double getCostPerOunce() {
        return this.costPerOunce;
    }

    public void setCostPerOunce(double costPerOunce) {
        if (costPerOunce > 0) {
            this.costPerOunce = costPerOunce;
        } else
            System.out.println("Negative values not allowed. Value not changed");

    }

    public double calculateCost() {
        return costPerOunce * weight;
    }

    @Override
    public String toString() {
        return "{" +
                " senderAddress='" + getSenderAddress() + "'" +
                ", senderName='" + getSenderName() + "'" +
                ", recAddress='" + getRecAddress() + "'" +
                ", recName='" + getRecName() + "'" +
                ", weight='" + getWeight() + "'" +
                ", costPerOunce='" + getCostPerOunce() + "'" +
                "}";
    }

}

class OvernightPackage extends Package {
    double additionalFee;

    public OvernightPackage() {
        super();
    }

    public OvernightPackage(String senderAddress, String senderName, String recAddress, String recName, double weight,
            double costPerOunce, double additionalFee) {
        super(senderAddress, senderName, recAddress, recName, weight, costPerOunce);
        this.additionalFee = additionalFee;
    }

    public double calculateCost() {
        return (additionalFee + super.calculateCost());
    }

}

class TwoDayPackage extends Package {
    double flatFee;

    public TwoDayPackage() {
        super();
    }

    public TwoDayPackage(String senderAddress, String senderName, String recAddress, String recName, double weight,
            double costPerOunce, double flatFee) {
        super(senderAddress, senderName, recAddress, recName, weight, costPerOunce);
        this.flatFee = flatFee;
    }

    public double calculateCost() {
        return (flatFee + super.calculateCost());
    }
}

public class Task1 {
    public static void main(String[] args) {
        Package p1 = new OvernightPackage("Las Vegas", "Charlie Kirk", "Washington D.C", "Donald Trump", 2500, 10,200);
        Package p2 = new TwoDayPackage("Tahiti", "Dutch", "San Denis", "Milton", 30.25, 3,80);
        System.out.println(p1.calculateCost());
        System.out.println(p2.calculateCost());
    }
}
