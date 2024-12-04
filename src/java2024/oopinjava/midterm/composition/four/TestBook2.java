package java2024.oopinjava.midterm.composition.four;

import java2024.oopinjava.midterm.composition.one.Author;

public class TestBook2 {
	public static void main(String[] args) {
	    // Create an array of Authors
	    Author[] authors = new Author[2];
	    authors[0] = new Author("Wilson Gayo", "wilsonk@email.com", 'm');
	    authors[1] = new Author("Paul Tan", "paul@email.com", 'm');
	
	    // Create a Book instance
	    Book2 book2 = new Book2("Java for Dummy 2", authors, 19.99, 99);
	
	    // Test toString method
	    System.out.println(book2.toString());
	
	    // Test getAuthorNames method
	    System.out.println("\nAuthors: " + book2.getAuthorNames());
	
	    // Test setters and getters for price and quantity
	    book2.setPrice(29.99);
	    book2.setQty(150);
	    System.out.println("Updated price: " + book2.getPrice());
	    System.out.println("Updated quantity: " + book2.getQty());
	
	    // Output the updated book details
	    System.out.println(book2.toString());
	}
}
