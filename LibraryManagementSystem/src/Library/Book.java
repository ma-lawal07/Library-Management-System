package Library;

import java.util.ArrayList;

public class Book {
	
	private String name; //title
	private String author; //author
	private String publisher; //publisher
	private String adress; // Collection for sale
	private String status; // Borrowing status
	private String qty; //  Copies for sale
	private double price; //Price
	private int brwcopies; //Copies for borrowing
	
	public Book( ) {};
	
	public Book(String name, String author, String publisher, String status, String qty, double price, int brwcopies) {
		super();
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.status = status;
		this.qty = qty;
		this.price = price;
		this.brwcopies = brwcopies;
	}

	public String toString() {
	String text = "Book Name: " + name + "Book Author: " + author 
			+ "Book publisher" + publisher + "Book collection address" + adress
			+ "qty: " + String.valueOf(qty) + "Price: " + String.valueOf(price) 
			+ "Borrowing Copies: " + String.valueOf(brwcopies);
	return text;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getQty() {
		return qty;
	}

	public void setQty(String qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getBrwcopies() {
		return brwcopies;
	}

	public void setBrwcopies(int brwcopies) {
		this.brwcopies = brwcopies;
	}
	
	

}
