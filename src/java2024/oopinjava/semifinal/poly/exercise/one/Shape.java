package java2024.oopinjava.semifinal.poly.exercise.one;

class Shape {
    public String getType() {
        return "Shape";
    }
}

class Circle extends Shape {
    @Override
    public String getType() {
        return "Circle";
    }
}
