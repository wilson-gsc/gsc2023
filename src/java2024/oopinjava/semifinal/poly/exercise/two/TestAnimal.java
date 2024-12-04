package java2024.oopinjava.semifinal.poly.exercise.two;

public class TestAnimal {
	public static void main(String[] args) {
		// Step 1: Upcasting
		Animal animal = new Dog();

		// Step 2: Call overridden method
		animal.sound();  // Output: Bark

		// Step 3: Attempt to call `fetch`
		// animal.fetch();  // This line will cause a compile-time error

		// Step 4: Downcasting to call `fetch`
		if (animal instanceof Dog) {
			Dog dog = (Dog) animal;
			dog.fetch();  // Output: Fetching...
		}
	}
}