package com.encore.child;

import com.encore.parent.Book;

public class Magazine extends Book {
	int year;
	int month;
	
	public Magazine(String ibsn, String title, String author, String publisher, double price, String desc, int year,
			int month) {
		super(ibsn, title, author, publisher, price, desc);
		this.year = year;
		this.month = month;
	}

	@Override
	public String toString() {
		return super.toString()+"Magazine [year=" + year + ", month=" + month + "]";
	}
	
}
