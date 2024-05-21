package e_commerce;

public class Main {
public static void main(String[] args) {
	
    Login login = new Login();

    
    Customer customer1 = new Customer(1, "Prerana", "password123", "prerana@example.com");
    Admin admin1 = new Admin(2, "admin", "adminpass", "admin@example.com");

    
    login.register(customer1);
    login.register(admin1);

   
    Product product1 = new Product(1, "Laptop", 1000.0, 10, "Electronics");
    Product product2 = new Product(2, "Mobile", 500.0, 20, "Electronics");

    login.login("admin", "adminpass");
    if (login.isAdmin()) {
        Admin admin = (Admin) login.getLoggedInUser();
        admin.addProduct(product1);
        admin.addProduct(product2);
        admin.updateProduct(product1);
    }
    login.logout();

    
    login.login("Prerana", "password123");
    if (login.isCustomer()) {
        Customer customer = (Customer) login.getLoggedInUser();
        customer.viewProfile();
        customer.addToCart(product1);
        customer.addToCart(product2);
        customer.checkout();

       
        Product[] orderedProducts = { product1, product2 };
        Order order = new Order(1, customer.getUserId(), orderedProducts);
        order.placeOrder();
        order.trackOrder();
        order.cancelOrder();
    }
    login.logout();
}
}
