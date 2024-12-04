package java2024.oopinjava.semifinal.poly.exercise.two;

class Animal {
    public void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Bark");
    }
    public void fetch() {
        System.out.println("Fetching...");
    }
}
