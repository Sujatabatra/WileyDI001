package com.sujata.setsdemo;

import java.util.Comparator;

public class AuthorNameSort implements Comparator<MyBook> {

	@Override
	public int compare(MyBook book1, MyBook book2) {
		
		return book1.getAuthorName().compareTo(book2.getAuthorName());
	}

}
