package day6;

public class Airplane {

    String producer;
    private int year;
    private int length;
    private int weigh;
    private int fuel;


    public Airplane() {
        //конструктор для создания обьекта с произвольными данными - пустой конструктор?
    }

    public Airplane(String producer, int year, int length, int weigh) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weigh = weigh;
        this.fuel = 0; //если не задать значение в конструкторе по умолчанию оно равно 0,
                       // получается что сторка не имеет смысла?
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

    static void info(Airplane a) {
        System.out.println("Данные о самолете " + a.getProducer() + ", Изготовитель: " + a.getProducer() +
                ", год выпуска: " + a.getYear() + ", длина: " + a.getLength() + ", вес: " + a.getWeigh() +
                ", количество топлива: " + a.getFuel());
    }

    static void fillUp(Airplane a, int n) {
        a.setFuel(a.getFuel() + n);

    }


}
