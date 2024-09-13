package java2024.oopinjava.midterm.composition.one;

/**
 * A test driver program for the Book class.
 */
public class TestBook {
   public static void main(String[] args) {
      // We need an Author instance to create a Book instance
	  Author ahTeck = new Author("Wilson Gayo", "wilson@email.com", 'm');
      System.out.println(ahTeck);  // Author's toString()
      //Wilson Gayo(m) at wilson@email.com

      // Test Book's constructor and toString()
      Book dummyBook = new Book("Java for dummies", ahTeck, 9.99, 99);
      System.out.println(dummyBook);  // Book's toString()
      //'Java for dummies' by Wilson Gayo (m) at wilson@email.com

      // Test Setters and Getters
      dummyBook.setPrice(8.88);
      dummyBook.setQty(88);
      System.out.println("Name is: " + dummyBook.getName());
      //name is: Java for dummies
      System.out.println("Price is: " + dummyBook.getPrice());
      //price is: 8.88
      System.out.println("Qty is: " + dummyBook.getQty());
      //qty is: 88
      System.out.println("Author is: " + dummyBook.getAuthor());  // invoke Author's toString()
      //author is: Wilson Gayo (m) at wilson@email.com
      System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
      //author's name is: Wilson Gayo
      System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());
      //author's email is: wilson@email.com
      System.out.println("Author's gender is: " + dummyBook.getAuthor().getGender());
      //author's gender is: m

      // Using an anonymous Author instance to create a Book instance
      Book moreDummyBook = new Book("Java for more dummies",
            new Author("Peter Lee", "peter@nowhere.com", 'm'), // an anonymous Author's instance
            19.99, 8);
      System.out.println(moreDummyBook);  // Book's toString()
      //'Java for more dummies' by Peter Lee (m) at peter@nowhere.com
   }
}
