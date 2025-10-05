class HotDogStand {
    private int id;
    private int sale;

    public HotDogStand() {
        id = 0;
        sale = 0;
    }

    public HotDogStand(int id, int sale) {
        this.id = id;
        this.sale = sale;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public void justSold() {
        sale += 1;
    }

    public int getSale() {
        return sale;
    }

}

public class Task4 {
    public static void main(String[] args) {
        HotDogStand stand1 = new HotDogStand();
        HotDogStand stand2 = new HotDogStand(1,10);
        HotDogStand stand3 = new HotDogStand(2,15);
        stand1.justSold();
        stand2.justSold();
        stand3.justSold();
        System.out.println(stand1.getSale());
        System.out.println(stand2.getSale());
        System.out.println(stand3.getSale());

    }
}
