package e_commerce;

public class Product {

	private int productId;
	private String productName;
	private double price;
	private int quantity;
	private String category;

	public Product(int productId, String productName, double price, int quantity, String category) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price > 0) {
			this.price = price;
		} else {
			System.out.println("Price not valid");
		}
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if (quantity >= 0) {
			this.quantity = quantity;
		} else {
			System.out.println("Quantity not valid");
		}
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getProductDetails() {
		  return "ID: " + productId + ", Name: " + productName + ", Price: $" + price + ", Quantity: " + quantity + ", Category: " + category;
	}
	
	public void updateQuantity(int newQuantity) {
		setQuantity(newQuantity);
	}
	
	public void updatePrice(double newPrice) {
		setPrice(newPrice);
	}
}





