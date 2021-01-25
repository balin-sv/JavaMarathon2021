package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike moto1 = new Motorbike(2011, "red", "honda");
        showItem(moto1);

    }

    public static void showItem(Motorbike a) {
        System.out.println("год выпуска " + a.getYear());
        System.out.println("цвет " + a.getColor());
        System.out.println("модель " + a.getModel());

    }
}
