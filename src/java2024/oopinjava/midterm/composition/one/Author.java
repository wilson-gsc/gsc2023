package java2024.oopinjava.midterm.composition.one;

/** 
 * The Author class model a book's author.
 */
public class Author {
   // The private instance variables
   private String name;
   private String email;
   private char gender;   // 'm' or 'f'
 
   /** Constructs a Author instance with the given inputs */
   public Author(String name, String email, char gender) {
      this.name = name;
      this.email = email;
      this.gender = gender;
   }
 
   // The public getters and setters for the private instance variables.
   // No setter for name and gender as they are not designed to be changed.
   /** Returns the name */
   public String getName() {
      return name;
   }
   /** Returns the gender */
   public char getGender() {
      return gender;
   }
   /** Returns the email */
   public String getEmail() {
      return email;
   }
   /** Sets the email */
   public void setEmail(String email) {
      this.email = email;
   }
 
   /** Returns a self-descriptive String */
   public String toString() {
      return name + " (" + gender + ") at " + email;
   }
}