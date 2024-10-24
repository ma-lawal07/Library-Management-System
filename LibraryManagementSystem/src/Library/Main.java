package Library;

import java.util.Scanner;

public class Main {
    static Scanner s;
    static Database database;
    
    public static void main(String[]args) {
    	
    	 database = new Database();
    	 System.out.println("Welcome to library management system");
    
	int num;
	 do {
		System.out.println("Welcome to library Management System!\n"
				+ "0. Exit\n"
				+ "1.Login\n2. New User");
		s = new Scanner(System.in);
		
		num =s.nextInt();
		
		switch(num) {
		   case 1: login();break;
		   case 2: newuser();break;
		}
	} while(num != 0);
	
    }
    
    
    
    private static void newuser() {
		// TODO Auto-generated method stub
    	System.out.println("Enter your name");
    	String name = s.next();
    	System.out.println("Enter your phonenumber");
    	String phonenumber = s.next();
    	System.out.println("Enter your email");
    	String email = s.next();
    	System.out.println("1.Admin\n2. Normal user");
    	int n2 = s.nextInt();
    	User user; 
    	if (n2==1) {
    		user  = new Admin(name, email, phonenumber);
    	} else {
    		user = new NormalUser(name, email, phonenumber);
    	}
    	database.AddUser(user);
    	user.menu( database, user);
    	System.out.println("User created sucessfully");
	}



	private static void login() {
    	System.out.println("Enter your phonenumber");
    	String phonenumber = s.next();
    	System.out.println("Enter your email");
    	String email = s.next();
    	int n = database.login(phonenumber, email);
    	if( n != -1) {
    		User user = database.getUser(n); 
    		user.menu( database, user);
    		System.out.println("Welcome" + user.getName());
    	} else {
    		System.out.println("User does't exist");
    	}
    }
    
    
}
