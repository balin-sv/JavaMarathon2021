package day8;

public class Airplane {

    private final String producer;
    private final int year;
    private final int length;
    private final int weigh;



    public Airplane(String producer, int year, int length, int weigh) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weigh = weigh;

    }


    public void info() {
        System.out.println("Данные о самолете \n" + "изготовитель: " + producer
                + "\n" + "год выпуска: " + year + "\n" + "длина: " + length +
                "\n" + "вес: " + weigh);
    }


    @Override

    public String toString (){

        return "Данные о самолете \n" + "изготовитель: " + producer
                + "\n" + "год выпуска: " + year + "\n" + "длина: " + length +
                "\n" + "вес: " + weigh;
    }


}

