package testcompany;
public class Company {
 private String name;
    private Store[] arrayStore; // Array to hold stores
    private int nbStore; // Number of stores in the company

    // Constructor
    public Company(String name) {
        this.name = name;
        this.arrayStore = new Store[10]; // Maximum 10 stores
        this.nbStore = 0;
    }

    // Method to add a store
    public void addStore(Store store) {
        if (nbStore < 10) {
            arrayStore[nbStore] = store;
            nbStore++;
        } else {
            System.out.println("Cannot add more stores, maximum limit reached.");
        }
    }

    // Method to search number of stores containing a product
    public int searchNbofStore(String productName) {
        int count = 0;
        for (int i = 0; i < nbStore; i++) {
            if (arrayStore[i].searchProduct(productName)) {
                count++;
            }
        }
        return count; // Return number of stores containing the product
    }

    // Method to display all stores
    public void displayAll() {
        System.out.println("Stores in " + name + ":");
        for (int i = 0; i < nbStore; i++) {
            System.out.println(arrayStore[i].getName());
        }
    }
}
