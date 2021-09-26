package day9.Task2;

public class Triangle extends Figure {
    double lengthSide1;
    double lengthSide2;
    double lengthSide3;

    public Triangle(String color, double lengthSide1, double lengthSide2, double lengthSide3) {
        super(color);
        this.lengthSide1 = lengthSide1;
        this.lengthSide2 = lengthSide2;
        this.lengthSide3 = lengthSide3;
    }

    @Override
    public double area() {
        double halfPerimeter = perimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - lengthSide1) * (halfPerimeter - lengthSide2) * (halfPerimeter - lengthSide3));
    }

    @Override
    public double perimeter() {
        return lengthSide1 + lengthSide2 + lengthSide3;
    }
}
