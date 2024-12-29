package book;

public class BookDemo {
    
    public static void main(String[] args) {
        Book book1 = new Book("DEVELOPING JAVA SOFTWARE","RUSSEL WINDERLAND",79.75);
        
        book1.display();
        
        book1.setAuthor("john karles");
        book1.getAuthor();
        
        book1.setTitle("kidnapped");
        book1.getTitle();
        
        book1.setPrice(99.9);
        book1.getPrice();
        
        book1.display();
        
    }
    
}