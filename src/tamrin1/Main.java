package tamrin1;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book(
                "How to programing Java", "Paul Deitel", 1000, 2014);

        book1.displayInfo();
        System.out.print("\n");
        book2.displayInfo();
    }
}
