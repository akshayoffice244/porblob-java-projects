package com.bookstore.model;

public class Book {
	private int id;
	private String book_name;
	private double book_mrp;
	private int book_quantity;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public double getBook_mrp() {
		return book_mrp;
	}
	public void setBook_mrp(double book_mrp) {
		this.book_mrp = book_mrp;
	}
	public int getBook_quantity() {
		return book_quantity;
	}
	public void setBook_quantity(int book_quantity) {
		this.book_quantity = book_quantity;
	}
	
	
	

}
