package comprog12.finals.date;

/**
 * A Test Driver for the Date class.
 */
public class TestDate {
   public static void main(String[] args) {
      // Test constructor and toString()
	  System.out.println("Date Class Test constructor and toString()");
      Date d1 = new Date(2020, 2, 8);
      System.out.println("d1 instance: "+d1);  // toString()
      //02/08/2020

      // Test Setters and Getters
      System.out.println("\nTest setters");
      d1.setYear(2012);
      d1.setMonth(12);
      d1.setDay(23);
      System.out.println("d1 instance updated: "+d1);
      //12/23/2012
      System.out.println("\nTest getters");
      System.out.println("d1 Year: " + d1.getYear());
      //Year is: 2012
      System.out.println("d1 Month: " + d1.getMonth());
      //Month is: 12
      System.out.println("d1 Day: " + d1.getDay());
      //Day is: 23

      // Test setDate()
      System.out.println("\nTest d1 setDate()");
      d1.setDate(2988, 1, 2);
      System.out.println(d1);
      //01/02/2988
      
      System.out.println("\nTest input validation year");
      // Test year
      System.out.println("\nd1 instance setDate(-2988, 5, 21)");
	  d1.setDate(-2988, 5, 21);
	  System.out.println(d1);
	  
	  System.out.println("\nd1 instance setDate(0, 5, 21)");
	  d1.setDate(0, 5, 21);
	  System.out.println(d1);
	  
	  System.out.println("\nd1 instance setDate(2026, 5, 21)");
	  d1.setDate(2026, 5, 21);
	  System.out.println(d1);
	  
	  
	  // Test month
      System.out.println("\nTest input validation month");
      System.out.println("\nd1 instance setDate(2024, -5, 21)");
	  d1.setDate(2024, -5, 21);
	  System.out.println(d1);
	  
	  System.out.println("\nd1 instance setDate(2024, 0, 21)");
	  d1.setDate(2024, 0, 21);
	  System.out.println(d1);
	  
	  System.out.println("\nd1 instance setDate(2024, 13, 21)");
	  d1.setDate(2024, 13, 21);
	  System.out.println(d1);
	  
	  
	  // Test day
      System.out.println("\nTest input validation day");
      System.out.println("\nd1 instance setDate(2024, 5, -21)");
	  d1.setDate(2024, 5, -21);
	  System.out.println(d1);
	  
	  System.out.println("\nd1 instance setDate(2024, 5, 0)");
	  d1.setDate(2024, 5, 0);
	  System.out.println(d1);
	  
	  System.out.println("\nd1 instance setDate(2024, 5, 32)");
	  d1.setDate(2024, 5, 32);
	  System.out.println(d1);
	  
	  System.out.println("\nd1 instance setDate(2024, 6, 31)");
	  d1.setDate(2024, 6, 31);
	  System.out.println(d1);
	  
	  System.out.println("\nd1 instance setDate(2023, 2, 29)");
	  d1.setDate(2023, 2, 29);
	  System.out.println(d1);
	  
	  System.out.println("\nd1 instance setDate(2024, 2, 29)");
	  d1.setDate(2024, 2, 29);
	  System.out.println(d1);
   }
}
