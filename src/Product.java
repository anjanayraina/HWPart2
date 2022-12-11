
class Product<T> {

    private String name;
    private double price;

    public Product (String name, double price) {
        //TODO throw an exception
        if ((name.equals("") || name == null  )|| price <= 0  )throw new IllegalArgumentException();
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return "Product: " + name + " Price: " + price;
    }
}
