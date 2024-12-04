package java2024.oopinjava.midterm.inheritance.exercise;

import java2024.oopinjava.midterm.inheritance.eg3.Person;

public class Student extends Person {
	// private instance variables
	private String program;
	private int year;
	private double fee;
	
	// Constructors
	public Student(String name, String address, String program, int year, double fee) {
		super(name, address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}
	
	// public getters and setters
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student {\n\t" + super.toString() + ", "
				+ "\n\tprogram: " +program+", \n\tyear: "+year+", \n\tfee: "+fee+"\n}";
	}
}
