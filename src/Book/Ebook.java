package Book;

public class Ebook extends Book{

    int duration;

    int price;

    public Ebook(String title, String author,int duration) {
//        super(title,author);
        this.duration = duration;
    }
    @Override
    public void displayinfo() {
        System.out.println("title: " + title);
        System.out.println("autor: " + author);
        System.out.println("duration" + duration);
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

}
