import java.util.Scanner;

public class Book {
    Scanner myScanner = new Scanner(System.in);

    String name;
    Author author;
    double price;
    int qty;
    public Book(String bname, Author author1, double price1, int qty1){
        name = bname;
        author = author1;
        price = price1;
        qty = qty1;
    }

    public void Print(){
        //Book Book1 = new Book("Shrimp on adventures",author,20.99, 50  );
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString(){
        return "";
    }
}
