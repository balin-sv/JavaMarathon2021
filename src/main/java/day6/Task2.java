package day6;

public class Task2 {
    public static void main(String[] args) {

        Airplane plane = new Airplane("Boeing", 1980, 70, 200);

        Airplane.info(plane);
        Airplane.fillUp(plane, 300);

        Airplane plane1 = new Airplane();
        plane1.setLength(80);
        plane1.setYear(1990);
        Airplane.fillUp(plane1, 250);
        Airplane.fillUp(plane1, 310);

        Airplane.info(plane1);

    }
}
