
package librarytask;

public class LibraryBranch {
    private String branchName;
    private Book[] books;
    private int bookCount; 
    // Constructor
    public LibraryBranch(String branchName, int capacity) {
        this.branchName = branchName;
        this.books = new Book[capacity]; 
        this.bookCount = 0;
    }
    public String getName(){return branchName;}
    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
            System.out.println("Added book: " + book.getTitle() + " to branch: " + branchName);
        } else {
            System.out.println("No more space to add books in branch: " + branchName);
        }
    }
    public boolean removeBook(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i] != null && books[i].getIsbn().equals(isbn)) {
                // Shift books to the left to fill the gap
                for (int j = i; j < bookCount - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[bookCount - 1] = null; // Clear the last spot
                bookCount--;
                System.out.println("Removed book: " + books[i].getTitle() + " from branch: " + branchName);
                return true; // Book successfully removed
            }
        }
        System.out.println("Book with ISBN: " + isbn + " not found in branch: " + branchName);
        return false; // Book not found
    }
    public void displayAllBooks() {
        System.out.println("Books in branch: " + branchName);
        for (int i = 0; i < bookCount; i++) {
            if (books[i] != null) {
                books[i].displayInfo(); // Display each book's info
            }
        }
    }

}
