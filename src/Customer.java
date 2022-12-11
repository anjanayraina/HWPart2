public class Customer {
    //TODO Add attribute productsInBasket
    private String name;
    private double money;

    public Customer(String name, double money) {
        //TODO initialize attributes, throw exceptions
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }


    //TODO implement methods

    // TODO uncomment this method after you implemented all attributes
    public void adProductToBasket(Product product){

    }

    public boolean hasMoney(){
        return money > 0;
    }

    public void pay(double amount){
        if(amount < 0 || money < amount) {
            throw new UnsupportedOperationException();
        }
        money-=amount;
    }






}
