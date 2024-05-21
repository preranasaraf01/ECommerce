package e_commerce;

public abstract class User {
	private int userId;
	private String userName;
	private String password;
	private String email;

	public User(int userId, String userName, String password, String email) {
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.email = email;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if (password != null && password.length() >= 8) {
			this.password = password;
		} else {
			System.out.println("The password is wrong");
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email != null) {
			this.email = email;
		} else {
			System.out.println("Email is wrong");
		}
	}

	public void login() {
		System.out.println(userName + " logged in.");
	}

	public void logout() {
		System.out.println(userName + " logged out.");
	}

	public abstract void viewProfile();

	public abstract void updateProfile(String newUsername, String newPassword, String newEmail);
}
