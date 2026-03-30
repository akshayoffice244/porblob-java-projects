package com.bookstore.service;

import com.bookstore.model.Book;

public interface BookDao {
	void add(Book book);

	void delete(int id);

	void update(Book book);

	void removeAll();
	
	boolean doesBookExist(int id);
	
	void displayAll();
	
	Book search(int id);

}
