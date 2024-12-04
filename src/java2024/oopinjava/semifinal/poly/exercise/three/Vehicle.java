package java2024.oopinjava.semifinal.poly.exercise.three;

class Vehicle {
    public void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {
    public void start() {
        System.out.println("Car started");
    }
    public void honk() {
        System.out.println("Car honking");
    }
}

class Bike extends Vehicle {
    public void start() {
        System.out.println("Bike started");
    }
}
