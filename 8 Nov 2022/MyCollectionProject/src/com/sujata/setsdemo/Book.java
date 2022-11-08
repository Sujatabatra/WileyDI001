package com.sujata.setsdemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Book implements Comparable<Book> {

	private int bookId;
	private String bookName;
	private String authorName;
	private int noOfPages;
	private int price;
	/*
	 * TreeSet will be using compareTo to arrange objects in ascending order and will store unique
	 * if object1 (this) is greater return :1
	 * if object2(argument) is greater return : -1
	 * if both objects are equal : 0
	 */
	@Override
	public int compareTo(Book book2) {
		if(price>book2.price)
			return 1;
		else if(price<book2.price)
			return -1;
		else if(this.equals(book2))
			return 0;
		return 0;
	}
}
