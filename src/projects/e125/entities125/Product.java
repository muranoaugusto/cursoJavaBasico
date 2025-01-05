package projects.e125.entities125;

public class Product {
    
private String name;
private double price;

//#################################################

    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

//#################################################

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getprice() {
        return this.price;
    }

    public void setprice(double price) {
        this.price = price;
    }


}
