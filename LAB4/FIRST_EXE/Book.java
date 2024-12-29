package book;

public class Book {
    String title, author;
    double price;
    Book(String title, String author, double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public void display(){
        System.out.println("__________BOOK'S DETAILS__________");
        System.out.println("Book's title: "+title);
        System.out.println("Book's author: "+author);
        System.out.println("Book's price: "+price);
    }
    
}