package tamrin4;

public class Main {
    public static void main(String[] args) {
       Ebook ebook = new Ebook("How to programing Java", "Paul Deitel", 1000, 2014, 350, 850000);
       PaperBook paperBook = new PaperBook("Don't Overthink", "Anne Bougel", 1100, 2021, 192, 110000);

       ebook.displayInfo();
       paperBook.displayInfo();
    }
}
