public class Product {
    String name;
    double price;
    int stock;

    public void getDetails(){
        System.out.println("Product name: "+this.name+". Price €"+this.price+". Current stock: "+this.stock);
    }
    public void updateStock(int newStock){
        this.stock=newStock;
    }

    public Product(String name, double price, int stock){
        this.name=name;
        this.price=price;
        this.stock=stock;
    }
}
