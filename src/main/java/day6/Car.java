package day6;

public class Car {

    private int year;
    private String color;
    private String model;

    public Car() {
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    void info() {
        System.out.println("Это автомобиль");
    }

    static int yearDifference(int inputYear, Car a) {
        int difference;

        difference = inputYear - a.getYear();

        if (difference < 0) {

            difference = Math.abs(difference);
        }

        return difference;
    }

}
