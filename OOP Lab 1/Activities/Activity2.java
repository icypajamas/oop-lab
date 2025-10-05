class Date {

    String month;
    int day;
    int year;

    public void displayDate() {
        System.out.println("Month:" + month + " Day:" + day + " year:" + year);
    }
}

public class Activity2 {
    public static void main(String[] args) {
        Date date1 = new Date();
        date1.month = "July";
        date1.day = 29;
        date1.year = 2006;
        System.out.println(date1);
        date1.displayDate();
    }

}
