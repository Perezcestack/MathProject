package Week5;

public class BookMain {
    public static void main(String[] args) {
    Book greenEggsAndHam = new Book("green eggs and ham","Dr. Suess", 25.99,123456789);
        System.out.println(greenEggsAndHam.details() + " " + "The price for you is " + greenEggsAndHam.discount());
    }
}
