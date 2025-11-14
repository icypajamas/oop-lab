class Movie {
    String mpaaRating;
    int IDnum;
    String title;
    double lateFee = 2.0;

    public Movie() {
        mpaaRating = "";
        IDnum = 0;
        title = "";
    }

    public Movie(String mpaaRating, int IDnum, String title) {
        this.mpaaRating = mpaaRating;
        this.IDnum = IDnum;
        this.title = title;
    }

    void setMpaaRating(String mpaaRating) {
        this.mpaaRating = mpaaRating;
    }

    void setIDnum(int IDnum) {
        this.IDnum = IDnum;
    }

    void setTitle(String title) {
        this.title = title;
    }

    String getMpaaRating() {
        return mpaaRating;
    }

    int getIDnum() {
        return IDnum;
    }

    String getTitle() {
        return title;
    }

    boolean equals(Movie mov) {
        if (this.IDnum == mov.IDnum) {
            return true;
        } else
            return false;
    }

    double calcLateFees(int days) {
        return (lateFee * days);
    }

    public String toString(){
        return ("MPAA Rating: " + mpaaRating + "\nID Number: " + IDnum + "\nTitle: " + title + "\n");
    }

}

class Action extends Movie {
    double lateFee = 3.0;

    public Action() {
        super();
    }

    public Action(String mpaaRating, int IDnum, String title) {
        super(mpaaRating, IDnum, title);
    }

    double calcLateFees(int days) {
        return (lateFee * days);
    }

    public String toString(){
        return ("MPAA Rating: " + mpaaRating + "\nID Number: " + IDnum + "\nTitle: " + title + "\n");
    }

}

class Comedy extends Movie {
    double lateFee = 2.50;

    public Comedy() {
        super();
    }

    public Comedy(String mpaaRating, int IDnum, String title) {
        super(mpaaRating, IDnum, title);
    }

    double calcLateFees(int days) {
        return (lateFee * days);
    }

    public String toString(){
        return ("MPAA Rating: " + mpaaRating + "\nID Number: " + IDnum + "\nTitle: " + title + "\n");
    }

}

class Drama extends Movie {
    double lateFee = 2.0;

    public Drama() {
        super();
    }

    public Drama(String mpaaRating, int IDnum, String title) {
        super(mpaaRating, IDnum, title);
    }

    double calcLateFees(int days) {
        return (lateFee * days);
    }

    public String toString(){
        return ("MPAA Rating: " + mpaaRating + "\nID Number: " + IDnum + "\nTitle: " + title + "\n");
    }

}

public class Task1 {
    public static void main(String[] args) {
        Action a1 = new Action("Rated R", 1, "Generic Action Movie");
        System.out.println(a1.calcLateFees(4));
        Comedy c1 = new Comedy("Rated PG-13", 2, "Generic Comedy Movie");
        System.out.println(c1.calcLateFees(3));
        Drama d1 = new Drama("Rated M", 3, "Generic Drama Movie");
        System.out.println(d1.calcLateFees(5));
        System.out.println(a1.equals(d1));
        System.out.println(d1);
    }
}