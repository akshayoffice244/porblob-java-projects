package com.bookstore.main;

import java.util.Scanner;

import com.bookstore.model.Book;
import com.bookstore.service.BookDao;
import com.bookstore.service.BookDaoImpl;

public class Main {

	public static void main(String[] args) {
		BookDao book_dao = new BookDaoImpl();
		Scanner sc;
		int exit = 1;
		while (exit == 1) {

			sc = new Scanner(System.in);

			System.out.println("Please enter following choice:");
			System.out.println("1. Add a book");
			System.out.println("2  Update a book record");
			System.out.println("3  Show all records");
			System.out.println("4. Delete a book record");
			System.out.println("5. Delete all book records.");
			System.out.println("6. Exit");
			if (sc.hasNextInt()) {
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					addBook(book_dao);
					break;
				case 2:
					updateBookRecord(book_dao);
					break;
				case 3:
					showAllRecords(book_dao);
					break;
				case 4:
					deleteABookRecord(book_dao);
					break;
				case 5:
					book_dao.removeAll();
					break;
				case 6:
					exit = 6;
					break;
				default:
					System.out.println("Enter a valid choice!");

				}
			}
		}

	}

	static void addBook(BookDao bookDao) {
		try {

			Scanner sc = new Scanner(System.in);
			Book book = new Book();
			System.out.println("Enter book id: ");
			book.setId(sc.nextInt());
			System.out.println("Enter book name: ");
			sc.nextLine();
			book.setBook_name(sc.nextLine());

			System.out.println("Enter book MRP: ");
			book.setBook_mrp(sc.nextDouble());
			System.out.println("Enter book quantity: ");
			book.setBook_quantity(sc.nextInt());

			bookDao.add(book);

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	static void updateBookRecord(BookDao bookDao) {
		try {

			Scanner sc = new Scanner(System.in);
			Book book = new Book();
			System.out.println("Enter book id: ");
			book.setId(sc.nextInt());

			if (bookDao.doesBookExist(book.getId())) {

				System.out.println("Enter following choice");
				System.out.println("1.Update book name");
				System.out.println("2. Update book MRP");
				System.out.println("3.Update book quantity");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter book name: ");
					book.setBook_name(sc.nextLine());
					break;
				case 2:
					System.out.println("Enter book MRP: ");
					book.setBook_mrp(sc.nextDouble());
					break;
				case 3:
					System.out.println("Enter book quantity: ");
					book.setBook_quantity(sc.nextInt());
					break;
				default:
					System.out.println("Please enter a valid choice!");

				}

			} else {
				System.out.println("Book record doesn't exist!");
			}

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

	static void deleteABookRecord(BookDao bookDao) {
		try {

			System.out.println("Enter book ID: ");
			Scanner sc = new Scanner(System.in);
			int id = sc.nextInt();
			bookDao.delete(id);

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

	static void showAllRecords(BookDao bookDao) {
		try {
			bookDao.displayAll();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
