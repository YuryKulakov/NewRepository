package day9.Task2;

public class Circle extends Figure {
    double radius;


    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        return this.radius * 2 * Math.PI;
    }
}
