public class Order {
    private int orderId;
    private String products;
    private double totalPrice ;

    public Order(int orderId, String products, double totalPrice){
        super();
        this.orderId = orderId;
        this.products = products;
        this.totalPrice = totalPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double  generateInvoice(){
        // System.out.println("The order Id  is : " + orderId  , "Name of the Product : " + products , "The total price is : " +totalPrice );
        return 0;
    }
}

