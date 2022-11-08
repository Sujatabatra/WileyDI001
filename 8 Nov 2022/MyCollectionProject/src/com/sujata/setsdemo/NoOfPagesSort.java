package com.sujata.setsdemo;

import java.util.Comparator;

public class NoOfPagesSort implements Comparator<MyBook> {

	@Override
	public int compare(MyBook book1, MyBook book2) {
		
		if(book1.getNoOfPages()>book2.getNoOfPages())
			return 1;
		else if(book1.getNoOfPages()<book2.getNoOfPages())
			return -1;
		else if(book1.equals(book2))
			return 0;
			
		return 1;
	}

}
