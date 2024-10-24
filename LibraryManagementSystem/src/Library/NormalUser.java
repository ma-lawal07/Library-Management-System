package Library;

import java.util.Scanner;

public class NormalUser extends User{
	
	public NormalUser(String name) {
		super(name);
		this.operations = new IOOperation[] {
			new ViewBooks(),
			new Search(),
			new PlaceOrder(),
			new BorrowBook(),
			new CalculateFine(),
			new ReturnBook(),
			new Exit()
		};
	}
	
	public NormalUser (String name, String email, String phonenumber) {
		super(name, email, phonenumber);
		this.operations = new IOOperation[] {
				new ViewBooks(),
				new Search(),
				new PlaceOrder(),
				new BorrowBook(),
				new CalculateFine(),
				new ReturnBook(),
				new Exit()
			};
	}
	
	@Override
	public void menu(Database database, User user) {
		System.out.println("1. View books");
		System.out.println("2. Searh");
		System.out.println("3. Place Order");
		System.out.println("4. Burrow book");
		System.out.println("5. Calculate fine");
		System.out.println("6. Return books");
		System.out.println("7. Exit");
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		this.operations[n-1].oper(database, user);
	}

}
