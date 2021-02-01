package day9.Task2;

public class Triangle extends Figure{

    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c, String color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public double area() {
        return area = Math.sqrt(perimeter() / 2 * (perimeter() / 2 - getA())
                * (perimeter() / 2 - getB()) * (perimeter() / 2 - getC()));
    }

    @Override
    public double perimeter() {
        return perimeter = getA() + getB() + getC();
    }

}
