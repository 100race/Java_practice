package com.encore.parent;

public class Book {
	private String ibsn;
	private String title;
	private String author;
	private String publisher;
	private double price; //
	private String desc;
	
	public Book(String ibsn, String title, String author, String publisher, double price, String desc) {
		super();
		this.ibsn = ibsn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.desc = desc;
	}

	public String getIbsn() {
		return ibsn;
	}

	public void setIbsn(String ibsn) {
		this.ibsn = ibsn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Book [ibsn=" + ibsn + ", title=" + title + ", author=" + author + ", publisher=" + publisher
				+ ", price=" + price + ", desc=" + desc + "]";
	}
	
	
	
	
	
}
