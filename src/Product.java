class Product<T> {

    private String name;
    private double price;

    public Product (String name, double price) {
        //TODO throw an exception

        this.name = name;
        this.price = price;
        if ((name.equals("null") || name == null  )|| price <= 0  )throw new IllegalArgumentException();

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

