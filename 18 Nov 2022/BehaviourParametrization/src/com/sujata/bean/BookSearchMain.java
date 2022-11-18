package com.sujata.bean;

public class BookSearchMain {

	public static void main(String[] args) {
		BookSearch bookSearch = new BookSearch();

		System.out.println("All Books");
		System.out.println(bookSearch.getBookList());

		System.out.println("===========================");
		System.out.println("Books Written By Author A");
		System.out.println(bookSearch.searchBook(new AuthorABookPredicate()));

		System.out.println("===========================");
		System.out.println("List of Thick Books");
		System.out.println(bookSearch.searchBook(new ThickBookPredicate()));

		System.out.println("============================");
		System.out.println("Expensive Book for Sujata");
//		System.out.println(bookSearch.searchBook(new BookPredicate() {
//			
//			@Override
//			public boolean test(Book book) {
//				return book.getPrice()>2500;
//			}
//		}));

		System.out.println(bookSearch.searchBook(book-> book.getPrice() > 2500));

		System.out.println("============================");
		System.out.println("Expensive Book for Ihe");
		System.out.println(bookSearch.searchBook(new BookPredicate() {

			@Override
			public boolean test(Book book) {
				return book.getPrice() > 5500;
			}
		}));

	}

}
