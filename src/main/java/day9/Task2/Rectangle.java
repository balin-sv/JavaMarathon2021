package day9.Task2;

public class Rectangle extends Figure {

    private final double width;
    private final double height;

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double area() {
        return area = getWidth() * getHeight();
    }

    @Override
    public double perimeter() {
        return perimeter = 2 * (getHeight() + getWidth());
    }



}

