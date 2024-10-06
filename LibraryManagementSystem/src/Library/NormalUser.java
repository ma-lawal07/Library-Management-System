package Library;

public class NormalUser extends User{
	
	public NormalUser(String name) {
		super(name);
	}
	
	public NormalUser (String name, String email, String phonenumber) {
		super(name, email, phonenumber);
	}
	
	@Override
	public void menu() {
		System.out.println("1. View books");
		System.out.println("2. Searh");
		System.out.println("3. Place Order");
		System.out.println("4. Burrow book");
		System.out.println("5. Calculate fine");
		System.out.println("6. Return books");
		System.out.println("7. Exit");
	}

}
