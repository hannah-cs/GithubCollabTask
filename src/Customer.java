import java.util.Scanner;
public class Customer {
    public Customer(int cart, String name) {
        this.cart = 0;
        this.name = name;
    }

    private static int cart;


    public String getName() {
        return name;
    }

    private String name;

    public static void addToCart(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the item you'd like to purchase");
        String itemName = sc.next();
        System.out.println("Please enter the amount");
        int quantity = sc.nextInt();
        cart += quantity;
        System.out.println(quantity + " " + itemName + "(s) added to your cart.");

    }
    public void checkout() {
        System.out.println("Checkout for " + getName() + ":");
        System.out.println("You ordered " + cart + " item(s).");
        System.out.println("Thank you for shopping with us!");
    }




}
