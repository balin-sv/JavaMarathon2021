package day11.task1;

public class Courier implements Worker {

    private int salary;
    private boolean isPayed;
    private static int countCouriers;
    private final Warehouse w1;

    public Courier(Warehouse w1) {
        this.w1 = w1;
        countCouriers++;
    }

    public int getCountCouriers() {
        return countCouriers;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    public void setIsPayed(boolean isPayed) {
        this.isPayed = isPayed;
    }

    @Override
    public String toString() {
        return "заработная плата " + getSalary() + " бонус " + getIsPayed();
    }

    @Override
    public void doWork() {
        w1.setCountDeliveredOrders(w1.getCountDeliveredOrders() + 1);

        if (w1.getCountDeliveredOrders() == 10000) {
            setSalary(getSalary() + 100);
            bonus();
            w1.setCountDeliveredOrders(0);
        } else {
            setSalary(getSalary() + 100);

        }
    }

    @Override
    public void bonus() {

        if (w1.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
        }
        if (w1.getCountDeliveredOrders() == 10000) {
            System.out.println("Бонус!!!!!");

            int aux = 50000 / countCouriers;
            setSalary(aux);
        }

    }

}

