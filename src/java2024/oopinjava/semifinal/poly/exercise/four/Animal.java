package java2024.oopinjava.semifinal.poly.exercise.four;

class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
    
    public static void main(String[] args) {
        Animal[] animals = { new Cat(), new Dog() };

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}