

public class Customer<T> {
    //TODO Add attribute productsInBasket
    private String name;
    private double money;

    private Stack<T> productsInBasket;

    public Customer(String name, double money) {
        this.money=money;
        this.name= name;
        if(money < 0 ||name==null) {
            throw new IllegalArgumentException();}
        //TODO initialize attributes, throw exceptions
    }

    public Stack getProductsInBasket() {
        return productsInBasket;
    }

    public void setProductsInBasket(Stack productsInBasket) {
        this.productsInBasket = productsInBasket;
    }

    public boolean hasMoney(){
        return money > 0;
    }

    public void addProductToBasket( Product product){

    }

    public void placeAllProductsOnBand( Queue<Product> band){

    }

    public void takeAllProductsFromBand(Queue<Product> band){

    }

    public void pay(double amount){
        if(amount < 0 || money < amount) {
            throw new UnsupportedOperationException();
        }
        money-=amount;
    }

    public void goToCheckout(TUMSupermarket supermarket){

    }

    public String getName() {
        return name;
    }


    public double getMoney() {
        return money;
    }



    //TODO implement methods

    // TODO uncomment this method after you implemented all attributes
    /*
    @Override
    public String toString() {
        return "Customer: " + name + ", money: " + money + "\n" + productsInBasket;
    }
     */
}
