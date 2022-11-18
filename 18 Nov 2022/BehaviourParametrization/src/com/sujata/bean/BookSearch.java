package com.sujata.bean;

import java.util.ArrayList;
import java.util.List;

public class BookSearch {

	static private List<Book> bookList=new ArrayList();
	
	static {
		bookList.add(new Book(1, "Book 1", "Author A", 1200, 5000));
		bookList.add(new Book(2, "Book 2", "Author M", 2100, 2000));
		bookList.add(new Book(3, "Book 3", "Author A", 3000, 6000));
		bookList.add(new Book(4, "Book 4", "Author D", 800, 2800));
		bookList.add(new Book(5, "Book 5", "Author M", 7200, 1100));
		bookList.add(new Book(6, "Book 6", "Author A", 8200, 4300));
		bookList.add(new Book(7, "Book 7", "Author A", 7900, 5600));
	}

	public static List<Book> getBookList() {
		return bookList;
	}
	
//	List<Book> getBooksWrittenByAuthorA(){
//		List<Book> searchedBooks=new ArrayList();
//		for(Book book:bookList) {
//			if(book.getAuthorName().equals("Author A"))
//				searchedBooks.add(book);
//		}
//		return searchedBooks;
//	}
//	
//	List<Book> getThickBooks(){
//		List<Book> searchedBooks=new ArrayList();
//		for(Book book:bookList) {
//			if(book.getNoOfPages()>5000)
//				searchedBooks.add(book);
//		}
//		return searchedBooks;
//	}
	
	List<Book> searchBook(BookPredicate bookPredicate){
		List<Book> searchedBooks=new ArrayList();
		for(Book book:bookList) {
			if(bookPredicate.test(book))
				searchedBooks.add(book);
		}
		return searchedBooks;
	}
	
}
