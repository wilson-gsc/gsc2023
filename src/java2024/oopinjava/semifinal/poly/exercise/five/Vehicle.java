package java2024.oopinjava.semifinal.poly.exercise.five;

class Vehicle {
    public String type = "Vehicle";

    public void printType() {
        System.out.println(type);
    }
    
    public static void main(String[] args) {
        Vehicle vehicle = new Car();

        vehicle.printType();
        System.out.println(vehicle.type);
    }
}

class Car extends Vehicle {
    public String type = "Car";

    @Override
    public void printType() {
        System.out.println(type);
    }
}

