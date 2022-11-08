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
	 * compareto() method will be used internally by add() method of TreeSet class: to store your object in binary search tree
	 */
	@Override
	public int compareTo(Book book2) {
		//object1 price is greater return 1 : store object2 in left subtree and object1 in right subtree
		if(price>book2.price) 
			return 1;
		//object2 price is greater return -1 : store object1 in right subtree and object 2 in left subtree
		else if(price<book2.price)
			return -1;
		//if two objects are equal return 0 : objects are duplicate , don't store it
		else if(this.equals(book2))
			return 0;
		//prices of both objects are same but objects are not same : store object2 in left subtree and object1 in right subtree
		return 1;
	}
}
