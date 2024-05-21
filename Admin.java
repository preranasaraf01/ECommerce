package e_commerce;

public class Admin extends User{

	public Admin(int userId, String userName, String password, String email) {
		super(userId, userName, password, email);
		
	}
	
	@Override
	public void viewProfile() {
		   System.out.println("Admin Profile - Username: " + getUserName() + ", Email: " + getEmail());
	}

	public void updateProfile(String newUsername, String newPassword, String newEmail) {
        System.out.println("Updating profile for " +getUserName());
        System.out.println("Profile updated.");
    }

    public void addProduct(Product product) {
        System.out.println("Product " + product.getProductName() + " added.");
    }

    public void removeProduct(Product product) {
        System.out.println("Product " + product.getProductName() + " removed.");
    }

    public void updateProduct(Product product) {
        System.out.println("Product " + product.getProductName() + " updated.");
    }

	

}



