package java2024.oopinjava.semifinal.poly.exercise.six;

class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }

    public void draw(String color) {
        System.out.println("Drawing a shape in color: " + color);
    }
    
    public static void main(String[] args) {
        Shape shape = new Circle();

        shape.draw();
        shape.draw("red");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
