package day11.task1;

public class Picker1 implements Worker {

    private int salary;
    private boolean isPayed;
    private static int countPickers;
    private final Warehouse w1;

    public int getCountPickers() {
        return countPickers;
    }

    public Picker1(Warehouse w1) {
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

        if (w1.getCountPickedOrders() == 10000) {
            setSalary(getSalary() + 80);
            bonus();
            w1.setCountPickedOrders(0);
        } else {
            setSalary(getSalary() + 80);

        }
    }

    /**
     *
     */
    @Override
    public void bonus() {

        if (w1.getCountPickedOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
        }
//        if (w1.getCountPickedOrders() > 10000) {
//            System.out.println("Бонус уже был выплачен");
//        }

        if (w1.getCountPickedOrders() == 10000) {
            System.out.println("Бонус!!!!!");
            int aux = 70000/countPickers;
            setSalary(aux);
        }

    }

}

