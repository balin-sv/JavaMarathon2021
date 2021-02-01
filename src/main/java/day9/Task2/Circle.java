package day9.Task2;

public class Circle extends Figure {

    private final double radio;

    public Circle(double radio, String color) {
        super(color);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public double area() {
        return area = Math.PI * getRadio();
    }

    @Override
    public double perimeter() {
        return perimeter = 2 * Math.PI * getRadio();
    }

}

