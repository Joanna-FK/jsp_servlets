package serwer.app.model;

public class ProductDetails {
    private String name;
    private double price;
    private int id;

    public ProductDetails(String name, double price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
