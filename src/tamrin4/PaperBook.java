package tamrin4;

public class PaperBook extends Book{
    int numberOfPages;
    int price;

    public PaperBook(String title, String author, int press, int releaseDate, int numberOfPage, int price) {
        super(title, author, press, releaseDate);
        this.numberOfPages = numberOfPage;
        this.price = price;
    }

    @Override
    public void displayInfo() {
        System.out.println("title: " + title);
        System.out.println("author: " + author);
        System.out.println("number of pages: " + numberOfPages);
        System.out.println("model of " + title + ":" + "PaperBack");
        System.out.print("\n");
    }
}
