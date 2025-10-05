class Book {
    private String author;
    private String[] chapterNames;

    public Book() {
        author = null;
        chapterNames = new String[100];
    }

    public Book(String author, String[] chapterNames) {
        this.author = author;
        this.chapterNames = chapterNames;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setChapterNames(String[] chapterNames) {
        this.chapterNames = chapterNames;
    }

    public boolean compareBooks(Book a) {
        if (this.author == null || a.author == null) {
            return false;
        }
        return this.author.equals(a.author);
    }

    public void displayChapters() {
        for (int i = 0; i < chapterNames.length; i++) {
            System.out.println(chapterNames[i]);
        }
    }

    public void displayAuthor() {
        System.out.println("Author: " + this.author);
    }

    public Book compareChapterNames(Book a) {
        int chapterCount1 = 0;
        int chapterCount2 = 0;
        for (int i = 0; i < this.chapterNames.length; i++) {
            if (this.chapterNames[i] != null) {
                chapterCount1++;
            } else {
                continue;
            }
        }
        for (int i = 0; i < a.chapterNames.length; i++) {
            if (a.chapterNames[i] != null) {
                chapterCount2++;
            } else {
                continue;
            }
        }
        if (chapterCount1 > chapterCount2) {
            return this;
        } else {
            return a;
        }
    }

}

public class Task2 {
    public static void main(String[] args) {
        Book book1 = new Book();
        String[] chapterNames1 = { "Chapter 1", "Chapter 2", "Chapter 3" };
        book1.setAuthor("Donald Trump");
        book1.setChapterNames(chapterNames1);
        book1.displayChapters();
        String[] chapterNames2 = { "Good", "Bad" };
        Book book2 = new Book("Wattoo", chapterNames2);
        book2.displayChapters();
        System.out.println(book1.compareBooks(book2));
        Book book3 = book1.compareChapterNames(book2);
        book3.displayAuthor();
    }

}
