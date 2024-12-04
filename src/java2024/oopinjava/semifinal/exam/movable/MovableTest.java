package java2024.oopinjava.semifinal.exam.movable;

import java.util.Scanner;

public class MovableTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Choose an object to move:");
		System.out.println("1. MovablePoint");
		System.out.println("2. MovableCircle");
		System.out.print("Enter your choice (1 or 2): ");

		int choice = scanner.nextInt();
		Movable movableObject;

		if (choice == 1) {
			System.out.print("Enter x and y coordinates: ");
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			System.out.print("Enter xSpeed and ySpeed: ");
			int xSpeed = scanner.nextInt();
			int ySpeed = scanner.nextInt();
			movableObject = new MovablePoint(x, y, xSpeed, ySpeed);
		} else if (choice == 2) {
			System.out.print("Enter x and y coordinates for the center: ");
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			System.out.print("Enter xSpeed and ySpeed: ");
			int xSpeed = scanner.nextInt();
			int ySpeed = scanner.nextInt();
			System.out.print("Enter the radius: ");
			int radius = scanner.nextInt();
			movableObject = new MovableCircle(x, y, xSpeed, ySpeed, radius);
		} else {
			System.out.println("Invalid choice!");
			return;
		}

		System.out.println("Initial position: " + movableObject);

		while (true) {
			System.out.println("\nChoose an action:");
			System.out.println("1. Move up");
			System.out.println("2. Move down");
			System.out.println("3. Move left");
			System.out.println("4. Move right");
			System.out.println("5. Exit");
					System.out.print("Enter your choice: ");

					int action = scanner.nextInt();

					switch (action) {
					case 1:
						movableObject.moveUp();
						break;
					case 2:
						movableObject.moveDown();
						break;
					case 3:
						movableObject.moveLeft();
						break;
					case 4:
						movableObject.moveRight();
						break;
					case 5:
						System.out.println("Exiting...");
						return;
					default:
						System.out.println("Invalid action!");
					}

					System.out.println("Current position: " + movableObject);
					
					scanner.close();
		}
	}
}
