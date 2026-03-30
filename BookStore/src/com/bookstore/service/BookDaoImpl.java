package com.bookstore.service;

import java.util.HashMap;

import com.bookstore.model.Book;

public class BookDaoImpl implements BookDao{
	HashMap<Integer, Book> book_list = new HashMap<>();

	@Override
	public void add(Book book) {
		if(!book_list.containsKey(book.getId())) {
			book_list.put(book.getId(), book);
			System.out.println("Book added successfully!");
			printSeparation();
		}else {
			System.out.println("Book already exists in the record!");
			printSeparation();
		}
		
	}

	@Override
	public void delete(int id) {
		Book book = book_list.remove(id);
		if(book != null) {
			System.out.println("Record deleted successfully!");
			printSeparation();
		}else {
			System.out.println("Doesn't exist!");
			printSeparation();
		}
				
		
	}

	@Override
	public void update(Book book) {
		Book newBook = book_list.get(book.getId());
		if(newBook != null) {
			book_list.put(book.getId(), book);
			System.out.println("Record updated successfully!");
			printSeparation();
		}else {
			System.out.println("Record doesn't exist!");
			printSeparation();
		}
		
		
	}

	@Override
	public void removeAll() {
		book_list.clear();
		System.out.println("Successfully removed all records!");
		printSeparation();
		
	}

	@Override
	public boolean doesBookExist(int id) {
		
		return book_list.containsKey(id);
		
	}

	@Override
	public void displayAll() {
		for(Book book : book_list.values()) {
			System.out.println("------------------");
			System.out.println("Book Id: " + book.getId());
			System.out.println("Book name: " + book.getBook_name());
			System.out.println("Book MRP: " + book.getBook_mrp());
			System.out.println("Book quantity: " + book.getBook_quantity());
			System.out.println("------------------");
			
		}
		
	}

	@Override
	public Book search(int id) {
		Book book  = book_list.get(id);
		return book;
	}
   private void printSeparation() {
	   System.out.println("------------------------------");
		System.out.println();
   }
}
