package day12;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i <= 350; i++) {
            if (i <= 30 && i > 0 && i% 2 == 0) {
                list.add(i++);
            }
            if (i>= 300 && i%2 == 0) {
                list.add(i++);
            }
        }

        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));
        }

    }

}
