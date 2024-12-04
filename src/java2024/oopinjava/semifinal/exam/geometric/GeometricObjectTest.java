package java2024.oopinjava.semifinal.exam.geometric;

import java.util.Scanner;

public class GeometricObjectTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Select an object type:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.print("Enter your choice (1 or 2): ");

        int choice = input.nextInt();

        GeometricObject geoObject;

        if (choice == 1) {
            System.out.print("Enter the radius of the circle: ");
            double radius = input.nextDouble();
            geoObject = new Circle(radius);
        } else if (choice == 2) {
            System.out.print("Enter the width of the rectangle: ");
            double width = input.nextDouble();
            System.out.print("Enter the length of the rectangle: ");
            double length = input.nextDouble();
            geoObject = new Rectangle(width, length);
        } else {
            System.out.println("Invalid choice. Exiting.");
            return; // Exit the program
        }

        System.out.println("\n"+geoObject);
        System.out.println("\nArea: " + geoObject.getArea());
        System.out.println("Perimeter: " + geoObject.getPerimeter());

        input.close();
    }
}