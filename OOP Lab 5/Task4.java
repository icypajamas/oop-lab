class Pizza {
    private String size;
    private int cheese;
    private int pepperoni;
    private int ham;

    public Pizza() {
        size = "";
        cheese = 0;
        pepperoni = 0;
        ham = 0;

    }

    public Pizza(String size, int cheese, int pepperoni, int ham) {
        this.size = size;
        this.cheese = cheese;
        this.pepperoni = pepperoni;
        this.ham = ham;

    }

    void setSize(String size) {
        this.size = size;
    }

    void setCheese(int cheese) {
        this.cheese = cheese;
    }

    void setPepperoni(int pepperoni) {
        this.pepperoni = pepperoni;
    }

    void setHam(int ham) {
        this.ham = ham;
    }

    String getSize() {
        return size;
    }

    int getCheese() {
        return cheese;
    }

    int getPeppperoni() {
        return pepperoni;
    }

    int getHam() {
        return ham;
    }

    public double calcCost() {
        if (size.equalsIgnoreCase("small")) {
            return (10 + (getCheese() * 2) + (getHam() * 2) + (getPeppperoni() * 2));
        } else if (size.equalsIgnoreCase("medium")) {
            return (12 + (getCheese() * 2) + (getHam() * 2) + (getPeppperoni() * 2));
        } else
            return (14 + (getCheese() * 2) + (getHam() * 2) + (getPeppperoni() * 2));

    }

    public String getDescription() {
        String description = "Size: " + getSize() + "\nCheese: " + getCheese() + "\nPepperoni: " + getPeppperoni()
                + "\nHam: " + getHam();
        return description;
    }

    
}



public class Task4 {
    public static void main(String[] args) {
        Pizza wattooPizza = new Pizza("medium", 2, 5, 9);
        Pizza ddpizza = new Pizza("small", 5, 3, 6);
        Pizza icyPizza = new Pizza("large", 1, 1, 2);
        System.out.println(icyPizza.calcCost());


    }
}
