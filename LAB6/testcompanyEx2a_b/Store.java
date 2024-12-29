package testcompany;
public class Store {
    
    private String name;
    private String location;
    private Product[] productList; // Array to hold products
    private int nbProduct; // Number of products in the store

    // Constructor
    public Store(String name, String location) {
        this.name = name;
        this.location = location;
        this.productList = new Product[100]; // Maximum 100 products
        this.nbProduct = 0;
    }

    // Method to add a product
    public void addProduct(Product p) {
        if (nbProduct < 100) {
            productList[nbProduct] = p;
            nbProduct++;
        } else {
            System.out.println("Cannot add more products, maximum limit reached.");
        }
    }

    // Method to search for a product
    public boolean searchProduct(String productName) {
        for (int i = 0; i < nbProduct; i++) {
            if (productList[i].getName().equalsIgnoreCase(productName)) {
                return true; // Product found
            }
        }
        return false; // Product not found
    }

    // Method to delete a product
    public Product deleteProduct(String productName) {
        for (int i = 0; i < nbProduct; i++) {
            if (productList[i].getName().equalsIgnoreCase(productName)) {
                Product deletedProduct = productList[i];
                // Shift the products left to fill the gap
                for (int j = i; j < nbProduct - 1; j++) {
                    productList[j] = productList[j + 1];
                }
                productList[nbProduct - 1] = null; // Clear the last position
                nbProduct--;
                return deletedProduct; // Return the deleted product
            }
        }
        return null; // Product not found
    }

    // Method to display all products
    public void displayAll() {
        System.out.println("Products in " + name + ":");
        for (int i = 0; i < nbProduct; i++) {
            System.out.println(productList[i].getName());
        }
    }

    // Getter for Store name
    public String getName() {
        return name;
    }
}
