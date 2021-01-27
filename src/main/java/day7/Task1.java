package day7;

public class Task1 {
    public static void main(String[] args) {

        Airplane plane = new Airplane("Boeing", 1980, 70, 200);

        Airplane plane1 = new Airplane("Aerobus", 1990, 100, 300);

        Airplane.compareAirplanes(plane, plane1);

    }
}