package day6;

public class Task1 {
    public static void main(String[] args) {

        Car car = new Car();

        car.setColor("green");
        car.setModel("skoda");
        car.setYear(2017);

        Motorbike moto = new Motorbike(2000, "red", "honda");

        car.info();
        System.out.println("разница между годом выпуска авто и агрументом = " + Car.yearDifference(2000, car));

        moto.info();
        System.out.println("разница между годом выпуска мотоцикла и агрументом = " + Motorbike.yearDifference(2000, moto));

    }

}
