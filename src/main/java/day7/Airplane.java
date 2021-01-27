package day7;

public class Airplane {

    String producer;
    private int year;
    private int length;
    private int weigh;
    private int fuel;

    public Airplane() {
    }

    public Airplane(String producer, int year, int length, int weigh) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weigh = weigh;
        this.fuel = 0;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeigh(int weigh) {
        this.weigh = weigh;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public String getProducer() {
        return producer;
    }

    public int getYear() {
        return year;
    }

    public int getLength() {
        return length;
    }

    public int getWeigh() {
        return weigh;
    }

    public int getFuel() {
        return fuel;
    }

    public static void compareAirplanes(Airplane a, Airplane b) {
        if (a.getLength() > b.getLength()) {
            System.out.println(a.getProducer() + " длиннее");
        } else {
            System.out.println(b.getProducer() + " длиннее");
        }
    }

}




