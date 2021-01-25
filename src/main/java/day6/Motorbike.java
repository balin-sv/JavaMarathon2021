package day6;

public class Motorbike {

    private int year;
    private String color;
    private String model;

    public Motorbike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
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
        System.out.println("Это мотоцикл");
    }

    static int yearDifference(int inputYear, Motorbike a) {
        int difference;

        difference = inputYear - a.getYear();

        if (difference < 0) {

            difference = Math.abs(difference);
        }

        return difference;
    }

}

