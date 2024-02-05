package Book;

public abstract class  Book {
    String title;
    String author;
    String press;
    int releaseDate;

    static int saleCount;

    static {
        saleCount = 0;
    }


    public static void printSaleCount() {
        System.out.println(saleCount);
    }

    public static void addOne(){
        saleCount++;
    }

    public Book(){
        this.title = "no title";
        this.author = "no author";
        this.press = "no press";
        this.releaseDate= 0;
    }

    public Book(String title, String author, String press, int releaseDate){
        this.title = title;
        this.author = author;
        this.press = press;
        this.releaseDate= releaseDate;
    }


    public abstract void displayinfo();
//    {
//        System.out.println(title);
//        System.out.println(author);
//        System.out.println(press);
//        System.out.println(releaseDate);
//    }
}
