package comprog12.finals.date;

/**
 * The Date class models a calendar date with day, month and year.
 * This class does not perform input validation for day, month and year.
 */
public class Date {
	// The private instance variables
	private int year, month, day;

	/** Constructs a Date instance with the given year, month and day. No input validation */
	public Date(int year, int month, int day) {
		this.setYear(year);
		this.setMonth(month);
		this.setDay(day);
	}

	// The public getters/setters for the private variables
	/** Returns the year */
	public int getYear() {
		return this.year;
	}
	/** Returns the month */
	public int getMonth() {
		return this.month;
	}
	/** Returns the day */
	public int getDay() {
		return this.day;
	}
	/** Sets the year. No input validation */
	public void setYear(int year) {
		if(year <= 0) {
			System.out.println("year can not be negative or zero");
			this.year = 1;
		} else if(year > 2024) {
			System.out.println("year can not be greater than 2024");
			this.year = 1;
		} else {
			this.year = year;
		}
	}
	/** Sets the month. No input validation */
	public void setMonth(int month) {
		if(month <= 0) {
			System.out.println("month can not be negative or zero");
			this.month = 1;
		} else if(month > 12) {
			System.out.println("month can not be greater than 12");
			this.month = 1;
		} else {
			this.month = month;
		}
	}
	/** Sets the day. No input validation */
	public void setDay(int day) {
		if(day <= 0) {
			System.out.println("day can not be negative or zero");
			this.day = 1;
		} else {
			// check for leap year
			if(month == 2 && day == 29 && !isLeapYear()) {
				System.out.println("February 29th is only valid in leap year");
				this.day = 1;
			}
			// check for months with 31 days
			else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
				if(day > 31) {
					System.out.println(getMonthString(month) + " has only 31 days");
					this.day = 1;
				}
			}
			// check for months with 30 days
			else if(month == 4 || month == 6 || month == 9 || month == 11) {
				if(day > 30) {
					System.out.println(getMonthString(month) + " has only 30 days");
					this.day = 1;
				}
			}
			else this.day = day;
		}
		
	}

	/* Returns a descriptive String in the form "MM/DD/YYYY" with leading zero */
	public String toString() {
		// Use built-in function String.format() to form a formatted String
		return String.format("%02d/%02d/%04d", month, day, year);
		// Specifier "0" to print leading zeros
	}

	/** Sets year, month and day. No input validation */
	public void setDate(int year, int month, int day) {
		this.setYear(year);
		this.setMonth(month);
		this.setDay(day);
	}
	
	// method to check if year is leap year
	public boolean isLeapYear() {
		if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}
	
	//method to return month string
	public String getMonthString(int month) {
		switch(month) {
			case 1: return "January";
			case 2: return "February";
			case 3: return "March";
			case 4: return "April";
			case 5: return "May";
			case 6: return "June";
			case 7: return "July";
			case 8: return "August";
			case 9: return "September";
			case 10: return "October";
			case 11: return "November";
			case 12: return "December";
		}
		return null;
	}
}
