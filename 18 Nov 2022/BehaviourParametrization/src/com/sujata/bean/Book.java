package com.sujata.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Book {

	private int bookId;
	private String bookName;
	private String authorName;
	private int noOfPages;
	private int price;
	
}
