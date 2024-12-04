package java2024.oopinjava.semifinal.poly.exercise.three;

public class TestVehicle {
	public static void main(String[] args) {
        Vehicle[] vehicles = { new Car(), new Bike() };

        for (Vehicle v : vehicles) {
            v.start();

            if (v instanceof Car) {
                Car car = (Car) v;
                car.honk();
            }
        }
    }
}