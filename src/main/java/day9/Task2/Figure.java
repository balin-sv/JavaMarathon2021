package day9.Task2;

public abstract class Figure {

    private final String color;
    double area;
    double perimeter;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double area();

    public abstract double perimeter();

}

