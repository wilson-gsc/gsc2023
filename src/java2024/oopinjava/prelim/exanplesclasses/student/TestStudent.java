package java2024.oopinjava.prelim.exanplesclasses.student;

/**
 * A test driver program for the Student class.
 */
public class TestStudent {
   public static void main(String[] args) {
      // Test constructor and toString()
      Student ahTeck = new Student("Your Full Name", "1 Happy Ave");
      System.out.println(ahTeck);  // toString()
      //Your Full Name(1 Happy Ave)

      // Test Setters and Getters
      ahTeck.setAddress("8 Kg Java");
      System.out.println(ahTeck);
      //Your Full Name(8 Kg Java)
      System.out.println(ahTeck.getName());
      //Your Full Name
      System.out.println(ahTeck.getAddress());
      //8 Kg Java

      // Test addCourseGrade(), printGrades() and getAverageGrade()
      ahTeck.addCourseGrade("IM101", 89);
      ahTeck.addCourseGrade("IM102", 57);
      ahTeck.addCourseGrade("IM103", 96);
      ahTeck.printGrades();
      //Your Full Name IM101:89 IM102:57 IM103:96
      System.out.printf("The average grade is %.2f%n", ahTeck.getAverageGrade());
      //The average grade is 80.67
   }
}

