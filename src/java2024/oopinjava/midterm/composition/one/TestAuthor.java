package java2024.oopinjava.midterm.composition.one;

/**
 * A test driver for the Author class.
 */
public class TestAuthor {
   public static void main(String[] args) {
      // Test constructor and toString()
      Author ahTeck = new Author("Wilson Gayo", "wilson@email.com", 'm');
      System.out.println(ahTeck);  // toString()
      //Wilson Gayo (m) at wilson@email.com

      // Test Setters and Getters
      ahTeck.setEmail("wilson@email.com");
      System.out.println(ahTeck);  // toString()
      //Wilson Gayo (m) at wilson@email.com
      System.out.println("Name is: " + ahTeck.getName());
      //name is: Wilson Gayo
      System.out.println("Gender is: " + ahTeck.getGender());
      //gender is: m
      System.out.println("Email is: " + ahTeck.getEmail());
      //email is: wilson@email.com
   }
}