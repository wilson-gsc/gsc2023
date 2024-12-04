package java2024.oopinjava.midterm.inheritance.eg3;

/**
 * A test driver for Person and its subclasses.
 */
public class TestPerson {
   public static void main(String[] args) {
      /* Test Student class */
	  System.out.println("Test Student class");
      Student s1 = new Student("John Smith", "1 Happy Ave");
      s1.addCourseGrade("IM101", 97);
      s1.addCourseGrade("IM102", 68);
      s1.printGrades();
      //Student:John Smith(1 Happy Ave) IM101:97 IM102:68
      System.out.println("Average is " + s1.getAverageGrade());
      //Average is 82.5

      /* Test Teacher class */
      System.out.println("\nTest Teacher class");
      Teacher t1 = new Teacher("Wilson Gayo", "8 sunset way");
      System.out.println(t1);
      //Teacher: Wilson(8 sunset way)
      
      System.out.println("\nTest Teacher class add course");
      String[] courses = {"IM101", "IM102", "IM101"};
      for (String course: courses) {
         if (t1.addCourse(course)) {
            System.out.println(course + " added");
         } else {
            System.out.println(course + " cannot be added");
         }
      }
      //IM101 added
      //IM102 added
      //IM101 cannot be added
      
      System.out.println("\nTest Teacher class removed course");
      for (String course: courses) {
         if (t1.removeCourse(course)) {
            System.out.println(course + " removed");
         } else {
            System.out.println(course + " cannot be removed");
         }
      }
      //IM101 removed
      //IM102 removed
      //IM101 cannot be removed
   }
}
