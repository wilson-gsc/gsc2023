package java2024.oopinjava.prelim.exanplesclasses.time;

/**
 * The Time class models a time instance with second, minute and hour.
 * This class performs input validations using exception handling.
 */
public class Time3 {
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
		if (second < 0 || second > 59)
			throw new IllegalArgumentException("invalid second " + second); // exit automatically
		// Normal operation
		this.second = second;
	}
	/** Sets the minute to the given value with input validation */
	public void setMinute(int minute) {
		// Input validation
		if (minute < 0 || minute > 59)
			throw new IllegalArgumentException("invalid minute " + minute); // exit automatically
		// Normal operation
		this.minute = minute;
	}
	/** Sets the hour to the given value with input validation */
	public void setHour(int hour) {
		// Input validation
		if (hour < 0 || hour > 24)
			throw new IllegalArgumentException("invalid hour " + hour); // exit automatically
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
	public Time3(int second, int minute, int hour) {
		// Invoke setters to do input validation
		this.setTime(second, minute, hour);
	}
	/** Constructs a Time instance with default values */
	public Time3() {  // The default constructor
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
	public Time3 nextSecond() {
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
		// Time3 t3 = new Time3(60, 59, 24);
		// error: invalid minute 61
		// exit with exit code 1 for abnormal termination
		// System.out.println(t3);   // not executed

		// Case 1: valid input
		//int hour = 23, minute = 58, second = 58;
		// Case 2: invalid input
		int hour = 25, minute = 59, second = 59;
		Time3 t12;

		//t12 = new Time(second, minute, hour);
		// Without try-catch, the program will terminate abruptly if exception thrown

		try {
			t12 = new Time3(second, minute, hour);
			// If input is invalid, throw exception. Skip the rest, goto "catch".
			// Else complete "try", skip "catch"
			System.out.println("valid input");
		} catch (IllegalArgumentException ex) {
			// You have the opportunity to do something to recover from the error.
			ex.printStackTrace();  // print error messages
			System.out.println("Error in input. Set to default value");
			// You should ask the user to provide the valid input instead!
			t12 = new Time3();
		}

		System.out.println("Time is " + t12);
		System.out.println("Life goes on...");

		// Case 1 output
		//valid input
		//Time is 23:58:58
		//Life goes on...

		// Case 2 output
		//java.lang.IllegalArgumentException: invalid hour
		//Error in input. Set to default value
		//Time is 00:00:00
		//Life goes on...
	}
}
