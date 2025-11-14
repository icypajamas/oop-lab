import java.util.Scanner;

class Publication {
    String title;
    double price;

    public Publication() {
        title = "";
        price = 0.0;
    }

    public Publication(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public void display() {
        System.out.printf("Title: %s\nPrice: %.2f$\n", title, price);
    }
}

class Book extends Publication {
    int pages;

    public Book() {
        super();
        pages = 0;
    }

    public Book(String title, double price, int pages) {
        super(title, price);
        this.pages = pages;

    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void display() {
        System.out.println("----Book Details----");
        super.display();
        System.out.println("Pages: " + pages);
    }
}

class Tape extends Publication {
    int playTime;

    public Tape() {
        super();
        playTime = 0;
    }

    public Tape(String title, double price, int playTime) {
        super(title, price);
        this.playTime = playTime;
    }

    public void setPlayTime(int playTime) {
        this.playTime = playTime;
    }

    public int getPlaytime() {
        return playTime;
    }

    public void display() {
        System.out.println("----Tape Details----");
        super.display();
        System.out.println("Playtime: " + playTime + " minutes");
    }
}

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Book book1 = new Book();
        Tape tape1 = new Tape();

        System.out.print("Enter Title of book: ");
        String bookTitle = scan.nextLine();
        System.out.print("Enter Price of book: ");
        double bookPrice = scan.nextDouble();
        System.out.print("Enter number of Pages of book: ");
        int bookPages = scan.nextInt();
        book1.setTitle(bookTitle);
        book1.setPrice(bookPrice);
        book1.setPages(bookPages);

        scan.nextLine();
        
        System.out.print("Enter Title of Tape: ");
        String tapeTitle = scan.nextLine();
        System.out.print("Enter Price of Tape: ");
        double tapePrice = scan.nextDouble();
        System.out.print("Enter playtime of Tape (in minutes): ");
        int tapePlaytime = scan.nextInt();
        tape1.setTitle(tapeTitle);
        tape1.setPrice(tapePrice);
        tape1.setPlayTime(tapePlaytime);

        book1.display();
        tape1.display();
    }
}
