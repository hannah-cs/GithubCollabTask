public class Store {


        private List<Product> products;
        private List<Order> orders;

        public Store() {
            this.products = new ArrayList<>();
            this.orders = new ArrayList<>();
        }

        public void addProduct(Product product) {
            this.products.add(product);
        }

        public void processOrder(Order order) {
            this.orders.add(order);
        }

        public List<Product> getProducts() {
            return this.products;
        }

        public List<Order> getOrders() {
            return this.orders;
        }
    }


