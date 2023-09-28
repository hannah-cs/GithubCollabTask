public class Main {
    public static void main(String[] args) {
        Product bread = new Product("Bread", 2.00, 2);
        Product rice = new Product ("Rice", 1.50, 7);
        Product chocolate = new Product ("Chocolate", 1.00, 3);
        Customer abi = new Customer(2, chocolate);
        Customer valentina = new Customer(1, bread);
        Customer hannah = new Customer(2, rice);
        valentina.addToCart();
    }
}