package day8;

public class Task1 {
    public static void main(String[] args) {

        String a = "";
        Integer x = 0, y = 0;
        StringBuilder b = new StringBuilder();
        long time, time1;

        time = System.currentTimeMillis();

        for (int i = 0; i < 20000; i++) {
            a = a + " " + (x++).toString();
        }

        System.out.println(System.currentTimeMillis() - time);

        System.out.println(a);

        time1 = System.currentTimeMillis();

        for (int i = 0; i < 20000; i++) {
            b.append(y++).append(" ");
        }

        System.out.println(System.currentTimeMillis() - time1);

        System.out.println(b);

    }
}
