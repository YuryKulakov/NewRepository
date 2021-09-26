package day9.Task2;

public class Rectangle extends Figure {
    double width;
    double height;


    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;

    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
}
