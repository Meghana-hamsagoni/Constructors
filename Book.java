package com.oops;

public class Book {
	String title;
	String author;
	 
public Book (String bookTitle, String bookAuthor) {
	title=bookTitle;
	author=bookAuthor;
	
}
public void displayDetails() {
	System.out.println( "Title of the Book:" + title);
	System.out.println( "Author of the Book:" + author);
	
	
}
public static void main (String [] args) {
	Book book=new Book ("Harry potter", "J.K. Rowling");
	book.displayDetails();
}

}
