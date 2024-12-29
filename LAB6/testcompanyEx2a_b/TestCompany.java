package testcompany;
public class TestCompany {

    public static void main(String[] args) {
    
        Store s1 = new Store("Makro", "Karachi");
        Store s2 = new Store("Hypermart", "Karachi");

        // Sample Products
        Product p1 = new Product("Bicycle", 10, 150.00);
        Product p2 = new Product("TV", 5, 500.00);
        Product p3 = new Product("Refrigerator", 3, 300.00);

        s1.addProduct(p1);
        s1.addProduct(p2);
        s1.addProduct(p3);
        s1.displayAll();

        Product tempProduct = s1.deleteProduct("Bicycle");
        if (tempProduct != null)
            System.out.println("Product " + tempProduct.getName() + " is deleted");
        else
            System.out.println("There is no product to delete");
        s1.displayAll();
        s2.addProduct(p1);
        s2.addProduct(p2);
        s2.addProduct(p3);
        s2.displayAll();

        Company c1 = new Company("Unilever");
        c1.addStore(s1);
        c1.addStore(s2);
        c1.displayAll();

        int n = c1.searchNbofStore("TV");
        System.out.println("Number of stores have TV: " + n);
   
 }
    
}
