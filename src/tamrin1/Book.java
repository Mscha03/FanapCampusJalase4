package tamrin1;

public class Book {

    // information of Book
    String title;
    String author;
    int press;
    int releaseDate;


    //constructor with no parameter
    public Book(){
        this.title = "no title";
        this.author = "no author";
        this.press = 0;
        this.releaseDate = 0;
    }

    //constructor with parameters
    public Book(String title, String author, int press, int releaseDate){
        this.title = title;
        this.author = author;
        this.press = press;
        this.releaseDate = releaseDate;
    }


    // show Information of Book
    public  void displayInfo()
    {
        System.out.println("title: " + title);
        System.out.println("author of " + title + ":" + author);
        System.out.println("press of " + title + ":" + press);
        System.out.println("releaseDate of " + title + ":" + releaseDate);
        System.out.print("\n");
    }
}
