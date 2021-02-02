package day11.task1;

public class Task1 {

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Warehouse warehouse1 = new Warehouse();

        Picker p1 = new Picker(warehouse);
        Picker p2 = new Picker(warehouse);

        Courier c1 = new Courier(warehouse);
        Courier c2 = new Courier(warehouse);
        Courier c3 = new Courier(warehouse);

        c3.doWork();

        System.out.println(p2.getCountPickers());
        System.out.println(c1.getCountCouriers());

        businessProcess(p1);
        businessProcess(c1);

        System.out.println(p1.getSalary());
        System.out.println(c1.getSalary());

        c1.doWork();
        c1.doWork();
        System.out.println(warehouse.toString());

        System.out.println(c3.getSalary());

        Picker1 p3 = new Picker1(warehouse1);
        Picker1 p4 = new Picker1(warehouse1);
        p3.doWork();

        Courier1 c4 = new Courier1(warehouse1);

        c4.doWork();
        System.out.println(warehouse1.toString());

        System.out.println(c4.getSalary());

        businessProcess(p4);

        System.out.println(p4.getSalary());
        System.out.println(p3.getSalary());
        System.out.println(warehouse1.toString());

        System.out.println(warehouse.toString());

    }

    static void businessProcess(Worker worker) {
        int count = 0;

        do {
            worker.doWork();
            count++;
        } while (count <= 10000);

    }
}

