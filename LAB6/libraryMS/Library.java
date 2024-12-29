package librarytask;
public class Library {
    private String libraryName;
    private LibraryBranch[] branches;
    private int branchCount;

    public Library(String libraryName, int capacity) {
        this.libraryName = libraryName;
        this.branches = new LibraryBranch[capacity]; 
        this.branchCount = 0; 
    }
    public void addBranch(LibraryBranch branch) {
        if (branchCount < branches.length) {
            branches[branchCount] = branch;
            branchCount++;
            System.out.println("Added branch: " + branch.getName() + " to library: " + libraryName);
        } else {
            System.out.println("No more space to add branches in library: " + libraryName);
        }
    }
 public void displayAllBranches() {
        System.out.println("Library: " + libraryName);
        for (int i = 0; i < branchCount; i++) {
            if (branches[i] != null) {
                branches[i].displayAllBooks(); 
            }
        }
    }
}

