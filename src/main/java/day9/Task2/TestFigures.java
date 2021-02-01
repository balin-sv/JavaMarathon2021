package day9. Task2;

public class TestFigures {

    public static void main(String[] args) {

        Figure[] figures = new Figure[]{
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };

        System.out.println("суммa площадей красных фигур " + calculateRedArea(figures)
                + "\n" + "суммa периметров красных фигур " + calculateRedPerimeter(figures));

    }

    static double sumaPerimeter = 0;

    public static double calculateRedPerimeter(Figure[] a) {
        for (Figure figure : a) {
            if (figure.getColor().equals("Red")) {
                sumaPerimeter = sumaPerimeter + figure.perimeter();
            }
        }
        return sumaPerimeter;
    }

    static double sumaArea = 0;

    public static double calculateRedArea(Figure[] a) {
        for (Figure figure : a) {
            if (figure.getColor().equals("Red")) {
                sumaArea = sumaArea + figure.area();
            }
        }
        return sumaArea;
    }
}
