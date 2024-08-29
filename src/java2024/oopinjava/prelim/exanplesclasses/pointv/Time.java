package java2024.oopinjava.prelim.exanplesclasses.pointv;

/**
 * The Time class models a time instance with second, minute and hour.
 * This class performs input validations.
 */
public class Time {
   // The private instance variables - with input validations.
   private int second;  // valid range is [0, 59]
   private int minute;  // valid range is [0, 59]
   private int hour;    // valid range is [0, 23]

   // Input validations are done in the setters.
   // All the other methods (such as constructors and setTime()) invoke
   //   these setters to perform input validations to avoid code duplication.
   /** Sets the second to the given value with input validation */
   public void setSecond(int second) {
      // Input validation
      if (second < 0 || second > 59) {
         System.out.println("error: invalid second " + second);
         System.exit(1);   // non-0 for abnormal termination, 0 for normal
      }
      // Normal operation
      this.second = second;
   }
   /** Sets the minute to the given value with input validation */
   public void setMinute(int minute) {
      // Input validation
      if (minute < 0 || minute > 59) {
         System.out.println("error: invalid minute " + second);
         System.exit(1);
      }
      // Normal operation
      this.minute = minute;
   }
   /** Sets the hour to the given value with input validation */
   public void setHour(int hour) {
      // Input validation
      if (hour < 0 || hour > 59) {
         System.out.println("error: invalid hour " + second);
         System.exit(1);
      }
      // Normal operation
      this.hour = hour;
   }

   /** Sets second, minute and hour to the given values with input validation */
   public void setTime(int second, int minute, int hour) {
      // Invoke setters to do input validation
      this.setSecond(second);
      this.setMinute(minute);
      this.setHour(hour);
   }

   /** Constructs a Time instance with the given values with input validation */
   public Time(int second, int minute, int hour) {
      // Invoke setters to do input validation
      this.setTime(second, minute, hour);
   }
   /** Constructs a Time instance with default values */
   public Time() {  // The default constructor
      this.second = 0;
      this.minute = 0;
      this.hour = 0;
   }

   // The public getters
   /** Returns the second */
   public int getSecond() {
      return this.second;
   }
   /** Returns the minute */
   public int getMinute() {
      return this.minute;
   }
   /** Returns the hour */
   public int getHour() {
      return this.hour;
   }

   /** Returns a self-descriptive string in the form of "hh:mm:ss" with leading zeros */
   public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
   }
   /** Advances this Time instance by one second and returns this instance to support chaining */
   public Time nextSecond() {
      ++second;
      if (second == 60) {  // We are sure that second <= 60 here because of the input validation
         second = 0;
         ++minute;
         if (minute == 60) {
            minute = 0;
            ++hour;
            if (hour == 24) {
               hour = 0;
            }
         }
      }
      return this;   // Return this instance, to support chaining
   }

   // Test
   public static void main(String[] args) {
      Time t1 = new Time(59, 61, 25);
      // error: invalid minute 61
      // exit with exit code 1 for abnormal termination
      System.out.println(t1);   // not executed
   }
}