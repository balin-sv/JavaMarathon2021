package day11.task1;

public class Task1 {

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Warehouse warehouse1 = new Warehouse();

        Picker p1 = new Picker(warehouse);
        Picker p2 = new Picker(warehouse);

        Courier c1 = new Courier(warehouse);
        Courier c3 = new Courier(warehouse);

        businessProcess(p1);
        businessProcess(c1);

        c3.doWork();
        System.out.println(c3.getSalary());

        System.out.println(warehouse.toString());

        Picker p3 = new Picker(warehouse1);
        Courier c4 = new Courier(warehouse1);
        Courier c5 = new Courier(warehouse1);

        businessProcess(c5);

        businessProcess(p3);

        System.out.println(warehouse1.toString());

    }

    static void businessProcess(Worker worker) {
//        int count = 0;
//        do {
//            worker.doWork();
//            count++;
//        } while (count <= 10000);
//
//
        for (int i = 0; i < 10000; i++) {
            worker.doWork();

        }

    }

}

