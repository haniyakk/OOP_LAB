package testcompany;
public class Product {
    private String name;
    private int quality;
    private double price;
    public Product(String name, int quality, double price){this.name=name; 
    this.quality=quality; this.price=price;}
    public String getName(){return name;}
    public int getQuality(){return quality;}
    public double getPrice(){return price;}
}
