package Week5;

public class Book {
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getiSBN() {
        return iSBN;
    }

    public void setiSBN(int iSBN) {
        this.iSBN = iSBN;
    }
    public Book(String title, String author, double price, int iSBN) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.iSBN = iSBN;
    }


    private String title;
    private String author;
    private double price;
    private int iSBN;

    public String details() {
    return title + " is the title, " + author + " is the author, " + price + " is the price, " + iSBN + " is the ISBN";
    }

    public double discount(){
        price = price * .90;
        price = Math.floor(price * 100)/100;
    return price;}

}
