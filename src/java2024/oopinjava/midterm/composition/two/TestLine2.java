package java2024.oopinjava.midterm.composition.two;

import java2024.oopinjava.prelim.exanplesclasses.point.Point;

public class TestLine2 {
	public static void main(String[] args) {
		
		Point p1 = new Point(1, 2);
		Point p2 = new Point(3, 4);
		Line l1 = new Line(p1, p2);
		System.out.println(l1);
		
	}
}
