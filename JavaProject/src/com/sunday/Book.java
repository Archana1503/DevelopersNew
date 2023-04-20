package com.sunday;//by using set and get

public class Book {
	int bookId;
	String bookName;
	double bookPrice;

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void setBookPrice(double bookPrice) {

		this.bookPrice = bookPrice;
		if (bookPrice > 500) {
			double discount = bookPrice * 0.10;
			this.bookPrice = bookPrice - discount;
		} else {
			this.bookPrice = bookPrice * 1;
		}
	}

	public int getBookId() {
		return bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public static void main(String[] args) {

		Book b = new Book();
		b.setBookId(10);
		b.setBookName("Shyams mother");
		b.setBookPrice(1000.00);

		System.out.println("Book ID =" + b.getBookId());
		System.out.println("Book Name =" + b.getBookName());
		System.out.println("Book Price =" + b.getBookPrice());

	}

}