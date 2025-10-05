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

    int getPepperoni() {
        return pepperoni;
    }

    int getHam() {
        return ham;
    }

    public double calcCost() {
        if (size.equalsIgnoreCase("small")) {
            return (10 + (getCheese() * 2) + (getHam() * 2) + (getPepperoni() * 2));
        } else if (size.equalsIgnoreCase("medium")) {
            return (12 + (getCheese() * 2) + (getHam() * 2) + (getPepperoni() * 2));
        } else
            return (14 + (getCheese() * 2) + (getHam() * 2) + (getPepperoni() * 2));

    }

    public void displayCost(){
        System.out.println(calcCost() + "$");
    }

    public String getDescription() {
        String description = "Size: " + getSize() + "\nCheese: " + getCheese() + "\nPepperoni: " + getPepperoni()
                + "\nHam: " + getHam();
        return description;
    }

    
}

class PizzaOrder {
    Pizza pizza1;
    Pizza pizza2;
    Pizza pizza3;

    public PizzaOrder(){
        pizza1 = null;
        pizza2 = null;
        pizza3 = null;
    }
    public PizzaOrder(Pizza p1, Pizza p2){
        pizza1 = p1;
        pizza2 = p2;
        
    }
    public PizzaOrder(Pizza p1){
        pizza1 = p1;
    }
    public PizzaOrder(Pizza p1, Pizza p2, Pizza p3){
        pizza1 = p1;
        pizza2 = p2;
        pizza3 = p3;
    }

    public void calcTotal(){
        double total = 0;
        if(pizza1 != null) total += pizza1.calcCost();
        if(pizza2 != null) total += pizza2.calcCost();
        if(pizza3 != null) total += pizza3.calcCost();
        System.out.println("Your total Order is " + total + "$");
    }


}



public class Task4 {
    public static void main(String[] args) {
        Pizza hotPizza = new Pizza("small", 5, 3, 6);
        Pizza icyPizza = new Pizza("large", 1, 1, 2);
        hotPizza.displayCost();
        icyPizza.displayCost();
        PizzaOrder order1 = new PizzaOrder(hotPizza, icyPizza);
        order1.calcTotal();


    }
}
