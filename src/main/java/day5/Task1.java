package day5;

public class Task1 {
    public static void main(String[] args) {

        Car car1 = new Car();

        createItem(car1);
        showItem(car1);

    }

    public static void createItem(Car a) {
        a.setColor("green");
        a.setModel("skoda");
        a.setYear(2017);

    }

    public static void showItem(Car a) {
        System.out.println("цвет " + a.getColor());
        System.out.println("модель " + a.getModel());
        System.out.println("год выпуска " + a.getYear());
    }

}
