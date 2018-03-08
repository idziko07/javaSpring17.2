package pl.presentation.product;

public class Product {
    private String name;
    private double price;
    private Category category;

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        category = category.toUpperCase();
        this.category = Category.valueOf(category);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return this.category.name();
    }

    @Override
    public String toString() {
        return name + " " + price + " " + category.name().toLowerCase();
    }
}
