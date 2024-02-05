package tamrin2;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Don't Overthink", "Anne Bougel", 1100, 2021);
        Book book2 = new Book("How to programing Java", "Paul Deitel", 1000, 2014);


        System.out.println("Book.saleCount = " + Book.saleCount);
        System.out.println("book1.saleCount = " + book1.saleCount);
        System.out.println("book2.saleCount = " + book2.saleCount);

        Book.addOneToSaleCount();

        System.out.println("book1.saleCount = " + book1.saleCount);
        System.out.println("book2.saleCount = " + book2.saleCount);


    }
}
