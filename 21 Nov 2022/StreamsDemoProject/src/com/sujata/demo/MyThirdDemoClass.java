package com.sujata.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class MyThirdDemoClass {

	public static void main(String[] args) {
		List<Book> bookList = new ArrayList();

		bookList.add(new Book(1, "Book 1", "Author A", 1200, 5000));
		bookList.add(new Book(2, "Book 2", "Author M", 2100, 2000));
		bookList.add(new Book(3, "Book 3", "Author A", 3000, 6000));
		bookList.add(new Book(4, "Book 4", "Author D", 800, 2800));
		bookList.add(new Book(5, "Book 5", "Author M", 7200, 1100));
		bookList.add(new Book(6, "Book 6", "Author A", 8200, 4300));
		bookList.add(new Book(7, "Book 7", "Author A", 7900, 5600));

		long count1=bookList.stream()
		.filter((book)->book.getAuthorName().equals("Author A"))
		.count();
		
		System.out.println("Total No of books written by Author A : "+count1);
		
		List<Book> newList=bookList.stream()
		.filter((book)->book.getAuthorName().equals("Author A"))
		.collect(Collectors.toList());
		
		System.out.println(newList);
	}

}
