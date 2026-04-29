package entities;

public class Product {

    private String name;
    private int quantity;
    private double price;

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String toString() {
        return String.format("Produto: %s\nQuantidade: %d\nPreço: %.2f\n", name, quantity, price);
    }
}
