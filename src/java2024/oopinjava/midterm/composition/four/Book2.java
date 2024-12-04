package java2024.oopinjava.midterm.composition.four;

import java2024.oopinjava.midterm.composition.one.Author;

/**
 * The Book class models a book with one (and only one) author.
 */
public class Book2 {
   // The private instance variables
   private String name;
   private Author[] authors;
   private double price;
   private int qty;
 
   /** Constructs a Book instance with the given author */
   public Book2(String name, Author[] authors, double price, int qty) {
      this.name = name;
      this.authors = authors;
      this.price = price;
      this.qty = qty;
   }
 
   // Getters and Setters
   /** Returns the name of this book */
   public String getName() {
      return name;
   }
   /** Return the Author instance of this book */
   public Author[] getAuthors() {
      return authors;  // return member author, which is an instance of the class Author
   }
   /** Returns the price */
   public double getPrice() {
      return price;
   }
   /** Sets the price */
   public void setPrice(double price) {
      this.price = price;
   }
   /** Returns the quantity */
   public int getQty() {
      return qty;
   }
   /** Sets the quantity */
   public void setQty(int qty) {
      this.qty = qty;
   }
 
   public String toString() {
       String result = "Book[\n\tName: " + name + ",\n\tAuthors: {";
       for (int i = 0; i < authors.length; i++) {
           result += "\n\t\t"+authors[i].toString();
           if (i < authors.length - 1) {
               result += ", "; // Add a comma and space between author objects
           }
       }
       result += "\n\t\t},\n\tPrice: " + price + ",\n\tQty: " + qty + "\n]";
       return result;
   }

   // Returns a comma-separated string of author names
   public String getAuthorNames() {
	   String authorNames = "";
	   for (int i = 0; i < authors.length; i++) {
		   authorNames += "\n\t"+authors[i].getName();
		   if (i < authors.length - 1) {
			   authorNames += ", "; // Add a comma and space between author names
		   }
	   }
	   return authorNames;
   }
}