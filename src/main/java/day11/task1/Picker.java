package day11.task1;

public class Picker implements Worker {

    private int salary;
    private boolean isPayed;
    private static int countPickers;
    private final Warehouse w1;

    public int getCountPickers() {
        return countPickers;
    }

    public Picker(Warehouse w1) {
        this.w1 = w1;
        countPickers++;

    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setIsPayed(boolean isPayed) {
        this.isPayed = isPayed;
    }

    public int getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "заработная плата " + getSalary() + " бонус " + getIsPayed();
    }

    @Override
    public void doWork() {
        w1.setCountPickedOrders(w1.getCountPickedOrders() + 1);
        salary = salary + 80;
        if (w1.getCountPickedOrders() == 10000) {
            bonus();
        }
        if (w1.getCountPickedOrders() < 10000) {
            // System.out.println("Бонус пока не доступен");
        }
        if (w1.getCountPickedOrders() > 10000 && w1.getCountPickedOrders() < 20000) {
            System.out.println("бонус уже был выплачен");
        }

    }

    @Override
    public void bonus() {
        System.out.println("Бонус!!!!!");
        int aux = 70000 / countPickers;
        salary = aux;

    }

}
