package tamrin4;

public class Ebook extends Book {

    // add new fields
    int duration;
    int price;

    // constructor
    public Ebook(String title, String author, int press, int releaseDate, int duration, int price) {
        super(title, author, press, releaseDate);
        this.duration = duration;
        this.price = price;
    }

    
    @Override
    public void displayInfo() {
        System.out.println("title: " + title);
        System.out.println("author: " + author);
        System.out.println("duration: " + duration);
        System.out.println("model of " + title + ": " + "Digital");
        System.out.print("\n");
    }

}
