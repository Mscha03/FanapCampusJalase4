package tamrin3;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Don't Overthink", "Anne Bougel", 1100, 2021);
        Ebook ebook = new Ebook("How to programing Java", "Paul Deitel", 1000, 2014, 350, 850000);

        book.displayInfo();
        ebook.displayInfo();
    }
}
