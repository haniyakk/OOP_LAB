package librarytask;

public class LibraryTask {
    public static void main(String[] args) {
        Library library = new Library("City Library", 3);

        LibraryBranch branch1 = new LibraryBranch("Downtown", 5);
        LibraryBranch branch2 = new LibraryBranch("Uptown", 5);
        library.addBranch(branch1);
        library.addBranch(branch2);
        Book book1 = new Book("1984", "George Orwell", "9780451524935");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
        branch1.addBook(book1);
        branch1.addBook(book2);
        branch2.addBook(book3);

        library.displayAllBranches();

        branch1.removeBook("9780451524935");

        library.displayAllBranches();

    }
    
}
