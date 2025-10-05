class Book {
    String bookName;
    String publisher;
    Person p;

    public Book() {
        bookName = "";
        publisher = "";
        p = null;
    }

    public Book(String bookName, String publisher, Person p) {
        this.bookName = bookName;
        this.publisher = publisher;
        this.p = p;
    }

    public Person getAuthor(){
        return p;
    }


}

public class Task2 {
    public static void main(String[] args) {
        Address add1 = new Address("NYC", 24, 21);
        Person per1 = new Person("George Orwell", add1);
        Book book1 = new Book("1984", "Company", per1);
        System.out.println("Before Address Change: ");
        book1.getAuthor().display();
        Address add2 = new Address("Washington", 81, 104);
        book1.getAuthor().setAd(add2);
        System.out.println("After Address Change: ");
        book1.getAuthor().display();
    }
}
